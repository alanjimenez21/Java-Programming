 /**
 * Description: This program will display balance, monthly interest, and date created on a bank account.
 */

public class TestAccount {
    public static void main(String[] args) {
        //Create account, set interest, call methods withdrawal and deposit.
        Account myAccount = new Account(1122,20000);
        myAccount.setAnnualInterestRate(4.5);
        myAccount.withdrawal(2500);
        myAccount.deposit(3000);

        //Get balance, monthly interest, and date created,
        System.out.println("The balance is $" + myAccount.getBalance());
        System.out.println("The monthly interest is " + myAccount.getMonthlyInterest());
        System.out.println("The date when the account was created is " + myAccount.getDateCreated());
    }
}
