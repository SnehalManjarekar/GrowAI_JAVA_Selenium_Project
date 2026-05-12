package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginSetup {

    public WebDriver driver;


    public void setupSuite() {
        System.out.println("Suite Started");
    }

    public void setupBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Browser launched");
    }


    public void NavigateToApp() {
        driver.get("https://the-internet.herokuapp.com/login");
        System.out.println("Navigate to The Internet Page");
    }
}