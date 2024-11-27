package PACKAGE_NAME.TrafficLight;

public class TrafficMain {
    public static void main(String[] args) {
            for(TraficLight light : TraficLight.values()){
                System.out.println(light.getAction());

            }

    }
}
