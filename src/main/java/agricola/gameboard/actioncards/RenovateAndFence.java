package agricola.gameboard.actioncards;

import java.util.List;

import agricola.gameboard.Action;
import agricola.gameboard.ActionCard;

public class RenovateAndFence implements ActionCard {

    @Override
    public String getName() {
        return "After Reonvation also Fences. 1 Wood per fence";
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
        return 6;
    }

    @Override
    public int getPlayerCount() {
        return 0;
    }
}
