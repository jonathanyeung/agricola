package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Grocer implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Grocer";
    }

    @Override
    public String getDescription() {
        return "Pile (from bottom to top) 1 Vegetable, Reed, Clay, Wood, Vegetable, Stone, Grain, Reed on this card.  At any time, you may buy the top item for 1 Food.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
