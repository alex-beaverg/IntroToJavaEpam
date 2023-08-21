package by.epam.bobrikov.stage06.Task01.objects;

public class Book {
    private int id;
    private String title;
    private String author;
    private String format;

    public Book(int id, String title, String author, String format) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.format = format;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "Book N" + id + ": " + title + " - " + author + " (" + format + ")";
    }
}
