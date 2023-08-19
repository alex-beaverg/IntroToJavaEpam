package by.epam.bobrikov.stage05.Task01;

import java.io.File;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, вывести
 * на консоль содержимое, дополнить, удалить
 */
public class Task01Actions {
    public void taskCalculation(){
        // Create text file in this directory:
        File newFile = TxtFile.createTxtFile("HelloFile");
        // Create directory and file in this directory:
        File newFileInNewDir = TxtFile.createDirWithTxtFile("HelloDir", "HelloFile");
        // Create directory in this directory:
        File newDir = TxtFile.createDir("HelloDir2");
        // Rename directory HelloDir2 to HelloDir3:
        File renamedDir = TxtFile.renameDir(newDir, "HelloDir3");
        // Rename text file HelloFile.txt to HelloFile2.txt in this directory:
        File renamedFile = TxtFile.renameTxtFile(newFile, "HelloFile2");
        // Rename text file HelloFile.txt to HelloFile2.txt in directory HelloDir:
        File renamedFile2 = TxtFile.renameTxtFileInDir("HelloDir", newFileInNewDir, "HelloFile2");
        // Write to text file HelloFile2:
        TxtFile.writeToTxtFile(renamedFile, "Hello world!", false);
        // Append text to text file HelloFile2:
        TxtFile.writeToTxtFile(renamedFile, "Line 2", true);
        // Write to text file HelloFile2 in directory HelloDir:
        TxtFile.writeToTxtFile(renamedFile2, "Hello world!", false);
        // Print to console from file HelloFile2:
        TxtFile.printFromFile(renamedFile);
        // Delete directory HelloDir3:
        TxtFile.deleteFileOrDir(renamedDir);
        // Delete file HelloFile2:
        TxtFile.deleteFileOrDir(renamedFile);
        /// Delete file HelloFile2 in directory HelloDir:
        TxtFile.deleteFileOrDir(renamedFile2);
        // Delete directory HelloDir:
        TxtFile.deleteFileOrDir("HelloDir");
    }
}
