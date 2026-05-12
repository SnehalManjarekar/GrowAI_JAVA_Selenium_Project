package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginBlankFieldTest extends LoginSetup {

    public void BlankLogin() {
        // Keep username blank
        driver.findElement(By.id("username"))
                .sendKeys("");

        // Keep password blank
        driver.findElement(By.id("password"))
                .sendKeys("");

        // Click login button
        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();

        // Capture error message from UI
        String errorMessage = driver.findElement(By.id("flash"))
                .getText()
                .replace("×", "")
                .trim();

        // Assert error message
        Assert.assertEquals(
                errorMessage,
                "This field is required"
        );
        // Note :System showing wrong msg for empty filed

        System.out.println("Blank Login Test Passed");

        // Close browser
        driver.quit();
    }
}
