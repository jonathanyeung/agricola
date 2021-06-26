package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class HeadOfTheFamily implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        //TODO: Implement
        return "";
    }

    @Override
    public String getDescription() {
        //TODO: Implement
        return "";
    }

    @Override
    public int minimumPlayerCount() {
        //TODO: Implement
        return 9;
    }
}
