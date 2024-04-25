package answer10;

public class CheckingAccount extends BankAccount{
    /* Write a Java program to create a base class BankAccount with methods deposit() and
    withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
    withdraw() method in each subclass to impose different withdrawal limits and fees.*/
    double overdraftFee;
    public CheckingAccount(double initialBalance, double overdraftFee) {
        super(initialBalance);
        this.overdraftFee = overdraftFee;
    }
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft fee applied.");
            super.withdraw(amount + overdraftFee);
        }
    }

    public static void main(String[] args) {
        BankAccount checkingAccount = new CheckingAccount(1550, 450);
        withdrawFromAccount(checkingAccount, 450);
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
    public static void withdrawFromAccount(BankAccount account, double amount) {
        account.withdraw(amount);
    }
}
