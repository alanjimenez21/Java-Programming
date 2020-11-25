/**
* Write a program called SalaryAnalyzer.java to display the total
 * salary for assistant professors, associate professors, full professors, and all faculty,
 * respectively, and display the average salary for assistant professors, associate professors,
 * full professors, and all faculty, respectively. Y
 */


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

//Link to extract the information http://liveexample.pearsoncmg.com/data/Salary.txt

public class SalaryAnalyzer {

    public static void main(String[] args) throws Exception {
        //Define Constant Variables
        final int ASSISTANT = 0;
        final int ASSOCIATE = 1;
        final int FULL = 2;

        //Define Array Lists
        ArrayList<ArrayList<Double>> ranks = new ArrayList<>(3);
        ranks.add(ASSISTANT, new ArrayList<>());
        ranks.add(ASSOCIATE, new ArrayList<>());
        ranks.add(FULL, new ArrayList<>());

        try {
            //Read URL Website
            URL url = new URL("http://liveexample.pearsoncmg.com/data/Salary.txt");
            Scanner userInput = new Scanner(url.openStream());

            //Count Ranks
            int assistantCount = 0;
            int associateCount = 0;
            int fullCount = 0;
            int totalFaculty = 0;

            //Identify Ranks & Add them to Array
            while (userInput.hasNext()) {
                String firstName = userInput.next();
                String lastName = userInput.next();
                String rank = userInput.next();
                if (rank.contains("assistant")) {
                    ranks.get(ASSISTANT).add(userInput.nextDouble());
                    assistantCount += 1;
                } else if (rank.contains("associate")) {
                    ranks.get(ASSOCIATE).add(userInput.nextDouble());
                    associateCount += 1;
                } else {
                    ranks.get(FULL).add(userInput.nextDouble());
                    fullCount += 1;
                }
                totalFaculty = assistantCount + associateCount + fullCount;
            }
            //Salary Variables
            long totalAssistantsSalary = (long) getTotal(ranks.get(ASSISTANT).toArray());
            long totalAssociatesSalary = (long) getTotal(ranks.get(ASSOCIATE).toArray());
            long totalFullsSalary = (long) getTotal(ranks.get(FULL).toArray());
            long facultySalary = totalAssistantsSalary + totalAssociatesSalary + totalFullsSalary;

            //AVG Variables
            double averageAssistantSalary = (double) totalAssistantsSalary / assistantCount;
            double averageAssociateSalary = (double) totalAssociatesSalary / associateCount;
            double averageFullSalary = (double) totalFullsSalary / fullCount;
            double averageFacultySalary = (double) facultySalary / totalFaculty;

            //Print out Values
            System.out.println("\t           Faculty Salaries:");
            System.out.println("There are " + assistantCount + " Assistants professors with a total salary of: $" + totalAssistantsSalary);
            System.out.println("There are " + associateCount + " Associates professors with a total salary of: $" + totalAssociatesSalary);
            System.out.println("There are " + fullCount + " Full-Time professors with a total salary of: $" + totalFullsSalary);
            System.out.println("The total salary of all " + totalFaculty + " faculty members is: $" + facultySalary);
            System.out.println();
            System.out.printf("The average salary of an assistant professors:  $%.2f\n", averageAssistantSalary);
            System.out.printf("The average salary of an associate professor: $%.2f\n", averageAssociateSalary);
            System.out.printf("The average salary of a full-time professor: $%.2f\n", averageFullSalary);
            System.out.printf("The average salary of all faculty professors: $%.2f\n", averageFacultySalary);

        } catch (MalformedURLException exception) {
            System.out.println("Invalid URL");
        } catch (IOException ex) {
            System.out.println("IO Errors");
        }

    }

    /**
     * Methods
     */
    private static double getTotal(Object[] ranks) {
        double total = 0;
        for (Object o : ranks) {
            total += (double) o;
        }
        return total;
    }
}

