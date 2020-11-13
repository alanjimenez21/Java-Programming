 /**
 * Description: This program will display balance, monthly interest, and date created on a bank account.
 * & Checking and Saving Account information
 */

public class TestAccount {
    public static void main(String[] args) {
        //Create Account with Parameters & Deposit or Withdraw Amount
        Account myAccount = new Account(12459,2500,4.5);
        myAccount.deposit(3000);
        myAccount.withdrawal(2350);

        //Create Checking Account with Parameters & Deposit or Withdraw Amount
        CheckingAccount myCheckingAccount = new CheckingAccount(95421,300,4.5,-10);
        myCheckingAccount.deposit(700);
        myCheckingAccount.withdraw(800);

        ////Create Savings Account with Parameters & Deposit or Withdraw Amount
        SavingsAccount mySavingAccount = new SavingsAccount(93478,40000,4.5);
        mySavingAccount.deposit(6000);
        mySavingAccount.withdraw(3000);

        //Print Accounts Information
        System.out.println(myAccount.toString());
        System.out.println("\nChecking " +myCheckingAccount.toString());
        System.out.println("\nSavings "+mySavingAccount.toString());
