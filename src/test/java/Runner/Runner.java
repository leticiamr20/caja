package Runner;

import common.BaseDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class Runner {
    static BaseDriver baseDriver = new BaseDriver();

    @BeforeClass
    public static void driverInstanceCreation() {
        baseDriver.initDriver();
    }

    @AfterClass
    public static void deleteDriverInstance(){
        baseDriver.exitDriver();
    }
}
