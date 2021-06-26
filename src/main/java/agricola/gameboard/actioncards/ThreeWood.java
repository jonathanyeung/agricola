package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class ThreeWood implements ActionCard {

    int woodCount;

    @Override
    public String getName() {
        return "3 Wood";
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
        woodCount += 3;
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
