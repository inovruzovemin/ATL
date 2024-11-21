package PACKAGE_NAME.Cars;

public class Mercedes extends Car {
    public Mercedes(String name, String color, int speed) {
        super(name,color,speed);
        super.drive();
    }

    public void balanceMercedes (){
        System.out.println("Mercedes maintains a balance between performance and comfort.");
    }


}
