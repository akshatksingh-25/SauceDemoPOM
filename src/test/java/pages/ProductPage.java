package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    // Step 1: Driver reference
    WebDriver driver;

    // Step 2: Locators
    By addToCartButton = By.id("add-to-cart");
    By backToProductsButton = By.id("back-to-products");

    // Step 3: Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Step 4: Page actions

    public void addProductToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void goBackToProducts() {
        driver.findElement(backToProductsButton).click();
    }
}
