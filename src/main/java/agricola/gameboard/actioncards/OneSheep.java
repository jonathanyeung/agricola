package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class OneSheep implements ActionCard {

    int sheepCount;

    @Override
    public String getName() {
        return "1 Sheep";
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
        sheepCount++;
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
