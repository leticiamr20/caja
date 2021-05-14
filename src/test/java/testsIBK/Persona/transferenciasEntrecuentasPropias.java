package testsIBK.Persona;

import common.loginPersonaIBK;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class transferenciasEntrecuentasPropias extends loginPersonaIBK{
    public static WebDriver driver;
    private By clickMenuOperaciones = By.xpath("//form[@id='j_idt72']//div[@class='menu-groups']//a[contains(text(),'OPERACIONES')]");
    private By seleccionSubMenuTransferencias = By.xpath("//form[@id='j_idt72']//div[@id='menuWebIbk']//a[contains(text(),'Transferencias')]");
    private By clicOpcionEntreCuentasPropias = By.xpath("//form[@id='j_idt72']//div[@id='menuWebIbk']//a[contains(text(),'Transferencias')]//following-sibling::ul//a[contains(text(),'Entre cuentas propias')]");

    private By cuentaOrigen = By.xpath("//form[@id='j_idt155']//div[@id='operacion']//select[@name='cuenta-origen']");  //("//*[@id='cuenta-origen']");
    //private By cuentaSoles = By.xpath("//*[@id='cuenta-origen']/option[2]");
    private By cuentaDestino = By.xpath("//*[@id='cuenta-destino']");
    private By montoATransferir = By.id("monto");


    @Test
    public void transferenciasEntrecuentasPropias() throws Exception{

        WebElement selecionarMenuOperaciones = loginPersonaIBK.driver.findElement(clickMenuOperaciones);
        selecionarMenuOperaciones.click();

        Actions action = new Actions(loginPersonaIBK.driver);
        WebElement seleccionarSubMenuTransferencias = loginPersonaIBK.driver.findElement(seleccionSubMenuTransferencias);
        action.moveToElement(seleccionarSubMenuTransferencias).build().perform();

        WebDriverWait wait = new WebDriverWait(loginPersonaIBK.driver,600);
        wait.until(ExpectedConditions.elementToBeClickable(clicOpcionEntreCuentasPropias));

        Actions action2 = new Actions(loginPersonaIBK.driver);
        WebElement ingresarAtransferenciasEntreCuentasPropias = loginPersonaIBK.driver.findElement(clicOpcionEntreCuentasPropias);
        action2.moveToElement(ingresarAtransferenciasEntreCuentasPropias).perform();
        ingresarAtransferenciasEntreCuentasPropias.click();

        loginPersonaIBK.driver.navigate().to("http://10.0.202.9:8080/internetbanking/ibk/operacion-transferencia-nuevo-pago-1#no-back-button");


        //Paso 1
        //seleccionar cuenta origen
        Select seleccionarCuentaOrigen = new Select(loginPersonaIBK.driver.findElement(cuentaOrigen));
        seleccionarCuentaOrigen.selectByValue("210-01-0021742");

        //ingresar monto a transferir
        WebElement monto = loginPersonaIBK.driver.findElement(montoATransferir);
        monto.sendKeys("10");



        //seleccionar cuenta destino
        //WebElement seleccionarCuentaDestino = loginPersonaIBK.driver.findElement(cuentaDestino);
        //Select seleccionar_CuentaDestino = new Select(seleccionarCuentaDestino);
        //seleccionar_CuentaDestino.selectByValue("2210-02-9556371");

    }
}
