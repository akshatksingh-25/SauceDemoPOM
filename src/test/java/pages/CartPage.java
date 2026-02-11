package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    // Step 1: Driver reference
    WebDriver driver;

    // Step 2: Locator
    By checkoutButton = By.id("checkout");

    // Step 3: Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Step 4: Page action
    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }
}
