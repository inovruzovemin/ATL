package PACKAGE_NAME.Birds;

public class Eagle extends Birds {
    private Double wingspane;

    public Eagle(String name, int age, double wingspane) {
        super(name, age);
        this.wingspane = wingspane;
    }

    public Double getWingspane() {
        return wingspane;
    }

    public void setWingspane(Double wingspane) {
        this.wingspane = wingspane;
    }
    public void hunt(){
        System.out.println(getName() + " hunt");
    }

    public void fly() {
        System.out.println(getName() + " fly high");
    }
}
