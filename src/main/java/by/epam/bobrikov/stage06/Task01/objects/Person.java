package by.epam.bobrikov.stage06.Task01.objects;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Person implements Access {
    private String login;
    private String password;
    private String email;

    protected Person(String login, String password) {
        this.login = login;
        this.password = password;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public static Person createPerson(String login, String password) {
        Person person = null;
        String[] items;
        File usersFile = new File("src//main//java//by//epam//bobrikov//stage06//Task01//database//users.txt");
        try(FileReader fileReader = new FileReader(usersFile)) {
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                items = scan.nextLine().split("\\s//\\s");
                if (login.equals(items[0]) && password.equals(items[1])) {
                    if (items[2].equals("admin")) {
                        person = new Admin(login, password);
                        person.setEmail(items[3]);
                    } else if (items[2].equals("user")) {
                        person = new User(login, password);
                        person.setEmail(items[3]);
                    }
                }
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (person == null) {
            System.out.println("Authorisation error: Invalid login or password!");
        }
        return person;
    }

    @Override
    public void viewAllBooksInLibrary() { }

    @Override
    public Book findBookInLibraryByTitle(String title) {
        return null;
    }

    @Override
    public void addBookToLibrary(Book book) { }
}
