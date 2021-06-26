package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Tutor implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Tutor";
    }

    @Override
    public String getDescription() {
        return "At the end of the game, you receive 1 Bonus point for each Occupation that you play after this one.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
