import Keyin.BankAccount;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {

    @Test
    public void testDeposit (){

        BankAccount account = new BankAccount();
        account.deposit(100);
        Assert.assertEquals(100, account.getBalance(), 0 );
    }

    @Test
    public void TestWithdraw () {

        BankAccount account = new BankAccount();
        account.deposit(200);
        account.withdraw(50);
        Assert.assertEquals(150,account.getBalance(),0);
    }

    @Test
    public void TestWithdrawInsufficientFunds(){
        BankAccount account = new BankAccount();
        account.deposit(200);
        account.withdraw(100);
        Assert.assertEquals(100, account.getBalance(),0);
    }

    @Test
    public void testOverdrawLimit() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(150);
        Assert.assertEquals(-50, account.getBalance(),0);
    }
}


