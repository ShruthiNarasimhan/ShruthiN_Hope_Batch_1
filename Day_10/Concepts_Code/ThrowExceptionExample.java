package Day_10.Concepts_Code;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws InsufficientBalanceException {
        if (amount > 0) {
            balance+=amount;
            System.out.println("Deposited: "+amount);
        } else {
            throw new InsufficientBalanceException("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            throw new InsufficientBalanceException("Invalid withdrawal amount or insufficient funds.");
        }
    }
}
public class ThrowExceptionExample {
    public static void main(String[] args) throws InsufficientBalanceException{
        BankAccount account = new BankAccount("123456789", 10000.0);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        try {
            account.deposit(500.0);
            System.out.println("Balance after deposit: " + account.getBalance());

            account.withdraw(200.0);
            System.out.println("Balance after withdrawal: " + account.getBalance());

            account.withdraw(15000.0); 
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
