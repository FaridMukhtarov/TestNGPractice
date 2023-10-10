package firstDay;

import org.testng.annotations.*;

public class AnnotationPractice {

    @Test
    public void loginTest() {
        System.out.println("This is Login test");
    }

    @Test
    public void logoutTest() {
        System.out.println("This is Logout Test");
    }

    @AfterMethod
    public void afterTestMethod() {
        System.out.println("This will execute after every Method");
    }

    @BeforeMethod
    public void beforeTestMethod() {
        System.out.println("This will execute before every Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will execute before the Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will execute after the Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will execute after the Test");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("This will execute before the Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will execute before the Suite");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("This will execute after the Suite");
    }
}
