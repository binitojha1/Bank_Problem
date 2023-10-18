package karts.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage implements karts.kart.LoginPage {
    private WebDriver driver;


    private String uname = "binito@testvagrant.com";
    private String password = "123456";

    private WebElement uNameTextField = driver.findElement(By.xpath("//input[@id='ap_email']"));
    private WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
    private WebElement passwordField = driver.findElement(By.xpath("//input[@id='ap_password']"));
    private WebElement signInButton = driver.findElement(By.xpath("//input[@id='signInSubmit']"));

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage doLogin(String userName, String password) {
        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
        uNameTextField.click();
        uNameTextField.sendKeys(userName);
        continueButton.click();
        passwordField.click();
        passwordField.sendKeys(password);
        signInButton.click();
        return new HomePage(driver);
    }
}
