package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Woodcutter implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Woodcutter";
    }

    @Override
    public String getDescription() {
        return "You receive 1 additional Wood whenever you use a family member's action to take Wood.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
