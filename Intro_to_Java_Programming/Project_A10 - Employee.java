import java.util.Date;

public class Employee extends Person {
    private int office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, int office, double salary) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }


    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {

        this.office = office;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public String getDateHired() {
        return dateHired.getMonth() + "/" + dateHired.getDay() + "/" + dateHired.getYear();
    }

    public void setDateHired() {
        dateHired = new MyDate();
    }

    public String toString() {
        return "\n" + super.toString() + "\nOffice: " + office + "\nSalary: $" + salary + "\nDate hired: " + getDateHired();
    }
}
