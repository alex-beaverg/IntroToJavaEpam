package by.epam.bobrikov.stage06.Task01.objects;

public interface Access {
    void viewAllBooksInLibrary();
    Book findBookInLibraryByTitle(String title);
    void addBookToLibrary(Book book);
}
