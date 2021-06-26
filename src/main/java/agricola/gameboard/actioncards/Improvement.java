package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class Improvement implements ActionCard {

    @Override
    public String getName() {
        return "1 Major Improvement or 1 Minor Improvement";
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public List<Action> getActionChoices() {
        //TODO: Implement
        return null;
    }

    @Override
    public void onRoundBegin() {
        // No Op
    }

    @Override
    public int getStage() {
        return 1;
    }

    @Override
    public int getPlayerCount() {
        return 0;
    }
}
