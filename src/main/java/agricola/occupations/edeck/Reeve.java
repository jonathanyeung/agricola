package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Reeve implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Reeve";
    }

    @Override
    public String getDescription() {
        return "Take 1/2/3/4 Wood if there are still 1/3/6/9 rounds to play.  At the end of the game, all players with the most played Occupation cards receive 3 bonus points each";
    }

    @Override
    public int minimumPlayerCount() {
        return 3;
    }

}
