package firstDay;

import org.testng.annotations.Test;

public class DisablingTests {

    @Test(enabled = false)
    public void editCustomer(){
        System.out.println("This is editing customer");
    }
    @Test
    public void search(){
        System.out.println("This is search test");
    }
    @Test(enabled = false)
    public void pageVisibly(){
        System.out.println("This is page visibly test");
    }
    @Test
    public void pageTitle(){
        System.out.println("This is page title test");
    }
}
