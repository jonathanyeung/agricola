package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class ChiefsDaughter implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Chief's Daughter";
    }

    @Override
    public String getDescription() {
        return "If another player plays the 'Chief' card, you can play this card immediately at no cost. (You can also" +
            " play it using an Action Space in the usual way.) At the end of the game, you receive 3 Bonus points if" +
            " you have a Stone house, 1 if you have a Clay hut.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
