package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Stablemaster implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Stablemaster";
    }

    @Override
    public String getDescription() {
        return "One (and only one) of your unfenced stables may hold up to 3 animals of the same type.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
