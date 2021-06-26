package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class LordOfTheManor implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Lord of the Manor";
    }

    @Override
    public String getDescription() {
        return "At the end of the game, you receive 1 bonus point for each scoring category where you have scored the maximum 4 points. (The bonus point is also awarded for 4 fenced stables.)";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
