package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class transferencias {

    public static WebDriver driver;
    loginPersonaIBK LoginPersonaIBK = new loginPersonaIBK();

    //Variables Transferencias a terceros
    private By menuOperaciones = By.xpath("//form[@id='j_idt72']//div[@class='menu-groups']//a[contains(text(),'OPERACIONES')]");
    private By subMenuTransferencias = By.xpath("//form[@id='j_idt72']//div[@id='menuWebIbk']//a[contains(text(),'Transferencias')]");
    private By Aterceros = By.xpath("//form[@id='j_idt72']//div[@id='menuWebIbk']//a[contains(text(),'Transferencias')]//following-sibling::ul//a[contains(text(),'A terceros')]");

/*
    public void ingresarAMenuTransferenciasATerceros(){
        Actions action = new Actions(loginPersonaIBK.driver);
        WebElement seleccionarSubMenuPlazofijo = loginPersonaIBK.driver.findElement(seleccionSubMenuPlazoFijo);
        action.moveToElement(seleccionarSubMenuPlazofijo).build().perform();

        WebDriverWait wait = new WebDriverWait(loginPersonaIBK.driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(conAbonoCuentaPropia));

        Actions action2 = new Actions(loginPersonaIBK.driver);
        WebElement ingresarAcancelacionAbonoACuentaPropia = loginPersonaIBK.driver.findElement(conAbonoCuentaPropia);
        action2.moveToElement(ingresarAcancelacionAbonoACuentaPropia).perform();
        ingresarAcancelacionAbonoACuentaPropia.click();

    }


//cuenta para test transferencias a terceros 210-01-0600946
*/

}
