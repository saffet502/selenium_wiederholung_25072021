package selenium_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlTest {
    public static void main(String[] args) {
        // Verifizieren Sie, ob die URL von Googlehomepage "www.google.com" ist.
        System.setProperty("webdriver.chrome.driver","C:/Users/CC-Student/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.google.com";

        if(actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        System.out.println("ACTUAL URL: "+actualURL);
        System.out.println("EXPECTED URL: "+expectedURL);
    }
}
