package tests;

import base.BaseTest;
import listeners.TestListener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;

@Listeners(TestListener.class)

public class LoginTests extends BaseTest {

    @Test

    public void verifyLogin() {

        LoginPage loginPage =
            new LoginPage(driver);

        loginPage.login(
             "admin",
             "admin123");

        Assert.assertTrue(
            driver.getCurrentUrl()
            .contains("home"));
    }
}