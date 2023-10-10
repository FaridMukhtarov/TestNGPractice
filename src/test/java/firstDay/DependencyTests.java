package firstDay;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTests {

    @Test(priority = 1)
    public void starCar(){
        System.out.println("Car started");
    }

    @Test(dependsOnMethods = "starCar", priority = 2)
    public void driver(){
        System.out.println("Car driving");
    }

    @Test(dependsOnMethods = {"starCar", "driver"})
    public void stopCar(){
        System.out.println("Car stopped");
    }

    @Test(dependsOnMethods = {"starCar","driver","stopCar",}, alwaysRun = true)
    public void park(){
        System.out.println("Car parked");
    }

    // Eger her hansisa method fail olarsa  alwaysRun = true
    // olaraq qeyd edilen method hemise execut olunacaq
}
