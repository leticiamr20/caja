package Runner;

import common.BaseDriver;

import common.loginPersonaIBK;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import util.Utilities;

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



