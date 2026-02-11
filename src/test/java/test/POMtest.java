package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.*;

public class POMtest {

    public static void main(String[] args) {

        // Step 1: Browser setup
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");

        // Step 2: Create Page Object references
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CompletePage completePage = new CompletePage(driver);
        MenuPage menuPage = new MenuPage(driver);

        // Step 3: Login
        loginPage.login("standard_user", "secret_sauce");

        if (loginPage.isLoginSuccessful()) {
            System.out.println("Login Done");
        } else {
            System.out.println("Login Failed");
        }

        // Step 4: Add first product
        inventoryPage.openFirstProduct();
        productPage.addProductToCart();
        productPage.goBackToProducts();

        // Step 5: Add second product
        inventoryPage.openSecondProduct();
        productPage.addProductToCart();
        productPage.goBackToProducts();

        // Step 6: Verify cart count
        System.out.println("Cart Count: " + inventoryPage.getCartCount());

        // Step 7: Checkout
        inventoryPage.goToCart();
        cartPage.clickCheckout();

        checkoutPage.enterUserDetails("Akshat", "Singh", "800001");
        checkoutPage.finishOrder();

        // Step 8: Verify order success
        System.out.println(completePage.getSuccessMessage());

        // Step 9: Back to home
        completePage.goBackToInventory();

        if (inventoryPage.isOnInventoryPage()) {
            System.out.println("Returned to Home Page");
        }

        // Step 10: Logout
        menuPage.logout();

        if (menuPage.isLoggedOut()) {
            System.out.println("Logged out successfully");
        }

        // Step 11: Close browser
//        driver.quit();
    }
}
