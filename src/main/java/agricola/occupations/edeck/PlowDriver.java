package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class PlowDriver implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Plow Driver";
    }

    @Override
    public String getDescription() {
        return "Once you have a Stone house, you can pay 1 Food at the start of each round to Plow (at most) 1 field.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
