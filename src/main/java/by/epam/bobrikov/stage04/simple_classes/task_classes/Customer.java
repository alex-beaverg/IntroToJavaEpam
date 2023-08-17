package by.epam.bobrikov.stage04.simple_classes.task_classes;

public class Customer implements Comparable<Customer>{
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int creditCard;
    private int bankAccount;

    public Customer(int id, String surname, String name, String patronymic, String address, int creditCard,
                    int bankAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;
    }

    public String getSurname() {
        return surname;
    }

    public int getCreditCard() {
        return creditCard;
    }

    @Override
    public String toString() {
        return "\nCustomer: " +
                "id = " + id +
                ", surname = '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", patronymic = '" + patronymic + '\'' +
                ", address = '" + address + '\'' +
                ", creditCard = " + creditCard +
                ", bankAccount = " + bankAccount;
    }

    @Override
    public int compareTo(Customer customer) {
        return this.surname.compareTo(customer.getSurname());
    }
}
