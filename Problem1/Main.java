import java.util.Arrays;

public class Main {
    public static void curveScores(int[] scores, int bonus) {
        for (int index = 0; index < scores.length; index++) {
            scores[index] += bonus;
        }
    }

    public static void main(String[] args) {
        int[] scores = {72, 84, 91, 68};
        curveScores(scores, 5);
        System.out.println("Curved scores: " + Arrays.toString(scores));
    }
}
