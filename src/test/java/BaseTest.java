import banks.Bank;
import banks.CitiBank;
import banks.HdfcBank;
import org.testng.annotations.BeforeSuite;
import utils.ConfigLoader;

public class BaseTest {

    protected Bank bank;

    @BeforeSuite
    public void setUpBank() {
        String bankName = ConfigLoader.getInstance().getBankName();
        switch (bankName) {
            case "hdfc" :
                bank = new HdfcBank();
                break;
            case "citi" :
                bank = new CitiBank();
                break;
        }
    }
}
