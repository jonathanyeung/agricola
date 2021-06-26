package agricola.player;

import java.lang.reflect.Constructor;

import com.google.inject.Inject;

import agricola.farm.Farm;

public class Player {
    
    private final String name;
    private final Farm farm;
    private ScoringStrategy scoringStrategy;

    @Inject
    Player(String name, Farm farm) {
        this.name = name;
        this.farm = farm;
        scoringStrategy = new DefaultScoringStrategy();
    }

    public String getName() {
        return this.name;
    }

    public Farm getFarm() {
        return this.farm;
    }

    public int getScore() {
        return this.scoringStrategy.calculateScore(this.farm);
    }

    public void modifyScoringStrategy(Class<ScoringStrategy> modifier) throws Throwable {
        Constructor<ScoringStrategy> ctr = modifier.getConstructor(new Class[] {ScoringStrategy.class});
        this.scoringStrategy = ctr.newInstance(new Object[] {this.scoringStrategy});
    }
}
