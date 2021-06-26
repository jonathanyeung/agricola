package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Merchant implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Merchant";
    }

    @Override
    public String getDescription() {
        return "Whenever you use the 'Minor improvement' or 'Minor or Major Improvement' action, you can pay 1 Food to use the action a second time.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
