import java.util.Scanner;

abstract class Account {
    private int accountNumber;
    protected Double balance;

    Account(int accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Double withdraw(Double amount) {
        return balance -= amount;
    }

    abstract double calculateInterest();
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}

class CheckingAccount extends Account {
    double monthlyFee;

    CheckingAccount(int accountNumber, double balance, double monthlyFee) {
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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Savings Account details:");
        System.out.print("Account Number: ");
        int savingsAccountNumber = scanner.nextInt();


        System.out.print("Balance: ");
        double savingsBalance = scanner.nextDouble();

        System.out.print("Interest Rate: ");
        double interestRate = scanner.nextDouble();
        SavingsAccount savingAccount = new SavingsAccount(savingsAccountNumber, savingsBalance, interestRate);

        System.out.println("Enter Checking Account details:");
        System.out.print("Account Number: ");
        int checkingAccountNumber = scanner.nextInt();
        System.out.print("Balance: ");
        double checkingBalance = scanner.nextDouble();
        System.out.print("Monthly Fee: ");
        double monthlyFee = scanner.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(checkingAccountNumber, checkingBalance, monthlyFee);

        
        System.out.println("Savings Account Interest: " + savingAccount.calculateInterest());
        System.out.println("Checking Account Interest: " + checkingAccount.calculateInterest());

        scanner.close();
    }
}