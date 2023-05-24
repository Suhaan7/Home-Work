package browsertest_7_ishalife;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiBrowserTest_7 {
    static String brower = "FireFox";
    static WebDriver driver;
    static String url = "https://www.ishalife.co.uk/collections/sadhana-clothing";
    static String expectedTitle = "Sadhana Clothing – Isha Life UK & Europe";


    public static void main(String[] args) {
        if (brower.equalsIgnoreCase("edge")){
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);
        } else if (brower.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver();
        } else if (brower.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        }else {
            System.out.println("Invalid Browser");
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is: " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}

