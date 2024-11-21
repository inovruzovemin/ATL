package PACKAGE_NAME.Student;

public class Teacher extends Academy{
    private int teacherId;
    private String teacherName;
    private String subject;

    public void teach() {
        System.out.println("Teacher number " + teacherId + " - " + teacherName + " teaches " + subject +
                " subject in " + getName() + ". Adress : " + getAddress() );
    }

    public Teacher(String address, String name, int teacherId, String subject, String teacherName) {
        super(address, name);
        this.teacherName = teacherName;
        this.teacherId = teacherId;
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
