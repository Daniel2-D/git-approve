public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    // Check balance
    public void printAccountSummary() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }

    // MAIN METHOD (entry point)
    public static void main(String[] args) {

        // Create bank account
        BankAccount account = new BankAccount(
                "123456789",
                "Daniel Debesay",
                1000.00
        );

        // Perform transactions
        account.printAccountSummary();
        System.out.println("-----");

        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500); // should fail

        System.out.println("-----");
        account.printAccountSummary();

    }
}
// Bank account status