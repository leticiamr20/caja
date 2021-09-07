package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Utilities;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class solicitudCambioModalidadDePagoDeIntereses {

    public WebDriver driver;
    Utilities utilities = new Utilities();
    public solicitudCambioModalidadDePagoDeIntereses (WebDriver driver){
        this.driver= driver;
    }


    private final By tituloFormulario= By.xpath("//*[@id='solicitud']/div/div[1]/div[1]/div/h5");
    private final By seccionMenu = By.xpath("//*[@id='solicitud']/div/div[1]/div[1]/div/ol/li[1]");
    private final By seccionSubmenu = By.xpath("//*[@id='solicitud']/div/div[1]/div[1]/div/ol/li[2]");
    private final By seccionOpcion = By.xpath("//*[@id='solicitud']/div/div[1]/div[1]/div/ol/li[3]");
    private final By botonNext = By.xpath("//*[@id='solicitud']/div/div[3]/a");
    private final By tituloPaso= By.xpath("//*[@id='subTitulo']");

    private final By cuentaDePlazoFijoPaso1 = By.id("cuenta-select");
    private final By nuevaModalidadDePagoDeInteresesPaso1 = By.id("cboModalidadPago");
    private final By modalidadActualDePagoDeInteresesPaso1 = By.xpath("//*[@id='pnlModalidadTipo']/p[2]");
    private final By cuentaDeAbonoInteresesPaso1 = By.id("cboCuentaAhorros");

    String cuentaDePlazoFijo_paso1;
    String nuevaModalidadDePagoDeIntereses_paso1;
    String modalidadActualDePagoDeIntereses_paso1;
    String cuentaDeAbonoIntereses_paso1;

    private final By cuentaDePlazoFijoPaso2 = By.xpath("//*[@id='ctn-creditos']/div[1]/p[2]");
    private final By nuevaModalidadDePagoDeInteresesPaso2 = By.xpath("//*[@id='ctn-creditos']/div[3]/p[2]");
    private final By modalidadActualDePagoDeInteresesPaso2 = By.xpath("//*[@id='ctn-creditos']/div[2]/p[2]");
    private final By cuentaDeAbonoInteresesPaso2 = By.xpath("//*[@id='ctn-creditos']/div[4]/p[2]");
    private final By botonContunuarPaso2 = By.xpath("//*[@id='frmCambioModalidad']/div/div/div[4]/div/div/div[3]/a");

    String nuevaModalidadDePagoDeIntereses_paso2;
    String modalidadActualDePagoDeIntereses_paso2;
    String cuentaDePlazoFijo_paso2;
    String cuentaDeAbonoIntereses_paso2;

    private final By numeroSolicitudPaso3 = By.xpath("//*[@id='ctn-creditos']/div[1]/p[2]");
    private final By cuentaDePlazoFijoPaso3 = By.xpath("//*[@id='ctn-creditos']/div[3]/p[2]");
    private final By nuevaModalidadDePagoDeInteresesPaso3 = By.xpath("//*[@id='ctn-creditos']/div[4]/p[2]");
    private final By modalidadActualDePagoDeInteresesPaso3 = By.xpath("//*[@id='ctn-creditos']/div[2]/p[2]");
    private final By cuentaDeAbonoInteresesPaso3 = By.xpath("//*[@id='ctn-creditos']/div[5]/p[2]");

    String numeroSolicitud_paso3;
    String cuentaDePlazoFijo_paso3;
    String nuevaModalidadDePagoDeIntereses_paso3;
    String modalidadActualDePagoDeIntereses_paso3;
    String cuentaDeAbonoIntereses_paso3;

    private final By enviarConstancia = By.xpath("//*[@id='j_idt160']");
    private final By numeroSolicitudConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[1]/span[2]");
    private final By cuentaDePlazoFijoConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[2]/td[1]/span[2]");
    private final By nuevaModalidadDePagoDeInteresesConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[2]/td[2]/span[2]");
    private final By modalidadActualDePagoDeInteresesConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[2]/span[2]");
    private final By cuentaDeAbonoInteresesConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[3]/td/span[2]");

    public void paso1(String cuentaDPF,String nuevaModalidad, String cuentaAbono){
        cuentaDePlazoFijo_paso1 = cuentaDPF;
        nuevaModalidadDePagoDeIntereses_paso1 = nuevaModalidad;
        cuentaDeAbonoIntereses_paso1 = cuentaAbono;

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(tituloFormulario));

        String validartituloFormularioPaso1= driver.findElement(tituloFormulario).getText();
        String tituloFormularioEsperadoPaso1=("Solicitud de cambio de modalidad de pago de intereses");
        assertEquals(tituloFormularioEsperadoPaso1, validartituloFormularioPaso1);
        System.out.println("Titulo Formulario ok");

        String validarSeccionMenu= driver.findElement(seccionMenu).getText();
        String seccionMenuEsperado=("SOLICITUDES");
        assertEquals(seccionMenuEsperado, validarSeccionMenu);
        System.out.println("Sección solicitudes ok");

        String validarSeccionSubmenu= driver.findElement(seccionSubmenu).getText();
        String seccionSubmenuEsperado=("PLAZOS FIJOS");
        assertEquals(seccionSubmenuEsperado, validarSeccionSubmenu);
        System.out.println("Sección submenu ok");

        String validarSeccionOpcion= driver.findElement(seccionOpcion).getText();
        String seccionOpcionEsperado=("CAMBIAR MODALIDAD DE PAGO DE INTERESES");
        assertEquals(seccionOpcionEsperado, validarSeccionOpcion);
        System.out.println("Sección opción ok");

        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="SELECCIÓN DE MODALIDAD DE PAGO DE INTERESES\n" +
                "(PASO 1 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 1 ok");

        Select plazoFijo = new Select(driver.findElement(cuentaDePlazoFijoPaso1));
        plazoFijo.selectByValue(cuentaDPF);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Select nuevaModalidadDeIntereses = new Select(driver.findElement(nuevaModalidadDePagoDeInteresesPaso1));
        nuevaModalidadDeIntereses.selectByValue(nuevaModalidad);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        modalidadActualDePagoDeIntereses_paso1 = driver.findElement(modalidadActualDePagoDeInteresesPaso1).getText();

        if (nuevaModalidad.contains("2")||nuevaModalidad.contains("5")){

            Select cuentaAbonoIntereses = new Select(driver.findElement(cuentaDeAbonoInteresesPaso1));
            cuentaAbonoIntereses.selectByValue(cuentaAbono);

            WebElement botonSiguientePaso1 = driver.findElement(botonNext);
            botonSiguientePaso1.click();


        } else {
            WebElement botonSiguientePaso1 = driver.findElement(botonNext);
            botonSiguientePaso1.click();
        }



    }
    public void paso2(){
        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="CONFIRMAR CAMBIO DE MODALIDAD DE PAGO DE INTERESES - CLAVE\n" +
                "(PASO 2 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 2 ok");

        cuentaDePlazoFijo_paso2 = driver.findElement(cuentaDePlazoFijoPaso2).getText();
        assertTrue(cuentaDePlazoFijo_paso2.contains(cuentaDePlazoFijo_paso1));

        modalidadActualDePagoDeIntereses_paso2 = driver.findElement(modalidadActualDePagoDeInteresesPaso2).getText();
        assertEquals(modalidadActualDePagoDeIntereses_paso1,modalidadActualDePagoDeIntereses_paso2);

        nuevaModalidadDePagoDeIntereses_paso2 = driver.findElement(nuevaModalidadDePagoDeInteresesPaso2).getText();

        if(nuevaModalidadDePagoDeIntereses_paso1.contains("2")){//Abono en cuenta
            assertEquals("ABONO EN CUENTA",nuevaModalidadDePagoDeIntereses_paso2);
        }else if(nuevaModalidadDePagoDeIntereses_paso1.contains("3")){ //capitalizable al vencimiento
            assertEquals("CAPITALIZABLE AL VENCIMIENTO",nuevaModalidadDePagoDeIntereses_paso2);
        } else if(nuevaModalidadDePagoDeIntereses_paso1.contains("5")){ //Abono en cuenta
            assertEquals("ABONO MENSUAL",nuevaModalidadDePagoDeIntereses_paso2);
        } else { //1 disponible en cuenta
            assertEquals("DISPONIBLE EN CUENTA",nuevaModalidadDePagoDeIntereses_paso2);
        }

        cuentaDeAbonoIntereses_paso2 = driver.findElement(cuentaDeAbonoInteresesPaso2).getText();
        assertTrue(cuentaDeAbonoIntereses_paso2.contains(cuentaDeAbonoIntereses_paso1));

        utilities.ingresarclavede6();

        WebElement botonConfirmar = driver.findElement(botonContunuarPaso2);
        botonConfirmar.click();


    }
    public void paso3(){
        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="IMPRIMIR Y/O ENVIAR CONSTANCIA\n" +
                "(PASO 3 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 3 ok");

        String mensajeExitoso = driver.findElement(By.xpath("//*[@id='solicitud']/div[2]/div/p[1]")).getText();
        assertEquals("La transacción se ha realizado correctamente.",mensajeExitoso);

        numeroSolicitud_paso3 = driver.findElement(numeroSolicitudPaso3).getText();
        assertNotNull(numeroSolicitud_paso3);

        cuentaDePlazoFijo_paso3 = driver.findElement(cuentaDePlazoFijoPaso3).getText();
        assertEquals(cuentaDePlazoFijo_paso2,cuentaDePlazoFijo_paso3);

        nuevaModalidadDePagoDeIntereses_paso3 = driver.findElement(nuevaModalidadDePagoDeInteresesPaso3).getText();
        nuevaModalidadDePagoDeIntereses_paso2.compareToIgnoreCase(nuevaModalidadDePagoDeIntereses_paso3);


        modalidadActualDePagoDeIntereses_paso3 = driver.findElement(modalidadActualDePagoDeInteresesPaso3).getText();
        assertEquals(modalidadActualDePagoDeIntereses_paso2,modalidadActualDePagoDeIntereses_paso3);

        if(nuevaModalidadDePagoDeIntereses_paso1.contains("2") ||nuevaModalidadDePagoDeIntereses_paso1.contains("5")){
            cuentaDeAbonoIntereses_paso3 = driver.findElement(cuentaDeAbonoInteresesPaso3).getText();
            assertEquals(cuentaDeAbonoIntereses_paso2,cuentaDeAbonoIntereses_paso3);
        }

    }

    public void validarDatosDeEnvio(){

        WebElement EnviarConstancia = driver.findElement(enviarConstancia);
        EnviarConstancia.click();

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='enviarDEU01']/div/div/div[1]/h5")));

        String tituloModalEnvioDeConstancia= driver.findElement(By.xpath("//*[@id='enviarDEU01']/div/div/div[1]/h5")).getText();
        assertEquals("ENVÍO DE CONSTANCIA", tituloModalEnvioDeConstancia);

        String SubtituloModalEnvioDeConstancia= driver.findElement(By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[1]/span")).getText();
        assertEquals("Constancia de Solicitud de cambio de modalidad de pago de intereses", SubtituloModalEnvioDeConstancia);

        String  numeroSolicitud_constancia = driver.findElement(numeroSolicitudConstancia).getText();
        assertEquals(numeroSolicitud_paso3,numeroSolicitud_constancia);

        String cuentaDePlazoFijo_constancia = driver.findElement(cuentaDePlazoFijoConstancia).getText();
        assertEquals(cuentaDePlazoFijo_paso3,cuentaDePlazoFijo_constancia);

        String nuevaModalidadDePagoDeIntereses_constancia = driver.findElement(nuevaModalidadDePagoDeInteresesConstancia).getText();
        assertEquals(nuevaModalidadDePagoDeIntereses_paso3,nuevaModalidadDePagoDeIntereses_constancia);

        String modalidadActualDePagoDeIntereses_constancia = driver.findElement(modalidadActualDePagoDeInteresesConstancia).getText();
        assertEquals(modalidadActualDePagoDeIntereses_paso3,modalidadActualDePagoDeIntereses_constancia);

        if(nuevaModalidadDePagoDeIntereses_paso1.contains("2") ||nuevaModalidadDePagoDeIntereses_paso1.contains("5")){
            String cuentaDeAbonoIntereses_constancia = driver.findElement(cuentaDeAbonoInteresesConstancia).getText();
            assertEquals(cuentaDeAbonoIntereses_paso3,cuentaDeAbonoIntereses_constancia);
        }

    }


}
