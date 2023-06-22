package nubos;

public class User {
	private String fullName;
    private String emailAddress;
    private String password;
    private String studentId;
    
    public User(String fullName, String emailAddress, String password, String studentId) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.studentId = studentId;
    
    }
    
    public String getFullName() {
        return fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public String getStudentId() {
        return studentId;
    }
}


