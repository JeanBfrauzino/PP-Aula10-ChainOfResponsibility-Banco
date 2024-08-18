package Chain_Of_Responsibility_Banco;

public class TransferHandler extends AbstractTransactionHandler {
    @Override
    public void handle(Transaction transaction) {
        if ("transfer".equalsIgnoreCase(transaction.getType())) {
            if (transaction.getFromAccount().hasSufficientBalance(transaction.getAmount())) {
                transaction.getFromAccount().withdraw(transaction.getAmount());
                transaction.getToAccount().deposit(transaction.getAmount());
                System.out.println("Transferência de R$" + transaction.getAmount() + " realizada da conta " +
                        transaction.getFromAccount().getAccountNumber() + " para a conta " + transaction.getToAccount().getAccountNumber());
            } else {
                System.out.println("Saldo insuficiente para a transferência.");
            }
        } else {
            super.handle(transaction);
        }
    }
}

