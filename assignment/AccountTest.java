import bankApp.Account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {

    private Account account;

    @BeforeEach
    public void setUP() {
        account = new Account();
        account.deposit(5_000);
    }

    @Test
    public void testThatDepositIs5kThenBalanceIs5k(){
        assertEquals(5_000, account.getBalance());
    }

    @Test
    public void testThatWhenDepositIs5kDepositNegative2kThenBalanceIsUnchanged() {
        account.deposit(-2_000);
        assertEquals(5_000, account.getBalance());
    }

    @Test
    public void testThatDepositIs5kWithdraw2kThenBalanceIs3k() {
        account.withdraw(2_000);
        assertEquals(3_000, account.getBalance());
    }

    @Test
    public void testThatBalanceIs5kThenWithdrawMoreThanBalanceAndBalanceRemainsUnchanged() {
        account.withdraw(10_000);
        assertEquals(5_000, account.getBalance());
    }
}
