public class Main {
    public static void main(String[] args) {
        Necklace necklace = new Necklace();

        PreciousGemstone diamond = new PreciousGemstone("Diamond", 2.5, 5000, 0.1);
        PreciousGemstone emerald = new PreciousGemstone("Emerald", 3.0, 8000, 0.4);
        SemiPreciousGemstone amethyst = new SemiPreciousGemstone("Amethyst", 1.0, 200, 0.7);

        necklace.addGemstone(diamond);
        necklace.addGemstone(emerald);
        necklace.addGemstone(amethyst);

        System.out.println("Total Weight: " + necklace.calculateTotalWeight() + " carats");
        System.out.println("Total Price: $" + necklace.calculateTotalPrice());

        necklace.sortByValue();
        System.out.println("\nSorted by Value:");
        for (Gemstone gemstone : necklace.findGemstonesInTransparencyRange(0.1, 0.9)) {
            System.out.println(gemstone);
        }
    }
}
