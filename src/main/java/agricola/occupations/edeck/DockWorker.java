package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class DockWorker implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Dock Worker";
    }

    @Override
    public String getDescription() {
        return "At any time, you can use the Dock Worker to convert 3 Woord to either 1 Clay, 1 Reed or 1 Stone, or to convert 2 Clay, 2 Reed, or 2 Stone to 1 other building resource.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
