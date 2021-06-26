package agricola.occupations.edeck;

import agricola.DeckSet;
import agricola.occupations.Occupation;

public class Conservator implements Occupation {

    @Override
    public DeckSet getDeckSet() {
        return DeckSet.E;
    }

    @Override
    public String getName() {
        return "Conservator";
    }

    @Override
    public String getDescription() {
        return "You can reonvate your Wooden hut to a Stone house without first needing to renovate it to a Clay hut.";
    }

    @Override
    public int minimumPlayerCount() {
        return 1;
    }
}
