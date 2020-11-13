/**
 * Description: This class contains the methods, variables, and constructors.
 */

import java.util.Date;

public class Account {

    /**
     * Variables
     */

    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated = new Date();

    /**
     * Constructors
     */

    //A no-arg constructor that creates a default account.
    public Account() {
        //dateCreated = new Date();
    }

    //A constructor that creates an account with the specified id and initial balance.
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * Accessor & Mutator Methods
     */
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //Getters
    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    /**
     * Methods
     */

    double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    void withdrawal(double withdrawalAmount) {
        balance -= withdrawalAmount;
    }

    void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public String toString() {
        return "Account Number:  " + id + "\nBalance: $" + balance + "\nAnnual Interest Rate: " + annualInterestRate + "%"
                + "\nDate Created: " +  dateCreated;
    }

}
