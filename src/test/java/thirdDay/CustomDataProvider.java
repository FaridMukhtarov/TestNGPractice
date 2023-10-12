package thirdDay;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomDataProvider {


    @Test(dataProvider = "loginDataProvider",dataProviderClass = DataProviderExample.class)
    public void test(String name, String password){
        System.out.println(name + "\n" + password);
    }
}
