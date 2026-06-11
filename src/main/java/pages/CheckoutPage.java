package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;
    WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addNewAddress(String address) {
        WebElement addNewBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("add-new-btn"))
        );
        addNewBtn.click();

        WebElement addressBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("textarea[placeholder='Enter your complete address']")
                )
        );
        addressBox.sendKeys(address);

        WebElement addBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[text()='ADD']")
                )
        );
        addBtn.click();
    }

    public void selectAddress(String address) {
        WebElement addressCard = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//p[text()='" + address + "']")
                )
        );
        addressCard.click();
    }

    public void placeOrder() {
        WebElement placeOrderBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[text()='PLACE ORDER']")
                )
        );
        placeOrderBtn.click();
    }
}
