package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class SeasonalWorker implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Seasonal Worker";
    }

    @Override
    public String getDescription() {
        return "Whenever you use the 'Day Laborer' Action space, you receive 1 additional Grain. From Round 6, you can choose to receive 1 Vegetable instead.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
