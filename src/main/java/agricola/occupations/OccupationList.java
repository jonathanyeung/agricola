package agricola.occupations;

import java.util.List;

import com.google.common.collect.ImmutableList;

import agricola.DeckSet;
import agricola.occupations.Occupation;
import agricola.occupations.edeck.*;

public class OccupationList {
    public static List<Occupation> getDeckOccupations(DeckSet deck) {
        switch(deck) {
            case E:
                return getEDeck();
            default:
                return getEDeck();
        }
    }

    private static List<Occupation> getEDeck() {
        return ImmutableList.of(
            new LandAgent(),
            new Academic(),
            new MasterBaker(),
            new Baker(),
            new MasterBuilder(),
            new BerryPicker(),
            new Mendicant(),
            new MasterBrewer(),
            new BreadSeller(),
            new BrushMaker(),
            new Thatcher(),
            new Turner(),
            new HeadOfTheFamily(),
            new Farmer(),
            new Fisherman(),
            new MeatSeller(),
            new FieldWarden(),
            new MasterForester(),
            new YeomanFarmer(),
            new Undergardener(),
            new Conjurer(),
            new Greengrocer(),
            new Storyteller(),
            new EstateManager(),
            new DockWorker(),
            new Chief(),
            new ChiefsDaughter(),
            new Tutor(),
            new HedgeKeeper(),
            new Woodcutter(),
            new WoodenHutBuilder(),
            new HutBuilder(),
            new Merchant(),
            new HobbyFarmer(),
            new Cook(),
            new CharcoalBurner(),
            new Basketmaker(),
            new Grocer(),
            new ClayFirer(),
            new ClaySeller(),
            new ClayDeliveryman(),
            new ClayMixer(),
            new LordOfTheManor(),
            new Maid(),
            new Mason(),
            new Patron(),
            new Pastor(),
            new PlowDriver(),
            new PlowMaker(),
            new MushroomCollector(),
            new Braggart(),
            new Ratcatcher(),
            new Renovator(),
            new Conservator(),
            new CattleWhisperer(),
            new SeasonalWorker(),
            new Sheperd(),
            new MasterSheperd(),
            new ReedCollector(),
            new Swineherd(),
            new Stablehand(),
            new Stablemaster(),
            new Quarryman(),
            new StoneCarrier(),
            new Stonecutter(),
            new Dancer(),
            new Stockman(),
            new Potter(),
            new TenantFarmer(),
            new AnimalKeeper(),
            new Reeve(),
            new Carpenter(),
            new Guildmaster());
    }
}
