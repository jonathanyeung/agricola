package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class ClayDeliveryman implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Clay Deliveryman";
    }

    @Override
    public String getDescription() {
        return "Place 1 Clay on each of the spaces for rounds 6 to 14.  At the start of these rounds, you receive the Clay.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
