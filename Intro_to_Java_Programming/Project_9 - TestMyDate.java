/**
*Description: This program will display current date & time elapsed method.
*/

public class TestMyDate {
    public static void main(String[] args) {
        //DateOne = Current Date && dateTwo = Elapse Time
        MyDate dateOne = new MyDate();
        MyDate dateTwo = new MyDate( 34355555133101L);

        //Print Results
        System.out.println("Date one: " + dateOne.getYear() +" / " + dateOne.getMonth() + " / " + dateOne.getDay());
        System.out.println("Date two: "+ dateTwo.getYear() +" / " + dateTwo.getMonth() + " / " + dateTwo.getDay());

    }
}
