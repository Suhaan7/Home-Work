package browsertest_1_nopcommerce;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiBrowserTest_1 {

    static String browser = "Edge";

    static WebDriver driver;
    static String url = "https://demo.nopcommerce.com";
    static String expectedTitle = "nopCommerce demo store";//Expected Title

    public static void main(String[] args) {
if(browser.equalsIgnoreCase("chrome")){
    ChromeOptions options = new ChromeOptions();//Setting web-driver
    driver = new ChromeDriver(options);
} else if (browser.equalsIgnoreCase("firefox")) {
    FirefoxOptions options = new FirefoxOptions();
    driver = new FirefoxDriver(options);
} else if (browser.equalsIgnoreCase("edge")) {
    EdgeOptions options = new EdgeOptions();
driver = new EdgeDriver(options);
}else{
    System.out.println("Invalid browser");
}

        driver.get(url); // Launch url
driver.manage().window().maximize();//Mzximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
String actualTitle =driver.getTitle();//Getting title of the page
        System.out.println("Title of the page is: " + actualTitle);//Printing title of the page
        Assert.assertTrue(expectedTitle.equals(actualTitle));//Comparing titles (Expected with actual)
        driver.quit();//Closing driver
    }

}
