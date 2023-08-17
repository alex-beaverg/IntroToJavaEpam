package by.epam.bobrikov.stage04.simple_classes.task_classes;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<Book> books;

    public Books() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> booksByAuthor(String author) {
        List<Book> newBookList = new ArrayList<>();
        for (Book book: books) {
            if (book.getAuthor().equals(author)) {
                newBookList.add(book);
            }
        }
        return newBookList;
    }

    public List<Book> booksByPublishingHouse(String publishingHouse) {
        List<Book> newBookList = new ArrayList<>();
        for (Book book: books) {
            if (book.getPublishingHouse().equals(publishingHouse)) {
                newBookList.add(book);
            }
        }
        return newBookList;
    }

    public List<Book> booksAfterYear(int year) {
        List<Book> newBookList = new ArrayList<>();
        for (Book book: books) {
            if (book.getYear() > year) {
                newBookList.add(book);
            }
        }
        return newBookList;
    }

    @Override
    public String toString() {
        return "Books: " + books;
    }
}
