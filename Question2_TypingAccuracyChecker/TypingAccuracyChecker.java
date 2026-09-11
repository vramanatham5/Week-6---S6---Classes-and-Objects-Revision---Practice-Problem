public class TypingAccuracyChecker {
    public static void checkTypingAccuracy(String original, String typed) {
        if (original.length() != typed.length()) {
            System.out.println("The original passage and typed text must have equal length.");
            return;
        }

        int matchedCharacters = 0;
        int firstMismatchPosition = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matchedCharacters++;
            } else if (firstMismatchPosition == -1) {
                firstMismatchPosition = i + 1;
            }
        }

        double accuracy = (double) matchedCharacters / original.length() * 100;
        System.out.printf("Accuracy: %.2f%%%n", accuracy);

        if (firstMismatchPosition == -1) {
            System.out.println("There were no mismatches.");
        } else {
            System.out.println("First mismatch position: " + firstMismatchPosition);
        }
    }

    public static void main(String[] args) {
        checkTypingAccuracy("Java makes coding fun", "Java mikes coding fun");
    }
}