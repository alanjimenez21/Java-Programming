public class Person {

    /**
     * Variable
     */

    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person() {

    }

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    /**
     * Setters
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Getters
     */
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * to String for Person
     */

    public String toString() {
        return name + "\nAddress: " + address +
                "\nPhone Number: " + phoneNumber + "\nEmail Address: " + emailAddress;
    }
}
