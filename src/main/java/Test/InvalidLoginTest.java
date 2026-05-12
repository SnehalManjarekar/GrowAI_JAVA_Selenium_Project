package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InvalidLoginTest extends LoginSetup {

    public void InvalidLogin() {

        // Enter username
        driver.findElement(By.id("username"))
                .sendKeys("wrongusername");

        // Enter password
        driver.findElement(By.id("password"))
                .sendKeys("wrongpassword");

        // Click login button
        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();

        // Get error message
        String message = driver.findElement(By.id("flash"))
                .getText()
                .replace("×", "")
                .trim();

        // Assertion
        Assert.assertEquals(
                message,
                "Your username is invalid!",
                "Invalid Login Test Failed"
        );

        System.out.println(message);
        System.out.println("Invalid Login Test Passed");

        // Close browser
        driver.quit();
    }
}