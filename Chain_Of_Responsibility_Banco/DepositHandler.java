package Chain_Of_Responsibility_Banco;

public class DepositHandler extends AbstractTransactionHandler {
    @Override
    public void handle(Transaction transaction) {
        if ("deposit".equalsIgnoreCase(transaction.getType())) {
            if (transaction.getAmount() > 0) {
                transaction.getFromAccount().deposit(transaction.getAmount());
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        } else {
            super.handle(transaction);
        }
    }
}

