package agricola.farm;

import java.util.List;

import agricola.farm.FarmSpace.Occupant;

public class DefaultFarmGrid implements FarmGrid {

    private int height = 3;
    private int width = 5;

    FarmSpace[][] farmGrid;


    /*
        Fences are represented as the following:
        Columns      0     1     2     3     4    (Horizonal Fences)
        Columns   0     1     2     3     4    5  (Vertical Fences)
             _     _____ _____ _____ _____ _____
                  |    ||    ||    ||    ||    |
                  |    ||    ||    ||    ||    |
                  |____||____||____||____||____|
    */
    // boolean[][] horizontalFences;
    // boolean[][] verticalFences;

    public DefaultFarmGrid() {
        farmGrid = new FarmSpace[width][height];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                farmGrid[i][j] = new FarmSpace();
            }
        }

        // Starting configuration is to have 2 wooden houses in the bottom left corner.
        farmGrid[0][0].setOccupant(Occupant.room);
        farmGrid[0][1].setOccupant(Occupant.room);

        // horizontalFences = new boolean[height + 1][width];
        // verticalFences = new boolean[height][width + 1];
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public FarmSpace getFarmSpace(int x, int y) {
        return farmGrid[x][y];
    }

    @Override
    public int getRoomCount() {
        return getOccupantCount(Occupant.room);
    }


    @Override
    public int getFieldCount() {
        return getOccupantCount(Occupant.field);
    }

    @Override
    public int getPastureCount() {
        //TODO: Implement
        return 0;
    }

    
    @Override
    public int getStableCount() {
        return getOccupantCount(Occupant.stable);
    }

    @Override
    public void buildRoom(int x, int y) {
        farmGrid[x][y].setOccupant(Occupant.room);    
    }

    @Override
    public void buildField(int x, int y) {
        farmGrid[x][y].setOccupant(Occupant.field);  
    }

    @Override
    public void buildStable(int x, int y) {
        farmGrid[x][y].setOccupant(Occupant.stable);  
    }

    @Override
    public void buildFence(List<FenceCommand> buildFenceCommand) {
        //ToDo: Implement.
    }

    @Override
    public int getUnusedSpaceCount() {
        return getOccupantCount(Occupant.unused);
    }
    
    private int getOccupantCount(Occupant type) {
        int count = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (farmGrid[i][j].getOccupant().equals(type)) {
                    count++;
                }
            }
        }

        return count;
    }


/*  Game Board:
    5 x 3 grid
    Rooms
    Fields
    Pastures
    Stables

    Grain 
    Vegetables

    Sheep
    Wild Board
    Cattle

    Wood
    Clay
    Stone
    Reed

    Family Members
    
    Occupations
    Major Improvements
    Minor Improvements */
}
