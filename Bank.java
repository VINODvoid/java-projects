abstract class Account {
    private int accountNumber;
    protected Double balance ;
    Account(int accountNumber,Double balance)
    {
        this.accountNumber  = accountNumber;
        this.balance = balance;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public double getBalance()
    {
        return balance;
   }
    public Double withdraw(Double amount)
    {
        return balance -=amount;
    }
    abstract double calculateInterest();
}
class SavingsAccount extends Account{
    double interestRate;
    SavingsAccount(int accountNumber,double balance ,double interestRate)
    {
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }
    @Override
    public double calculateInterest()
    {
        return balance*interestRate;
    }
}
class CheckingAccount extends Account
{
    double monthlyFee;
    CheckingAccount(int accountNumber,double balance , double monthlyFee)
    {
        super(accountNumber, balance);
        this.monthlyFee = monthlyFee;
    }

    @Override
    double calculateInterest() { 
        return 0.0;
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount savingAccount = new SavingsAccount(1234567, 12.89, 3.0);
        CheckingAccount checkingAccount = new CheckingAccount(2002, 1000.0, 12.5); 
        System.out.println(savingAccount.calculateInterest());
        System.out.println(checkingAccount.calculateInterest());
    }
}
