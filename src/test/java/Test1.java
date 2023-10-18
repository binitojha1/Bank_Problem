import io.github.bonigarcia.wdm.WebDriverManager;
import karts.amazon.AmazonKart;
import karts.amazon.HomePage;
import karts.amazon.ProductPage;
import karts.kart.Kart;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BaseTest{



    @Test
    public void bankTest() {



        System.out.println(kart.getKartName());
//        System.out.println("Balance is Rs. : "+ kart.getAvailableBalance());
//        kart.depositAmount(1000);
//        Assert.assertEquals(kart.getAvailableBalance(), 1000);
//        kart.withdrawAmount(720);
//        Assert.assertEquals(kart.getAvailableBalance(), 280);
//        kart.depositAmount(500);
//        Assert.assertEquals(kart.getAvailableBalance(), 780);

        kart.loadKart().
                doLogin("binito@testvagrant.com","123456").
                searchProduct("adidas").
                clickOnAddTOCartButton();

    }
}
