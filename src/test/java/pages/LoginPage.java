package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    // Step 1: Create driver reference
    WebDriver driver;

    // Step 2: Create locators
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    // Step 3: Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Step 4: Page actions
    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    // Step 5: Page state (NO verification here)
    public boolean isLoginSuccessful() {
        return driver.getCurrentUrl().contains("inventory.html");
    }
}
