package browsertest_2_orangehrm;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
public class ChromeTest_2 {
    static WebDriver driver;
    static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    static String expectedtitle = "OrangeHRM";
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
String actualTitle = driver.getTitle();
System.out.println("Title of the page is : " + actualTitle);
        Assert.assertTrue(expectedtitle.equals(actualTitle));
        driver.quit();

}
}



