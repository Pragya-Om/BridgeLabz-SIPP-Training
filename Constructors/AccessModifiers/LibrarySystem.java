package Constructors.AccessModifiers;

public class LibrarySystem {

    static class Book {
        public String ISBN;       
        protected String title;     
        private String author;      
    
        public Book(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        
        public String getAuthor() {
            return author;
        }

        
        public void setAuthor(String author) {
            this.author = author;
        }

        
        public void displayBookDetails() {
            System.out.println("ISBN   : " + ISBN);
            System.out.println("Title  : " + title);
            System.out.println("Author : " + author);
            System.out.println("-----------------------------");
        }
    }

    
    static class EBook extends Book {
        private double fileSizeMB;

        public EBook(String ISBN, String title, String author, double fileSizeMB) {
            super(ISBN, title, author);
            this.fileSizeMB = fileSizeMB;
        }

        public void displayEBookDetails() {
           
            System.out.println("EBook ISBN   : " + ISBN);   
            System.out.println("EBook Title  : " + title);  
            System.out.println("File Size    : " + fileSizeMB + " MB");
            System.out.println("-----------------------------");
        }
    }

  
    public static void main(String[] args) {
        Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        book1.displayBookDetails();

        book1.setAuthor("Joshua Bloch (Updated)");
        System.out.println("Updated Author: " + book1.getAuthor());
        book1.displayBookDetails();

        EBook ebook1 = new EBook("978-1492056270", "Java Cookbook", "Ian F. Darwin", 5.2);
        ebook1.displayEBookDetails();
        ebook1.displayBookDetails(); 
    }
}
