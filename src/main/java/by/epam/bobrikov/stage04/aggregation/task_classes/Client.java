package by.epam.bobrikov.stage04.aggregation.task_classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Client {
    private String surname;
    private List<Account> accounts;

    public Client(String surname) {
        this.surname = surname;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void sortAccountsByNumber() {
        accounts.sort(Comparator.comparing(Account::getNumber));
    }

    public void sortAccountsByBalance() {
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    public Account findAccount(int number) {
        for (Account account: accounts) {
            if (account.getNumber() == number) {
                return account;
            }
        }
        return null;
    }

    public int sumUnblockedAccounts() {
        int sum = 0;
        for (Account account: accounts) {
            if (!account.isBlocked()) {
                sum += account.getBalance();
            }
        }
        return sum;
    }

    public int sumBlockedAccounts() {
        int sum = 0;
        for (Account account: accounts) {
            if (account.isBlocked()) {
                sum += account.getBalance();
            }
        }
        return sum;
    }

    public int sumAccounts() {
        int sum = 0;
        for (Account account: accounts) {
            sum += account.getBalance();
        }
        return sum;
    }

    public String getSurname() {
        return surname;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "\nClient: " +
                "surname = '" + surname + '\'' +
                ", accounts = " + accounts;
    }
}
