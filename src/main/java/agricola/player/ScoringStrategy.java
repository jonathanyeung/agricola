package agricola.player;

import agricola.farm.Farm;

public interface ScoringStrategy {
    public int calculateScore(Farm farm);
}
