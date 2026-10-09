package bai2_5;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public boolean equals(Book other) {
        if (this.title.equals(other.title) && this.author.equals(other.author) && this.price == other.price) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("hello", "cyne", 29);
        Book book2 = new Book("hello", "cyne", 29);
        if(book1 == book2) {
            System.out.println("== true");
        } else System.out.println("== false");

        if(book1.equals(book2)) {
            System.out.println("equals true");
        } else System.out.println("equals false");
    }
}
