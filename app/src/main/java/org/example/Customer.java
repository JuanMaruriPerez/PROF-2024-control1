package es.upm.grise.prof.curso2024.control1;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<Account> accounts;

    // Constructor para inicializar la lista de cuentas
    Customer() {
        accounts = new ArrayList<Account>();
    }

    // Método para agregar cuentas al cliente
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Método para obtener la cuenta con el mayor saldo
    public String getAccountWithHighestBalance() throws NoAccountsException {
        if (accounts.isEmpty()) {
            throw new NoAccountsException();
        }

        String selectedAccount = "";
        float maxBalance = 0;

        for (Account account : accounts) {
            if (account.getCurrentBalance() > maxBalance) {
                selectedAccount = account.getAccountNumber();
                maxBalance = account.getCurrentBalance(); // Aseguramos que maxBalance se actualice
            }
        }

        return selectedAccount;
    }
}
