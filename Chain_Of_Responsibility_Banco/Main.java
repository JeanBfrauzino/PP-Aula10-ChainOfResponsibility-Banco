package Chain_Of_Responsibility_Banco;

public class Main {
    public static void main(String[] args) {
        // Configuração das contas
        Account account1 = new Account("123456", 500.0);
        Account account2 = new Account("654321", 300.0);

        // Configuração da cadeia de responsabilidade
        TransactionHandler handler = new DepositHandler();
        handler.setNext(new WithdrawHandler())
               .setNext(new TransferHandler());

        // Exemplo de transações
        Transaction deposit = new Transaction("deposit", 200.0, account1, null);
        Transaction withdraw = new Transaction("withdraw", 100.0, account1, null);
        Transaction transfer = new Transaction("transfer", 150.0, account1, account2);
        Transaction invalid = new Transaction("invalid", 50.0, account1, account2);

        // Processamento das transações
        handler.handle(deposit);   // Deve realizar o depósito
        handler.handle(withdraw);  // Deve realizar o saque
        handler.handle(transfer);  // Deve realizar a transferência
        handler.handle(invalid);   // Transação inválida, não deve ser processada
    }
}

