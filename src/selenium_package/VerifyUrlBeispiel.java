package selenium_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlBeispiel {
    public static void main(String[] args) {
        // ChromeDriver kullanarak youtube sayfasina gidin
        System.setProperty("webdriver.chrome.driver","C:/Users/CC-Student/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

        // Sayfa basliginin "youtube" olup olmadigini dogrulayin(verify), eger degilse dogru basligi( Actual Title ) konsola yazdirin.
        String actualYoutubeTitle = driver.getTitle();
        String expectedYoutubeTitle = "youtube";
        if(actualYoutubeTitle.equals(expectedYoutubeTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL YOUTUBE TITLE: "+actualYoutubeTitle);
            System.out.println("EXPECTED YOUTUBE TITLE: "+expectedYoutubeTitle);
        }

        // Sayfa URL'sinin "youtube" icerip icermedigini (contains) dogrulayin, icermiyorsa dogru URL'yi yazdirin.
        String actualYoutubeURL = driver.getCurrentUrl();
        String expectedYoutubeURL = "youtube";
        if(actualYoutubeURL.contains(expectedYoutubeURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL YOUTUBE URL: "+actualYoutubeURL);
        }

        // Daha sonra navigate to https://www.amazon.com/
        driver.navigate().to("htpps://www.amazon.com/");
        // Navigate back to youtube
        driver.navigate().back();
        // Refresh the page
        driver.navigate().refresh();
        // Nagivate forward to amazon
        driver.navigate().forward();
        // Maximize the window
        driver.manage().window().maximize();
        // Ardindan sayfa basliginin "Amazon" icerip icermedigini(contains) dogrulayin, yoksa dogru basligi (Actual Title) yazdirin.

        String actualAmazonTitle = driver.getTitle();
        String expectedAmazonTitle = "Amazon";

        if(actualAmazonTitle.contains(expectedAmazonTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON TITLE: "+actualAmazonTitle);

        }
        /*
        // Sayfa URL'sinin https://www.amazon.com/ olup olmadigini dogrulayin, degilse dogru URL'yi yazdirin.

        String actualAmazonURL = driver.getCurrentUrl();
        String expectedAmazonURL = "https://www.amazon.com/";

        if(actualAmazonURL.equals(expectedAmazonURL)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON URL: "+actualAmazonURL);
            System.out.println("EXPECTED AMAZON URL: "+expectedAmazonURL);
        }


        // Quit the browser
        driver.quit();
        */
    }


}
