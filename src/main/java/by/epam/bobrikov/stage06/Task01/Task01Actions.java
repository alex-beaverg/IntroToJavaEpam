package by.epam.bobrikov.stage06.Task01;

import by.epam.bobrikov.stage06.Task01.objects.*;

/**
 * Создать консольное приложение “Учет книг в домашней библиотеке”.
 * Общие требования к заданию:
 * • Система учитывает книги как в электронном, так и в бумажном варианте.
 * • Существующие роли: пользователь, администратор.
 * • Пользователь может просматривать книги в каталоге книг, осуществлять поиск книг в каталоге.
 * • Администратор может модифицировать каталог.
 * • *При добавлении описания книги в каталог оповещение о ней рассылается на e-mail всем пользователям
 * • **При просмотре каталога желательно реализовать постраничный просмотр
 * • ***Пользователь может предложить добавить книгу в библиотеку, переслав её администратору на e-mail.
 * • Каталог книг хранится в текстовом файле.
 * • Данные аутентификации пользователей хранятся в текстовом файле. Пароль не хранится в открытом виде
 */
public class Task01Actions {
    public void taskCalculation(){
        Person badPerson = Person.createPerson("user2", "54321");
        System.out.println("Created person: " + badPerson);
        Person user = Person.createPerson("user1", "54321");
        System.out.println("Is created person a user? " + (user instanceof User));
        Person admin = Person.createPerson("admin1", "12345");
        System.out.println("Is created person an admin? " + (admin instanceof Admin));

        System.out.println("User views Library:");
        user.viewAllBooksInLibrary();
        System.out.println("Admin views Library:");
        admin.viewAllBooksInLibrary();
        System.out.println("User finds book (Code complete) in Library:");
        System.out.println(user.findBookInLibraryByTitle("Code complete"));
        System.out.println("User finds book (Code complete 2) in Library:");
        System.out.println(user.findBookInLibraryByTitle("Code complete 2"));
        System.out.println("Admin finds book (Code complete) in Library:");
        System.out.println(admin.findBookInLibraryByTitle("Code complete"));
        System.out.println("Admin finds book (Code complete 2) in Library:");
        System.out.println(admin.findBookInLibraryByTitle("Code complete 2"));

        Book newBook = new Book(100, "Pook the mouse", "Unknown author", "eBook");
        System.out.println("The user informs the admin about the offer to add a book to library:");
        user.addBookToLibrary(newBook);
        System.out.println("Admin adds new book to library:");
        admin.addBookToLibrary(newBook);
        System.out.println("User views Library:");
        user.viewAllBooksInLibrary();
    }
}
