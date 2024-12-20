package PACKAGE_NAME.StudentRegister;

public class DuplicateStudentException extends RuntimeException{
    public DuplicateStudentException (String message) {
        super ( message);
    }
}
