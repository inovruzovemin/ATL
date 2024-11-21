package PACKAGE_NAME.Student;

public class main {
    public static void main(String[] args) {
        // student üçün
        Student student = new Student("Elmler","BDU", 1,"English", "Ali");
        student.study();

        Teacher teacher = new Teacher("28 May","ADNSU",45,"Mats", "Su");
        teacher.teach();

        Academy academy =  new Academy("City Point", "ATL");
        academy.display();
    }
}
