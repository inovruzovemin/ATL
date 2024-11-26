package PACKAGE_NAME.Interface;

public class Bike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike is running");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike is stopped");
    }

    @Override
    public String getFuelType() {
        return "Electric \n";
    }
}
