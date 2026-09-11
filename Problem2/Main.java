public class Main {
    public static void findFirstDuplicate(String[] teamNames) {
        for (int first = 0; first < teamNames.length; first++) {
            for (int second = first + 1; second < teamNames.length; second++) {
                if (teamNames[first].equals(teamNames[second])) {
                    System.out.println("First duplicate: " + teamNames[first]);
                    return;
                }
            }
        }
        System.out.println("No duplicate team names found.");
    }

    public static void main(String[] args) {
        String[] teamNames = {"ByteBuilders", "CodeCrafters", "NullPointers", "CodeCrafters"};
        findFirstDuplicate(teamNames);
    }
}
