package PACKAGE_NAME.Figurs;

public class Quadrilateral extends Figurs {


    public Quadrilateral(int line, String name,int a,int b) {
        super(line, name,a,b,0);
        System.out.println(name + " line count : "+ line );
    }

    @Override
    void perimetr() {
        System.out.println("Perimetring : 2(a+b)= " + 2*(a+b));

    }

}
