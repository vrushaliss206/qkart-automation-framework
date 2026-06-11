package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import utils.WaitUtils;

public class CheckoutTests extends BaseTest {

    @Test
    public void verifyCheckoutFlow() {
        HomePage home = new HomePage(driver);

        home.searchProduct("YONEX");
        home.addProductToCart("YONEX Smash Badminton Racquet");
        home.clickCheckout();

        // Wait until checkout page loads
        WaitUtils.waitForUrl(driver, "/checkout");

        CheckoutPage checkout = new CheckoutPage(driver);

        String address = "Test Address 123";
        checkout.addNewAddress(address);
        checkout.selectAddress(address);
        checkout.placeOrder();

        Assert.assertTrue(driver.getCurrentUrl().contains("thanks"));
    }
}
