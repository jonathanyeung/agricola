package agricola.player;

import agricola.farm.Farm;

/**
 * Default scoring methodology without any modifiers.
 */
public abstract class ScoringStrategyDecorator implements ScoringStrategy {
    private ScoringStrategy baseStrategy;

    public ScoringStrategyDecorator(ScoringStrategy baseStrategy) {
        this.baseStrategy = baseStrategy;
    }

    public int calculateScore(Farm farm) {
        return baseStrategy.calculateScore(farm);
    }
}
