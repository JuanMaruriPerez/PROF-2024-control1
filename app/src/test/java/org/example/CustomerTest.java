package es.upm.grise.prof.curso2024.control1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    // Valores que no sean "magic numbers"
    private static final float ACCOUNT_1_BALANCE = 1000.0f;
    private static final float ACCOUNT_2_BALANCE = 5000.0f;
    private static final String ACCOUNT_1_NUMBER = "A";
    private static final String ACCOUNT_2_NUMBER = "B";

    @Test
    void testNoAccountsAssociated() {
        Customer customer = new Customer();
        assertThrows(NoAccountsException.class, () -> customer.getAccountWithHighestBalance(), 
                     "NoAccountsException is expected");
    }

    @Test
    void testGetAccountWithHighestBalance() throws NoAccountsException {
        Customer customer = new Customer();
        
        Account account1 = new Account(ACCOUNT_1_NUMBER, ACCOUNT_1_BALANCE);
        Account account2 = new Account(ACCOUNT_2_NUMBER, ACCOUNT_2_BALANCE);
        
        customer.addAccount(account1);
        customer.addAccount(account2);

        String accountWithHighestBalance = customer.getAccountWithHighestBalance();

        assertEquals(ACCOUNT_2_NUMBER, accountWithHighestBalance, 
                "the account should be " + ACCOUNT_2_NUMBER);
    }
}



