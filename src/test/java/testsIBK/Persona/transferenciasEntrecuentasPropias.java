package testsIBK.Persona;

import common.BaseDriver;
import common.loginPersonaIBK;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class transferenciasEntrecuentasPropias extends BaseDriver {

    loginPersonaIBK loginPersonaIBK=  new loginPersonaIBK(driver);
    public static WebDriver driver;

    private By clickMenuOperaciones = By.xpath("//form[@id='j_idt72']//div[@class='menu-groups']//a[contains(text(),'OPERACIONES')]");
    private By seleccionSubMenuTransferencias = By.xpath("//form[@id='j_idt72']//div[@id='menuWebIbk']//a[contains(text(),'Transferencias')]");
    private By clicOpcionEntreCuentasPropias = By.xpath("//form[@id='j_idt72']//div[@id='menuWebIbk']//a[contains(text(),'Transferencias')]//following-sibling::ul//a[contains(text(),'Entre cuentas propias')]");

    private By cuentaOrigen = By.xpath("//form[@id='j_idt155']//div[@id='operacion']//select[@name='cuenta-origen']");
    private By cuentaDestino = By.xpath("//form[@id='j_idt155']//div[@id='operacion']//div[@id='ctn-creditos']//select[@name='cuenta-destino']");
    private By montoATransferir = By.id("monto");
    private By botonSiguientePaso1 = By.name("j_idt187");
    private By botonContinuarPaso2 = By.xpath("//form[@id='autorizacionTransferenciaForm']//a[contains(text(),'CONFIRMAR')]");
    private By clavede6 = By.xpath("//form[@id='autorizacionTransferenciaForm']//div[@class='teclado']//div[@id='Map']//a[@id='key-7']");

    private By cuentaOrigenPaso2 =By.xpath("//*[@id='ctn-creditos']/div[1]/p[2]");
    private By cuentaDestinoPaso2 = By.xpath("//*[@id='ctn-creditos']/div[4]/p[2]");
    private By montoATransferirPaso2= By.xpath("//*[@id='ctn-creditos']/div[2]/span");
    private By montoEquivalentePaso2= By.xpath("//*[@id='ctn-creditos']/div[3]/span");
    private By tipoDeCambioPaso2 = By.xpath("//*[@id='ctn-creditos']/div[6]/span");

    private By tipo = By.xpath("//*[@id='ctn-creditos']/div/div[1]/p[2]");
    private By numeroDeReferencia = By.xpath("//*[@id='ctn-creditos']/div/div[2]/p[2]");
    private By numeroDeOperacion = By.xpath("//*[@id='ctn-creditos']/div/div[3]/p[2]");
    private By fechaDePresentacion = By.xpath("//*[@id='ctn-creditos']/div/div[4]/p[2]");
    private By cuentaOrigenPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[5]/p[2]");
    private By montoATransferirPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[6]/p[2]");
    private By cuentaDestinoPaso3 = By.xpath("//*[@id='ctn-creditos']/div/div[7]/p[2]");
    private By montoEquivalentePaso3= By.xpath("//*[@id='ctn-creditos']/div/div[8]/p[2]");
    private By tipoDeCambioPaso3 = By.xpath("//*[@id='ctn-creditos']/div/div[9]/p[2]");

    @Test
    public void transferenciasEntrecuentasPropias() { //throws Exception
        loginPersonaIBK.loginPersonaIBK();

        WebElement selecionarMenuOperaciones = loginPersonaIBK.driver.findElement(clickMenuOperaciones);
        selecionarMenuOperaciones.click();

        Actions action = new Actions(loginPersonaIBK.driver);
        WebElement seleccionarSubMenuTransferencias = loginPersonaIBK.driver.findElement(seleccionSubMenuTransferencias);
        action.moveToElement(seleccionarSubMenuTransferencias).build().perform();

        WebDriverWait wait = new WebDriverWait(loginPersonaIBK.driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(clicOpcionEntreCuentasPropias));

        Actions action2 = new Actions(loginPersonaIBK.driver);
        WebElement ingresarAtransferenciasEntreCuentasPropias = loginPersonaIBK.driver.findElement(clicOpcionEntreCuentasPropias);
        action2.moveToElement(ingresarAtransferenciasEntreCuentasPropias).perform();
        ingresarAtransferenciasEntreCuentasPropias.click();

        loginPersonaIBK.driver.navigate().to("http://10.0.202.9:8080/internetbanking/ibk/operacion-transferencia-nuevo-pago-1#no-back-button");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //PASO 1
        //seleccionar cuenta origen
        //WebElement seleccionar_CuentaOrigen = loginPersonaIBK.driver.findElement(cuentaOrigen);
        Select seleccionarCuentaOrigen = new Select(loginPersonaIBK.driver.findElement(cuentaOrigen));
        seleccionarCuentaOrigen.selectByValue("430-01-0436982");

        //ingresar monto a transferir
        WebElement monto = loginPersonaIBK.driver.findElement(montoATransferir);
        monto.sendKeys("10");

        //seleccionar cuenta destino
        Select seleccionarCuentaDestino = new Select(loginPersonaIBK.driver.findElement(cuentaDestino));
        seleccionarCuentaDestino.selectByValue("210-02-9556371");

        //Clic boton Siguiente
        WebElement clicBotonSiguientePaso1= loginPersonaIBK.driver.findElement(botonSiguientePaso1);
        clicBotonSiguientePaso1.click();

        //loginPersonaIBK.driver.navigate().refresh();

        //PASO 2
        //validacion de campos en la seccion confirmar transferencia / clave
        //cuenta origen

        String confirmarCuentaOrigen= loginPersonaIBK.driver.findElement(cuentaOrigenPaso2).getText();
        String cuentaOrigenESperada= "Cuenta 430-01-0436982";
        assertEquals(cuentaOrigenESperada, confirmarCuentaOrigen);
        System.out.println("Cuenta origen ok en paso 2");

        //Cuenta destino
        String confirmarCuentaDestino= loginPersonaIBK.driver.findElement(cuentaDestinoPaso2).getText();
        String cuentaDestinoEsperada = "Cuenta 210-02-9556371";
        assertEquals(cuentaDestinoEsperada, confirmarCuentaDestino);
        System.out.println("Cuenta destino ok en paso 2");

        //Monto a transferir
        String confirmarMontoAtransferir= loginPersonaIBK.driver.findElement(montoATransferirPaso2).getText();
        String montoAtransferirEsperado = "S/ 10.00";
        assertEquals(montoAtransferirEsperado, confirmarMontoAtransferir);
        System.out.println("Monto a transferir ok en paso 2");

        //Monto equivalente
        String confirmarMontoEquivalente= loginPersonaIBK.driver.findElement(montoEquivalentePaso2).getText();
        assertNotNull(confirmarMontoEquivalente);
        System.out.println("Monto equivalente no es vacio en paso 2");

        //Tipo de cambio
        String confirmarTipoDeCambio= loginPersonaIBK.driver.findElement(tipoDeCambioPaso2).getText();
        assertNotNull(confirmarTipoDeCambio);
        System.out.println("Tipo de cambio no es vacio en paso 2");


        //Ingreso de clave de 6
        loginPersonaIBK.driver.findElement(clavede6).click();
        loginPersonaIBK.driver.findElement(clavede6).click();
        loginPersonaIBK.driver.findElement(clavede6).click();
        loginPersonaIBK.driver.findElement(clavede6).click();
        loginPersonaIBK.driver.findElement(clavede6).click();
        loginPersonaIBK.driver.findElement(clavede6).click();


        //clic en el boton paso 2
        WebElement clicBotonConfirmarPaso1= loginPersonaIBK.driver.findElement(botonContinuarPaso2);
        clicBotonConfirmarPaso1.click();


        //PASO 3
        //tipo
        String tipoPaso3= loginPersonaIBK.driver.findElement(tipo).getText();
        String tipoESperada= "TRANSF. DE CTA. CTS A CTA.";
        assertEquals(tipoESperada, tipoPaso3);
        System.out.println("Descripcion de tipo ok en el paso 3");

        //Número de referencia
        String numeroDereferenciapaso3= loginPersonaIBK.driver.findElement(numeroDeReferencia).getText();
        assertNotNull(numeroDereferenciapaso3);
        System.out.println("El número de refrencia no es vacio en paso 3");

        //Número de operación
        String numeroDeroperacionpaso3= loginPersonaIBK.driver.findElement(numeroDeOperacion).getText();
        assertNotNull(numeroDeroperacionpaso3);
        System.out.println("El número de operación no es vacio en paso 3");

        //Fecha de presentación
        String fechadepresentacionpaso3= common.loginPersonaIBK.driver.findElement(fechaDePresentacion).getText();
        assertNotNull(fechadepresentacionpaso3);
        System.out.println("La fecha de presentacion no es vacio en el paso 3");

        //Cuenta Origen
        String CuentaOrigenPaso3= loginPersonaIBK.driver.findElement(cuentaOrigenPaso3).getText();
        assertEquals(confirmarCuentaOrigen, CuentaOrigenPaso3);
        System.out.println("Cuenta origen ok en paso 3");

        //Monto a Transferir
        String montoAtransferirpaso3= loginPersonaIBK.driver.findElement(montoATransferirPaso3).getText();
        assertEquals(confirmarMontoAtransferir, montoAtransferirpaso3);
        System.out.println("Monto a transferir ok en paso 3");

        //Cuenta destino
        String CuentaDestinoPaso3= loginPersonaIBK.driver.findElement(cuentaDestinoPaso3).getText();
        assertEquals(confirmarCuentaDestino, CuentaDestinoPaso3);
        System.out.println("Cuenta destino ok en paso 3");

        //Monto Equivalente
        String montoEquivalentepaso3= loginPersonaIBK.driver.findElement(montoATransferirPaso3).getText();
        assertEquals(confirmarCuentaDestino, CuentaDestinoPaso3);
        System.out.println("Monto Equivalente ok en paso 3");

        //Tipo de cambio
        String tipodecambioPaso3= loginPersonaIBK.driver.findElement(tipoDeCambioPaso3).getText();
        assertEquals(confirmarTipoDeCambio, tipodecambioPaso3);
        System.out.println("Tipo de camio ok en paso 3");









    }
}
