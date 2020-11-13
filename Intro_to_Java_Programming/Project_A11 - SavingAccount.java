/**
* Description: This class contains the methods, variables, and constructors.
 */

public class SavingsAccount extends Account {

    public SavingsAccount(int id, double balance,double annualInterestRate){

        super(id,balance,annualInterestRate);
    }

    public void withdraw(double amount){
        if(getBalance() > amount){
            setBalance(getBalance()-amount);
        }
        else{
            System.out.println("Your account is overdrawn");
        }
    }

    public String toString(){
        return super.toString();
    }
}

