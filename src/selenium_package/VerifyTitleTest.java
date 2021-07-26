package selenium_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/CC-Student/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "google";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        System.out.println("Actual Title: " + actualTitle);
        System.out.println("Expected Title: " +expectedTitle);
        driver.close();
    }
}
