package browsertest_3_herokuapp;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiBrowserTest_3 {

    static String browser = "Chrome";

    static WebDriver driver;
    static String url = "http://the-internet.herokuapp.com/login";

    static String expectedTitle = "The Internet";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);
        } else if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        } else {
            System.out.println("Invalid Browser");
    }
      driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is: " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
