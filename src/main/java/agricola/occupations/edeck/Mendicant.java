package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Mendicant implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Mendicant";
    }

    @Override
    public String getDescription() {
        return "At the end of the game, you can discard up to 2 Begging cards without losing points for them.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
