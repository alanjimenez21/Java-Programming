/**
 * Description: This class contains the methods, variables, and constructors.
 */

import java.util.GregorianCalendar;

/**
 * Class: CSC.151.00003 - Java Programming
 * Student: Alan Ivan Jimenez Gallardo
 * Instructor: Ying Andrews
 * Due: 10/26/2020
 * Description: This class contains the methods, variables, and constructors.
 */

public class MyDate {

    /**
     * Variables
     */
    //The data fields year, month, and day that represent a date. month is 0-based, i.e., 0 is for January
    private int year;
    private int month;
    private int day;

    /**
     * Constructors
     */

    //A no-arg constructor that creates a MyDate object for the current date.
    MyDate() {
        GregorianCalendar currentDate = new GregorianCalendar();
        year = currentDate.get(GregorianCalendar.YEAR);
        month = currentDate.get(GregorianCalendar.MONTH);
        day = currentDate.get(GregorianCalendar.DAY_OF_MONTH);
    }

    //A constructor that constructs a MyDate object with a specified elapsed time since midnight, January 1, 1970, in milliseconds.
    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    //A constructor that constructs a MyDate object with the specified year, month, and day

    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Getters
     */

    public int getYear() {
        return year;
    }

    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }

    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }

    /**
     * Setter
     */

    //This method will calculate Time elapsed
    public void setDate(long elapsedTime) {
        GregorianCalendar newCalendar = new GregorianCalendar();
        newCalendar.setTimeInMillis(elapsedTime);
        year = newCalendar.get(GregorianCalendar.YEAR);
        month = newCalendar.get(GregorianCalendar.MONTH);
        day = newCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

}
