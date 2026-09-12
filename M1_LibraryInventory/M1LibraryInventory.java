class BookInventory {
    String title;
    String author;
    int copiesAvailable;

    BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    void printEntry() {
        System.out.println("Title: " + title + " | Author: " + author
                + " | Copies available: " + copiesAvailable);
    }
}

public class M1LibraryInventory {
    public static void main(String[] args) {
        BookInventory[] inventory = {
            new BookInventory("1984", "George Orwell", 5),
            new BookInventory("The Hobbit", "J.R.R. Tolkien", 3),
            new BookInventory("Pride and Prejudice", "Jane Austen", 4),
            new BookInventory("The Alchemist", "Paulo Coelho", 6)
        };

        for (BookInventory book : inventory) {
            book.printEntry();
        }
    }
}