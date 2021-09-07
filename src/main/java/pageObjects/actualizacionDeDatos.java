package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Utilities;

import static org.junit.Assert.*;

public class actualizacionDeDatos {
    public WebDriver driver;
    Utilities utilities = new Utilities();

    public actualizacionDeDatos(WebDriver driver){this.driver= driver; }

    private final By tituloFormulario= By.xpath("//*[@id='operacion']/div/div[1]/div/h5");
    private final By seccionMenu = By.xpath("//*[@id='operacion']/div/div[1]/div/ol/li[1]");
    private final By seccionSubmenu = By.xpath("//*[@id='operacion']/div/div[1]/div/ol/li[2]");
    private final By botonNext = By.xpath("//*[@id='botonNext']");
    private final By tituloPaso= By.xpath("//*[@id='subTitulo']");

    private final By botonEditarCorreoPaso1 = By.xpath("//*[@id='j_idt166']");
    private final By txtCorreoPaso1 = By.xpath("//*[@id='txtCorreo']");
    private final By botonGuardarCorreoPaso1 = By.xpath("//*[@id='j_idt175']");
    private final By botonEditarTelefonoPaso1 = By.xpath("//*[@id='j_idt188:0:panFijoEditar']/div[1]/div/div[2]/a[1]");
    private final By tipoTelefonoPaso1 = By.xpath("//*[@id='j_idt188:0:panFijoEditar']/div[2]/div[1]/div/button");
    private final By txtCod = By.xpath("//*[@id='j_idt188:0:panFijoEditar']/div[2]/div[2]/input");
    private final By txtFijo = By.xpath("//*[@id='j_idt188:0:panFijoEditar']/div[2]/div[3]/input");
    private final By comboOperador = By.xpath("//*[@id='j_idt188:0:panMovilEditar']/div[2]/div[2]/div/button/span[1]");
    private final By txtmovil = By.xpath("//*[@id='j_idt188:0:panMovilEditar']/div[2]/div[3]/input");
    private final By botonGuardarTelefonoPaso1 = By.xpath("//*[@id='j_idt188:0:j_idt237']");
    //private final By checkProteccionDatosPersonalesPaso1 = By.xpath("//*[@id='actualizacionDatosForm']/div[1]/div[2]/div[3]/div/div/div[1]");
    private final By respuestaActualPaso1 = By.xpath("//*[@id='texto-autorizacionDatos']/div[1]/span");
    private final By botonEditarRespuestaPaso1 = By.xpath("//*[@id='j_idt364']/i/i");
    private final By comboRespuestaPaso1 = By.id("autorizacionUsoDatos");
    private final By botonGuardarRespuestaPaso1 = By.xpath("//*[@id='j_idt374']");

    public void paso1(String correo, String Tipotelefono, String cod, String fijo, String movil, String operador, String recibirOfertas){

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(tituloFormulario));

        String validartituloFormularioPaso1= driver.findElement(tituloFormulario).getText();
        assertEquals("Actualización de datos", validartituloFormularioPaso1);
        System.out.println("Titulo Formulario ok");

        String validarSeccionmenu= driver.findElement(seccionMenu).getText();
        assertEquals("ADMINISTRACIÓN", validarSeccionmenu);
        System.out.println("Sección menu ok");

