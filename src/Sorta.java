package PACKAGE_NAME;

import java.util.Comparator;

public class Sorta implements Comparator<Sorta> {
    private String name;
    private Integer salary;
    private Integer age;

    public Sorta(String name, Integer salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Sorta() {
    }

    @Override
    public String toString() {
        return "Sort{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

//    @Override
//    public int compareTo(Sorta emp1) {
//        return Integer.compare(this.age,emp1.age);
//    }

    @Override
    public int compare(Sorta o1, Sorta o2) {
        return o1.getName().compareTo(o2.getName());
    }
}



