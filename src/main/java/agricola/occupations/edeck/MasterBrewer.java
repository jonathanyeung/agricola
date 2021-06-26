package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class MasterBrewer implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Master Brewer";
    }

    @Override
    public String getDescription() {
        return "In the feeding phase of each Harvest, the Master Brewer can convert up to 1 Grain to 3 Food.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
