public class Main {
    private static double rowAverage(int[] row) {
        int total = 0;
        for (int value : row) {
            total += value;
        }
        return (double) total / row.length;
    }

    public static void classifyRows(int[][] seatingGrid, double threshold) {
        for (int rowIndex = 0; rowIndex < seatingGrid.length; rowIndex++) {
            double average = rowAverage(seatingGrid[rowIndex]);
            String zone = average < threshold ? "Quiet Zone" : "Buzzing Zone";
            System.out.printf("Row %d: %.2f - %s%n", rowIndex + 1, average, zone);
        }
    }

    public static void main(String[] args) {
        int[][] seatingGrid = {
            {2, 3, 4, 3},
            {7, 8, 6, 9},
            {5, 4, 5, 6}
        };
        classifyRows(seatingGrid, 5.0);
    }
}
