package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class pagoDeCredito {

    public WebDriver driver;

    public pagoDeCredito(WebDriver driver){this.driver= driver; }

    Utilities utilities = new Utilities();


    private final By tituloFormulario= By.xpath("//*[@id='operacion']/div/div[1]/div/div/h5");
    private final By seccionOperaciones = By.xpath("//*[@id='operacion']/div/div[1]/div/div/ol/li[1]");
    private final By seccionPagodeCréditos = By.xpath("//*[@id='operacion']/div/div[1]/div/div/ol/li[2]");
    private final By botonNext = By.xpath("//*[@id='operacion']/div/div[3]/input");
    private final By tituloPaso= By.xpath("//*[@id='subTitulo']");

    private final By cuentapaso1 = By.id("cuenta-select");
    //variables paso 1
    String cuenta_paso1;
    String pagare_paso1;

    private final By cuentaPaso2 = By.xpath("//*[@id='ctn-creditos']/div[1]/p[2]");
    private final By pagarePaso2 = By.xpath("//*[@id='ctn-creditos']/div[2]/p[2]");
    private final By descripcionPaso2 = By.xpath("//*[@id='ctn-creditos']/div[3]/p[2]");
    private final By titularDelCreditoPaso2 = By.xpath("//*[@id='ctn-creditos']/div[4]/p[2]");
    private final By numeroDeCuotaAPagarPaso2 = By.xpath("//*[@id='operacion']/div/div[3]/div[1]/p[2]");
    private final By fechaDeVencimientoPaso2 = By.xpath("//*[@id='operacion']/div/div[3]/div[2]/p[2]");
    private final By operacionArealizarPaso2 = By.id("login-card-select");
    private final By cuotaApagarPaso2 = By.xpath("//*[@id='panel01']/div/div[2]/p");
    private final By amortizacionPaso2 = By.xpath("//*[@id='txtAmortizacion']");
    private final By botonConfirmar = By.xpath("//*[@id='zonaPin']/div[3]/div[5]/a");

    //variables paso 2
    String descripcion_paso2;
    String titularDelCredito_paso2;
    String numeroCuota_paso2;
    String fechaDeVencimiento_paso2;
    String operacionArealizar_paso2;
    String cuotaApagar_paso2;
    //String amortizacion_paso2;
    String operacion_paso2;

    private final By mensajeExitosoPaos3 = By.xpath("//*[@id='mensajeTransaccion']/div/p[1]");

    private final By numeroDeReferenciaPaso3 = By.xpath("//*[@id='operacion']/div/div[3]/div/div[1]/p[2]");
    private final By numeroDeOperacionPaso3 = By.xpath("//*[@id='operacion']/div/div[3]/div/div[2]/p[2]");
    private final By fechaDePresentacionPaso3 = By.xpath("//*[@id='operacion']/div/div[3]/div/div[3]/p[2]");

    private final By pagarePaso3 = By.xpath("//*[@id='operacion']/div/div[4]/div/div[1]/p[3]");
    private final By descripcionPaso3 = By.xpath("//*[@id='operacion']/div/div[4]/div/div[2]/p[2]");
    private final By titularDelCreditoPaso3 = By.xpath("//*[@id='operacion']/div/div[4]/div/div[3]/p[2]");
    private final By numeroCuotaApagarPaso3 = By.xpath("//*[@id='operacion']/div/div[4]/div/div[4]/p[2]");
    private final By fechaDeVencimientoPaso3 =  By.xpath("//*[@id='operacion']/div/div[4]/div/div[5]/p[2]");
    private final By capitalPaso3 = By.xpath("//*[@id='operacion']/div/div[4]/div/div[6]/p[2]");
    private final By intCompensatorioPaso3 = By.xpath("//*[@id='operacion']/div/div[4]/div/div[7]/p[2]");
    private final By intCompenVencPaso3 = By.xpath("//*[@id='operacion']/div/div[4]/div/div[8]/p[2]");
    private final By intMoratorioPaso3 = By.xpath("//*[@id='operacion']/div/div[4]/div/div[9]/p[2]");
    private final By gastosPaso3= By.xpath("//*[@id='operacion']/div/div[4]/div/div[10]/p[2]");
    private final By seguroPaso3 = By.xpath("//*[@id='operacion']/div/div[4]/div/div[11]/p[2]");
    private final By totalPagadoPaso3 =By.xpath("//*[@id='operacion']/div/div[4]/div/div[12]/p[2]");

    private final By cuentaPaso3 = By.xpath("//*[@id='operacion']/div/div[5]/div/div[1]/p[2]");
    private final By totalPagadoDatosCargoPaso3 =  By.xpath("//*[@id='operacion']/div/div[5]/div/div[2]/p[2]");
    private final By itfPorCargoAcuentaPaso3 = By.xpath("//*[@id='operacion']/div/div[5]/div/div[3]/p[2]");
    private final By totalPaso3 = By.xpath("//*[@id='operacion']/div/div[5]/div/div[4]/p[2]");

   //Variables paso3

    String numeroDeReferencia_paso3;
    String numeroDeOperacion_paso3;
    String fechaDePresentacion_paso3;
    String horaDePresentacion_paso3;
    String capital_paso3;
    String intCompensatorio_paso3;
    String intCompenVenc_paso3;
    String intMoratorio_paso3;
    String gastos_paso3;
    String seguro_paso3;
    String totalPagado_paso3;
    String totalPagadoDatosCargo_paso3;
    String itfPorCargoAcuenta_paso3;
    String total_paso3;

    private final By enviarConstancia = By.xpath("//*[@id='j_idt158']");
    private final By numeroDeReferenciaConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr/td[1]/span[2]");
    private final By numeroDeOperacionConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr/td[2]/span[2]");
    private final By fechaDePresentacionConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr/td[3]/span[2]");
    private final By horaDePresentacionConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr/td[3]/span[3]");
    private final By pagareConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[1]/span[3]");
    private final By descripcionConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[2]/span[2]");
    private final By titularDelCreditoConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[3]/span[2]");
    private final By numeroCuotaApagarConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td[1]/span[2]");
    private final By fechaDeVencimientoConstancia =  By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td[2]/span[2]");
    private final By capitalConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td[3]/span[2]");
    private final By intCompensatorioConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[3]/td[1]/span[2]");
    private final By intCompenVencConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[3]/td[2]/span[2]");
    private final By intMoratorioConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[3]/td[3]/span[2]");
    private final By gastosConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[4]/td[1]/span[2]");
    private final By seguroConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[4]/td[2]/span[2]");
    private final By totalPagadoConstancia =By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[4]/td[3]/span[2]");
    private final By cuentaConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[1]/td[1]/span[2]");
    private final By totalPagadoDatosCargoConstancia =  By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[1]/td[2]/span[2]");
    private final By itfPorCargoAcuentaConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[1]/td[3]/span[2]");
    private final By totalConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[2]/td[1]/span[2]");


    public void paso1(String cuentaAseleccionar, String pagare){
        cuenta_paso1= cuentaAseleccionar;
        pagare_paso1= pagare;

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(tituloFormulario));

        String validartituloFormularioPaso1= driver.findElement(tituloFormulario).getText();
        String tituloFormularioEsperadoPaso1=("Pago de créditos");
        assertEquals(tituloFormularioEsperadoPaso1, validartituloFormularioPaso1);
        System.out.println("Titulo Formulario ok");

        String validarSeccionOperaciones= driver.findElement(seccionOperaciones).getText();
        String seccionOperacionesEsperado=("OPERACIONES");
        assertEquals(seccionOperacionesEsperado, validarSeccionOperaciones);
        System.out.println("Sección operaciones ok");

        String validarSeccionTransferencias= driver.findElement(seccionPagodeCréditos).getText();
        String seccionTransferenciasEsperado=("PAGO DE CRÉDITOS");
        assertEquals(seccionTransferenciasEsperado, validarSeccionTransferencias);
        System.out.println("Sección incremento ok");

        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="SELECCIÓN DE DEUDA A PAGAR\n" +
                "(PASO 1 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 1 ok");

        Select seleccionCtaPF = new Select(driver.findElement(cuentapaso1));
        seleccionCtaPF.selectByValue(cuentaAseleccionar);

        WebElement checkBox= driver.findElement(By.xpath("//*[@id='tableMTN']/tbody/tr[1]/td[1]/label"));
        checkBox.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        By cuentaXpath = By.xpath("//tr/td[2]//span[contains(text(),'"+pagare+"')]/../../td[1]/label");

        WebElement cuenta= driver.findElement(cuentaXpath);
        cuenta.click();

        WebElement botonSiguiente = driver.findElement(botonNext);
        botonSiguiente.click();
    }
    public void paso2(String operacion, String amortizacion){
        operacion_paso2 = operacion;

        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="CONFIRMAR PAGO DE DEUDA - CLAVE\n" +
                "(PASO 2 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 2 ok");

        String cuentapaso2= driver.findElement(cuentaPaso2).getText();
        assertEquals(cuenta_paso1,cuentapaso2);

        String pagarepaso2= driver.findElement(pagarePaso2).getText();
        assertEquals(pagare_paso1,pagarepaso2);

        descripcion_paso2= driver.findElement(descripcionPaso2).getText();
        assertNotNull(descripcion_paso2);

        titularDelCredito_paso2= driver.findElement(titularDelCreditoPaso2).getText();
        assertNotNull(titularDelCredito_paso2);

        numeroCuota_paso2= driver.findElement(numeroDeCuotaAPagarPaso2).getText();
        assertNotNull(numeroCuota_paso2);

        fechaDeVencimiento_paso2 = driver.findElement(fechaDeVencimientoPaso2).getText();
        assertNotNull(fechaDeVencimiento_paso2);

        Select operacionArealizarpaso2 = new Select(driver.findElement(operacionArealizarPaso2));
        operacionArealizarpaso2.selectByValue(operacion);

        if (operacion.contains("OPE_AMOR")){ // OPE_AMOR: amortización OPE_PCUO: Pago de cuota
            cuotaApagar_paso2 = driver.findElement(cuotaApagarPaso2).getText();
            assertNotNull(cuotaApagar_paso2);

            WebDriverWait wait = new WebDriverWait(driver,6000);
            wait.until(ExpectedConditions.elementToBeClickable(amortizacionPaso2));

            WebElement amortizacionpaso2 = driver.findElement(amortizacionPaso2);
            amortizacionpaso2.sendKeys(amortizacion);

            Actions actions = new Actions(driver);
            WebElement botoncontinuar = driver.findElement(botonConfirmar);
            actions.moveToElement(botoncontinuar).build().perform();

            utilities.ingresarclavede6();

            botoncontinuar.click();

        } else {
            cuotaApagar_paso2 = driver.findElement(cuotaApagarPaso2).getText();
            assertNotNull(cuotaApagar_paso2);

            Actions actions = new Actions(driver);
            WebElement botoncontinuar = driver.findElement(botonConfirmar);
            actions.moveToElement(botoncontinuar).build().perform();

            utilities.ingresarclavede6();

            botoncontinuar.click();
        }
    }
    public void paso3(){
        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="IMPRIMIR Y/O ENVIAR CONSTANCIA\n" +
                "(PASO 3 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 3 ok");

        String validarMensaje = driver.findElement(mensajeExitosoPaos3).getText();
        assertEquals("La transacción se ha realizado correctamente.",validarMensaje);

        String numeroReferencia = driver.findElement(numeroDeReferenciaPaso3).getText();
        numeroDeReferencia_paso3 = numeroReferencia;
        assertNotNull(numeroReferencia);

        String numeroOperacion = driver.findElement(numeroDeOperacionPaso3).getText();
        numeroDeOperacion_paso3=numeroOperacion;
        assertNotNull(numeroOperacion);

        String fechaPresentacion = driver.findElement(fechaDePresentacionPaso3).getText();
        fechaDePresentacion_paso3 = fechaPresentacion.substring(0,10);

        String[] hora= fechaPresentacion.split(" ");
        horaDePresentacion_paso3= hora[hora.length - 1];

        System.out.println(fechaDePresentacion_paso3 + " " + horaDePresentacion_paso3);
        assertNotNull(fechaPresentacion);

        String pagare = driver.findElement(pagarePaso3).getText();
        assertNotNull(pagare_paso1,pagare);

        String descripcion = driver.findElement(descripcionPaso3).getText();
        assertEquals(descripcion_paso2,descripcion);

        String titular = driver.findElement(titularDelCreditoPaso3).getText();
        assertEquals(titularDelCredito_paso2,titular);

        String cuota = driver.findElement(numeroCuotaApagarPaso3).getText();
        assertEquals(numeroCuota_paso2,cuota);

        String fechaDeVencimiento = driver.findElement(fechaDeVencimientoPaso3).getText();
        assertEquals(fechaDeVencimiento_paso2,fechaDeVencimiento);

        String capital = driver.findElement(capitalPaso3).getText();
        capital_paso3 = capital;
        assertNotNull(capital);

        String intCompensatorio = driver.findElement(intCompensatorioPaso3).getText();
        intCompensatorio_paso3 = intCompensatorio;
        assertNotNull(intCompensatorio);

        String intCompenVenc = driver.findElement(intCompenVencPaso3).getText();
        intCompenVenc_paso3 = intCompenVenc;
        assertNotNull(intCompenVenc);

        String intMoratorio = driver.findElement(intMoratorioPaso3).getText();
        intMoratorio_paso3 = intMoratorio;
        assertNotNull(intMoratorio);

        String gastos = driver.findElement(gastosPaso3).getText();
        gastos_paso3 = gastos;
        assertNotNull(gastos);

        String seguro = driver.findElement(seguroPaso3).getText();
        seguro_paso3= seguro;
        assertNotNull(seguro);

        String totalPagado = driver.findElement(totalPagadoPaso3).getText();
        totalPagado_paso3 = totalPagado;
        assertNotNull(totalPagado);

        String cuenta = driver.findElement(cuentaPaso3).getText();
        assertEquals(cuenta_paso1,cuenta);

        String totalPagadoDatosCargo = driver.findElement(totalPagadoDatosCargoPaso3).getText();
        totalPagadoDatosCargo_paso3 = totalPagadoDatosCargo;
        assertNotNull(totalPagadoDatosCargo);

        String itfPorCargoAcuenta = driver.findElement(itfPorCargoAcuentaPaso3).getText();
        itfPorCargoAcuenta_paso3 = itfPorCargoAcuenta;
        assertNotNull(itfPorCargoAcuenta);

        String total =  driver.findElement(totalPaso3).getText();
        total_paso3 = total;
        assertNotNull(total);
    }

    public void validarDatosDeEnvio(){
        WebElement EnviarConstancia = driver.findElement(enviarConstancia);
        EnviarConstancia.click();

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='enviarDEU01']/div/div/div[1]/h5")));

        String tituloModalEnvioDeConstancia= driver.findElement(By.xpath("//*[@id='enviarDEU01']/div/div/div[1]/h5")).getText();
        assertEquals("ENVÍO DE CONSTANCIA", tituloModalEnvioDeConstancia);

        String SubtituloModalEnvioDeConstancia= driver.findElement(By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[1]/span")).getText();
        assertEquals("Constancia de Pago de crédito", SubtituloModalEnvioDeConstancia);

        String numeroReferencia = driver.findElement(numeroDeReferenciaConstancia).getText();
        numeroDeReferencia_paso3 = numeroReferencia;
        assertNotNull(numeroReferencia);

        String numeroOperacion = driver.findElement(numeroDeOperacionConstancia).getText();
        numeroDeOperacion_paso3=numeroOperacion;
        assertNotNull(numeroOperacion);

        String fechaPresentacion = driver.findElement(fechaDePresentacionConstancia).getText();
        assertEquals(fechaDePresentacion_paso3,fechaPresentacion);

        String horaPresentacion = driver.findElement(horaDePresentacionConstancia).getText();
        assertEquals(horaDePresentacion_paso3,horaPresentacion);

        String pagare = driver.findElement(pagareConstancia).getText();
        assertNotNull(pagare_paso1,pagare);

        String descripcion = driver.findElement(descripcionConstancia).getText();
        assertEquals(descripcion_paso2,descripcion);

        String titular = driver.findElement(titularDelCreditoConstancia).getText();
        assertEquals(titularDelCredito_paso2,titular);

        String cuota = driver.findElement(numeroCuotaApagarConstancia).getText();
        assertEquals(numeroCuota_paso2,cuota);

        String fechaDeVencimiento = driver.findElement(fechaDeVencimientoConstancia).getText();
        assertEquals(fechaDeVencimiento_paso2,fechaDeVencimiento);

        String capital = driver.findElement(capitalConstancia).getText();
        assertEquals(capital_paso3,capital);

        String intCompensatorio = driver.findElement(intCompensatorioConstancia).getText();
        assertEquals(intCompensatorio_paso3, intCompensatorio);

        String intCompenVenc = driver.findElement(intCompenVencConstancia).getText();
        assertEquals(intCompenVenc_paso3,intCompenVenc);

        String intMoratorio = driver.findElement(intMoratorioConstancia).getText();
        assertEquals(intMoratorio_paso3,intMoratorio);

        String gastos = driver.findElement(gastosConstancia).getText();
        assertEquals(gastos_paso3,gastos);

        String seguro = driver.findElement(seguroConstancia).getText();
        assertEquals(seguro_paso3, seguro);

        String totalPagado = driver.findElement(totalPagadoConstancia).getText();
        assertEquals(totalPagado_paso3,totalPagado);

        String cuenta = driver.findElement(cuentaConstancia).getText();
        assertEquals(cuenta_paso1,cuenta);

        String totalPagadoDatosCargo = driver.findElement(totalPagadoDatosCargoConstancia).getText();
        assertEquals(totalPagadoDatosCargo_paso3,totalPagadoDatosCargo);

        String itfPorCargoAcuenta = driver.findElement(itfPorCargoAcuentaConstancia).getText();
        assertEquals(itfPorCargoAcuenta_paso3,itfPorCargoAcuenta);

        String total =  driver.findElement(totalConstancia).getText();
        assertEquals(total_paso3,total);
    }


}
