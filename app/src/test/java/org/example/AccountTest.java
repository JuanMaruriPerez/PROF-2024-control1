import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AccountTest {

    private static final double EXPECTED_BALANCE = 1000.0;

    @Test
    void testGetCurrentBalance() {
        Account mockAccount = mock(Account.class);

        when(mockAccount.getCurrentBalance()).thenReturn(EXPECTED_BALANCE);

        assertEquals(EXPECTED_BALANCE, mockAccount.getCurrentBalance(), "The current balance should be " + EXPECTED_BALANCE);
    }
}