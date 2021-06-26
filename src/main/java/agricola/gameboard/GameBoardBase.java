package agricola.gameboard;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableList;

import agricola.gameboard.actioncards.*;

public abstract class GameBoardBase {
    protected ActionCard[] baseCards;
    protected final ActionCard[] roundCards;
    protected List<ActionCard> extensionCards;
    private final int NUMBER_OF_ROUNDS = 14;

    protected ImmutableList<ActionCard> stageOneCards = ImmutableList.of(
        new OneSheep(),
        new SowBakeBread(),
        new Fences(),
        new Improvement()
    );

    protected ImmutableList<ActionCard> stageTwoCards = ImmutableList.of(
        new OneStone(),
        new Renovate(),
        new FamilyGrowth()
    );

    protected ImmutableList<ActionCard> stageThreeCards = ImmutableList.of(
        new OneBoar(),
        new Vegetable()
    );

    protected ImmutableList<ActionCard> stageFourCards = ImmutableList.of(
        new Cattle(),
        new OneStone()
    );

    protected ImmutableList<ActionCard> stageFiveCards = ImmutableList.of(
        new PlowAndSow(),
        new FamilyGrowthNoSpace()
    );

    protected ImmutableList<ActionCard> stageSixCards = ImmutableList.of(
        new RenovateAndFence()
    );

    public GameBoardBase() {
        roundCards = new ActionCard[NUMBER_OF_ROUNDS];
        this.initializeRoundCards();
        extensionCards = new ArrayList<ActionCard>();
    }

    public ActionCard getActionCardForRound(int roundNumber) {
        return roundCards[roundNumber];
    }
    
    private void initializeRoundCards() {
        //ToDo: Implement randomization logic.
    }
}
