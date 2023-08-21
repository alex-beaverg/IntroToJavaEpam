package by.epam.bobrikov.stage06.Task01.objects;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends Person implements Access {
    protected Admin(String login, String password) {
        super(login, password);
    }

    @Override
    public void viewAllBooksInLibrary() {
        Library.viewAllLibrary();
    }

    @Override
    public Book findBookInLibraryByTitle(String title) {
        return Library.findBookByTitle(title);
    }

    @Override
    public void addBookToLibrary(Book book) {
        Library.addBookToLibrary(book);
        sendEmailsToUsers(book);
    }

    private void sendEmailsToUsers(Book book) {
        String[] items;
        List<String> emails = new ArrayList<>();
        File usersFile = new File("src//main//java//by//epam//bobrikov//stage06//Task01//database//users.txt");
        try(FileReader fileReader = new FileReader(usersFile)) {
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                items = scan.nextLine().split("\\s//\\s");
                if (items[2].equals("user")) {
                    emails.add(items[3]);
                }
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Letters about adding a [" + book + "] to the library have been sent to addresses: " + emails);
    }
}
