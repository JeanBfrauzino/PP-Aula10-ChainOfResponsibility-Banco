package Chain_Of_Responsibility_Banco;

public class WithdrawHandler extends AbstractTransactionHandler {
    @Override
    public void handle(Transaction transaction) {
        if ("withdraw".equalsIgnoreCase(transaction.getType())) {
            if (transaction.getFromAccount().hasSufficientBalance(transaction.getAmount())) {
                transaction.getFromAccount().withdraw(transaction.getAmount());
            } else {
                System.out.println("Saldo insuficiente para o saque.");
            }
        } else {
            super.handle(transaction);
        }
    }
}
