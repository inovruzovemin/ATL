package PACKAGE_NAME.Student;

public class Student extends Academy{
    private int studentID;
    private String course;
    private String studentName;

    public void study (){
        System.out.println("Student number "  + studentID + " - " + studentName + " is studying in the " + course +
                " course in "+ getName() + ". Adress : " + getAddress() );
    }

    public Student(String address,String name,int studentID, String course, String studentName) {
        super(address,name);
        this.studentName = studentName;
        this.studentID = studentID;
        this.course = course;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
