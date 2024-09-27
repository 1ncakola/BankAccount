package Keyin;


public class BankAccount {
    private double balance;
    private double overdrawLimit = 150;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance + overdrawLimit >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
