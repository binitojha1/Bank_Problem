package karts.flipkart;

import karts.amazon.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage implements karts.kart.LoginPage {
    private WebDriver driver;


    private String uname = "binito@testvagrant.com";
    private String password = "Bi12345678";

    private WebElement uNameTextField = driver.findElement(By.xpath("//input[@type='email']"));
    private WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
    private WebElement loginButton = driver.findElement(By.xpath("//input[@name='login']"));

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public HomePage doLogin(String userName, String password) {
        uNameTextField.click();
        uNameTextField.sendKeys(userName);
        passwordField.click();
        passwordField.sendKeys(password);
        loginButton.click();
        return new HomePage(driver);
    }
}
