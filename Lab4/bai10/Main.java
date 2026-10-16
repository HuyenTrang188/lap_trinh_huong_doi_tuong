package bai10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibrarySection<Book> bookSection = new LibrarySection<>();
        LibrarySection<DVD> dvdSection = new LibrarySection<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String id = sc.next();
            String name = sc.next();

            if (type.equals("B")) {
                String author = sc.next();
                int pages = sc.nextInt();

                bookSection.addItem(
                    new Book(id, name, author, pages)
                );
            } else if (type.equals("D")) {
                String director = sc.next();
                int duration = sc.nextInt();

                dvdSection.addItem(
                    new DVD(id, name, director, duration)
                );
            }
        }

        System.out.println("Khu vuc sach:");
        bookSection.displayAll();

        System.out.println();
        System.out.println("Khu vuc DVD:");
        dvdSection.displayAll();

        sc.close();
    }
}
