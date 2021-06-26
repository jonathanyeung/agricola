package agricola;

public class BuildCost {
    private int woodCost;
    private int clayCost;
    private int stoneCost;
    private int reedCost;
    private int foodCost;

    public BuildCost() {}


    public int getWoodCost() {
        return this.woodCost;
    }

    public BuildCost setWoodCost(int woodCost) {
        this.woodCost = woodCost;
        return this;
    }

    public int getClayCost() {
        return this.clayCost;
    }

    public BuildCost setClayCost(int clayCost) {
        this.clayCost = clayCost;
        return this;
    }

    public int getStoneCost() {
        return this.stoneCost;
    }

    public BuildCost setStoneCost(int stoneCost) {
        this.stoneCost = stoneCost;
        return this;
    }

    public int getReedCost() {
        return this.reedCost;
    }

    public BuildCost setReedCost(int reedCost) {
        this.reedCost = reedCost;
        return this;
    }

    public int getFoodCost() {
        return this.foodCost;
    }

    public BuildCost setFoodCost(int foodCost) {
        this.foodCost = foodCost;
        return this;
    }
}
