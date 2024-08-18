package Chain_Of_Responsibility_Banco;

public interface TransactionHandler {
    TransactionHandler setNext(TransactionHandler handler);
    void handle(Transaction transaction);
}
