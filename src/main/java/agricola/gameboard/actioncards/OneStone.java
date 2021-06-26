package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class OneStone implements ActionCard {

    int stoneCount;

    @Override
    public String getName() {
        return "1 Stone";
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
        stoneCount++;
    }

    @Override
    public int getStage() {
        return 2;
    }

    @Override
    public int getPlayerCount() {
        return 0;
    }
}
