class Book {
    String title;
    String author;
    double price;
    boolean isAvailable;

  
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is currently unavailable.");
        }
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 299);

        book1.displayInfo();
        book1.borrowBook();
        book1.displayInfo();
        book1.borrowBook();
    }
}
