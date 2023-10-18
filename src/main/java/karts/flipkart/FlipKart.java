package karts.flipkart;

import karts.kart.Kart;


import org.openqa.selenium.WebDriver;

public class FlipKart implements Kart {

    private WebDriver driver;
    public FlipKart(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public String getKartName() {
        return "The test is running for FlipKart..!";
    }

    @Override
    public LoginPage loadKart() {
        driver.get("https://rahulshettyacademy.com/client/");
        return new LoginPage(driver);
    }




}
