package agricola.gameboard;

import agricola.gameboard.actioncards.*;

public class TwoPlayerBoard extends GameBoardBase{
    public TwoPlayerBoard() {
        super();
        initializeBaseCards();
    }

    private void initializeBaseCards() {
        this.baseCards = new ActionCard[10];

        baseCards[0] = new Fishing();
        baseCards[1] = new BuildRoomAndStables();
        baseCards[2] = new OneOccupation();
        baseCards[3] = new StartingPlayer();
        baseCards[4] = new TakeGrain();
        baseCards[5] = new PlowField();
        baseCards[6] = new DayLaborer();
        baseCards[7] = new ThreeWood();
        baseCards[8] = new OneClay();
        baseCards[9] = new OneReed();
    }
}
