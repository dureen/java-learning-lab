/**
 * Intermediate Lesson 03 – Encapsulation
 */
class BankAccount {
    private double balance;

    public BankAccount(double initial) {
        this.balance = initial;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100);
        acc.deposit(50);
        System.out.println("Balance: " + acc.getBalance());
        acc.withdraw(30);
        System.out.println("After withdraw: " + acc.getBalance());
    }
}
