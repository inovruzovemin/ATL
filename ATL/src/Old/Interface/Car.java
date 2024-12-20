package PACKAGE_NAME.Interface;

public class Car implements Vehicle {
    boolean hasFuel= false;
    public Boolean checkFuel() {
        return hasFuel;
    }

    public void startCar(){
        if(checkFuel()){
            System.out.println("Car is ready");
            startEngine();
        }
        else {
            System.out.println("Car has not fuel");
        }


    }
    @Override
    public void startEngine() {
        System.out.println("Car Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car Stop");
    }

    @Override
    public String getFuelType() {
        return "Gasoline \n";
    }

}
