package by.epam.bobrikov.stage06.Task01.objects;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class User extends Person implements Access {
    protected User(String login, String password) {
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
        sendEmailToAdmin(book);
    }

    private void sendEmailToAdmin(Book book) {
        String adminEmail = "";
        String[] items;
        File usersFile = new File("src//main//java//by//epam//bobrikov//stage06//Task01//database//users.txt");
        try(FileReader fileReader = new FileReader(usersFile)) {
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                items = scan.nextLine().split("\\s//\\s");
                if (items[2].equals("admin")) {
                    adminEmail = items[3];
                    break;
                }
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("A letter with a proposal to add a [" + book + "] to the library has been sent to " + adminEmail);
    }
}
