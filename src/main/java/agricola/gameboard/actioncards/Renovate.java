package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class Renovate implements ActionCard {

    @Override
    public String getName() {
        return "After Renovation also 1 Major or 1 Minor Improvement";
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
