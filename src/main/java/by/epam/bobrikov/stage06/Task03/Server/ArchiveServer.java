package by.epam.bobrikov.stage06.Task03.Server;

import by.epam.bobrikov.stage06.Task03.Server.objects.Archive;
import by.epam.bobrikov.stage06.Task03.Server.objects.Student;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ArchiveServer {
    private static Socket clientSocket;
    private static ServerSocket server;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void run() {
        try {
            try  {
                server = new ServerSocket(5000);
                System.out.println("Archive server started!");
                clientSocket = server.accept();
                try {
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                    Student student = null;
                    String request = "";
                    while (!request.equals("exit")) {
                        request = in.readLine();
                        if (request.contains("edit")) {
                            student = Archive.getStudentAsObject(request.split("\\s")[0]);
                            out.write("Which field do you want to edit [surname/name/age/group newValue]?\n");
                        } else if (request.contains("surname")) {
                            Archive.editStudent(student, "surname", request.split("\\s")[1]);
                            out.write("Surname was changed\n");
                        } else if (request.contains("name")) {
                            Archive.editStudent(student, "name", request.split("\\s")[1]);
                            out.write("Name was changed\n");
                        } else if (request.contains("age")) {
                            Archive.editStudent(student, "age", request.split("\\s")[1]);
                            out.write("Age was changed\n");
                        } else if (request.contains("group")) {
                            Archive.editStudent(student, "group", request.split("\\s")[1]);
                            out.write("Group was changed\n");
                        } else if (request.contains("add student")) {
                            String[] items = request.split("\\s");
                            Archive.addStudentToArchive(items[0], items[1], Integer.parseInt(items[2]),
                                    Integer.parseInt(items[3]));
                            out.write("Student was added\n");
                        } else {
                            out.write("Requested case: " + Archive.getStudent(request) + "\n");
                        }
                        out.flush();
                    }
                } finally {
                    clientSocket.close();
                    in.close();
                    out.close();
                }
            } finally {
                System.out.println("Archive server closed!");
                server.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
