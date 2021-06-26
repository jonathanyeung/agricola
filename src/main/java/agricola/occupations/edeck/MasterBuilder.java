package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class MasterBuilder implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Master Builder";
    }

    @Override
    public String getDescription() {
        return "Once during the game, at any time after your home reaches at least 5 rooms, you may extend it by 1 room at no cost.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
