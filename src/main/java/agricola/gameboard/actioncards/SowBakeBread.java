package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class SowBakeBread implements ActionCard {

    @Override
    public String getName() {
        return "Sow and/or Bake Bread";
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
        return 1;
    }

    @Override
    public int getPlayerCount() {
        return 0;
    }
}
