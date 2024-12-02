package PACKAGE_NAME.StudentRegister;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    LocalDate birthDate;


    public Student(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public int studentAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
@Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return "Ad: " + getName() + ", Doğum tarixi: " + birthDate.format(formatter);
    }
}
