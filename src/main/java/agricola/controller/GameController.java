package agricola.controller;

import java.util.List;

import com.google.inject.Inject;

import agricola.gameboard.GameBoardBase;
import agricola.majorimprovements.MajorImprovement;
import agricola.minorimprovements.MinorImprovement;
import agricola.occupations.Occupation;
import agricola.player.Player;

public class GameController {
    private GameBoardBase gameBoard;
    private List<Occupation> occupationSet;
    private List<MinorImprovement> minorImprovementSet;
    private List<MajorImprovement> majorImprovementSet;
    private List<Player> players;

    private Player currentTurn;
    private int roundNumber = 0;

    @Inject
    GameController(
            GameBoardBase gameBoard,
            List<Occupation> occupationSet,
            List<MinorImprovement> minorImprovementSet,
            List<MajorImprovement> majorImprovementSet,
            List<Player> players) {
        this.gameBoard = gameBoard;
        this.occupationSet = occupationSet;
        this.minorImprovementSet = minorImprovementSet;
        this.majorImprovementSet = majorImprovementSet;
        this.players = players;
    }

    public Player getCurrentTurn() {
        return currentTurn;
    }

    public Player getPlayerState(int playerId) {
        return null;
    }

    public void submitTurn(Player player ) {

    }

    /**
     * General game flow:
     * It is Player A's turn.
     * 
     * Player A is presented with several actions. 
     * Some actions end the turn, while others don't.
     * Actions that don't end a turn include:
     *  * Food Conversion
     *  * Moving Animals
     *  * Placing the first person in a lasso
     * 
     * Actions that end the turn:
     *  * Placing your family member.
     * 
     * Certain actions can trigger actions on other players (Reed Buyer)
     * 
     * Actions should be transactional (you don't confirm your actions until you hit play button.  You can cancel everything)
     */
}
