/**
 * Description: This program generates a .txt file with 1,000 entries with different ranks, and salaries.
 */

import java.io.File;
import java.io.PrintWriter;

public class SalaryGenerator {
    public static void main(String[] args) throws Exception {
        //TODO Auto-generated method stub
        File SalaryGenerator = new File("salary.txt");
        if (SalaryGenerator.exists()) {
            System.out.println("The File " + SalaryGenerator + " already exists!");
            System.exit(0);
        }
        //Create .txt File
        try (PrintWriter output = new PrintWriter("salary.txt")) {
            for (int i = 1; i <= 1000; i++) {
                String rank = getRandomRank();
                output.print("FirstName" + i + " LastName" + i);
                double salary = getSalaryRank(rank);
                output.printf(" " + rank + " $" + "%.2f\n", salary);

            }
        }
        //Prompt the user when the file is ready to be seen!
        System.out.println("File Ready!");
    }

    //Get Random Rank from Array
    public static String getRandomRank() {
        String[] rank = {"assistant", "associate", "full"};
        return rank[(int) (Math.random() * rank.length)];
    }

    //Get Salary Method
    public static double getSalaryRank(String rank) {
        if (rank.equals("assistant")) {
            return 50000 + (Math.random() * 30001);
        } else if (rank.equals("associate")) {
            return 60000 + (Math.random() * 50001);
        } else
            return 75000 + (Math.random() * 55001);
    }
}
