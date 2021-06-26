package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class AnimalKeeper implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Animal Keeper";
    }

    @Override
    public String getDescription() {
        return "You can keep Sheep, Wild boar, and Cattle in the same pasture. This applies to all your pastures (except the Forest Pasture)";
    }

    @Override
    public int minimumPlayerCount() {
        return 4;
    }

}
