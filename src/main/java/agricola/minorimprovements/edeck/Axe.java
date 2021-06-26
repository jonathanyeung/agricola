package agricola.minorimprovements.edeck;

import agricola.BuildCost;
import agricola.DeckSet;
import agricola.minorimprovements.MinorImprovement;

public class Axe implements MinorImprovement {

    @Override
    public String getName() {
        return "Axe";
    }

    @Override
    public String getDescription() {
        return "Whenever you add a room to your Wooden hut, you only pay 2 Wood and 2 Reed.";
    }

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public BuildCost getBuildCost() {
        return new BuildCost()
            .setWoodCost(1)
            .setStoneCost(1);
    }

    @Override
    public boolean canBuild() {
        return false;
    }

    @Override
    public int minimumPlayerCount() {
        return 0;
    }

    @Override
    public int getPointValue() {
        return 1;
    }

}
