package PACKAGE_NAME.Cars;

public class CarMain {
    public static void main(String[] args) {
    BMW bmw = new BMW("BMW M3 Competition", "black", 290);
    bmw.weightBMW();
        System.out.println();

    Mercedes mercedes = new Mercedes("Mercedes-AMG GT 63 S E", "space gray", 316);
    mercedes.balanceMercedes();
        System.out.println();

    Bentley bentley = new Bentley("Bentley Continental GT Speed", "ice white ", 335);
    bentley.handBentley();


    }
}
