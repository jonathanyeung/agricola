package agricola.occupations;

import agricola.Card;
import agricola.InDeckSet;

public interface Occupation extends Card, InDeckSet{
    // Some cards are only introduced when there are greater than a certain number of players.
    public int minimumPlayerCount();
}
