package pages;

import org.openqa.selenium.*;


import java.util.List;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String product) {
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.clear();
        searchBox.sendKeys(product);
    }

    public void addProductToCart(String productName) {
        List<WebElement> products = driver.findElements(By.className("css-yg30e6"));
        List<WebElement> buttons = driver.findElements(By.xpath("//button[text()='Add to cart']"));

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getText().equalsIgnoreCase(productName)) {
                buttons.get(i).click();
                return;
            }
        }
        throw new RuntimeException("Product not found: " + productName);
    }

  public void clickCheckout() {
    driver.findElement(By.xpath("//button[text()='Checkout']")).click();
}


    public void logout() {
        driver.findElement(By.className("MuiButton-text")).click();
    }
}
