package secondDay;

import org.testng.annotations.Test;

public class GroupingTests {

    @Test(groups = {"Smoke"})
    void test1(){
        System.out.println("This is test 1 (Smoke)");
    }
    @Test(groups = {"Smoke"})
    void test2(){
        System.out.println("This is test 2 (Smoke)");
    }
    @Test(groups = {"Sanity"})
    void test3(){
        System.out.println("This is test 3 (Sanity)");
    }
    @Test(groups = {"Regression"})
    void test4(){
        System.out.println("This is test 4 (Regression)");
    }
    @Test(groups = {"Regression"})
    void test5(){
        System.out.println("This is test 5 (Regression)");
    }
    @Test(groups = {"Smoke, Regression"})
    void test6(){
        System.out.println("This is test 6 (Smoke, Regression)");
    }
    @Test(groups = {"Smoke, Regression, Sanity"})
    void test7(){
        System.out.println("This is test 7 (Smoke, Regression, Sanity)");
    }
    @Test(groups = {"Regression, Sanity"})
    void test8(){
        System.out.println("This is test 8 (Regression, Sanity)");
    }

}
