package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Mason implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Mason";
    }

    @Override
    public String getDescription() {
        return "Once during the game, at any time after your Stone house reaches at least 4 rooms, you may extrend it by 1 room at no cost.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
