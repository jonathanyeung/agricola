package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Stablehand implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Stablehand";
    }

    @Override
    public String getDescription() {
        return "Whenever you build at least 1 fence, you also receive 1 stable which you must build immediately. (This may be build inside or outside the fenced area.) (You do not need to pay any Wood for the Stable.)";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
