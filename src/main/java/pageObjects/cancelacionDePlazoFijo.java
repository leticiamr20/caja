package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Utilities;


import static org.junit.Assert.*;

public class cancelacionDePlazoFijo {

    public static WebDriver driver;

    Utilities  utilities = new Utilities();

    public cancelacionDePlazoFijo (WebDriver driver){
        this.driver= driver;
    }

    private final By tituloformulario = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/h5");
    private final By seccionOperaciones = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[1]");
    private final By seccionPlazoFijo = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[2]");
    private final By seccionCancelaciondePlazoFijo = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[3]");
    private final By seccionConAbonoAcuentaPropia = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[4]");
    private final By tituloPaso1 = By.xpath("//*[@id='subTitulo']");
    private final By paso1De3 = By.xpath("//*[@id='subTitulo']/div");

    private final By cuentaAcancelar = By.xpath("//form[@id='fixed-term-cancellation-ownaccount-form']//div[@id='operacion']//div[@id='ctn-creditos']//select[@id='cuenta-origen']");
    private final By cuentaDestino= By.xpath("//form[@id='fixed-term-cancellation-ownaccount-form']//div[@id='operacion']//select[@id='cuenta-destino']");
    private final By siguientePaso1 = By.xpath("//*[@id='botonNext']");

    //PASO 2
    //Confirmar cancelacion - clave
    private final By cuentaAcancelarPaso2= By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[1]/p");
    private final By cuentaAcancelarEnceroPaso2 = By.xpath("//*[@id='idDatosCancelacionFirstLine']/div/p");
    private final By importeDeDocumentosPaso2 = By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[2]/p");
    private final By interesCalculadoAlaTasaVigentePositivoPaso2 = By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[3]/p");
    private final By toolTipPaso2= By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[3]/label/i");
    private final By interesPorCancelacionAntesDePlazoPaso2= By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[4]/p");
    private final By interesCalculadoAlaTasaVigenteNegativoPaso2 = By.xpath("//*[@id='idDatosCancelacionSecondLine']/div[1]/p");
    private final By montoDeCancelacionPaso2= By.xpath("//*[@id='idDatosCancelacionSecondLine']/div[2]/p");
    private final By ITFPaso2= By.xpath("//*[@id='idDatosCancelacionSecondLine']/div[3]/p");
    //Validación de datos del abono
    private final By cuentaDestinoPaso2= By.xpath("//*[@id='idDatosAbonoFirstLine']/div/p");
    private final By montoAtransferirPaso2= By.xpath("//*[@id='idDatosAbonoFirstLine']/span/p");
    private final By montoATransferirMultimonedaPaso2= By.xpath("//*[@id='idDatosAbonoFirstLine']/span[3]/p");
    //Completando información solitada
    private final By botonConfirmar = By.xpath("//*[@id='botonNext']");

    //PASO 3
    private final By mensajeExitosoPaso3= By.xpath("//*[@id='mensajeTransaccion']/div/p/span[2]");
    private final By tituloPaso3 = By.xpath("//*[@id='subTitulo']");
    private final By paso3De3 = By.xpath("//*[@id='subTitulo']/span");

    private final By numeroReferenciaPaso3= By.xpath("//*[@id='operacion']/div[3]/div[1]/p[2]");
    private final By numeroOperacionPaso3 = By.xpath("//*[@id='operacion']/div[3]/div[2]/p[2]");
    private final By fechaPresentacionPaso3 = By.xpath("//*[@id='fechapresentacion']");

    //locatos cuenta sin fondo
    private final By numeroReferencia_Paso3= By.xpath("//*[@id='idDatosConfirmacionCancelacion']/div[1]/p[2]");
    private final By numeroOperacion_Paso3= By.xpath("//*[@id='idDatosConfirmacionCancelacion']/div[2]/p[2]");
    private final By fechaPresentacion_Paso3= By.xpath("//*[@id='fechapresentacion']");

    private final By cuentaCanceladaEnceroPaso3 = By.xpath("//*[@id='idDatosConfirmacionCancelacion']/div[4]/p");
    //

    //Datos de cancelación
    private final By cuentaCanceladaPaso3 = By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[1]/p");
    private final By importedocumentoPaso3 = By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[2]/p");
    private final By interesCalculadoAlaTasaVigentePositivoPaso3 = By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[3]/p");
    private final By interesXcancelacionAntesDePlazoPaso3 = By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[4]/p");
    private final By interesCalculadoAlaTasaVigenteNegativoPaso3 = By.xpath("//*[@id='idDatosCancelacionSecondLine']/div[1]/p");
    private final By montoCancelacionPaso3 = By.xpath("//*[@id='idDatosCancelacionSecondLine']/div[2]/p");
    private final By itfPaso3 = By.xpath("//*[@id='idDatosCancelacionSecondLine']/div[3]/p");
    //Datos del abono
    private final By cuentaDestinoPaso3 = By.xpath("//*[@id='idDatosAbonoFirstLine']/div/p");
    private final By montotransferidoPaso3 = By.xpath("//*[@id='idDatosAbonoFirstLine']/span/p");
    private final By montoTransferidoMultimonedaPaso3= By.xpath("//*[@id='idDatosAbonoFirstLine']/span[3]/p");

