import io.github.bonigarcia.wdm.WebDriverManager;
import karts.kart.Kart;
import karts.amazon.AmazonKart;
import karts.flipkart.FlipKart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import utils.ConfigLoader;

public class BaseTest {

    protected Kart kart;
    protected WebDriver driver;

    @BeforeTest
    public void setUpBank() {
        setUpBrowser();
        String kartName = ConfigLoader.getInstance().getKartName();
        switch (kartName) {
            case "flipkart" :
                kart = new FlipKart(driver);
                break;
            case "amazon" :
                kart = new AmazonKart(driver);
                break;
        }
    }

    private void setUpBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
}
