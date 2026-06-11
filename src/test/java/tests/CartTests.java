package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class CartTests extends BaseTest {

    @Test
    public void verifyAddToCart() {
        HomePage home = new HomePage(driver);
        home.searchProduct("YONEX Smash Badminton Racquet");
        home.addProductToCart("YONEX Smash Badminton Racquet");
    }
}
