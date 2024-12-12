package es.upm.grise.prof.curso2024.control1;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountNumber;
    private float initialAmount;
    private List<Transaction> transactions;

    // Constructor modificado para aceptar accountNumber e initialAmount
    Account(String accountNumber, float initialAmount) {
        this.accountNumber = accountNumber;
        this.initialAmount = initialAmount;
        this.transactions = new ArrayList<Transaction>();
    }

    // Método para obtener el saldo actual (incluyendo transacciones)
    public float getCurrentBalance() {
        float result = initialAmount;

        for (Transaction transaction : transactions) {
            result += transaction.getAmount();
        }

        return result;
    }

    // Getter para el número de cuenta
    public String getAccountNumber() {
        return accountNumber;
    }
    
    // Método para agregar transacciones (si es necesario)
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}
