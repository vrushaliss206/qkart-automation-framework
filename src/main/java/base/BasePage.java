package base;

import org.openqa.selenium.*;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
    }

    protected void click(By locator) {

        driver.findElement(locator).click();
    }

    protected void type(
            By locator,
            String text) {

        driver.findElement(locator)
                .sendKeys(text);
    }
}