package karts.flipkart;

import karts.amazon.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage implements karts.kart.HomePage {
    private WebDriver driver;

    private WebElement searchBox = driver.findElement(By.xpath("//section[@id='sidebar']//input[@placeholder='search'][1]"));
    private WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
    Wait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    public HomePage(WebDriver driver) {
        super();
        this.driver = driver;
    }
    @Override
    public ProductPage searchProduct(String productName) {
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.click();
        searchBox.sendKeys(productName, Keys.RETURN);

        return new ProductPage(driver);
    }
}
