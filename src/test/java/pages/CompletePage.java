package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletePage {

    // Step 1: Driver reference
    WebDriver driver;

    // Step 2: Locators
    By successHeader = By.className("complete-header");
    By backToProductsButton = By.id("back-to-products");

    // Step 3: Constructor
    public CompletePage(WebDriver driver) {
        this.driver = driver;
    }

    // Step 4: Page actions & state

    public String getSuccessMessage() {
        return driver.findElement(successHeader).getText();
    }

    public void goBackToInventory() {
        driver.findElement(backToProductsButton).click();
    }
}
