package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    private By registerNowLink =
            By.xpath("//button[text()='Register Now']");

    private By usernameField =
            By.id("username");

    private By passwordField =
            By.id("password");

    private By confirmPasswordField =
            By.id("confirmPassword");

    private By registerButton =
            By.xpath("//button[text()='Register']");

    public RegisterPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickRegisterNow() {

        driver.findElement(registerNowLink).click();
    }

    public void enterUsername(String username) {

        driver.findElement(usernameField)
                .sendKeys(username);
    }

    public void enterPassword(String password) {

        driver.findElement(passwordField)
                .sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {

        driver.findElement(confirmPasswordField)
                .sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {

        driver.findElement(registerButton).click();
    }

    public void registerUser(
            String username,
            String password,
            String confirmPassword) {

        clickRegisterNow();

        enterUsername(username);

        enterPassword(password);

        enterConfirmPassword(confirmPassword);

        clickRegisterButton();
    }
}