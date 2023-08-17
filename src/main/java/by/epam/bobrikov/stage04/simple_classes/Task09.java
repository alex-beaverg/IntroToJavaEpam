package by.epam.bobrikov.stage04.simple_classes;

import by.epam.bobrikov.stage04.simple_classes.task_classes.Book;
import by.epam.bobrikov.stage04.simple_classes.task_classes.Books;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать
 * критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года
 */
public class Task09 {
    public void taskCalculation() {
        Book book1 = new Book(101, "Chook and Gek", "Gaidar", "AST", 2015, 100,
                12, "hard cover");
        Book book2 = new Book(22, "Gek and Chook", "Gaidar", "OSP", 1997, 106,
                13, "hard cover");
        Book book3 = new Book(13, "Metallica", "Hetfield", "AST", 2010, 223,
                29, "soft cover");
        Book book4 = new Book(46, "Harry Potter 1", "Rolling", "OSP", 2005, 401,
                22, "soft cover");
        Book book5 = new Book(51, "Book 5", "Unknown", "AST", 1999, 15,
                5, "hard cover");

        Books books = new Books();
        books.addBook(book1);
        books.addBook(book2);
        books.addBook(book3);
        books.addBook(book4);
        books.addBook(book5);

        System.out.print("Books by author Gaidar: \nBooks: ");
        System.out.println(books.booksByAuthor("Gaidar"));
        System.out.println();

        System.out.print("Books by publishing house AST: \nBooks: ");
        System.out.println(books.booksByPublishingHouse("AST"));
        System.out.println();

        System.out.print("Books after 2000 year: \nBooks: ");
        System.out.println(books.booksAfterYear(2000));
    }
}
