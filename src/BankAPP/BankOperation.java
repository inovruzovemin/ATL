package PACKAGE_NAME.BankAPP;

public abstract class BankOperation {
    double balance;

    // Balansı yoxlama
    public abstract double checkBalance();

    // Balansı artırma
    public abstract void deposit(double amount) throws InvalidAmountException;
    }



