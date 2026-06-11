package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchTests extends BaseTest {

    @Test
    public void verifySearch() {
        HomePage home = new HomePage(driver);
        home.searchProduct("YONEX");
        Assert.assertTrue(driver.getPageSource().contains("YONEX"));
    }
}
