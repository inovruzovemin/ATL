package PACKAGE_NAME.BankAPP;

public interface PaymentService {
    public void pay(double amount) throws InvalidAmountException, InsufficientFundsException;
    public void refund(double amount) throws InvalidAmountException;
}
