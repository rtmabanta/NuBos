package nubos;

public class User {
	private String fullName;
    private String emailAddress;
    private String password;
    private String studentId;
    private String address;
    private int contact;
    private String contactPname;
    private String relation;
    private int contactPnum;
    private String contactPemail;
    
    public User(String fullName, String emailAddress, String password, String studentId, String address, 
    		    int contact, String contactPname, String relation, int contactPnum, String contactPemail) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.studentId = studentId;
        this.address = address;
        this.contact = contact;
        this.contactPname = contactPname;
        this.relation = relation;
        this.contactPnum = contactPnum;
        this.contactPemail = contactPemail;
    
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
    public String getAddress() {
        return address;
    }

    public int getContact() {
        return contact;
    }

    public String getContactPname() {
        return contactPname;
    }

    public String getRelation() {
        return relation;
    }
    public int getContactPnum() {
        return contactPnum;
    }
    public String getContactPemail() {
        return contactPemail;
    }
}


