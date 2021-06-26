package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Carpenter implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Carpenter";
    }

    @Override
    public String getDescription() {
        return "To extend your home, you need only 3 of the appropriate building resources and 2 Reed for each new room. (For example, if you live in a Wooden hut, you need 3 Wood and 2 Reed.)";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }

}
