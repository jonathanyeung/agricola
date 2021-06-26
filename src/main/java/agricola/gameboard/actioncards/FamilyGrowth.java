package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class FamilyGrowth implements ActionCard {

    @Override
    public String getName() {
        return "After Family Grown 1 Minor Improvement";
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
        return 2;
    }

    @Override
    public int getPlayerCount() {
        return 0;
    }
}
