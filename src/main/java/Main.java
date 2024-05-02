import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Goes to the URL
            driver.get("https://www.officeworks.com.au/app/identity/create-account");

            // Perform actions using relative locators
            RelativeSeleniumLocator.performActions(driver);

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}