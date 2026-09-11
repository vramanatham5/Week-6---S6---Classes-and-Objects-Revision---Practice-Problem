public class WarehouseInventoryBalancer {
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA.length != sectionB.length) {
            System.out.println("The sections must contain arrays of equal length.");
            return;
        }

        int totalA = 0;
        int totalB = 0;
        int highestQuantity = Integer.MIN_VALUE;
        String highestSection = "";
        int highestIndex = -1;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > highestQuantity) {
                highestQuantity = sectionA[i];
                highestSection = "Section A";
                highestIndex = i;
            }

            totalB += sectionB[i];
            if (sectionB[i] > highestQuantity) {
                highestQuantity = sectionB[i];
                highestSection = "Section B";
                highestIndex = i;
            }
        }

        System.out.println("Section A total: " + totalA);
        System.out.println("Section B total: " + totalB);
        System.out.println(totalA == totalB ? "Balanced" : "Not Balanced");
        System.out.println("Highest quantity: " + highestQuantity + " in "
                + highestSection + " at index " + highestIndex);
    }

    public static void main(String[] args) {
        analyzeInventory(new int[] {20, 35, 15, 40}, new int[] {25, 30, 20, 35});
    }
}