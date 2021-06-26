package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class Vegetable implements ActionCard {

    @Override
    public String getName() {
        return "Take 1 Vegetable";
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
        return 3;
    }

    @Override
    public int getPlayerCount() {
        return 0;
    }
}