        String validarSeccionSubMenu= driver.findElement(seccionSubmenu).getText();
        assertEquals("ACTUALIZACIÓN DE DATOS", validarSeccionSubMenu);
        System.out.println("Sección submenu ok");

        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="DATOS DE CONTACTO\n" +
                "(PASO 1 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 1 ok");

        WebElement correoElectronico= driver.findElement(botonEditarCorreoPaso1);
        correoElectronico.click();

        WebDriverWait waitbotonGuardar = new WebDriverWait(driver,6000);
        waitbotonGuardar.until(ExpectedConditions.elementToBeClickable(botonGuardarCorreoPaso1));

        WebElement pasarCorreo = driver.findElement(txtCorreoPaso1);
        pasarCorreo.clear();
        pasarCorreo.sendKeys(correo);

        WebElement guardarCorreo = driver.findElement(botonGuardarCorreoPaso1);
        guardarCorreo.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement telefonoActual= driver.findElement(botonEditarTelefonoPaso1);
        telefonoActual.click();

        WebDriverWait waitbotonGuardarTelefono = new WebDriverWait(driver,6000);
        waitbotonGuardarTelefono.until(ExpectedConditions.elementToBeClickable(botonEditarTelefonoPaso1));

        if (Tipotelefono.contains("Fijo")){
            WebDriverWait waitTipo = new WebDriverWait(driver,6000);
            waitTipo.until(ExpectedConditions.elementToBeClickable(tipoTelefonoPaso1));

            WebElement tipo = driver.findElement(tipoTelefonoPaso1);
            tipo.click();

            By tipo_tel = By.xpath("//*[@id='j_idt188:0:panFijoEditar']/div[2]/div[1]/div/div/ul/li/a[1]/span[contains(text(),'"+Tipotelefono+"')]");

            WebElement tipoTelef = driver.findElement(tipo_tel);
            tipoTelef.click();

            //Select tipo = new Select(driver.findElement(tipoTelefonoPaso1));
            //tipo.selectByValue(Tipotelefono);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement codigoFijo= driver.findElement(txtCod);
            codigoFijo.clear();
            codigoFijo.sendKeys(cod);

            WebElement tel_fijo= driver.findElement(txtFijo);
            tel_fijo.clear();
            tel_fijo.sendKeys(fijo);

            WebElement guardartelefono = driver.findElement(botonGuardarTelefonoPaso1);
            guardartelefono.click();
        } else { //movil
            WebDriverWait wait_tipo = new WebDriverWait(driver,6000);
            wait_tipo.until(ExpectedConditions.elementToBeClickable(tipoTelefonoPaso1));

            WebElement tipo = driver.findElement(tipoTelefonoPaso1);
            tipo.click();

            By tipo_tel = By.xpath("//*[@id='j_idt188:0:panFijoEditar']/div[2]/div[1]/div/div/ul/li/a[1]/span[contains(text(),'"+Tipotelefono+"')]");

            WebElement tipoTelef = driver.findElement(tipo_tel);
            tipoTelef.click();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement operador_movil = driver.findElement(comboOperador);
            operador_movil.click();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            By operador_paso1 = By.xpath("//*[@id='j_idt188:0:panMovilEditar']/div[2]/div[2]/div/div/ul/li/a/span[contains(text(),'"+operador+"')]");

            WebElement seleccionarOperador = driver.findElement(operador_paso1);
            seleccionarOperador.click();

            WebElement telefMovil = driver.findElement(txtmovil);
            telefMovil.sendKeys(movil);
        }

        Actions moverABotonSiguiente = new Actions(driver);
        WebElement botonSiguiente = driver.findElement(botonNext);
        moverABotonSiguiente.moveToElement(botonSiguiente).build().perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement check = driver.findElement(By.xpath("//*[@id='actualizacionDatosForm']/div[1]/div[2]/div[3]/div/div/div[1]"));
        check.getAttribute("aria-checked");
        check.sendKeys("true");

        //utilities.checkBox();

        String rptaActual = driver.findElement(respuestaActualPaso1).getText();

        if ((recibirOfertas.contains("S") && rptaActual.contains("SI")) || (recibirOfertas.contains("N") && rptaActual.contains("NO"))){

            botonSiguiente.click();

        }else{
            WebElement editarRpta = driver.findElement(botonEditarRespuestaPaso1);
            editarRpta.click();

            WebDriverWait waitbotonGuardarRpta = new WebDriverWait(driver,6000);
            waitbotonGuardarRpta.until(ExpectedConditions.elementToBeClickable(botonGuardarRespuestaPaso1));

            Select rpta = new Select(driver.findElement(comboRespuestaPaso1));
            rpta.selectByValue(recibirOfertas);

            WebElement guardarRpta = driver.findElement(botonGuardarRespuestaPaso1);
            guardarRpta.click();

        }

        botonSiguiente.click();


    }



}
