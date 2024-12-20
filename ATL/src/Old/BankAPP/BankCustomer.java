package PACKAGE_NAME.BankAPP;

public class BankCustomer extends BankOperation implements PaymentService {
    private Customer customer;

    public BankCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public double checkBalance() {
        return customer.getBalance();
    }

    @Override
    public void pay(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount can't be negative");
        }
        if (customer.getBalance() < amount) {
            throw new InsufficientFundsException("Balance is not enaugh");
        }
        customer.updateBalance(-amount);
        System.out.println("Payment successful " + amount);
    }

    @Override
    public void refund(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount can't be negative");
        }
        customer.updateBalance(amount);
        System.out.println("Refund successful " + amount);
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount cant be negative");
        }
        customer.updateBalance(amount);
        System.out.println("Deposit successful " + amount);

    }

}