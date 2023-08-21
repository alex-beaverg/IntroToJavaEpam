package by.epam.bobrikov.stage06.Task02.objects;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoteBook {
    private static List<Note> getNotes() {
        List<Note> notes = new ArrayList<>();
        List<String> items = new ArrayList<>();
        File notesFile = new File("src//main//java//by//epam//bobrikov//stage06//Task02//database//notebook.txt");
        try (FileReader fileReader = new FileReader(notesFile)) {
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (!line.equals("////")) {
                    items.add(line);
                } else {
                    notes.add(new Note(items.get(0), items.get(1), items.get(2), items.get(3)));
                    items = new ArrayList<>();
                }
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return notes;
    }

    public static void viewNoteBook() {
        List<Note> notes = getNotes();
        for (Note note: notes) {
            System.out.println(note);
        }
    }

    public static void viewFindNotes(List<Note> list, String sortParameter) {
        switch (sortParameter) {
            case "Title" -> list.sort(Comparator.comparing(Note::getTitle));
            case "Date" -> list.sort(Comparator.comparing(Note::getCalendarDate));
            case "Email" -> list.sort(Comparator.comparing(Note::getEmail));
            default -> System.out.println("List of notes without sorting:");
        }
        if (list.size() > 0) {
            for (Note note : list) {
                System.out.println(note);
            }
        }
    }

    public static List<Note> findNotesByTitle(String title) {
        List<Note> notes = getNotes();
        List<Note> findNotes = new ArrayList<>();
        Pattern pattern = Pattern.compile("^" + title + "$", Pattern.CASE_INSENSITIVE);
        for (Note note: notes) {
            Matcher matcher = pattern.matcher(note.getTitle());
            if (matcher.find()) {
                findNotes.add(note);
            }
        }
        if (findNotes.size() == 0) {
            System.out.println("Find error! Notes with title [" + title + "] was not found!");
        }
        return findNotes;
    }

    public static List<Note> findNotesByDate(String startDate, String endDate) {
        List<Note> notes = getNotes();
        List<Note> findNotes = new ArrayList<>();
        for (Note note: notes) {
            if (dateConverter(note.getDate()).after(dateConverter(startDate)) &&
                    dateConverter(note.getDate()).before(dateConverter(endDate))) {
                findNotes.add(note);
            }
        }
        if (findNotes.size() == 0) {
            System.out.println("Find error! Notes between dates [" + startDate + ", " + endDate + "] was not found!");
        }
        return findNotes;
    }

    public static List<Note> findNotesByEmail(String email) {
        List<Note> notes = getNotes();
        List<Note> findNotes = new ArrayList<>();
        Pattern pattern = Pattern.compile("^" + email + "$", Pattern.CASE_INSENSITIVE);
        for (Note note: notes) {
            Matcher matcher = pattern.matcher(note.getEmail());
            if (matcher.find()) {
                findNotes.add(note);
            }
        }
        if (findNotes.size() == 0) {
            System.out.println("Find error! Notes with email [" + email + "] was not found!");
        }
        return findNotes;
    }

    public static List<Note> findNotesByWordInText(String word) {
        List<Note> notes = getNotes();
        List<Note> findNotes = new ArrayList<>();
        Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
        for (Note note: notes) {
            Matcher matcher = pattern.matcher(note.getText());
            if (matcher.find()) {
                findNotes.add(note);
            }
        }
        if (findNotes.size() == 0) {
            System.out.println("Find error! Notes with word [" + word + "] in text was not found!");
        }
        return findNotes;
    }

    public static List<Note> findNotesByDateAndWordInText(String startDate, String endDate, String word) {
        List<Note> notes = getNotes();
        List<Note> findNotes = new ArrayList<>();
        Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
        for (Note note: notes) {
            Matcher matcher = pattern.matcher(note.getText());
            if (matcher.find() && dateConverter(note.getDate()).after(dateConverter(startDate)) &&
                    dateConverter(note.getDate()).before(dateConverter(endDate))) {
                findNotes.add(note);
            }
        }
        if (findNotes.size() == 0) {
            System.out.println("Find error! Notes with word [" + word + "] in text and between dates " +
                    "[" + startDate + ", " + endDate + "] was not found!");
        }
        return findNotes;
    }

    private static Calendar dateConverter(String date) {
        String[] items = date.split("\\.");
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, Integer.parseInt(items[2]));
        calendar.set(Calendar.MONTH, Integer.parseInt(items[1]));
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(items[0]));
        return calendar;
    }

    public static void addNote(Note note) {
        if (!checkNoteInNoteList(note)) {
            if (checkEmail(note.getEmail())) {
                File notesFile = new File("src//main//java//by//epam//bobrikov//stage06//Task02//database//notebook.txt");
                try (FileWriter fileWriter = new FileWriter(notesFile, true)) {
                    fileWriter.write("\n" + note.getTitle());
                    fileWriter.write("\n" + note.getDate());
                    fileWriter.write("\n" + note.getEmail());
                    fileWriter.write("\n" + note.getText());
                    fileWriter.write("\n////");
                    fileWriter.flush();
                    System.out.println("The note [" + note.getTitle() + "] was added to the notebook.");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Adding error! Note was not added! Email is not valid!");
            }
        } else {
            System.out.println("Adding error! This note is already in the notebook!");
        }
    }

    private static boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static boolean checkNoteInNoteList(Note note) {
        Pattern pattern = Pattern.compile(note.getTitle() + note.getDate() + note.getEmail() + note.getText());
        List<Note> notes = getNotes();
        for (Note noteInList: notes) {
            Matcher matcher = pattern.matcher(noteInList.getTitle() + noteInList.getDate() +
                    noteInList.getEmail() + noteInList.getText());
            if (matcher.matches()) {
                return true;
            }
        }
        return false;
    }
}