    private final By etiquetatipoCambio = By.xpath("//*[@id='idDatosAbonoFirstLine']/span[1]/label");
    private final By tipoDeCambio = By.xpath("//*[@id='idDatosAbonoFirstLine']/span[1]/p");
    private final By montoEquivalente= By.xpath("//*[@id='idDatosAbonoFirstLine']/span[2]/p");

    //Datos a validar en el paso 2
    String cuentaACancelarObtenido_Paso2;
    String cuentaACancelarObtenidoPaso2;
    String importeDeDocumentoObtenidoPaso2;
    String interesPositivoObtenidoPaso2;
    String toolTipObtenidoPaso2;
    String interesNegativoObtenidoPaso2;
    String interesXcancelacionAntesDePlazoObtenidoPaso2;
    String montoDeCancelacionObtenidoPaso2;
    String itfobtenidoPaso2;
    String cuentaDestinoObtenidoPaso2;
    String montoAtransferirObtenidoPaso2;
    String tipoDeCambioObtenidoPaso2;
    String montoEquivalenteObtenidoPaso2;
    String montoAtransferirmultimonedaObtenidoPaso2;

    String numeroReferenciaObtenidoPaso3;
    String numeroOperacionObtenidoPaso3;
    String fechaDePresentacionObtenidoPaso3;
    String tipoDeCambioObtenidoPaso3;
    String montoEquivalenteObtenidoPaso3;
    String montoAtransferirmultimonedaObtenidoPaso3;


    String cuentaSeleccionadaPaso1;


    String cuentaACancelarEnCeroObtenidoPaso2;
    String cuentaCanceladaEnCeroObtenidoPaso3;

    String monedaSoles= "S/";
    String monedaDolares= "US$";

    private final By seleccionarEnviarConstancia= By.xpath("//*[@id='j_idt158']");
    private final By constanciaNumeroDeReferencia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr/td[1]/span[2]");

    private final By constanciaNumeroDeOperacion = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr/td[2]/span[2]");
    private final By constanciaFechaDePresentacion = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr/td[3]/span[2]");
    private final By constanciaCuentaCancelada = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[1]/span");
    private final By constanciaImporteDeDocumento = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[2]/span[2]");
    private final By constanciaInteresCalculadoAlaTasaVigentePositivo = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[3]/span[2]");
    private final By constanciaInteresPorCancelacionAntesDePlazo = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td[1]/span[2]");
    private final By constanciaInteresCalculadoAlaTasaVigenteNegativo = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td[2]/span[2]");
    private final By constanciaMontoDeCancelacion = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td[3]/span[2]");
    private final By constanciaITF= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[3]/td/span[2]");
    private final By constanciaCuentaDestino= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr/td[1]/span[2]");
    private final By constanciaMontoTransferido= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr/td[2]/span");
    private final By constanciaEtiquetaTipoCambio= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[1]/td[2]/span[1]");
    private final By constanciaTipoDeCambio= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[1]/td[2]/span[2]");
    private final By constanciaMontoEquivalente= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[1]/td[3]/span[2]");
    private final By constanciaMontoTransferidoMultimoneda= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[2]/td/span");


    private final By menuConsultas= By.xpath("//*[@id='j_idt74:0:j_idt76']");
    private final By saldosYmovimientos= By.xpath("//*[@id='j_idt74:0:j_idt81:0:j_idt83']");
    private final By accesoDirectoCancelarCuenta= By.xpath("//*[@id='botonNext']");


