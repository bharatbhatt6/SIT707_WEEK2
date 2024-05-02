import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class RelativeSeleniumLocator {
    public static void performActions(WebDriver driver) {
        try {
        	  // First Name input
            WebElement inputfield = driver.findElement(By.id("firstname"));
            inputfield.sendKeys("Bharat");

            // Last Name input
            WebElement lastnamefield = driver.findElement(RelativeLocator.with(By.tagName("input")).below(inputfield));
            lastnamefield.sendKeys("Bhatt");

            // Mobile Number input
            WebElement mobnumber = driver.findElement(RelativeLocator.with(By.tagName("input")).below(lastnamefield));
            mobnumber.sendKeys("123456789");

            // Email input
            WebElement email = driver.findElement(RelativeLocator.with(By.tagName("input")).below(mobnumber));
            email.sendKeys("bharat@email.com");
	
            // Password input
            WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
            password.sendKeys("111");

            // Confirm Password input
            WebElement confirmpass = driver.findElement(RelativeLocator.with(By.tagName("input")).below(password));
            confirmpass.sendKeys("bharat@email.com");

            // Create Account button
            WebElement button = driver.findElement(By.className("ActionButton__StyledButton-r7njn9-0"));

            button.click();
            
            // Screenshot
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:/Users/Nebula PC/Pictures/Screenshots/ss.png"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
