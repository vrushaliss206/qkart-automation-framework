package pages;

import org.openqa.selenium.WebElement;

public class SearchResultPage {

    WebElement parent;

    public SearchResultPage(WebElement parent) {
        this.parent = parent;
    }

    public String getTitle() {
        return parent.getText();
    }
}
