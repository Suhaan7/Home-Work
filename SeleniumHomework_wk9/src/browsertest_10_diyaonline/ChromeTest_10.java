package browsertest_10_diyaonline;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest_10 {

    static WebDriver driver;

    static String url = "https://www.diyaonline.com/";
    static String expectedTitle = "Indian Clothing Online - Buy Sarees, Salwar Kameez, Anarkali Suits, Designer Lehengas, Kurtis, Pakistani Clothes | Men, Women & Kids Ethnic Wear in UK - Diya Online";

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is: " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }

}
