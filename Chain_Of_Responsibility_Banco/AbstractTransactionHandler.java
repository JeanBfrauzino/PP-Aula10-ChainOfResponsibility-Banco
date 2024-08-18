package Chain_Of_Responsibility_Banco;

public abstract class AbstractTransactionHandler implements TransactionHandler {
    private TransactionHandler nextHandler;

    @Override
    public TransactionHandler setNext(TransactionHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    @Override
    public void handle(Transaction transaction) {
        if (nextHandler != null) {
            nextHandler.handle(transaction);
        } else {
            System.out.println("Transação inválida ou não processada.");
        }
    }
}

