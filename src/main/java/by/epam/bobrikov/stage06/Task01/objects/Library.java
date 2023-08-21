package by.epam.bobrikov.stage06.Task01.objects;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private static List<Book> getLibrary() {
        List<Book> books = new ArrayList<>();
        String[] items;
        File libraryFile = new File("src//main//java//by//epam//bobrikov//stage06//Task01//database//books.txt");
        try(FileReader fileReader = new FileReader(libraryFile)) {
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                items = scan.nextLine().split("\\s//\\s");
                books.add(new Book(Integer.parseInt(items[0]), items[1], items[2], items[3]));
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return books;
    }

    protected static Book findBookByTitle(String title) {
        List<Book> books = getLibrary();
        for (Book book: books) {
            if (title.equals(book.getTitle())) {
                return book;
            }
        }
        System.out.println("Find Error: the Book was not found!");
        return null;
    }

    protected static void viewAllLibrary() {
        List<Book> books = getLibrary();
        for (Book book: books) {
            System.out.println(book);
        }
    }

    protected static void addBookToLibrary(Book book) {
        List<Book> books = getLibrary();
        boolean isExist = false;
        for (Book bookInList: books) {
            if (bookInList.getAuthor().equals(book.getAuthor()) &&
                    bookInList.getTitle().equals(book.getTitle()) && bookInList.getFormat().equals(book.getFormat())) {
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            File libraryFile = new File("src//main//java//by//epam//bobrikov//stage06//Task01//database//books.txt");
            try (FileWriter fileWriter = new FileWriter(libraryFile, true)) {
                fileWriter.write("\n" + book.getId() + " // " + book.getTitle() + " // " + book.getAuthor() +
                        " // " + book.getFormat());
                fileWriter.flush();
                System.out.println("The book [" + book.getTitle() + "] was added to the library.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("This book is already in the library.");
        }
    }
}