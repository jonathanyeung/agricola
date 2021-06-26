package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class StoneCarrier implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Stone Carrier";
    }

    @Override
    public String getDescription() {
        return "Whenever you take Stone with an action, you can also take 1 additional Stone. If you also receive other building resources, this costs you 1 Food.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
