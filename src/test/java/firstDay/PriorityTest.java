package firstDay;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test (priority = 1)
    public void setUp(){
        System.out.println("Opening Browser");
    }

    @Test(priority = 5)
    public void tearDown(){
        System.out.println("Closing Browser");
    }

    @Test (priority = 4)
    public void loginPositiveTest(){
        System.out.println("login Correct Email And Correct Password");
    }

    @Test (priority = 2)
    public void loginNegativeTestPassword(){
        System.out.println("login Correct Email And Incorrect Password");
    }

    @Test(priority = 3)
    public void loginNegativeTestEmail() {
        System.out.println("login Incorrect Email And Correct Password");
    }
}
