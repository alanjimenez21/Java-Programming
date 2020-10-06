/**
* Description: This program will read ten integers in an array, differentiate them, and put them in ascending order.
 */

import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        //Define Scanner & Array
        Scanner userInput = new Scanner(System.in);
        int[] myList = new int[10];

        //Input Array Numbers
        System.out.print("Enter ten numbers separated by spaces: ");
        int countDistinctNumbers = 0;
        for (int i = 0; i < myList.length; i++) {
           int arrayNumbersInput = userInput.nextInt();

            //Read a number and store it to an array if new else ignore it
            if (searchDistinctNumber(myList, arrayNumbersInput)){
                myList[countDistinctNumbers] = arrayNumbersInput;
                countDistinctNumbers++;
            }
        }
        //Print Number of Distinct Numbers
        System.out.println("The distinct numbers are: " + countDistinctNumbers);

        //The distinct numbers are
        //The numbers that are ignored will be equal to zero & the for loop will print values from lw to high
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < myList.length; i++) {
            if(myList[i]>0)
                System.out.print(myList[i] + " ");
        }
    }

    //Method to distinguish repeated numbers
    public static boolean searchDistinctNumber(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return false; //false will be 0
        }
        return true; // true will be num
    }
}
