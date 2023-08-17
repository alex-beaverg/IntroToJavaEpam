package by.epam.bobrikov.stage04.simple_classes.task_classes;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int year;
    private int pages;
    private int price;
    private String bindingType;

    public Book(int id, String name, String author, String publishingHouse, int year, int pages, int price,
                String bindingType) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "\nBook: " +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", author = '" + author + '\'' +
                ", publishingHouse = '" + publishingHouse + '\'' +
                ", year = " + year +
                ", pages = " + pages +
                ", price = " + price +
                ", bindingType = '" + bindingType + '\'';
    }
}
