package answer10;

public class SavingAccount extends BankAccount{
    /* Write a Java program to create a base class BankAccount with methods deposit() and
    withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
    withdraw() method in each subclass to impose different withdrawal limits and fees.*/
    double withdrawalLimit;
    public SavingAccount(double initialBalance, double withdrawalLimit) {
        super(initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal limit exceeded.");
        }
    }
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingAccount(2500, 850);
        withdrawFromAccount(savingsAccount, 500);
        System.out.println("Saving Account Balance: " + savingsAccount.getBalance());}
    public static void withdrawFromAccount(BankAccount account, double amount) {
        account.withdraw(amount);
    }

}
