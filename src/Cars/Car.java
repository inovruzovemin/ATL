
package PACKAGE_NAME.Cars;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.SortedMap;
//Deməli bir Car classi goturursuz +
//ümumi car' a aid metodlar və dəyişənlər olur. +
//Və BMW, Mercedes, Ferrari və s. kimi classlar yaradirsiz +
//və həmin classlarinda özlərinə məxsus ən azı 1 methodu olsun +
//və onlar Car dan exdens edir.+
// Və CarMain classinda cagirirsiz isdifade edirsiz.

public class Car {
 private String name;
 private String color;
 private int speed;

    public Car(String name, String color, int speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    public void drive(){
        System.out.println("The speed of the " + name + " branded " + color + " car is " + speed + " km/h.");

 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
