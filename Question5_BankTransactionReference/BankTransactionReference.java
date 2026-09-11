import java.util.Scanner;

public class BankTransactionReference {
    public static String validateAndFormatReference(String rawReference) {
        String reference = rawReference.trim();
        if (reference.length() < 3) {
            return "Invalid: wrong length";
        }

        String normalizedReference = reference.substring(0, 3).toUpperCase()
                + reference.substring(3);
        if (normalizedReference.length() != 14) {
            return "Invalid: wrong length";
        }

        for (int index = 0; index < 3; index++) {
            if (!Character.isLetter(normalizedReference.charAt(index))) {
                return "Invalid: non-letter bank code";
            }
        }

        for (int index = 3; index < normalizedReference.length(); index++) {
            if (!Character.isDigit(normalizedReference.charAt(index))) {
                return "Invalid: non-digit";
            }
        }

        String bankCode = normalizedReference.substring(0, 3);
        String date = normalizedReference.substring(3, 9);
        String sequence = normalizedReference.substring(9);
        StringBuilder formatted = new StringBuilder();
        formatted.append('[').append(bankCode).append("] DATE: ")
                .append(date, 0, 2).append('/')
                .append(date, 2, 4).append('/')
                .append(date, 4, 6).append(" | SEQ: ")
                .append(sequence);
        return formatted.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(validateAndFormatReference(scanner.nextLine()));
    }
}