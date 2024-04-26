package Answer12;

public class BankAccount {
   /* Write a Java program to create a class called BankAccount with private instance
    variables accountNumber and balance. Provide public getter and setter methods to
    access and modify these variables.*/
   private String accountNumber;
    private double balance;
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("ICC-0987658");
        account.setBalance(2523.1);
        String accountNumber = account.getAccountNumber();
        double balance = account.getBalance();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
