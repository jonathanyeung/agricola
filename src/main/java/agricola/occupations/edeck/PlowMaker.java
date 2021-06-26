package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class PlowMaker implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Plow Maker";
    }

    @Override
    public String getDescription() {
        return "Whenever you use either the 'Plow 1 field' or 'Plow 1 field and/or Sow' Action spaces, you can pay 1 Food to Plow 1 additional field.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
