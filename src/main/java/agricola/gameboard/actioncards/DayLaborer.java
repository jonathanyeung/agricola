package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class DayLaborer implements ActionCard {

    @Override
    public String getName() {
        return "Day Laborer";
    }

    @Override
    public String getDescription() {
        return "Take 2 food and place them in your personal supply.";
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
        return 0;
    }

    @Override
    public int getPlayerCount() {
        return 0;
    }
}
