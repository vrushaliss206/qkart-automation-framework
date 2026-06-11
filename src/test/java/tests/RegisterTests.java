package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.RegisterPage;
import utils.ExcelUtils;

public class RegisterTests extends BaseTest {

    @DataProvider(name = "registerData")
    public Object[][] registerData() throws Exception {

        return ExcelUtils.getTestData(
                "src/main/resources/testdata/users.xlsx");
    }

    @Test(dataProvider = "registerData")
    public void verifyRegistration(
            String username,
            String password) {

        RegisterPage registerPage =
                new RegisterPage(driver);

        // Make username unique every run
        String uniqueUsername =
                username + System.currentTimeMillis();

        registerPage.registerUser(
                uniqueUsername,
                password,
                password);

        Assert.assertTrue(
                driver.getCurrentUrl().contains("login"),
                "Registration failed");
    }

    // Optional: Run this once to verify Excel reading
    @Test(enabled = false)
    public void readExcelData() throws Exception {

        Object[][] data =
                ExcelUtils.getTestData(
                        "src/main/resources/testdata/users.xlsx");

        for (Object[] row : data) {

            System.out.println(
                    row[0] + " " + row[1]);
        }
    }
}