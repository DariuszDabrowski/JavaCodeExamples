package Account;


import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void defaultAccountTest() {
        Account testAccount = new Account("BZPL 12345", "Personal");
        Assert.assertEquals("BZPL 12345", testAccount.getId());
        Assert.assertEquals("Personal", testAccount.getName());
        Assert.assertEquals(0, testAccount.getBalance());
    }
    @Test
    public void AccountTest() {
        Account testAccount = new Account("BZPL 123456", "MyPersonal", 5500);
        Assert.assertEquals("BZPL 123456", testAccount.getId());
        Assert.assertEquals("MyPersonal", testAccount.getName());
        Assert.assertEquals(5500, testAccount.getBalance());
    }
    @Test
    public void AccountGetIdTest() {
        Account testAccount = new Account("BZPL 123", "MyPersonal", 5500);
        Assert.assertEquals("BZPL 123", testAccount.getId());
    }
    @Test
    public void AccountGetNameTest() {
        Account testAccount = new Account("BZPL 123", "MyAccount", 5500);
        Assert.assertEquals("MyAccount", testAccount.getName());
    }
    @Test
    public void AccountGetBalanceTest() {
        Account testAccount = new Account("BZPL 123", "MyPersonal", 4700);
        Assert.assertEquals(4700, testAccount.getBalance());
    }
    @Test
    public void AccountCreditTest() {
        Account testAccount = new Account("BZPL 123", "MyPersonal", 5500);
        Assert.assertEquals(6050, testAccount.credit(550));
    }
    @Test
    public void AccountDebitTest() {
        Account testAccount = new Account("BZPL 123", "MyPersonal", 5500);
        Assert.assertEquals(4900, testAccount.debit(600));
    }
    @Test
    public void AccountTransferToTest() {
        Account testAccount = new Account("BZPL 123", "MyPersonal", 5500);
        Assert.assertEquals(4000, testAccount.transferTo(new Account("PL2332", "SecondAccount", 2300), 1500));
    }
    @Test
    public void AccountToStringTest() {
        Account testAccount = new Account("PL123", "Personal", 5500);
        Assert.assertEquals("Account[id=PL123, name=Personal, balance=5500]", testAccount.toString());
    }

}
