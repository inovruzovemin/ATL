package PACKAGE_NAME.Figurs;

import java.util.Scanner;

public class FigursMain {
    public static void main(String[] args) {
        Figurs figurs = new Triangle(3, "Triangle",4,5,6);
        figurs.perimetr();


        Figurs figurs2 = new Quadrilateral(4,"Quadrilateral",4,5);
        figurs2.perimetr();

    }
}
