package agricola.farm;

import java.util.List;

import agricola.majorimprovements.MajorImprovement;
import agricola.minorimprovements.MinorImprovement;
import agricola.occupations.Occupation;

public interface Farm {
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

    FarmGrid getFarmGrid();

    void setFarmGrid(FarmGrid farmGrid);

    int getGrainCount();

    void setGrainCount(int grainCount);

    int getVeggieCount();

    void setVeggieCount(int veggieCount);

    int getSheepCount();

    void setSheepCount(int sheepCount);

    int getBoarCount();

    void setBoarCount(int boarCount);

    int getCattleCount();

    void setCattleCount(int cattleCount);

    int getWoodCount();

    void setWoodCount(int woodCount);

    int getClayCount();

    void setClayCount(int clayCount);

    int getStoneCount();

    void setStoneCount(int stoneCount);

    int getReedCount();

    void setReedCount(int reedCount);

    int getFoodCount();

    void setFoodCount(int foodCount);

    int getBeggingCardCount();

    void setBeggingCardCount(int beggingCardCount);

    List<Occupation> getUnplayedOccupations();

    void setUnplayedOccupations(List<Occupation> unplayedOccupations);

    List<Occupation> getPlayedOccupations();

    void setPlayedOccupations(List<Occupation> playedOccupations);

    List<MajorImprovement> getPlayedMajorImprovements();

    void setPlayedMajorImprovements(List<MajorImprovement> playedMajorImprovements);

    List<MinorImprovement> getPlayedMinorImprovements();

    void setPlayedMinorImprovements(List<MinorImprovement> playedMinorImprovements);

    List<MinorImprovement> getUnplayedMinorImprovements();

    void setUnplayedMinorImprovements(List<MinorImprovement> unplayedMinorImprovements);

    List<Occupation> getAuxiliaryOccupations();

    void setAuxiliaryOccupations(List<Occupation> auxiliaryOccupations);

    List<MinorImprovement> getAuxiliaryImprovements();

    void setAuxiliaryImprovements(List<MinorImprovement> auxiliaryImprovements);

    int getRemainingStableCount();

    void setRemainingStableCount(int remainingStableCount);

    int getRemainingFenceCount();

    void setRemainingFenceCount(int remainingFenceCount);

    int getBuiltStableCount();

    int getFencedStableCount();

    RoomType getRoomType();

    int getFamilyMemberCount();
}