    public void ingresarACancelacionDePlazoFijoDesdeAccesoDirecto(String cuentaSeleccionada){
        cuentaSeleccionadaPaso1= cuentaSeleccionada;
        Actions action = new Actions(driver);
        WebElement selecionarMenuConsultas = driver.findElement(menuConsultas);
        action.moveToElement(selecionarMenuConsultas).perform();

        Actions action1 = new Actions(driver);
        WebElement ingresarAsaldosYmovimientos = driver.findElement(saldosYmovimientos);
        action1.moveToElement(ingresarAsaldosYmovimientos).perform();
        ingresarAsaldosYmovimientos.click();

        By etiquetaPazoFijo= By.xpath("//*[@id='demo']/div[10]/h5");

        WebDriverWait wait = new WebDriverWait (driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(etiquetaPazoFijo));

        By filaCuenta = By.xpath("//tr[@role='row']/td[@data-label='Nº cuenta']/div/p[contains(text(),'"+cuentaSeleccionada+"')]/../../../td[@data-label='Detalle']/div/a");

        Actions seleccionarFila = new Actions(driver);
        WebElement Cuenta= driver.findElement(filaCuenta);
        seleccionarFila.moveToElement(Cuenta).build().perform();
        Cuenta.click();

        WebDriverWait wait1 = new WebDriverWait(driver,6000);
        wait1.until(ExpectedConditions.elementToBeClickable(accesoDirectoCancelarCuenta));

        WebElement botonAccesoDirecto = driver.findElement(accesoDirectoCancelarCuenta);
        botonAccesoDirecto.click();
    }
    public void validarCaracterisicasDeFormularioCargadoPaso1() {

        WebDriverWait wait1 = new WebDriverWait(driver,6000);
        wait1.until(ExpectedConditions.elementToBeClickable(tituloformulario));

        String validartituloFormularioPaso1= driver.findElement(tituloformulario).getText();
        String tituloFormularioEsperadoPaso1=("Cancelación de plazo fijo con abono a cuenta propia");
        assertEquals(tituloFormularioEsperadoPaso1, validartituloFormularioPaso1);
        System.out.println("Titulo Formulario ok");

        String validarSeccionOperaciones= driver.findElement(seccionOperaciones).getText();
        String seccionOperacionesEsperado=("OPERACIONES");
        assertEquals(seccionOperacionesEsperado, validarSeccionOperaciones);
        System.out.println("Sección operaciones ok");

        String validarSeccionPlazoFijo= driver.findElement(seccionPlazoFijo).getText();
        String seccionPlazoFijoEsperado=("PLAZO FIJO");
        assertEquals(seccionPlazoFijoEsperado, validarSeccionPlazoFijo);
        System.out.println("Sección Plazo Fijo ok");

        String validarSeccionCancelacionDePlazoFijo= driver.findElement(seccionCancelaciondePlazoFijo).getText();
        String seccionCancelacionDePlazoFijoEsperado="CANCELACIÓN DE PLAZO FIJO";
        assertEquals(seccionCancelacionDePlazoFijoEsperado, validarSeccionCancelacionDePlazoFijo);
        System.out.println("Sección cancelación de Plazo Fijo ok");

        String validarSeccionConAbonoAcuentaPropia= driver.findElement(seccionConAbonoAcuentaPropia).getText();
        String seccionConAbonoAcuentaPropiaEsperado="CON ABONO A CUENTA PROPIA";
        assertEquals(seccionConAbonoAcuentaPropiaEsperado, validarSeccionConAbonoAcuentaPropia);
        System.out.println("Sección con abono a cuenta propia ok");

        String validarTituloFormulario= driver.findElement(tituloPaso1).getText();
        String seccionTituloFormularioEsperado="SELECCIÓN DE CUENTA A CANCELAR Y CUENTA DESTINO\n" +
                "(PASO 1 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo formulario ok");
    }
    public void seleccionarTipoTransferenciaDesdeModal(){
        //Validando datos del modal
        By tituloModalTipoTransferencia= By.xpath("//*[@id='dlgOpcionesCancelacion']/div/div/div/div[1]/h5");
        String  tituloModal_tipoTransferencia = driver.findElement(tituloModalTipoTransferencia).getText();
        String tituloModalESperado_tipoTransferencia= "CANCELACIÓN DE PLAZO FIJO";
        assertEquals(tituloModalESperado_tipoTransferencia,tituloModal_tipoTransferencia);

        By subTituloModalTipoTransferencia= By.xpath("//*[@id='dlgOpcionesCancelacion']/div/div/div/div[2]/div[1]");
        String subTituloModal_tipoTransferencia = driver.findElement(subTituloModalTipoTransferencia).getText();
        String subTituloModalEsperado_tipoTransferencia= "Transfiere tus fondos:";
        assertEquals(subTituloModalEsperado_tipoTransferencia,subTituloModal_tipoTransferencia);

        By chekBox_ConAbonoAcuentaPropia= By.xpath("//*[@id='tableMTN:0:chkSeleccionLabel']");
        WebElement ConAbonoAcuentaPropia = driver.findElement(chekBox_ConAbonoAcuentaPropia);
        String ConAbonoAcuentaPropia_tipoTRansferencia = ConAbonoAcuentaPropia.getText();
        String ConAbonoAcuentaPropiaEsperado= "Con abono a cuenta propia";
        assertEquals(ConAbonoAcuentaPropiaEsperado,ConAbonoAcuentaPropia_tipoTRansferencia);
        ConAbonoAcuentaPropia.click();

        By botonSiguienteModalTipoTransferencia= By.xpath("//*[@id='btn-next']");

        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(botonSiguienteModalTipoTransferencia));

        WebElement botonSiguienteModal_tipoTransferencia= driver.findElement(botonSiguienteModalTipoTransferencia);
        botonSiguienteModal_tipoTransferencia.click();
    }
    public void completarPaso1De3desdeAccesoDirecto(String cuenta_destino){
        //validar cuenta origen
        String cuentaOrigen = driver.findElement(cuentaAcancelar).getText();
        if (cuentaOrigen.contains(cuentaSeleccionadaPaso1)){
            //seleccionar cuenta destino
            Select seleccionarCuentaDestino = new Select(driver.findElement(cuentaDestino));
            seleccionarCuentaDestino.selectByValue(cuenta_destino);

            //Clic botòn siguiente
            WebElement clicBotonSiguientePaso1= driver.findElement(siguientePaso1);
            clicBotonSiguientePaso1.click();
        }
    }
    public void completarPaso1De3ConFondo(String cuenta_a_cancelar, String cuenta_destino) {
        cuentaSeleccionadaPaso1 = cuenta_a_cancelar;
        //seleccionar cuenta origen
        Select seleccionarCuentaOrigen = new Select(driver.findElement(cuentaAcancelar));
        seleccionarCuentaOrigen.selectByValue(cuenta_a_cancelar);

        //seleccionar cuenta destino
        Select seleccionarCuentaDestino = new Select(driver.findElement(cuentaDestino));
        seleccionarCuentaDestino.selectByValue(cuenta_destino);

        //Clic botòn siguiente
        WebElement clicBotonSiguientePaso1= driver.findElement(siguientePaso1);
        clicBotonSiguientePaso1.click();

    }
    public void validarCaracterisicasDeFormularioCargadoPaso2(){
        String validarTituloPaso2= driver.findElement(tituloPaso1).getText();
        String tituloPaso2Esperado="CONFIRMAR CANCELACIÓN - CLAVE\n" +
                "(PASO 2 DE 3)";
        assertEquals(tituloPaso2Esperado, validarTituloPaso2);
        System.out.println("Sección con abono a cuenta propia ok");

    }
    public void validarDatosDeCancelacionPaso2(){
        if (cuentaSeleccionadaPaso1.contains("-")){
            //Cuenta a cancelar
            cuentaACancelarObtenidoPaso2= driver.findElement(cuentaAcancelarPaso2).getText();
            String parte1CuentaAcancelar= cuentaSeleccionadaPaso1.substring(0,3);
            String parte2CuentaAcancelar = cuentaSeleccionadaPaso1.substring(4,6);
            String parte3CuentaAcancelar = cuentaSeleccionadaPaso1.substring(7,14);
            String cuentaACancelarEsperadaPaso2 = "Cuenta "+parte1CuentaAcancelar+"-"+parte2CuentaAcancelar+"-"+parte3CuentaAcancelar;
            assertEquals(cuentaACancelarEsperadaPaso2, cuentaACancelarObtenidoPaso2);
            System.out.println("Cuenta a cancelar ok en paso 2");

        }else {
            cuentaACancelarObtenidoPaso2= driver.findElement(cuentaAcancelarPaso2).getText();
            String parte1CuentaAcancelar= cuentaSeleccionadaPaso1.substring(0,3);
            String parte2CuentaAcancelar = cuentaSeleccionadaPaso1.substring(3,5);
            String parte3CuentaAcancelar = cuentaSeleccionadaPaso1.substring(5,12);
            String cuentaACancelarEsperadaPaso2 = "Cuenta "+parte1CuentaAcancelar+"-"+parte2CuentaAcancelar+"-"+parte3CuentaAcancelar;
            assertEquals(cuentaACancelarEsperadaPaso2, cuentaACancelarObtenidoPaso2);
            System.out.println("Cuenta a cancelar ok en paso 2");

        }

        //Importe de documentos
        String validarImporteDeDocumentoPaso2= driver.findElement(importeDeDocumentosPaso2).getText();

        if(validarImporteDeDocumentoPaso2.contains(monedaSoles)){
            importeDeDocumentoObtenidoPaso2=validarImporteDeDocumentoPaso2;
            System.out.println("Importe de documento obtenido en paso 2: "+importeDeDocumentoObtenidoPaso2);

        } else if (validarImporteDeDocumentoPaso2.contains(monedaDolares)){
            importeDeDocumentoObtenidoPaso2=validarImporteDeDocumentoPaso2;
            System.out.println("Importe de documento obtenido en paso 2: "+importeDeDocumentoObtenidoPaso2);

        }

        //Interés calculado a la tasa vigente positivo
        String validarInteresCalculadoAlaTasaVigentePositivoPaso2= driver.findElement(interesCalculadoAlaTasaVigentePositivoPaso2).getText();
        interesPositivoObtenidoPaso2 = validarInteresCalculadoAlaTasaVigentePositivoPaso2;
        assertNotNull(interesPositivoObtenidoPaso2);
        System.out.println("Interés calculado a la tasa vigente(positivo) obtenido en el paso 2: "+ interesPositivoObtenidoPaso2);

        //Tooltip
        String  seleccionarTooltip = driver.findElement(toolTipPaso2).getAttribute("data-original-title");
        toolTipObtenidoPaso2 = seleccionarTooltip;
        String toolTipEsperadoPaso2= "Interés calculado a la fecha del vencimiento del documento";
        assertEquals(toolTipEsperadoPaso2,toolTipObtenidoPaso2 );

        //Interés por cancelación antes de plazo
        String validarInteresXcancelacionAntesDePlazoPaso2= driver.findElement(interesPorCancelacionAntesDePlazoPaso2).getText();
        interesXcancelacionAntesDePlazoObtenidoPaso2= validarInteresXcancelacionAntesDePlazoPaso2;
        assertNotNull(interesXcancelacionAntesDePlazoObtenidoPaso2);
        System.out.println("Interés por cancelación antes de plazo no es vacío en el paso 2");

        //Interés calculado a la tasa vigente (Negativo)
        String validarInteresCalculadoAlaTasaVigenteNegativoPaso2= driver.findElement(interesCalculadoAlaTasaVigenteNegativoPaso2).getText();
        interesNegativoObtenidoPaso2= validarInteresCalculadoAlaTasaVigenteNegativoPaso2;
        assertNotNull(interesNegativoObtenidoPaso2);
        System.out.println("Interés calculado a la tasa vigente (negativo) no es vacío en el paso 2");

        //Monto de cancelación
        String validarMontoCancelacionPaso2= driver.findElement(montoDeCancelacionPaso2).getText();

        if(validarMontoCancelacionPaso2.contains(monedaSoles)){
            montoDeCancelacionObtenidoPaso2=validarMontoCancelacionPaso2;
            System.out.println("Monto de cancelación obtenido en paso 2: "+montoDeCancelacionObtenidoPaso2);

        } else if (validarMontoCancelacionPaso2.contains(monedaDolares)){
            montoDeCancelacionObtenidoPaso2=validarMontoCancelacionPaso2;
            System.out.println("Monto de cancelación obtenido en paso 2: "+montoDeCancelacionObtenidoPaso2);

        }

        //ITF
        String validarItfPaso2= driver.findElement(ITFPaso2).getText();

        if(validarItfPaso2.contains(monedaSoles)){
            itfobtenidoPaso2=validarItfPaso2;
            System.out.println("ITF obtenido en paso 2: "+itfobtenidoPaso2);
            assertNotNull(itfobtenidoPaso2);

        } else if (validarItfPaso2.contains(monedaDolares)){
            itfobtenidoPaso2=validarItfPaso2;
            System.out.println("ITF obtenido en paso 2: "+itfobtenidoPaso2);
            assertNotNull(itfobtenidoPaso2);
        }
    }
    public void validarDatosDeDatosDelAbonoPaso2(){
        //Validación de datos del abono
        //Cuenta destino
        String validarCuentaDestinoPaso2= driver.findElement(cuentaDestinoPaso2).getText();
        cuentaDestinoObtenidoPaso2= validarCuentaDestinoPaso2;
        String parte1CuentaDestino= validarCuentaDestinoPaso2.substring(7,10);
        String parte2CuentaDestino = validarCuentaDestinoPaso2.substring(11,13);;
        String parte3CuentaDestino = validarCuentaDestinoPaso2.substring(14,21);;
        String cuentaDestinoEsperadaPaso2 = "Cuenta "+parte1CuentaDestino+"-"+parte2CuentaDestino+"-"+parte3CuentaDestino;
        assertEquals(cuentaDestinoEsperadaPaso2, cuentaDestinoObtenidoPaso2);
        System.out.println("Cuenta destino ok en paso 2");

        //Validación de existencia de campos correspondientes a operación multimoneda

        String  etiquetatipocambio= driver.findElement(etiquetatipoCambio).getText();
        String tipoCambio= driver.findElement(tipoDeCambio).getText();

        if (etiquetatipocambio.contains("Tipo de cambio")) {

            if(tipoCambio !=null && tipoCambio !="S/ 0.00"  && tipoCambio.contains(monedaSoles) ){
                tipoDeCambioObtenidoPaso2=tipoCambio;
                System.out.println("Tipo de cambio obtenido en paso 2: " + tipoDeCambioObtenidoPaso2);

                String montoequivalente = driver.findElement(montoEquivalente).getText();
                montoEquivalenteObtenidoPaso2= montoequivalente;
                System.out.println("Monto equivalente obtenido en paso 2: " + montoEquivalenteObtenidoPaso2);
                //Monto a transferir
                String validarMontoaTransferirPaso2= driver.findElement(montoATransferirMultimonedaPaso2).getText();

                if(validarMontoaTransferirPaso2.contains(monedaSoles)){
                    montoAtransferirmultimonedaObtenidoPaso2= validarMontoaTransferirPaso2;
                    System.out.println("Monto a transferir obtenido en paso 2: "+montoAtransferirmultimonedaObtenidoPaso2);
                    assertNotNull(montoAtransferirmultimonedaObtenidoPaso2);

                } else if (validarMontoaTransferirPaso2.contains(monedaDolares)){
                    montoAtransferirmultimonedaObtenidoPaso2= validarMontoaTransferirPaso2;
                    System.out.println("Monto a transferir obtenido en paso 2: "+montoAtransferirmultimonedaObtenidoPaso2);
                    assertNotNull(montoAtransferirmultimonedaObtenidoPaso2);
                }


            }else {
                System.out.println("ERROR " + tipoCambio);
            }

        } else {
            //Monto a transferir
            String validarMontoaTransferirPaso2= driver.findElement(montoAtransferirPaso2).getText();

            if(validarMontoaTransferirPaso2.contains(monedaSoles)){
                montoAtransferirObtenidoPaso2= validarMontoaTransferirPaso2;
                assertNotNull(montoAtransferirObtenidoPaso2);
                System.out.println("Monto a transferir obtenido en paso 2: "+montoAtransferirObtenidoPaso2);

            } else if (validarMontoaTransferirPaso2.contains(monedaDolares)){
                montoAtransferirObtenidoPaso2= validarMontoaTransferirPaso2;
                assertNotNull(montoAtransferirObtenidoPaso2);
                System.out.println("Monto a transferir obtenido en paso 2: "+montoAtransferirObtenidoPaso2);

            }
        }
    }
    public void completarPaso2De3() {

        WebDriverWait wait1 = new WebDriverWait(driver,6000);
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='generate-password-actual-autorizacion']")));

        Actions action = new Actions(driver);
        WebElement moverAbotonConfirmar = driver.findElement(By.xpath("//*[@id='generate-password-actual-autorizacion']"));
        action.moveToElement(moverAbotonConfirmar).build().perform();

        //ingresar clave de 6
        utilities.ingresarclavede6();
        //
        WebElement clicBotonConfirmarPaso2= driver.findElement(botonConfirmar);
        clicBotonConfirmarPaso2.click();

    }
    public void validarDatosDeCancelacionPaso3(){
        //Cuenta cancelada
        String cuentaCanceladaObtenidoPaso3= driver.findElement(cuentaCanceladaPaso3).getText();
        assertEquals(cuentaACancelarObtenidoPaso2, cuentaCanceladaObtenidoPaso3);
        System.out.println("Cuenta Cancelada en paso 3: " + cuentaCanceladaObtenidoPaso3);

        //Importe de documento
        String importeDeDocumentoObtenidoPaso3= driver.findElement(importedocumentoPaso3).getText();
        assertEquals(importeDeDocumentoObtenidoPaso2, importeDeDocumentoObtenidoPaso3);
        System.out.println("Importe de documento obtenido en paso 3: " + importeDeDocumentoObtenidoPaso3);

        //Interés calculado a la tasa vigente(positivo)
        String interesCalculadoAlaTasaVigentePositivoObtenidoPaso3= driver.findElement(interesCalculadoAlaTasaVigentePositivoPaso3).getText();
        assertEquals(interesPositivoObtenidoPaso2, interesCalculadoAlaTasaVigentePositivoObtenidoPaso3);
        System.out.println("Interés calculado a la tasa vigente(positivo) obtenido en paso 3: " + interesCalculadoAlaTasaVigentePositivoObtenidoPaso3);

        //Interés por cancelación antes de plazo
        String interesXcancelacionAntesDePlazoObtenidoPaso3= driver.findElement(interesXcancelacionAntesDePlazoPaso3).getText();
        assertEquals(interesXcancelacionAntesDePlazoObtenidoPaso2, interesXcancelacionAntesDePlazoObtenidoPaso3);
        System.out.println("Interés por cancelación antes de plazo obtenido en paso 3: " + interesXcancelacionAntesDePlazoObtenidoPaso3);

        //Interés calculado a la tasa vigente(negativo)
        String interesCalculadoAlaTasaVigenteNegativoObtenidoPaso3= driver.findElement(interesCalculadoAlaTasaVigenteNegativoPaso3).getText();
        assertEquals(interesNegativoObtenidoPaso2, interesCalculadoAlaTasaVigenteNegativoObtenidoPaso3);
        System.out.println("Interés calculado a la tasa vigente(Negativo) obtenido en paso 3: "+interesCalculadoAlaTasaVigenteNegativoObtenidoPaso3);

        //Monto de cancelación
        String montoCancelacionObtenidoPaso3= driver.findElement(montoCancelacionPaso3).getText();
        assertEquals(montoDeCancelacionObtenidoPaso2, montoCancelacionObtenidoPaso3);
        System.out.println("Monto de cancelación obtenida en paso 3: "+montoCancelacionObtenidoPaso3);

        //ITF
        String ITFobtenidoPaso3= driver.findElement(itfPaso3).getText();
        assertEquals(itfobtenidoPaso2, ITFobtenidoPaso3);
        System.out.println("ITF obtenida en paso 3: "+ITFobtenidoPaso3);
    }
    public void validarDatosDeDatosDelAbonoPaso3 (){
        //Cuenta destino
        String cuentaDestinoObtenidaPaso3= driver.findElement(cuentaDestinoPaso3).getText();
        assertEquals(cuentaDestinoObtenidoPaso2, cuentaDestinoObtenidaPaso3);
        System.out.println("Cuenta destino obtenido en paso 3: "+cuentaDestinoObtenidaPaso3);

        //Validación de existencia de campos correspondientes a operación multimoneda

        String  etiquetatipocambio= driver.findElement(etiquetatipoCambio).getText();
        String tipoCambio= driver.findElement(tipoDeCambio).getText();

        if (etiquetatipocambio.contains("Tipo de cambio")) { //es operación multimoneda
            if(tipoCambio !=null && tipoCambio !="S/ 0.00"  && tipoCambio.contains(monedaSoles) ){
                tipoDeCambioObtenidoPaso3=tipoCambio;
                assertEquals(tipoDeCambioObtenidoPaso3,tipoDeCambioObtenidoPaso2);
                System.out.println("Tipo de cambio obtenido en paso 3: " + tipoDeCambioObtenidoPaso3);

                String montoequivalente = driver.findElement(montoEquivalente).getText();
                montoEquivalenteObtenidoPaso3= montoequivalente;
                assertEquals(montoEquivalenteObtenidoPaso3,montoEquivalenteObtenidoPaso2);
                System.out.println("Monto equivalente obtenido en paso 3: " + montoEquivalenteObtenidoPaso3);

                //Monto a transferir
                String validarMontoaTransferirPaso3= driver.findElement(montoATransferirMultimonedaPaso2).getText();
                montoAtransferirmultimonedaObtenidoPaso3= validarMontoaTransferirPaso3;
                System.out.println("Monto a transferir obtenido en paso 3: "+montoAtransferirmultimonedaObtenidoPaso3);
                assertEquals(montoAtransferirmultimonedaObtenidoPaso3, montoAtransferirmultimonedaObtenidoPaso2);

            }else {
                System.out.println("ERROR " + tipoCambio);
            }

        } else{
            //Monto transferido
            String montoTransferidoObtenidaPaso3= driver.findElement(montotransferidoPaso3).getText();
            assertEquals(montoAtransferirObtenidoPaso2, montoTransferidoObtenidaPaso3);
            System.out.println("Monto transferido obtenido en paso 3: "+montoTransferidoObtenidaPaso3);
        }
    }
    public void validarDatosAdicionalesPaso3De3() {
        //Mensaje exitoso
        String validarMensajeExitoso= driver.findElement(mensajeExitosoPaso3).getText();
        String mensajeExitosoEsperado="La transacción se ha realizado correctamente";
        assertEquals(mensajeExitosoEsperado, validarMensajeExitoso);
        System.out.println("Mensaje exitoso ok en paso 3");
        //Paso
        String validarPaso3= driver.findElement(paso3De3).getText();
        String paso3Esperado="(PASO 3 DE 3)";
        assertEquals(paso3Esperado, validarPaso3);
        System.out.println("Paso 3 ok");

        //Validacion de campos
        String validarNumeroReferenciaPaso3= driver.findElement(numeroReferenciaPaso3).getText();
        numeroReferenciaObtenidoPaso3= validarNumeroReferenciaPaso3;
        assertNotNull(validarNumeroReferenciaPaso3);
        System.out.println(validarNumeroReferenciaPaso3);
        System.out.println("Numero de referencia no es vacio en paso 3");

        //Número de operación
        String validarNumeroOperacionPaso3= driver.findElement(numeroOperacionPaso3).getText();
        numeroOperacionObtenidoPaso3= validarNumeroOperacionPaso3;
        assertNotNull(validarNumeroOperacionPaso3);
        System.out.println("Numero de operacion no es vacio en paso 3");
        System.out.println(validarNumeroOperacionPaso3);

        //Fecha de presentación
        String validarFechaPresentacionPaso3= driver.findElement(fechaPresentacionPaso3).getText();
        fechaDePresentacionObtenidoPaso3= validarFechaPresentacionPaso3;
        assertNotNull(validarFechaPresentacionPaso3);
        System.out.println("Fecha no es vacío en paso 3");
        System.out.println(validarFechaPresentacionPaso3);


    }

    public void validarDatosDeModalConstancia(){
        WebElement EnviarConstancia = driver.findElement(seleccionarEnviarConstancia);
        EnviarConstancia.click();

        WebDriverWait wait1 = new WebDriverWait(driver,6000);
        wait1.until(ExpectedConditions.elementToBeClickable(constanciaNumeroDeReferencia));

        if (cuentaDestinoObtenidoPaso2!=null){ //es una operación de cancelación con fondo
            String numeroReferenciaConstancia= driver.findElement(constanciaNumeroDeReferencia).getText();
            String numeroReferenciaObtenidoConstancia= numeroReferenciaConstancia;
            assertEquals(numeroReferenciaObtenidoPaso3,numeroReferenciaObtenidoConstancia);

            String numeroOperacionObtenidoConstancia= driver.findElement(constanciaNumeroDeOperacion).getText();
            assertEquals(numeroOperacionObtenidoPaso3,numeroOperacionObtenidoConstancia);

            String fechaPresentacionObtenidoConstancia= driver.findElement(constanciaFechaDePresentacion).getText();
            assertEquals(fechaDePresentacionObtenidoPaso3,fechaPresentacionObtenidoConstancia);

            //Datos de Cancelación
            String cuentaCanceladaObtenidoConstancia= driver.findElement(constanciaCuentaCancelada).getText();
            assertEquals(cuentaACancelarObtenidoPaso2,cuentaCanceladaObtenidoConstancia);

            String importeDeDocumentoObtenidoConstancia= driver.findElement(constanciaImporteDeDocumento).getText();
            assertEquals(importeDeDocumentoObtenidoPaso2,importeDeDocumentoObtenidoConstancia);

            String interesPositivoObtenidoConstancia= driver.findElement(constanciaInteresCalculadoAlaTasaVigentePositivo).getText();
            assertEquals(interesPositivoObtenidoPaso2,interesPositivoObtenidoConstancia);

            String interesAntesDePlazoObtenidoConstancia= driver.findElement(constanciaInteresPorCancelacionAntesDePlazo).getText();
            assertEquals(interesXcancelacionAntesDePlazoObtenidoPaso2,interesAntesDePlazoObtenidoConstancia);

            String interesNegativoObtenidoConstancia= driver.findElement(constanciaInteresCalculadoAlaTasaVigenteNegativo).getText();
            assertEquals(interesNegativoObtenidoPaso2,interesNegativoObtenidoConstancia);

            String montoCancelacionObtenidoConstancia= driver.findElement(constanciaMontoDeCancelacion).getText();
            assertEquals(montoDeCancelacionObtenidoPaso2,montoCancelacionObtenidoConstancia);

            String itfObtenidoConstancia= driver.findElement(constanciaITF).getText();
            assertEquals(itfobtenidoPaso2,itfObtenidoConstancia);

            //Datos del Abono
            String cuentaDestinoObtenidoConstancia= driver.findElement(constanciaCuentaDestino).getText();
            assertEquals(cuentaDestinoObtenidoPaso2, cuentaDestinoObtenidoConstancia);

            //Validación de existencia de campos correspondientes a operación multimoneda
            String constanciaetiquetatipocambio= driver.findElement(constanciaEtiquetaTipoCambio).getText();

            if (constanciaetiquetatipocambio.contains("Tipo de cambio")){
                String constanciatipoCambio= driver.findElement(constanciaTipoDeCambio).getText();
                if(constanciatipoCambio !=null && constanciatipoCambio !="S/ 0.00"  && constanciatipoCambio.contains(monedaSoles) ){
                    assertEquals(tipoDeCambioObtenidoPaso2,constanciatipoCambio);

                    String montoEquivalenteObtenidoConstancia = driver.findElement(constanciaMontoEquivalente).getText();
                    assertEquals(montoEquivalenteObtenidoPaso2, montoEquivalenteObtenidoConstancia );

                    //Monto a transferir
                    String montoTransferidoMultimonedaObtenidoConstancia= driver.findElement(constanciaMontoTransferidoMultimoneda).getText();
                    assertEquals(montoAtransferirmultimonedaObtenidoPaso2, montoTransferidoMultimonedaObtenidoConstancia);

                }else {
                    System.out.println("ERROR " + constanciatipoCambio);
                }

            } else {
                String montoTransferidoObtenidoConstancia= driver.findElement(constanciaMontoTransferido).getText();
                assertEquals(montoAtransferirObtenidoPaso2,montoTransferidoObtenidoConstancia);
            }

        }else { //es una operación de cancelación sin fondo
            String numeroReferenciaObtenido_Constancia= driver.findElement(numeroReferencia_Paso3).getText();
            assertEquals(numeroReferenciaObtenidoPaso3,numeroReferenciaObtenido_Constancia);

            String numeroOperacionObtenido_Constancia= driver.findElement(numeroOperacion_Paso3).getText();
            assertEquals(numeroOperacionObtenidoPaso3,numeroOperacionObtenido_Constancia);

            String fechaPresentacionObtenido_Constancia= driver.findElement(fechaPresentacion_Paso3).getText();
            assertEquals(fechaDePresentacionObtenidoPaso3,fechaPresentacionObtenido_Constancia);

            String cuentaCanceladaObtenido_Constancia= driver.findElement(cuentaCanceladaEnceroPaso3).getText();
            assertEquals(cuentaCanceladaEnCeroObtenidoPaso3,cuentaCanceladaObtenido_Constancia);
        }
    }

    public void cancelarCuentaPlazoFijoconEnCero(){
        //Paso2
        //Cuenta a cancelar
        cuentaACancelarObtenido_Paso2= driver.findElement(cuentaAcancelarEnceroPaso2).getText();
        String parte1CuentaAcancelar= cuentaACancelarObtenido_Paso2.substring(7,10);
        String parte2CuentaAcancelar = cuentaACancelarObtenido_Paso2.substring(11,13);
        String parte3CuentaAcancelar = cuentaACancelarObtenido_Paso2.substring(14,21);
        String cuentaACancelarEsperadaPaso2 = parte1CuentaAcancelar+"-"+parte2CuentaAcancelar+"-"+parte3CuentaAcancelar;
        assertEquals(cuentaSeleccionadaPaso1, cuentaACancelarEsperadaPaso2);
        System.out.println("Cuenta a cancelar ok en paso 2");

        completarPaso2De3();

        //Paso 3
        numeroReferenciaObtenidoPaso3 = driver.findElement(numeroReferencia_Paso3).getText();
        assertNotNull(numeroReferenciaObtenidoPaso3);

        numeroOperacionObtenidoPaso3 = driver.findElement(numeroOperacion_Paso3).getText();
        assertNotNull(numeroOperacionObtenidoPaso3);

        fechaDePresentacionObtenidoPaso3 = driver.findElement(fechaPresentacion_Paso3).getText();
        assertNotNull(fechaDePresentacionObtenidoPaso3);

        //Cuenta a cancelar
        cuentaCanceladaEnCeroObtenidoPaso3= driver.findElement(cuentaCanceladaEnceroPaso3).getText();
        assertEquals(cuentaACancelarObtenido_Paso2, cuentaCanceladaEnCeroObtenidoPaso3);
        System.out.println("Cuenta a cancelar ok en paso 3");
    }

}
