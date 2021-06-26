package agricola;

public interface Improvement {
    
    BuildCost getBuildCost();

    // TODO: What are the arguments to this function?  GameState + PlayerState?
    boolean canBuild();

    int getPointValue();
}