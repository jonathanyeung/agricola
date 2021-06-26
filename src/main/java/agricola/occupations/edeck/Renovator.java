package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Renovator implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Renovator";
    }

    @Override
    public String getDescription() {
        return "Pay 2 fewer Clay to renovate to a Clay hut, and pay 2 fewer Stone to renovate to a Stone house.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
