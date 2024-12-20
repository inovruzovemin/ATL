package PACKAGE_NAME.BankAPP;

import PACKAGE_NAME.BankAPP.InvalidAmountException;

// Müştəri məlumatlarını saxlayan əsas sinif
public class Customer {
    private String name;
    private int id;
    private double balance;

    // Konstruktor
    public Customer(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }

}
