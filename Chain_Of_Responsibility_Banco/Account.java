package Chain_Of_Responsibility_Banco;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depósito de R$" + amount + " realizado na conta " + accountNumber);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Saque de R$" + amount + " realizado na conta " + accountNumber);
    }

    public boolean hasSufficientBalance(double amount) {
        return balance >= amount;
    }
}
