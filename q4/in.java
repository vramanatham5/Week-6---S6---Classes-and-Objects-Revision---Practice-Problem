class IdCard {
    String name;
    int booksIssued;

    IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
}

public class in {
    public static void main(String[] args) {
        IdCard firstCard = new IdCard("Ravi", 2);
        IdCard secondCard = firstCard;

        secondCard.booksIssued = 5;

        System.out.println("Books issued through firstCard: " + firstCard.booksIssued);
        System.out.println("firstCard == secondCard: " + (firstCard == secondCard));

        IdCard thirdCard = new IdCard("Ravi", 5);
        System.out.println("thirdCard == firstCard: " + (thirdCard == firstCard));
    }
}