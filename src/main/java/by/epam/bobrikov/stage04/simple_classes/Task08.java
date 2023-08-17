package by.epam.bobrikov.stage04.simple_classes;

import by.epam.bobrikov.stage04.simple_classes.task_classes.Customer;
import by.epam.bobrikov.stage04.simple_classes.task_classes.Customers;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Task08 {
    public void taskCalculation() {
        Customer customer1 = new Customer(100, "Ivanov", "Ivan", "Ivanovich",
                "Minsk", 4659, 25459);
        Customer customer2 = new Customer(115, "Petrov", "Petr", "Petrovich",
                "Grodno", 4123, 12568);
        Customer customer3 = new Customer(102, "Sidorov", "Oleg", "Olegovich",
                "Brest", 1526, 24369);
        Customer customer4 = new Customer(195, "Klimova", "Ira", "Ivanovna",
                "Paris", 3129, 35487);
        Customer customer5 = new Customer(69, "Kotova", "Anna", "Petrovna",
                "Oslo", 4933, 22133);

        Customers customers = new Customers();
        customers.addCustomer(customer1);
        customers.addCustomer(customer2);
        customers.addCustomer(customer3);
        customers.addCustomer(customer4);
        customers.addCustomer(customer5);

        customers.sortCustomersBySurname();
        System.out.println("Sort by surname:");
        System.out.println(customers);
        System.out.println();

        System.out.print("Customers with credit cards N4000-5000: \nCustomers: ");
        System.out.println(customers.customersByCreditCardInterval(4000, 5000));
    }
}
