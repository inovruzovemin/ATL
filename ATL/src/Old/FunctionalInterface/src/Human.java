import java.time.LocalDate;
import java.util.Objects;

public class Human {
    private String name;
    private int age;
    private LocalDate date;

    public Human(LocalDate date, int age, String name) {
        this.date = date;
        this.age = age;
        this.name = name;
    }

    public Human() {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(date, human.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, date);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
