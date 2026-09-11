public class MovieReviewProfiler {
    public static void profileReview(String review) {
        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        String trimmedReview = review.trim();
        if (!trimmedReview.isEmpty()) {
            String[] words = trimmedReview.split("\\s+");

            for (int i = 0; i < words.length; i++) {
                String word = words[i].replaceAll("[^a-zA-Z]", "");
                int wordLength = word.length();

                if (wordLength >= 1 && wordLength <= 4) {
                    shortWords++;
                } else if (wordLength <= 8) {
                    mediumWords++;
                } else if (wordLength >= 9) {
                    longWords++;
                }
            }
        }

        System.out.println("Short words: " + shortWords);
        System.out.println("Medium words: " + mediumWords);
        System.out.println("Long words: " + longWords);
    }

    public static void main(String[] args) {
        profileReview("A brilliant and unforgettable cinematic experience.");
    }
}