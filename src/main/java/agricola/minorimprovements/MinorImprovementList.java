package agricola.minorimprovements;

import java.util.List;

import com.google.common.collect.ImmutableList;

import agricola.DeckSet;
import agricola.minorimprovements.edeck.Axe;

public class MinorImprovementList {
    public static List<MinorImprovement> getMinorImprovementDeck(DeckSet deck) {
        switch(deck) {
            case E:
            default:
                return getEDeck();
        }
    }

    private static List<MinorImprovement> getEDeck() {
        return ImmutableList.of(
            new Axe());
            //ToDo: Extend list.
    }
}
