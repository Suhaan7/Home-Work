package browsertest_1_nopcommerce;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest_1 {

    static WebDriver driver;

    static String url = "https://demo.nopcommerce.com/"; // Stored url in String datatype
    static String expectedTitle = "nopCommerce demo store"; // Expected title

    public static void main(String[] args) {

        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();//Maximsing screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));//Giving wait to avoid Exception
        String actualTitle = driver.getTitle(); //Getting title of the page
        System.out.println("The title of the page is: " + actualTitle);//Printing title of the page
        Assert.assertTrue(expectedTitle.equals(actualTitle));//Comparing titles (Expected with Actual)
        driver.quit();//Close driver
    }
}
