package PACKAGE_NAME.Birds;

public class Birds {
    private String name;
    private int age;

    public Birds() {}

    // why we called empty constraction?

    //constraction
    public Birds(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void fly(){
        System.out.println(name + " can fly.");
    }
    public String toString() {
        return "Name " + name + ", "+ "age " + age;
    }
}

