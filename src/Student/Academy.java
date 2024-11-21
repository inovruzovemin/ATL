package PACKAGE_NAME.Student;
//1.Academy Student Teacher class yaradirsiz ve extend edir Academyden +
//2.Academy name ve address olur display Info metodu +
//3.Student de studentId ve course olur study metodu (filan idli telebe filan course alir seklinde cap etsin)+
//Teacher de teacherId ve subject olur teach metod(filan id mlm filan fendi kecir kimi text) +
//butun claslarin   Constructor ve set get leri olsun +
//main clasinda her birinin object yaradib metodlarini cagirin

public class Academy {
    private String name;
    private String address;

    public Academy(String address, String name) {
        this.address = address;
        this.name = name;
    }
    public void display() {
        System.out.println(name + " is located in " + address);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
