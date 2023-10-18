package karts.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class ProductPage implements karts.kart.ProductPage {
    private WebDriver driver;
    Wait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    private WebElement addToCartButton = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage clickOnAddTOCartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();

        return new ProductPage(driver);
    }
}
