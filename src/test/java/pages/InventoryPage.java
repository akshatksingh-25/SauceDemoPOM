package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    // Step 1: Driver reference
    WebDriver driver;

    // Step 2: Locators
    By firstProduct = By.id("item_4_title_link");
    By secondProduct = By.id("item_0_title_link");
    By cartBadge = By.className("shopping_cart_badge");
    By cartLink = By.className("shopping_cart_link");

    // Step 3: Constructor
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    // Step 4: Page actions

    public void openFirstProduct() {
        driver.findElement(firstProduct).click();
    }

    public void openSecondProduct() {
        driver.findElement(secondProduct).click();
    }

    public String getCartCount() {
        return driver.findElement(cartBadge).getText();
    }

    public void goToCart() {
        driver.findElement(cartLink).click();
    }

    // Step 5: Page state
    public boolean isOnInventoryPage() {
        return driver.getCurrentUrl().contains("inventory.html");
    }
}
