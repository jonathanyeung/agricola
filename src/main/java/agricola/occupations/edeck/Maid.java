package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Maid implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Maid";
    }

    @Override
    public String getDescription() {
        return "Once you have built a Clay hut, place 1 Food on each remaining Round space.  At the start of these rounds, you receive the Food. (If you have already have a Clay hut or a Stone house when you play this card, place the Food immediately)";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
