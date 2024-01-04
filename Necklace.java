import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Necklace {
    private ArrayList<Gemstone> gemstones = new ArrayList<>();

    public void addGemstone(Gemstone gemstone) {
        gemstones.add(gemstone);
    }

    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (Gemstone gemstone : gemstones) {
            totalWeight += gemstone.getCaratWeight();
        }
        return totalWeight;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Gemstone gemstone : gemstones) {
            totalPrice += gemstone.getPrice();
        }
        return totalPrice;
    }

    public void sortByValue() {
        Collections.sort(gemstones, Comparator.comparing(Gemstone::getPrice).reversed());
    }

    public ArrayList<Gemstone> findGemstonesInTransparencyRange(double minTransparency, double maxTransparency) {
        ArrayList<Gemstone> result = new ArrayList<>();
        for (Gemstone gemstone : gemstones) {
            if (gemstone.getTransparency() >= minTransparency && gemstone.getTransparency() <= maxTransparency) {
                result.add(gemstone);
            }
        }
        return result;
    }
}
