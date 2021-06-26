package agricola.farm;

import java.util.List;

public interface FarmGrid {
    int getWidth();
    int getHeight();

    /**
     * bottom left of the farm is (0,0);
     * @param x
     * @param y
     * @return
     */
    FarmSpace getFarmSpace(int x, int y);

    // Building
    // boolean canBuildRoom(int x, int y);
    // boolean canBuildField(int x, int y);
    // boolean canBuildStable(int x, int y);
    // boolean canBuildFence(List<FenceCommand> buildFenceCommand);

    int getRoomCount();
    int getFieldCount();
    int getPastureCount();
    int getStableCount();

    void buildRoom(int x, int y);
    void buildField(int x, int y);
    void buildStable(int x, int y);

    void buildFence(List<FenceCommand> buildFenceCommand);

    int getUnusedSpaceCount();



    



/*     Game Board:
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
