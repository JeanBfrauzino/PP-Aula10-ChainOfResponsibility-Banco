package Chain_Of_Responsibility_Banco;

public class Transaction {
    private String type;
    private double amount;
    private Account fromAccount;
    private Account toAccount;

    public Transaction(String type, double amount, Account fromAccount, Account toAccount) {
        this.type = type;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }
}

