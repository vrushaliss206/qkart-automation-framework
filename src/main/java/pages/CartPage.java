package pages;

import org.openqa.selenium.*;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void changeQuantity(String product, int quantity) {
        WebElement qtyBox = driver.findElement(By.xpath("//div[text()='" + product + "']/../..//input"));
        qtyBox.clear();
        qtyBox.sendKeys(String.valueOf(quantity));
    }
}
