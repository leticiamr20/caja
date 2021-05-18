package util;

import common.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities extends BaseDriver {

    public void esVisibleElemento(WebElement elemento){
        WebDriverWait wait = new WebDriverWait (driver,20);
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }

}
