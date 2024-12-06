package PACKAGE_NAME.MapTask;

//Butun telebeler:
//Student{id=1, name='Alice'}
//Student{id=2, name='Bob'}
//Student{id=3, name='Charlie'}
//
//ID 2'ye sahip student: Student{id=2, name='Bob'}
//
//ID 2'ye sahip student silindi.
//
//Silinenden Sonra Butun Students:
//Student{id=1, name='Alice'}
//Student{id=3, name='Charlie'}

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
