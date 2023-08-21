package by.epam.bobrikov.stage06.Task03.Client.objects;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Person {
    private String login;
    private String password;

    protected Person(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static Person createPerson(String login, String password) {
        Person person = null;
        String[] items;
        File usersFile = new File("src/main/java/by/epam/bobrikov/stage06/Task03/Client/database/users.txt");
        try(FileReader fileReader = new FileReader(usersFile)) {
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                items = scan.nextLine().split("\\s//\\s");
                if (login.equals(items[0]) && password.equals(items[1])) {
                    if (items[2].equals("admin")) {
                        person = new Admin(login, password);
                    } else if (items[2].equals("user")) {
                        person = new User(login, password);
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
}
