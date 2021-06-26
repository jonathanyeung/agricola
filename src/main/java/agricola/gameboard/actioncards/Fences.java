package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class Fences implements ActionCard {

    @Override
    public String getName() {
        return "Fences";
    }

    @Override
    public String getDescription() {
        return "1 Wood per fence.";
    }

    @Override
    public List<Action> getActionChoices() {
        //TODO: Implement
        return null;
    }

    @Override
    public void onRoundBegin() {
        //No Op.
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
