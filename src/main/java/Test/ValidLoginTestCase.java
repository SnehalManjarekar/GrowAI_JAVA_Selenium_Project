package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidLoginTestCase extends LoginSetup {

    public void ValidLogin() {
//      Enter valid username
        driver.findElement(By.id("username"))
                .sendKeys("tomsmith");

//      Enter valid Password
        driver.findElement(By.id("password"))
                .sendKeys("SuperSecretPassword!");

//      Click on login button
        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();

//      Assertion
        String message = driver.findElement(By.id("flash"))
                .getText()
                .replace("×", "")
                .trim();

        // Proper assertion
        Assert.assertTrue(
                message.contains("You logged into a secure area!"),
                "User is not logged into Secure Area"
        );

        // Optional: verify redirect
        Assert.assertTrue(
                driver.getCurrentUrl().contains("secure"),
                "Not redirected to Secure Area page"
        );
        System.out.println("Valid Login Test Passed");

        // Close browser
        driver.quit();
    }

}