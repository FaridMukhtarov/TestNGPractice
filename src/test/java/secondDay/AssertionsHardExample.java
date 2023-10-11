package secondDay;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AssertionsHardExample {
    WebDriver driver;


    @BeforeTest
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com");
    }

    @Test
    void logoVisibly(){
        WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']"));
        Assert.assertTrue(logo.isDisplayed());
    }

    @Test
    void titleEqual(){
        String pageTitleActual = driver.getTitle();
        Assert.assertEquals(pageTitleActual, "OrangeHRM", "Page Title is not equal");
    }

    @AfterTest
    void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
