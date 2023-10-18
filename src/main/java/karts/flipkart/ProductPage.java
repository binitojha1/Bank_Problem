package karts.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage implements karts.kart.ProductPage {
    private WebDriver driver;

    private WebElement addToCartButton = driver.findElement(By.xpath("//button[text()=' Add To Cart']"));
    Wait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    public ProductPage(WebDriver driver) {
        super();
        this.driver = driver;
    }
    @Override
    public ProductPage clickOnAddTOCartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
        return null;
    }
}
