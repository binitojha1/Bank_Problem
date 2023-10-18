package karts.amazon;

import karts.kart.Kart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class AmazonKart implements Kart {

    private WebDriver driver;
    private String uname = "binito@testvagrant.com";
    private String password = "123456";

    public AmazonKart(WebDriver driver) {
        this.driver = driver;
    }


    @Override
    public String getKartName() {
        return "The test is running for Amazon Kart..!";
    }

    @Override
    public LoginPage loadKart() {
        driver.get("https://www.amazon.in/");

        return new LoginPage(driver);
    }



}
