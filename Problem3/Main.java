import java.util.Arrays;

public class Main {
    public static int[] findTopThree(int[] scores) {
        if (scores.length < 3) {
            throw new IllegalArgumentException("At least three scores are required.");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int score : scores) {
            if (score >= first) {
                third = second;
                second = first;
                first = score;
            } else if (score >= second) {
                third = second;
                second = score;
            } else if (score > third) {
                third = score;
            }
        }

        return new int[] {first, second, third};
    }

    public static void main(String[] args) {
        int[] scores = {78, 96, 88, 91, 84, 99};
        System.out.println("Top three scores: " + Arrays.toString(findTopThree(scores)));
    }
}
