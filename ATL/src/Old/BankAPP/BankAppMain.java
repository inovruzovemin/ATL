package PACKAGE_NAME.BankAPP;

//Müştərilər üçün bir Customer sinfi yaradın:+
//Müştərinin adı, balansı və unikal ID-si olacaq.+
//Balansın yoxlanması və artırılması üçün metodlar yaradın. +
//Fərqli xidmətlər göstərən xüsusi BankCustomer sinfi yaradın.+
//PaymentService adlı bir interface yaradın: +
//İçində iki metod olsun: +
//pay(double amount) — Ödəniş etmək üçün. +
//refund(double amount) — Pulun geri qaytarılması üçün. +
//BankOperation adlı abstract class yaradın: +
//Ümumi bank əməliyyatlarını (balans artırma, balans yoxlama və s.) saxlayacaq. +
//Xəta idarə etmək üçün aşağıdakı istisnalardan istifadə edin: +
//InsufficientFundsException — Balans kifayət etmədikdə atılsın. +
//InvalidAmountException — Sıfır və ya mənfi məbləğ daxil edildikdə atılsın. +
//Customer, BankCustomers, PaymentService, və BankOperation siniflərini yaradın. +
//Müştəri balansını azaldan və artıran metodlar yaradın.
//Əməliyyat zamanı yuxarıda qeyd edilən xətaları idarə edin.
//Müştəri yaradın.
//Xidmətlər vasitəsilə balans artırın, ödəniş edin, və ya geri qaytarın.

public class BankAppMain {

    public static void main(String[] args) {
        Customer customer = new Customer("Emin", 45, 1000);
        BankCustomer bankCustomer = new BankCustomer(customer);
        try {
            System.out.println("Customer`s balance : " + bankCustomer.checkBalance());

            bankCustomer.deposit(100);
            System.out.println("Deposit added, now balance: " + bankCustomer.checkBalance());

            bankCustomer.pay(200);
            System.out.println("200 AZN was deducted, now balance :" + bankCustomer.checkBalance());

            bankCustomer.refund(200);
            System.out.println("200 AZN was refunded, now balance :" + bankCustomer.checkBalance());

            bankCustomer.pay(2000);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            bankCustomer.deposit(-50); // Səhv məbləğ daxil edilir
        } catch (InvalidAmountException e) {
            System.out.println("False: " + e.getMessage());
        }
    }
}





