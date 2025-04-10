package utils;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;


public class Closed_Tab {
    
    private WebDriver driver;

    // Constructor to initialize WebDriver
    public void WindowHandlingUtil(WebDriver driver) {
        this.driver = driver;
    }

    // Method to switch to child window and close it
    public void switchToChildAndClose() throws InterruptedException {
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();

        String parentWindow = iterator.next();
        String childWindow = null;

        // Identify the child window
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }

        // Switch to child window, close it, and return to parent window
        if (childWindow != null) {
            Thread.sleep(3000); // Wait for visibility
            driver.switchTo().window(childWindow).close();
            Thread.sleep(3000); // Wait before switching back
        }

        driver.switchTo().window(parentWindow);
    }
}
