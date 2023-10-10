package firstDay;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    @BeforeTest
    public void setUp(){
        System.out.println("Opening Browser");
    }

    @Test
    public void login(){
        System.out.println("This is Login test");
    }

    @AfterTest
    public void tearDown(){
        System.out.println("Closing Browser");
    }
}
