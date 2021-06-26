package agricola.farm;

public class FarmSpace {
    private Occupant occupant;

    public Occupant getOccupant() {
        return this.occupant;
    }

    public void setOccupant(Occupant occupant) {
        if (this.occupant.equals(Occupant.unused)) {
            this.occupant = occupant;
        }
        else {
            throw new IllegalStateException("This farm space is already occupied!");
        }
    }

    boolean isUsed;

    boolean containsField;

    boolean containsRoom;

    boolean containsPasture;

    boolean fencedLeft;
    boolean fencedRight;
    boolean fencedTop;
    boolean fencedBottom;

    public boolean fenced(Side side) {
        switch(side) {
            case left:
                return fencedLeft;
            case right:
                return fencedRight;
            case top:
                return fencedTop;
            case bottom:
                return fencedBottom;
            default:
                //TODO: throw.
                return false;
        }
    }


    boolean containsAnimal;

    
    public enum Side {
        left,
        right,
        top,
        bottom
    }

    public enum Occupant {
        unused,
        room,
        field,
        stable
    }

    
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


}
