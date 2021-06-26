package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Baker implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Baker";
    }

    @Override
    public String getDescription() {
        return "During each harvest, you make Bake bread at the start of the Feeding phase if you have an Improvement with the Baking symbol. When you play this card, you may Bake bread as an additional action.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
