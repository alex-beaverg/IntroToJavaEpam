package by.epam.bobrikov.stage05.Task02;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private int id;
    private List<Product> products;
    private int total = 0;
    private int tax = 20;
    private double totalWithTax;

    public Payment() {
        this.id = Integer
                .parseInt(String.valueOf(hashCode()).substring(String.valueOf(hashCode()).length() - 4));
        this.products = new ArrayList<>();
    }

    public void collectPayment() {
        collectTotal();
        collectTotalWithTax();
    }

    private void collectTotal() {
        for (Product product: products) {
            total += product.price;
        }
    }

    private void collectTotalWithTax() {
        totalWithTax = total + total * tax / 100.0;
    }

    public void printPayment() {
        System.out.println("Payment N" + id);
        System.out.println("- - - - -");
        for (Product product: products) {
            System.out.println(product);
        }
        System.out.println("- - - - -");
        System.out.println("Total: " + total + " BYN");
        System.out.println("Tax: " + tax + " %");
        System.out.println("Total w/tax: " + totalWithTax + " BYN");
    }

    public class Product {
        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
            Payment.this.products.add(this);
        }

        @Override
        public String toString() {
            return name + ": " + price + " BYN";
        }
    }
}
