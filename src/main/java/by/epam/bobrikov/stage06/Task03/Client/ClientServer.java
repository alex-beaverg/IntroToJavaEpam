package by.epam.bobrikov.stage06.Task03.Client;

import by.epam.bobrikov.stage06.Task03.Client.objects.Admin;
import by.epam.bobrikov.stage06.Task03.Client.objects.Person;
import by.epam.bobrikov.stage06.Task03.Client.objects.User;

import java.io.*;
import java.net.Socket;

public class ClientServer {
    private static Socket clientSocket;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {
//        Person person = Person.createPerson("user200", "00000");
        Person person = Person.createPerson("user1", "54321");
//        Person person = Person.createPerson("admin1", "12345");

        if (person != null) {
            try {
                try {
                    clientSocket = new Socket("localhost", 5000);
                    if (person instanceof User) {
                        System.out.println("Client as a User connected to archive!");
                    } else {
                        System.out.println("Client as an Admin connected to archive!");
                    }
                    reader = new BufferedReader(new InputStreamReader(System.in));
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                    String request = "";
                    System.out.println("\nEnter 'exit' to close connection.");
                    System.out.println("Enter 'Surname' for watching student case from archive:");
                    if (person instanceof Admin) {
                        System.out.println("Enter 'Surname edit' for editing student case in archive:");
                        System.out.println("Enter 'Surname Name Age Group add student' for adding student case " +
                                "to archive");
                    }
                    while (!request.equals("exit")) {
                        request = reader.readLine();
                        out.write(request + "\n");
                        out.flush();
                        String serverAnswer = in.readLine();
                        System.out.println(serverAnswer);
                    }
                } finally {
                    System.out.println("Client disconnected from archive!");
                    clientSocket.close();
                    in.close();
                    out.close();
                }
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}
