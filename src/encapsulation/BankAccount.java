package encapsulation;

public class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    int getAccountNumber(){
        return this.accountNumber;
    }
    double getBalance(){
        return this.balance;
    }
    void deposit(double amount){
        this.balance+=amount;
        System.out.println("Current balance : "+this.balance);
    }
    void withdraw(double amount){
        if(amount<this.balance){
            balance-=amount;
            System.out.println("Current balance : "+this.balance);
        }
        else System.out.println("Insufficient fund.");
    }
}
