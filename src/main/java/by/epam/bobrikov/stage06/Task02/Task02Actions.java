package by.epam.bobrikov.stage06.Task02;

import by.epam.bobrikov.stage06.Task02.objects.Note;
import by.epam.bobrikov.stage06.Task02.objects.NoteBook;

/**
 * Блокнот. Разработать консольное приложение, работающее с Заметками в Блокноте. Каждая Заметка это: Заметка (тема,
 * дата создания, e-mail, сообщение).
 * Общие пояснения к практическому заданию.
 * • В начале работы приложения данные должны считываться из файла, в конце работы – сохраняться в файл.
 * • У пользователя должна быть возможность найти запись по любому параметру или по группе параметров (группу
 * параметров можно определить самостоятельно), получить требуемые записи в отсортированном виде, найти записи,
 * текстовое поле которой содержит определенное слово, а также добавить новую запись.
 * • Особое условие: поиск, сравнение и валидацию вводимой информации осуществлять с использованием регулярных
 * выражений.
 * • Особое условие: проверку введенной информации на валидность должен осуществлять код, непосредственно добавляющий
 * информацию
 */
public class Task02Actions {
    public void taskCalculation(){
        System.out.println("View all notebook notes:");
        NoteBook.viewNoteBook();

        System.out.println("Find notes with title [Meeting] and sort by email:");
        NoteBook.viewFindNotes(NoteBook.findNotesByTitle("Meeting"), "Email");
        System.out.println("Find notes with title [Office meeting] and sort by email:");
        NoteBook.viewFindNotes(NoteBook.findNotesByTitle("Office meeting"), "Email");

        System.out.println("Find notes with date from 10.01.2023 to 10.02.2023 and sort by title:");
        NoteBook.viewFindNotes(NoteBook.findNotesByDate("10.01.2023", "10.02.2023"), "Title");
        System.out.println("Find notes with date from 10.04.2023 to 10.07.2023 and sort by title:");
        NoteBook.viewFindNotes(NoteBook.findNotesByDate("10.04.2023", "10.07.2023"), "Title");

        System.out.println("Find notes with email [oleg@gmail.com] and sort by title:");
        NoteBook.viewFindNotes(NoteBook.findNotesByEmail("oleg@gmail.com"), "Title");
        System.out.println("Find notes with email [alex@gmail.com] and sort by title:");
        NoteBook.viewFindNotes(NoteBook.findNotesByEmail("alex@gmail.com"), "Title");

        System.out.println("Find notes with word [Dating] in text and sort by email:");
        NoteBook.viewFindNotes(NoteBook.findNotesByWordInText("Dating"), "Email");
        System.out.println("Find notes with word [Timing] in text and sort by email:");
        NoteBook.viewFindNotes(NoteBook.findNotesByWordInText("Timing"), "Email");

        System.out.println("Find notes with date from 10.01.2023 to 10.02.2023 and with word [Timing] in text and " +
                "sort by Date:");
        NoteBook.viewFindNotes(NoteBook
                .findNotesByDateAndWordInText("10.01.2023", "10.02.2023", "Timing"),
                "Date");
        System.out.println("Find notes with date from 10.04.2023 to 10.07.2023 and with word [Timing] in text and " +
                "sort by Date:");
        NoteBook.viewFindNotes(NoteBook
                .findNotesByDateAndWordInText("10.04.2023", "10.07.2023", "Timing"),
                "Date");

        System.out.println("Add note to notebook:");
        Note newNote = new Note("Buying a table", "20.08.2023", "kate@gmail.com",
                "Furniture store. Model number 220. Title \"Wooden dream\"");
        NoteBook.addNote(newNote);
        System.out.println("View all notebook notes:");
        NoteBook.viewNoteBook();

        System.out.println("Add the same note to notebook:");
        NoteBook.addNote(newNote);
        System.out.println("View all notebook notes:");
        NoteBook.viewNoteBook();

        System.out.println("Add note with bad email to notebook:");
        Note newNote2 = new Note("Buying a table 2", "21.08.2023", "kate@@gmail.com",
                "Furniture store. Model number 221. Title \"Wooden dream\"");
        NoteBook.addNote(newNote2);
        System.out.println("View all notebook notes:");
        NoteBook.viewNoteBook();
    }
}
