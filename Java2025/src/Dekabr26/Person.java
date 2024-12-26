package Dekabr26;

import java.util.List;

public class Person {
    private String name;
    private List<Phone> phoneNumbers;


    public Person(String name,List<Phone> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setphoneNumbers(List<Phone> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
