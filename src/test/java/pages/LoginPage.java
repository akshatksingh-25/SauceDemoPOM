package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    // Step 1: Create driver reference
    WebDriver driver;

    // Step 2: Create locators
    By fillUsername = By.id("user-name");
    By fillPassword = By.id("password");
    By clickLogin = By.id("login-button");

    // Step 3: Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Step 4: Page actions
    public void login(String username, String password) {
        driver.findElement(fillUsername).sendKeys(username);
        driver.findElement(fillPassword).sendKeys(password);
        driver.findElement(clickLogin).click();
    }

    // Step 5: Page state (NO verification here)
    public boolean isLoginSuccessful() {
        return driver.getCurrentUrl().contains("inventory.html");
    }
}
