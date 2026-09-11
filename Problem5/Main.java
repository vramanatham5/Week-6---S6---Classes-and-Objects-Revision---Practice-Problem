import java.util.Arrays;

public class Main {
    private static class Candidate implements Comparable<Candidate> {
        private final String name;
        private final double cgpa;
        private final int codingScore;

        public Candidate(String name, double cgpa, int codingScore) {
            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
        }

        public static boolean isEligible(double cgpa) {
            return cgpa >= 8.5;
        }

        public static boolean isEligible(double cgpa, int codingScore) {
            return cgpa >= 7.5 && codingScore >= 75;
        }

        private double compositeScore() {
            return cgpa * 10 + codingScore;
        }

        @Override
        public int compareTo(Candidate other) {
            return Double.compare(other.compositeScore(), compositeScore());
        }

        @Override
        public String toString() {
            return String.format("%s (CGPA: %.1f, coding: %d, composite: %.1f)",
                    name, cgpa, codingScore, compositeScore());
        }
    }

    public static void main(String[] args) {
        Candidate[] candidates = {
            new Candidate("Aarav", 9.1, 72),
            new Candidate("Diya", 8.0, 86),
            new Candidate("Kabir", 7.2, 92),
            new Candidate("Meera", 8.7, 81),
            new Candidate("Rohan", 7.8, 78)
        };

        Candidate[] shortlisted = Arrays.stream(candidates)
                .filter(candidate -> Candidate.isEligible(candidate.cgpa)
                        || Candidate.isEligible(candidate.cgpa, candidate.codingScore))
                .toArray(Candidate[]::new);

        Arrays.sort(shortlisted);
        System.out.println("Shortlisted and ranked candidates:");
        for (Candidate candidate : shortlisted) {
            System.out.println(candidate);
        }
    }
}
