package thirdDay;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Parameterization {
    WebDriver driver;


    @BeforeTest
    @Parameters({"browser", "url"})
    void setUp(String browser, String app){
        if (browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        } else if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(app);
    }

    @Test
    void logoVisibly(){
        WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']"));
        Assert.assertTrue(logo.isDisplayed());
    }

    @Test
    void titleMatched(){
        String pageTitleActual = driver.getTitle();
        Assert.assertEquals(pageTitleActual, "OrangeHRM", "Page Title is not matched");
    }

    @AfterTest
    void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
