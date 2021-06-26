package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class ClayMixer implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Clay Mixer";
    }

    @Override
    public String getDescription() {
        return "Whenever one of your people's actions gives you only Clay, you receive 2 additional Clay.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
