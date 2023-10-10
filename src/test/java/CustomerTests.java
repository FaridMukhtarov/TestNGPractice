import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomerTests {

    @BeforeTest
    public void setUp(){
        System.out.println("Opening Browser");
    }

    @Test
    public void searchCustomer(){
        System.out.println("This is search customer test");
    }

    @Test
    public void addCustomer(){
        System.out.println("This is add customer test");
    }

    @AfterTest
    public void tearDown(){
        System.out.println("Closing Browser");
    }
}
