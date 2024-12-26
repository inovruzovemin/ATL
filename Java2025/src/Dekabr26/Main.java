package Dekabr26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Emin", Arrays.asList(new Phone("0507105657"), new Phone("0557125657")));
        Person person2 = new Person("Aytac", Arrays.asList(new Phone("0555555555"), new Phone("0557155555")));
        Person person3 = new Person("Huseyn", Arrays.asList(new Phone("0515987521"), new Phone("0557745211")));

        List<Person> persons = Arrays.asList(person1, person2, person3);
        List<String> allPhoneNumbers = persons.stream()
                .flatMap(person -> person.getPhoneNumbers().stream())
                .map(Phone::getPhoneNumber)
                .toList();
        System.out.println("All phone numbers: " + allPhoneNumbers);
    }
}

