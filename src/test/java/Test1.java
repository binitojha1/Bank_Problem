import banks.Bank;
import banks.HdfcBank;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BaseTest{



    @Test
    public void bankTest() {

        System.out.println(bank.getBankName());
        System.out.println("Balance is Rs. : "+ bank.getAvailableBalance());
        bank.depositAmount(1000);
        Assert.assertEquals(bank.getAvailableBalance(), 1000);
        bank.withdrawAmount(720);
        Assert.assertEquals(bank.getAvailableBalance(), 280);
        bank.depositAmount(500);
        Assert.assertEquals(bank.getAvailableBalance(), 780);
    }
}
