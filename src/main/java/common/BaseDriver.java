package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {

    protected static WebDriver driver;

    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        try {
            driver = new ChromeDriver();
        } catch (WebDriverException wde) {
            System.out.println(wde.getMessage());
        }
    }
    public void exitDriver(){
        if (driver != null){
            driver.close();
            driver.quit();
        }
    }


}
