package agricola.player;

/**
 * These are things that a player can do that require UI interaction.
 */
public enum PlayerActions {
    // Actions that players must use a family member to do:
    BuildRoom,          // Requires Coordinates
    RemoveRoom,         // Requires Coordinates
    PlowField,          // Requires Coordinates
    RemoveField,        // Requires Coordinates
    BuildStable,        // Requires Coordinates
    RemoveStable,       // Requires Coordinates
    BuildFences,        // Requires Fence Coordinates
    RemoveFences,       // Requires Fence Coordinates
    TakeResources,
    PlayOccupation,
    StartingPlayer,
    MajorImprovement,
    MinorImprovement,
    Sow,
    BakeBread,
    FamilyGrowth,
    Renovation
}
