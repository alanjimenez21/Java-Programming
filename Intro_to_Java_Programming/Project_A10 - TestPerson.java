public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Joshua Ramirez", "415 Banker Rd Raleigh, NC 25500", "919-123-456", "jramirez@gmail.com");
        Student student = new Student("Derek Williams", "512 Termini Rd Cary, NC 26502", "919-321-654", "dwilliams@gamil.com", 1);
        Employee employee = new Employee("Allison Webber", "7985 Green Place Rd Morrisville, NC 27560", "919-456-789", "awebber@gmail.com", 1325, 50000);
        Faculty faculty = new Faculty("Alexander Torres", "1478 Pine Dr Cary, NC 27650", "209-534-4718", "atorres@gmail.com", 2502, 56000, "Nelson Hall", "Associate Instructor");
        Staff staff = new Staff("Sandra Bailey", "5468 Oak Trail Durham, NC 27760", "919-951-753", "sbailey@gmail.com", 784, 60000, "Director of Diversity");

        System.out.println("Person:\n" + person.toString());
        System.out.println("\nStudent:" + student.toString());
        System.out.println("\nEmployee:" + employee.toString());
        System.out.println("\nFaculty:" + faculty.toString());
        System.out.println("\nStaff:" + staff.toString());
    }
}
