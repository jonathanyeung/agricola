package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class OneOccupation implements ActionCard {
    @Override
    public String getName() {
        return "1 Occupation";
    }

    @Override
    public String getDescription() {
        return ("First Occupation is free, each additional one costs 1 Food");
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
