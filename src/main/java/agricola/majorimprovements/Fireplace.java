package agricola.majorimprovements;

import agricola.BakingImprovement;
import agricola.BuildCost;
import agricola.FoodConvertable;
import agricola.FoodConverter;

public class Fireplace implements BakingImprovement, FoodConverter, MajorImprovement {

    private BuildCost buildCost;

    public Fireplace(BuildCost buildCost) {
        this.buildCost = buildCost;
    }

    @Override
    public int getConvertableQuantity(FoodConvertable toBeConverted) {
        // Fireplace has no conversion limits.
        // TODO: Is there a better way to pass infinity?
        return Integer.MAX_VALUE;
    }

    @Override
    public int foodProduced(FoodConvertable toBeConverted, int quantity) {
        // TODO:Implement
        return 0;
    }

    @Override
    public BuildCost getBuildCost() {
        return buildCost;
    }

    @Override
    public boolean canBuild() {
        return true;
    }

    @Override
    public String getName() {
        return "Fireplace";
    }

    @Override
    public String getDescription() {
        //TODO: Finish Description.
        return "At any time you may...";
    }

    @Override
    public int getPointValue() {
        return 1;
    }
}
