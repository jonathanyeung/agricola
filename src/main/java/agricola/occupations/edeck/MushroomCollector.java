package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class MushroomCollector implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Mushroom Collector";
    }

    @Override
    public String getDescription() {
        return "Whenever you use a Family member's action to take Wood from an Action space, you can leave 1 of the Wood on the space and take 2 Food in exchange.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
