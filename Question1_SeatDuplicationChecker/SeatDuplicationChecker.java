public class SeatDuplicationChecker {
    public static void checkDuplicates(int[] seatNumbers) {
        boolean foundDuplicate = false;

        System.out.println("Duplicated seat numbers:");
        for (int i = 0; i < seatNumbers.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < seatNumbers.length; j++) {
                if (i != j && seatNumbers[i] == seatNumbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            boolean alreadyPrinted = false;
            for (int previous = 0; previous < i; previous++) {
                if (seatNumbers[previous] == seatNumbers[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (isDuplicate && !alreadyPrinted) {
                System.out.println(seatNumbers[i]);
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate seat numbers found.");
        }
    }

    public static void main(String[] args) {
        int[] seatNumbers = {101, 205, 101, 309, 412, 205, 518};
        checkDuplicates(seatNumbers);
    }
}