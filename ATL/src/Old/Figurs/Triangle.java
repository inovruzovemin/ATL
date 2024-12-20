package PACKAGE_NAME.Figurs;

public class Triangle extends Figurs {

    public Triangle(int line, String name, int a, int b, int c) {
        super(line, name, a, b,c);
        System.out.println(name + " line count : "+ line);
    }

    @Override
    void perimetr() {
        System.out.println("Perimetr : a+b+c =  " + (a + b + c) + "\n");
    }


}
