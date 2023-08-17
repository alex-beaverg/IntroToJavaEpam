package by.epam.bobrikov.stage04.aggregation;

import by.epam.bobrikov.stage04.aggregation.task_classes.Account;
import by.epam.bobrikov.stage04.aggregation.task_classes.Bank;
import by.epam.bobrikov.stage04.aggregation.task_classes.Client;

/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
 * положительный и отрицательный балансы отдельно
 */
public class Task04 {
    public void taskCalculation() {
        Account account1 = new Account(1234, false, 5000);
        Account account2 = new Account(1564, false, 1200);
        Account account3 = new Account(2133, true, -500);
        Account account4 = new Account(1555, false, 10200);
        Account account5 = new Account(3659, false, 3100);
        Account account6 = new Account(2115, true, -2200);
        Account account7 = new Account(3222, true, -3125);
        Account account8 = new Account(5555, false, 1000);
        Account account9 = new Account(1000, false, 9150);
        Account account10 = new Account(1003, true, -10);

        Client client1 = new Client("Ivanov");
        client1.addAccount(account1);
        client1.addAccount(account2);
        client1.addAccount(account3);
        client1.addAccount(account4);
        client1.addAccount(account5);
        client1.addAccount(account6);

        Client client2 = new Client("Petrov");
        client2.addAccount(account7);
        client2.addAccount(account8);
        client2.addAccount(account9);
        client2.addAccount(account10);

        Bank bank = new Bank("Technobank");
        bank.addClient(client1);
        bank.addClient(client2);

        bank.findClient("Ivanov").sortAccountsByNumber();
        System.out.println("Finding client Ivanov and sort his accounts by number: " +
                bank.findClient("Ivanov").getAccounts());

        bank.findClient("Ivanov").sortAccountsByBalance();
        System.out.println("Finding client Ivanov and sort his accounts by balance: " +
                bank.findClient("Ivanov").getAccounts());

        System.out.println("Account 3659 before blocking: " + bank.findClient("Ivanov")
                .findAccount(3659));
        bank.findClient("Ivanov").findAccount(3659).blockAccount();
        System.out.println("Account 3659 after blocking: " + bank.findClient("Ivanov")
                .findAccount(3659));
        bank.findClient("Ivanov").findAccount(3659).unblockAccount();
        System.out.println("Account 3659 after unblocking: " + bank.findClient("Ivanov")
                .findAccount(3659));

        System.out.println("Sum of all accounts by Petrov: " + bank.findClient("Petrov").sumAccounts());
        System.out.println("Sum of unblocked accounts by Petrov: " + bank.findClient("Petrov")
                .sumUnblockedAccounts());
        System.out.println("Sum of blocked accounts by Petrov: " + bank.findClient("Petrov")
                .sumBlockedAccounts());
    }
}
