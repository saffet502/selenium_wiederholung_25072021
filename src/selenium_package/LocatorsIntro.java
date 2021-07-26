package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {
    public static void main(String[] args) {
        //http://a.testaddressbook.com/sign_in adresine gidiniz
        System.setProperty("webdriver.chrome.driver","C:/Users/CC-Student/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        // Kullanici adini ve sifresini asagiya girin ve oturum ac ( sign in ) butonuna tiklayin.
        // email textbox, password textbox and sigin button elementlerini locate ediniz.
        // username: testtechproed@gmail.com
        // password: Test1234!
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");

        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("Test1234!");

        WebElement signinButton = driver.findElement(By.name("commit"));
        signinButton.click();

        // Expected user id nin testtechproed@gmail.com oldugunu dogrulayin ( verify )

        WebElement userID = driver.findElement(By.className("navbar-text"));
        //System.out.println("USER ID -- > "+userID.getText());

        String actualUserID = userID.getText();
        String expectedUserID = "testtechproed@gmail.com";

        if(actualUserID.equals(expectedUserID)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL USER ID: "+ actualUserID);
            System.out.println("EXPECTED USER ID: "+expectedUserID);
        }
        // Addresses ve Sign Out textlerinin görüntülendigini (displayed) dogrulayin(verify)
        WebElement addressLinkText = driver.findElement(By.linkText("Addresses"));
        String actualAddressLinkText = addressLinkText.getText();
        String expectedAddressLinkText = "Addresses";
        if(actualAddressLinkText.equals(expectedAddressLinkText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL ADDRESS LINK TEXT: " +actualAddressLinkText);
        }

        WebElement signOutLinkText = driver.findElement(By.linkText("Sign out"));
        String actualSignOutLinkText = signOutLinkText.getText();
        String expectedSignOutLinkText = "Sign Out";

        if(actualSignOutLinkText.equals(expectedSignOutLinkText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL SIGN OUT LINK TEXT: "+actualSignOutLinkText );
        }

    }
}
