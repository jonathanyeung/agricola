package agricola.minorimprovements;

import agricola.Card;
import agricola.Improvement;
import agricola.InDeckSet;

public interface MinorImprovement extends Card, InDeckSet, Improvement {

    // Some cards are only introduced when there are greater than a certain number of players.
    public int minimumPlayerCount();
}
