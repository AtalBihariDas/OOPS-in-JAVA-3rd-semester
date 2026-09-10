class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Invalid withdrawal.");
    }
}
public class Question39 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Rahul", 5000);
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(2000);
        System.out.println("After deposit: " + account.getBalance());
        account.withdraw(1500);
        System.out.println("After withdrawal: " + account.getBalance());
    }
}
