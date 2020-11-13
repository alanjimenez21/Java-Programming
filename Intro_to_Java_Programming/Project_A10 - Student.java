public class Student extends Person {
    private int status;
    public static int FRESHMAN = 1;
    public static int SOPHOMORE = 2;
    public static int JUNIOR = 3;
    public static int SENIOR = 4;


    public Student(String name, String address, String phoneNumber, String emailAddress, int status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1:
                return "Freshman";
            case 2:
                return "Sophomore";
            case 3:
                return "Junior";
            case 4:
                return "Senior";
            default:
                return "N/A";
        }
    }

    public String toString() {
        return "\n" + super.toString() + "\nSchool Status: " + getStatus();
    }

}
