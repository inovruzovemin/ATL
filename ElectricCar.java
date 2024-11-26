package PACKAGE_NAME.Interface;

public class ElectricCar implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Electric Car Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Electric Car Stop");
    }

    @Override
    public String getFuelType() {
        return "Electric \n";
    }
}
