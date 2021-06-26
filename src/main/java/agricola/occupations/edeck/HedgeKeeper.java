package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class HedgeKeeper implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Hedge Keeper";
    }

    @Override
    public String getDescription() {
        return "Whenever you build at least 1 fence, you can build up to 3 additional fences without paying any additional Wood. (You can only place fences if they enclose a complete pasture.)";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
