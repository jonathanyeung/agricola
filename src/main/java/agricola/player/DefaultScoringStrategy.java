package agricola.player;

import agricola.farm.Farm;

/**
 * Default scoring methodology without any modifiers.
 */
public class DefaultScoringStrategy implements ScoringStrategy {

    @Override
    public int calculateScore(Farm farm) {
        int score = 0;

        int fieldCount = farm.getFarmGrid().getFieldCount();

        // Score Fields:
        if (fieldCount <= 1) {
            score += -1;
        }
        else if (fieldCount == 2) {
            score += 1;
        }
        else if (fieldCount == 3) {
            score += 2;
        }
        else if (fieldCount == 4) {
            score += 3;
        }
        else{
            score += 4;
        }

        // Score Pastures
        int pastureCount = farm.getFarmGrid().getPastureCount();
        if (pastureCount <= 0) {
            score -= 1;
        }
        else if (pastureCount <= 3) {
            score += pastureCount;
        }
        else {
            score += 4;
        }

        // Score Grain:
        int grainCount = farm.getGrainCount();
        if (grainCount <= 0) {
            score -= 1;
        }
        else if (grainCount <= 3) {
            score += 1;
        }
        else if (grainCount <= 5) {
            score += 2;
        }
        else if (grainCount <= 7) {
            score += 3;
        }
        else {
            score += 4;
        }

        // Score Veggies:
        int veggieCount = farm.getVeggieCount();
        if (veggieCount <= 0) {
            score -= 1;
        }
        else if (veggieCount <= 3) {
            score += veggieCount;
        }
        else {
            score += 4;
        }

        // Score Sheep:
        int sheepCount = farm.getSheepCount();
        if (sheepCount <= 0) {
            score -= 1;
        }
        else if (sheepCount <= 3) {
            score += 1;
        }
        else if (sheepCount <= 5) {
            score += 2;
        }
        else if (sheepCount <= 7) {
            score += 3;
        }
        else {
            score += 4;
        }

        // Score Boar:
        int boarCount = farm.getBoarCount();
        if (boarCount <= 0) {
            score -= 1;
        }
        else if (boarCount <= 2) {
            score += 1;
        }
        else if (boarCount <= 4) {
            score += 2;
        }
        else if (boarCount <= 6) {
            score += 3;
        }
        else {
            score += 4;
        }

        // Score Cattle:
        int cattleCount = farm.getCattleCount();
        if (cattleCount <= 0) {
            score -= 1;
        }
        else if (cattleCount <= 1) {
            score += 1;
        }
        else if (cattleCount <= 3) {
            score += 2;
        }
        else if (cattleCount <= 5) {
            score += 3;
        }
        else {
            score += 4;
        }

        // Score Unused Farmspace:
        score -= farm.getFarmGrid().getUnusedSpaceCount();

        // Score Fenced Stables:
        score += farm.getFencedStableCount();

        // Score Family Members:
        score += (3 * farm.getFamilyMemberCount());

        // Score Rooms:
        switch(farm.getRoomType()) {
            case Wood:
                break;
            case Clay:
                score += farm.getFarmGrid().getRoomCount();
                break;
            case Stone:
                score += (2 * farm.getFarmGrid().getRoomCount());
                break;
        }

        return score;
    }
}
