package karts.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class HomePage implements karts.kart.HomePage {
    private WebDriver driver;

    private WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    private WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
    Wait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    public HomePage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public ProductPage searchProduct(String productName) {
        String mainWindowHandle = driver.getWindowHandle();
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys(productName);
        searchButton.click();
        WebElement product = driver.findElement(By.xpath("//span[text()='1,569']"));
        wait.until(ExpectedConditions.visibilityOf(product));
        product.click();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles){
            if (handle != mainWindowHandle)
                driver.switchTo().window(handle);
        }

        return new ProductPage(driver);
    }
}
