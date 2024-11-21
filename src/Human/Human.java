package PACKAGE_NAME.Human;

public class Human {
    public Human() {
    }
    private String name;
    private String surname;
    private int age;
    private Pet nickname;
    private Human mother;
    public Human father;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Pet getNickname() {
        return nickname;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setNickname(Pet nickname) {
        this.nickname = nickname;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human(String name, String surname, int age, Pet nickname, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nickname = nickname;
        this.mother = mother;
        this.father = father;
    }



    }


