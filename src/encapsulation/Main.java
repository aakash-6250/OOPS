package encapsulation;

public class Main{
    public static void main(String[] args) {
        BankAccount aakash=new BankAccount(1,200);
        BankAccount manish=new BankAccount(2,400);
        System.out.println("Aakash account number : "+aakash.getAccountNumber());
        System.out.println("Aakash account balance : "+ aakash.getBalance());
        aakash.deposit(2000);
        aakash.withdraw(4000);
        aakash.withdraw(500);
        System.out.println("Manish account number : "+manish.getAccountNumber());
        System.out.println("Manish account balance : "+ manish.getBalance());
        manish.deposit(5000);
        manish.withdraw(40000);
        manish.withdraw(400);
    }
}
