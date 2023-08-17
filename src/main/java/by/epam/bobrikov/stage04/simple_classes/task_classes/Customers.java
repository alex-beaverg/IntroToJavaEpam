package by.epam.bobrikov.stage04.simple_classes.task_classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customers {
    private List<Customer> customers;

    public Customers() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void sortCustomersBySurname() {
        Collections.sort(customers);
    }

    public List<Customer> customersByCreditCardInterval(int startNumber, int endNumber) {
        List<Customer> newCustomerList = new ArrayList<>();
        for (Customer customer: customers) {
            if (customer.getCreditCard() >= startNumber && customer.getCreditCard() <= endNumber) {
                newCustomerList.add(customer);
            }
        }
        return newCustomerList;
    }

    @Override
    public String toString() {
        return "Customers: " + customers;
    }
}
