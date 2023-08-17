package by.epam.bobrikov.stage04.aggregation.task_classes;

public class Account {
    private int number;
    private boolean isBlocked;
    private int balance;

    public Account(int number, boolean isBlocked, int balance) {
        this.number = number;
        this.isBlocked = isBlocked;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void blockAccount() {
        isBlocked = true;
    }

    public void unblockAccount() {
        isBlocked = false;
    }

    @Override
    public String toString() {
        return "\nAccount: " +
                "number = " + number +
                ", isBlocked = " + isBlocked +
                ", balance = " + balance;
    }
}
