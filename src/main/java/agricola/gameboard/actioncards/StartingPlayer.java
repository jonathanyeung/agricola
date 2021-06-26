package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class StartingPlayer implements ActionCard {

    @Override
    public String getName() {
        return "Starting Player and/or 1 Minor Improvement";
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
    }

    @Override
    public int getStage() {
        return 0;
    }

    @Override
    public int getPlayerCount() {
        return 0;
    }
}
