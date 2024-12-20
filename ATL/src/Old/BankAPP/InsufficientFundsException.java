package PACKAGE_NAME.BankAPP;

    public class InsufficientFundsException extends Exception {
      public InsufficientFundsException(String message) {
        super(message);
      }
    }