package util;

import common.BaseDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.io.File;
import java.io.IOException;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class Utilities extends BaseDriver {


    public void esVisibleElemento(WebElement elemento){
        WebDriverWait wait = new WebDriverWait (driver,20);
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }


    public void ingresarclavede6(){
        Screen screen = new Screen();
        Pattern pattern;
        pattern= new Pattern("C:\\Users\\leticia.moreno\\Desktop\\CAJA\\caja\\src\\main\\resources\\imagenes\\tecla1Clave6.PNG");
        try {
            screen.click(pattern);
            screen.click(pattern);
            screen.click(pattern);
            screen.click(pattern);
            screen.click(pattern);
            screen.click(pattern);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

    }







}
