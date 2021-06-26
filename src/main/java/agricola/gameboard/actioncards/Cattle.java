package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class Cattle implements ActionCard {

    int cowCount;

    @Override
    public String getName() {
        return "1 Cattle";
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
        cowCount++;
    }

    @Override
    public int getStage() {
        return 4;
    }

    @Override
    public int getPlayerCount() {
        return 0;
    }
}
