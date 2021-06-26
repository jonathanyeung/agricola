package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class Fishing implements ActionCard {

    int fishCount;

    @Override
    public String getName() {
        return "Fishing";
    }

    @Override
    public String getDescription() {
        return "1 Food";
    }

    @Override
    public List<Action> getActionChoices() {
        //TODO: Implement
        return null;
    }

    @Override
    public void onRoundBegin() {
        fishCount++;
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
