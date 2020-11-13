/**
* Description: This class contains the methods, variables, and constructors.
 */

public class CheckingAccount extends Account{
    private double overdraftLimit;


    public CheckingAccount(int id, double balance,double annualInterestRate, int overdraftLimit){
        super(id,balance,annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount){
        if(getBalance() - amount > overdraftLimit){
            setBalance(getBalance()-amount);
        }
        else{
            System.out.println("Your Checking Account has exceeded overdraft amount");
        }
    }

    public String toString(){
        return super.toString() + "\nOverdraft limit: $" + overdraftLimit;
    }
}

