package agricola.gameboard;

import java.util.List;

import agricola.Card;

public interface ActionCard extends Card {

    /**
     * Gets a list of actions that the user can choose when playing the card. If the user has no choice, then this list
     * should only contain a single item.
     * @return
     */
    List<Action> getActionChoices();

    /**
     * Things that need to be done when a new round starts (i.e. replenish resources)
     */
    void onRoundBegin();

    /**
     * The stage number the card belongs to
     * @return
     */
    int getStage();

    /**
     * The number of players in the game that put this card in play. A value of 0 indicates that it's always in play.
     * @return
     */
    int getPlayerCount();
}
