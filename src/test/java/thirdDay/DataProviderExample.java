package thirdDay;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "loginDataProvider")
    public Object [][] getData(){
        Object [][] data = new Object[3][2];

        data[0][0] = "Ferid";
        data[0][1] = "ferid12345";

        data[1][0] = "Fuad";
        data[1][1] = "fuad12345";

        data[2][0] = "Feraim";
        data[2][1] = "feraim12345";
        return data;
    }
    @Test(dataProvider = "loginDataProvider")
    public void test(String name, String password){
        System.out.println(name + "\n" + password);
    }
}
