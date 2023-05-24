package browsertest_1_nopcommerce;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest_1 {

    static WebDriver driver;

static String url ="https://demo.nopcommerce.com/"; // Stored url into String data-type
static String expectedTitle ="nopCommerce demo store";// Expected Title

    public static void main(String[] args) {
ChromeOptions options = new ChromeOptions();
driver = new ChromeDriver (options);
driver.get(url);
driver.manage().window().maximize();// Maximising screen
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000)); // Giving wait to avoid Exception
String actualTitle = driver.getTitle(); //Getting title of the page;
        System.out.println("Title of the page is : " + actualTitle); //Printing Title of the page;
        Assert.assertTrue(expectedTitle.equals(actualTitle)); // Comparing Titles (Expected with Actual)
        driver.quit(); //Closing driver.
    }
}
