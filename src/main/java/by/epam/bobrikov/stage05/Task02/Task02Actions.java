package by.epam.bobrikov.stage05.Task02;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
 * нескольких товаров
 */
public class Task02Actions {
    public void taskCalculation(){
        Payment payment = new Payment();
        payment.new Product("Bread", 3);
        payment.new Product("Milk", 2);
        payment.new Product("Beer", 4);
        payment.new Product("Beef", 15);
        payment.new Product("Tomato", 6);
        payment.new Product("Water", 1);
        payment.new Product("Oil", 5);
        payment.collectPayment();
        payment.printPayment();
    }
}
