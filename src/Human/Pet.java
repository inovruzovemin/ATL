package PACKAGE_NAME.Human;

public class Pet {
    public Pet() {
    }

    private String nickname;
    private int age;
    private String gender;

    public Pet(String nickname, int age, String gender) {
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;

    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
