package by.epam.bobrikov.stage05.Task01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TxtFile {
    public static File createTxtFile(String fileName) {
        File newFile = new File("src//main//java//by//epam//bobrikov//stage05//Task01//" + fileName + ".txt");
        try {
            boolean createdFile = newFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return newFile;
    }

    public static File renameTxtFile(File oldFile, String newFileName) {
        File newFile = new File("src//main//java//by//epam//bobrikov//stage05//Task01//" + newFileName + ".txt");
        boolean renamed = oldFile.renameTo(newFile);
        return newFile;
    }

    public static File createDirWithTxtFile(String dirName, String fileName) {
        File newDir = new File("src//main//java//by//epam//bobrikov//stage05//Task01//" + dirName);
        boolean createdDir = newDir.mkdir();
        File newFile = new File("src//main//java//by//epam//bobrikov//stage05//Task01//" + dirName, fileName + ".txt");
        try {
            boolean createdFile = newFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return newFile;
    }

    public static File renameTxtFileInDir(String dirName, File oldFile, String newFileName) {
        File newFile = new File("src//main//java//by//epam//bobrikov//stage05//Task01//" + dirName + "//" + newFileName + ".txt");
        boolean renamed = oldFile.renameTo(newFile);
        return newFile;
    }

    public static File createDir(String dirName) {
        File newDir = new File("src//main//java//by//epam//bobrikov//stage05//Task01//" + dirName);
        boolean created = newDir.mkdir();
        return newDir;
    }

    public static File renameDir(File oldDir, String newDirName) {
        File newDir = new File("src//main//java//by//epam//bobrikov//stage05//Task01//" + newDirName);
        boolean renamed = oldDir.renameTo(newDir);
        return newDir;
    }

    public static void writeToTxtFile(File txtFile, String text, boolean append) {
        try (FileWriter writer = new FileWriter(txtFile, append)) {
            if (append) {
                writer.write("\n" + text);
            } else {
                writer.write(text);
            }
            writer.flush();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printFromFile(File txtFile) {
        try (FileReader reader = new FileReader(txtFile)) {
            Scanner scan = new Scanner(reader);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteFileOrDir(File fileOrDir) {
        boolean deleted = fileOrDir.delete();
    }

    public static void deleteFileOrDir(String fileOrDirName) {
        File newDir = new File("src//main//java//by//epam//bobrikov//stage05//Task01//" + fileOrDirName);
        boolean deleted = newDir.delete();
    }
}
