package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class MeatSeller implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Meat-seller";
    }

    @Override
    public String getDescription() {
        return "If you have an Oven, you can change your animals into Food at any time. Take 2 Food for each Sheep, 3 for each Wild boar and 4 for each cattle.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
