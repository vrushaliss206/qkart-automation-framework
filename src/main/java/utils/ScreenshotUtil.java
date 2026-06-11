package utils;

import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static void capture(WebDriver driver, String name) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File("build/screenshots/" + name + ".png");
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
