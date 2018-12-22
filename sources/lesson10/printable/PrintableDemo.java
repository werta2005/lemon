package lesson10.printable;

import lesson10.printable.Book;
import lesson10.printable.Magazine;
import lesson10.printable.Printable;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable[] printables = {new Book("Book1"), new Magazine("Magazine1"), new Magazine("Magazine2")};
        for (Printable printable : printables) {
            printable.print();
        }
        Magazine.printMagazines(printables);
        Book.printBook(printables);
    }
}
