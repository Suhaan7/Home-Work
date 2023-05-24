package browsertest_10_diyaonline;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest_10 {
    static WebDriver driver;
    static String url = "https://www.diyaonline.com/";
    static String expectedTitle = "Indian Clothing Online - Buy Sarees, Salwar Kameez, Anarkali Suits, Designer Lehengas, Kurtis, Pakistani Clothes | Men, Women & Kids Ethnic Wear in UK - Diya Online";
    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is: " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }

}
