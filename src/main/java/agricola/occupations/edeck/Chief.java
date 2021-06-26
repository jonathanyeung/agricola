package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Chief implements Occupation {

    // TODO: This card has an additional cost of 2 food.
    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Chief";
    }

    @Override
    public String getDescription() {
        return "At the end of the game, you receive 1 Bonus point for each room in your Stone house. (In total, you receive 3 points per room instead of 2.) Playing this card costs an additional 2 food.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
