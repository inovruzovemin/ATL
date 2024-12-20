package PACKAGE_NAME.Figurs;

abstract class Figurs
{
    int line;
    String name;
    int a, b, c;

    abstract void perimetr();

    public Figurs(int line, String name, int a, int b, int c) {
        this.line = line;
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
