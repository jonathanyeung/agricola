package agricola.farm;

import java.util.ArrayList;
import java.util.List;

import agricola.majorimprovements.MajorImprovement;
import agricola.minorimprovements.MinorImprovement;
import agricola.occupations.Occupation;

public class BasicFarm implements Farm {
    FarmGrid farmGrid;
    
    // Sowables:
    private int grainCount;
    private int veggieCount;

    // Animals:
    private int sheepCount;
    private int boarCount;
    private int cattleCount;

    // Resources:
    private int woodCount;
    private int clayCount;
    private int stoneCount;
    private int reedCount;

    private int foodCount;
    private int beggingCardCount;

    private List<Occupation> unplayedOccupations;
    private List<Occupation> playedOccupations;
    private List<MajorImprovement> playedMajorImprovements;
    private List<MinorImprovement> playedMinorImprovements;
    private List<MinorImprovement> unplayedMinorImprovements;

    // These are occupations/improvements played by a different player that can affect the behavior of the current
    // player. For example, whoever has the most fields gets 3 bonus points at the end of the game, etc.
    private List<Occupation> auxiliaryOccupations;
    private List<MinorImprovement> auxiliaryImprovements;

    private int remainingStableCount;
    private int remainingFenceCount;

    private RoomType roomType;

    private int familyMemberCount;

    public BasicFarm() {
        this.unplayedOccupations = new ArrayList<Occupation>();
        this.playedOccupations = new ArrayList<Occupation>();
        this.playedMajorImprovements = new ArrayList<MajorImprovement>();
        this.playedMinorImprovements = new ArrayList<MinorImprovement>();
        this.unplayedMinorImprovements = new ArrayList<MinorImprovement>();
        this.auxiliaryOccupations = new ArrayList<Occupation>();
        this.auxiliaryImprovements = new ArrayList<MinorImprovement>();
        this.roomType = RoomType.Wood;
        familyMemberCount = 2;
    }


    @Override
    public FarmGrid getFarmGrid() {
        return this.farmGrid;
    }

    @Override
    public void setFarmGrid(FarmGrid farmGrid) {
        this.farmGrid = farmGrid;
    }

    @Override
    public int getGrainCount() {
        return this.grainCount;
    }

    @Override
    public void setGrainCount(int grainCount) {
        this.grainCount = grainCount;
    }

    @Override
    public int getVeggieCount() {
        return this.veggieCount;
    }

    @Override
    public void setVeggieCount(int veggieCount) {
        this.veggieCount = veggieCount;
    }

    @Override
    public int getSheepCount() {
        return this.sheepCount;
    }

    @Override
    public void setSheepCount(int sheepCount) {
        this.sheepCount = sheepCount;
    }

    @Override
    public int getBoarCount() {
        return this.boarCount;
    }

    @Override
    public void setBoarCount(int boarCount) {
        this.boarCount = boarCount;
    }

    @Override
    public int getCattleCount() {
        return this.cattleCount;
    }

    @Override
    public void setCattleCount(int cattleCount) {
        this.cattleCount = cattleCount;
    }

    @Override
    public int getWoodCount() {
        return this.woodCount;
    }

    @Override
    public void setWoodCount(int woodCount) {
        this.woodCount = woodCount;
    }

    @Override
    public int getClayCount() {
        return this.clayCount;
    }

    @Override
    public void setClayCount(int clayCount) {
        this.clayCount = clayCount;
    }

    @Override
    public int getStoneCount() {
        return this.stoneCount;
    }

    @Override
    public void setStoneCount(int stoneCount) {
        this.stoneCount = stoneCount;
    }

    @Override
    public int getReedCount() {
        return this.reedCount;
    }

    @Override
    public void setReedCount(int reedCount) {
        this.reedCount = reedCount;
    }

    @Override
    public int getFoodCount() {
        return this.foodCount;
    }

    @Override
    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    @Override
    public int getBeggingCardCount() {
        return this.beggingCardCount;
    }

    @Override
    public void setBeggingCardCount(int beggingCardCount) {
        this.beggingCardCount = beggingCardCount;
    }

    @Override
    public List<Occupation> getUnplayedOccupations() {
        return this.unplayedOccupations;
    }

    @Override
    public void setUnplayedOccupations(List<Occupation> unplayedOccupations) {
        this.unplayedOccupations = unplayedOccupations;
    }

    @Override
    public List<Occupation> getPlayedOccupations() {
        return this.playedOccupations;
    }

    @Override
    public void setPlayedOccupations(List<Occupation> playedOccupations) {
        this.playedOccupations = playedOccupations;
    }

    @Override
    public List<MajorImprovement> getPlayedMajorImprovements() {
        return this.playedMajorImprovements;
    }

    @Override
    public void setPlayedMajorImprovements(List<MajorImprovement> playedMajorImprovements) {
        this.playedMajorImprovements = playedMajorImprovements;
    }

    @Override
    public List<MinorImprovement> getPlayedMinorImprovements() {
        return this.playedMinorImprovements;
    }

    @Override
    public void setPlayedMinorImprovements(List<MinorImprovement> playedMinorImprovements) {
        this.playedMinorImprovements = playedMinorImprovements;
    }

    @Override
    public List<MinorImprovement> getUnplayedMinorImprovements() {
        return this.unplayedMinorImprovements;
    }

    @Override
    public void setUnplayedMinorImprovements(List<MinorImprovement> unplayedMinorImprovements) {
        this.unplayedMinorImprovements = unplayedMinorImprovements;
    }

    @Override
    public List<Occupation> getAuxiliaryOccupations() {
        return this.auxiliaryOccupations;
    }

    @Override
    public void setAuxiliaryOccupations(List<Occupation> auxiliaryOccupations) {
        this.auxiliaryOccupations = auxiliaryOccupations;
    }

    @Override
    public List<MinorImprovement> getAuxiliaryImprovements() {
        return this.auxiliaryImprovements;
    }

    @Override
    public void setAuxiliaryImprovements(List<MinorImprovement> auxiliaryImprovements) {
        this.auxiliaryImprovements = auxiliaryImprovements;
    }

    @Override
    public int getRemainingStableCount() {
        return this.remainingStableCount;
    }

    @Override
    public void setRemainingStableCount(int remainingStableCount) {
        this.remainingStableCount = remainingStableCount;
    }

    @Override
    public int getRemainingFenceCount() {
        return this.remainingFenceCount;
    }

    @Override
    public void setRemainingFenceCount(int remainingFenceCount) {
        this.remainingFenceCount = remainingFenceCount;
    }

    @Override
    public int getBuiltStableCount() {
        // TODO: Implement properly
        return 4 - this.remainingStableCount;
    }

    @Override
    public int getFencedStableCount() {
        // TODO: Implement properly.
        return getBuiltStableCount();
    }

    @Override
    public RoomType getRoomType() {
        return this.roomType;
    }

    @Override
    public int getFamilyMemberCount() {
        return this.familyMemberCount;
    }
}