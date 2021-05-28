package common;

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

public class cancelacionDePlazoFijo {

    public static WebDriver driver;


    public cancelacionDePlazoFijo (WebDriver driver){
        this.driver= driver;
    }
    private By clickMenuOperaciones = By.xpath("//form[@id='j_idt72']//div[@class='menu-groups']//a[contains(text(),'OPERACIONES')]");
    private By seleccionSubMenuPlazoFijo= By.xpath("//*[@id='j_idt74:1:j_idt81:0:j_idt83']");
    private By conAbonoCuentaPropia = By.xpath("//*[@id='j_idt74:1:j_idt81:0:j_idt86:2:j_idt91:0:j_idt93']");

    private By tituloformulario = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/h5");
    private By seccionOperaciones = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[1]");
    private By seccionPlazoFijo = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[2]");
    private By seccionCancelaciondePlazoFijo = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[3]");
    private By seccionConAbonoAcuentaPropia = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[4]");
    private By tituloPaso1 = By.xpath("//*[@id='subTitulo']");
    private By paso1De3 = By.xpath("//*[@id='subTitulo']/div");

    private By cuentaAcancelar = By.xpath("//form[@id='fixed-term-cancellation-ownaccount-form']//div[@id='operacion']//div[@id='ctn-creditos']//select[@id='cuenta-origen']");
    private By cuentaDestino= By.xpath("//form[@id='fixed-term-cancellation-ownaccount-form']//div[@id='operacion']//select[@id='cuenta-destino']");
    private By siguientePaso1 = By.xpath("//*[@id='botonNext']");

    //PASO 2
    //Confirmar cancelacion - clave
    private By cuentaAcancelarPaso2= By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[1]/p");
    private By importeDeDocumentosPaso2 = By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[2]/p");
    private By interesCalculadoAlaTasaVigentePositivoPaso2 = By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[3]/p");
    private By toolTipPaso2= By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[3]/label/i");
    private By interesPorCancelacionAntesDePlazoPaso2= By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[4]/p");
    private By interesCalculadoAlaTasaVigenteNegativoPaso2 = By.xpath("//*[@id='idDatosCancelacionSecondLine']/div[1]/p");
    private By montoDeCancelacionPaso2= By.xpath("//*[@id='idDatosCancelacionSecondLine']/div[2]/p");
    private By ITFPaso2= By.xpath("//*[@id='idDatosCancelacionSecondLine']/div[3]/p");
    //Validación de datos del abono
    private By cuentaDestinoPaso2= By.xpath("//*[@id='idDatosAbonoFirstLine']/div/p");
    private By montoAtransferirPaso2= By.xpath("//*[@id='idDatosAbonoFirstLine']/span/p");
    //Completando información solitada
    private By clavede6 = By.xpath("//*[@id='key-3']");
    private By botonConfirmar = By.xpath("//*[@id='botonNext']");

    //PASO 3
    private By mensajeExitosoPaso3= By.xpath("//*[@id='mensajeTransaccion']/div/p/span[2]");
    private By tituloPaso3 = By.xpath("//*[@id='subTitulo']");
    private By paso3De3 = By.xpath("//*[@id='subTitulo']/span");

    private By numeroReferenciaPaso3= By.xpath("//*[@id='operacion']/div[3]/div[1]/p[2]");
    private By numeroOperacionPaso3 = By.xpath("//*[@id='operacion']/div[3]/div[2]/p[2]");
    private By fechaPresentacionPaso3 = By.xpath("//*[@id='fechapresentacion']");
    //Datos de cancelación
    private By cuentaCanceladaPaso3 = By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[1]/p");
    private By importedocumentoPaso3 = By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[2]/p");
    private By interesCalculadoAlaTasaVigentePositivoPaso3 = By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[3]/p");
    private By interesXcancelacionAntesDePlazoPaso3 = By.xpath("//*[@id='idDatosCancelacionFirstLine']/div[4]/p");
    private By interesCalculadoAlaTasaVigenteNegativoPaso3 = By.xpath("//*[@id='idDatosCancelacionSecondLine']/div[1]/p");
    private By montoCancelacionPaso3 = By.xpath("//*[@id='idDatosCancelacionSecondLine']/div[2]/p");
    private By itfPaso3 = By.xpath("//*[@id='idDatosCancelacionSecondLine']/div[3]/p");
    //Datos del abono
    private By cuentaDestinoPaso3 = By.xpath("//*[@id='idDatosAbonoFirstLine']/div/p");
    private By montotransferidoPaso3 = By.xpath("//*[@id='idDatosAbonoFirstLine']/span/p");

    loginPersonaIBK LoginPersonaIBK = new loginPersonaIBK();
    Utilities  utilities = new Utilities();

    //Datos a validar en el paso 2
    private String cuentaACancelarObtenidoPaso2;
    private String importeDeDocumentoObtenidoPaso2;
    private String interesPositivoObtenidoPaso2;
    private String toolTipObtenidoPaso2;
    private String interesNegativoObtenidoPaso2;
    private String interesXcancelacionAntesDePlazoObtenidoPaso2;
    private String montoDeCancelacionObtenidoPaso2;
    private String itfobtenidoPaso2;
    private String cuentaDestinoObtenidoPaso2;
    private String montoAtransferirObtenidoPaso2;

    private String numeroReferenciaObtenidoPaso3;
    private String numeroOperacionObtenidoPaso3;
    private String fechaDePresentacionObtenidoPaso3;

    String monedaSoles= "S/";
    String monedaDolares= "US$";

    private By modalEnviarConstancia = By.xpath("//*[@id='enviarDEU01']/div/div");
    private By seleccionarEnviarConstancia= By.xpath("//*[@id='j_idt158']");
    private By tituloModalEnviarConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[1]/h5");
    private By subTituloModalEnviarConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[1]/span");
    private By emailPara =  By.xpath("//*[@id='txtEmailPara']");
    private By emailasunto =  By.xpath("//*[@id='txtEmailAsunto']");
    private By constanciaNumeroDeReferencia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr/td[1]/span[2]");

    //form[@id='frmEnvio']//div[@id='enviarDEU01']//div[@class='modal-dialog']//div[@class='modal-content']
    //*[@id="enviarDEU01"]/div/div/div[2]/div[3]/div/table[1]/tbody/tr/td[1]/span[2]
    private By constanciaNumeroDeOperacion = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr/td[2]/span[2]");
    private By constanciaFechaDePresentacion = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr/td[3]/span[2]");
    private By constanciaCuentaCancelada = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[1]/span");
    private By constanciaImporteDeDocumento = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[2]/span[2]");
    private By constanciaInteresCalculadoAlaTasaVigentePositivo = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[3]/span[2]");
    private By constanciaInteresPorCancelacionAntesDePlazo = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td[1]/span[2]");
    private By constanciaInteresCalculadoAlaTasaVigenteNegativo = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td[2]/span[2]");
    private By constanciaMontoDeCancelacion = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td[3]/span[2]");
    private By constanciaITF= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[3]/td/span[2]");
    private By constanciaCuentaDestino= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr/td[1]/span[2]");
    private By constanciaMontoTransferido= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr/td[2]/span");
    private By constanciaBotonEnviar = By.xpath("//*[@id='j_idt293']");



    public void loginusuario1() {
        LoginPersonaIBK.loginPersonaIBK_usuario1();
    }
    public void ingresarACancelacionDePlazoFijoDesdeMenu() {
        WebElement selecionarMenuOperaciones = loginPersonaIBK.driver.findElement(clickMenuOperaciones);
        selecionarMenuOperaciones.click();

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
    public void validarCaracterisicasDeFormularioCargadoPaso1() {
        String validartituloFormularioPaso1= loginPersonaIBK.driver.findElement(tituloformulario).getText();
        String tituloFormularioEsperadoPaso1=("Cancelación de plazo fijo con abono a cuenta propia");
        assertEquals(tituloFormularioEsperadoPaso1, validartituloFormularioPaso1);
        System.out.println("Titulo Formulario ok");

        String validarSeccionOperaciones= loginPersonaIBK.driver.findElement(seccionOperaciones).getText();
        String seccionOperacionesEsperado=("OPERACIONES");
        assertEquals(seccionOperacionesEsperado, validarSeccionOperaciones);
        System.out.println("Sección operaciones ok");

        String validarSeccionPlazoFijo= loginPersonaIBK.driver.findElement(seccionPlazoFijo).getText();
        String seccionPlazoFijoEsperado=("PLAZO FIJO");
        assertEquals(seccionPlazoFijoEsperado, validarSeccionPlazoFijo);
        System.out.println("Sección Plazo Fijo ok");

        String validarSeccionCancelacionDePlazoFijo= loginPersonaIBK.driver.findElement(seccionCancelaciondePlazoFijo).getText();
        String seccionCancelacionDePlazoFijoEsperado="CANCELACIÓN DE PLAZO FIJO";
        assertEquals(seccionCancelacionDePlazoFijoEsperado, validarSeccionCancelacionDePlazoFijo);
        System.out.println("Sección cancelación de Plazo Fijo ok");

        String validarSeccionConAbonoAcuentaPropia= loginPersonaIBK.driver.findElement(seccionConAbonoAcuentaPropia).getText();
        String seccionConAbonoAcuentaPropiaEsperado="CON ABONO A CUENTA PROPIA";
        assertEquals(seccionConAbonoAcuentaPropiaEsperado, validarSeccionConAbonoAcuentaPropia);
        System.out.println("Sección con abono a cuenta propia ok");

        String validarTituloFormulario= loginPersonaIBK.driver.findElement(tituloPaso1).getText();
        String seccionTituloFormularioEsperado="SELECCIÓN DE CUENTA A CANCELAR Y CUENTA DESTINO\n" +
                "(PASO 1 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo formulario ok");

        String validarPaso1= loginPersonaIBK.driver.findElement(paso1De3).getText();
        String seccionPaso1Esperado="(PASO 1 DE 3)";
        assertEquals(seccionPaso1Esperado, validarPaso1);
        System.out.println("Paso 1 ok");

    }
    public void completarPaso1De3ConFondo(String cuenta_a_cancelar, String cuenta_destino) {
        //seleccionar cuenta origen
        Select seleccionarCuentaOrigen = new Select(loginPersonaIBK.driver.findElement(cuentaAcancelar));
        seleccionarCuentaOrigen.selectByValue(cuenta_a_cancelar); //Actualizar en cada ejeución 310019981212

        //seleccionar cuenta destino
        Select seleccionarCuentaDestino = new Select(loginPersonaIBK.driver.findElement(cuentaDestino));
        seleccionarCuentaDestino.selectByValue(cuenta_destino); //No actualizar, esta cuenta es una cuenta destino soles 210010021742

        //Clic botòn siguiente
        WebElement clicBotonSiguientePaso1= loginPersonaIBK.driver.findElement(siguientePaso1);
        clicBotonSiguientePaso1.click();

    }
    public void validarCaracterisicasDeFormularioCargadoPaso2(){
        String validarTituloPaso2= loginPersonaIBK.driver.findElement(tituloPaso1).getText();
        String tituloPaso2Esperado="CONFIRMAR CANCELACIÓN - CLAVE\n" +
                "(PASO 2 DE 3)";
        assertEquals(tituloPaso2Esperado, validarTituloPaso2);
        System.out.println("Sección con abono a cuenta propia ok");

    }
    public void validarDatosDeCancelacionPaso2(){
        //Cuenta a cancelar
        String validarCuentaAcancelarPaso2= loginPersonaIBK.driver.findElement(cuentaAcancelarPaso2).getText();
        cuentaACancelarObtenidoPaso2= validarCuentaAcancelarPaso2;
        String parte1CuentaAcancelar= validarCuentaAcancelarPaso2.substring(7,10);
        String parte2CuentaAcancelar = validarCuentaAcancelarPaso2.substring(11,13);;
        String parte3CuentaAcancelar = validarCuentaAcancelarPaso2.substring(14,21);;
        String cuentaACancelarEsperadaPaso2 = "Cuenta "+parte1CuentaAcancelar+"-"+parte2CuentaAcancelar+"-"+parte3CuentaAcancelar;
        assertEquals(cuentaACancelarEsperadaPaso2, cuentaACancelarObtenidoPaso2);
        System.out.println("Cuenta a cancelar ok en paso 2");

        //Importe de documentos
        String validarImporteDeDocumentoPaso2= loginPersonaIBK.driver.findElement(importeDeDocumentosPaso2).getText();


        if(validarImporteDeDocumentoPaso2.contains(monedaSoles)){
            importeDeDocumentoObtenidoPaso2=validarImporteDeDocumentoPaso2;
            System.out.println("Importe de documento obtenido en paso 2: "+importeDeDocumentoObtenidoPaso2);

        } else if (validarImporteDeDocumentoPaso2.contains(monedaDolares)){
            importeDeDocumentoObtenidoPaso2=validarImporteDeDocumentoPaso2;
            System.out.println("Importe de documento obtenido en paso 2: "+importeDeDocumentoObtenidoPaso2);

        }

        //Interés calculado a la tasa vigente positivo
        String validarInteresCalculadoAlaTasaVigentePositivoPaso2= loginPersonaIBK.driver.findElement(interesCalculadoAlaTasaVigentePositivoPaso2).getText();
        interesPositivoObtenidoPaso2 = validarInteresCalculadoAlaTasaVigentePositivoPaso2;
        assertNotNull(interesPositivoObtenidoPaso2);
        System.out.println("Interés calculado a la tasa vigente(positivo) obtenido en el paso 2: "+ interesPositivoObtenidoPaso2);

        //Tooltip
        String  seleccionarTooltip = loginPersonaIBK.driver.findElement(toolTipPaso2).getAttribute("data-original-title");
        toolTipObtenidoPaso2 = seleccionarTooltip;
        String toolTipEsperadoPaso2= "Interés calculado a la fecha del vencimiento del documento";
        assertEquals(toolTipEsperadoPaso2,toolTipObtenidoPaso2 );

        //Interés por cancelación antes de plazo
        String validarInteresXcancelacionAntesDePlazoPaso2= loginPersonaIBK.driver.findElement(interesPorCancelacionAntesDePlazoPaso2).getText();
        interesXcancelacionAntesDePlazoObtenidoPaso2= validarInteresXcancelacionAntesDePlazoPaso2;
        assertNotNull(interesXcancelacionAntesDePlazoObtenidoPaso2);
        System.out.println("Interés por cancelación antes de plazo no es vacío en el paso 2");

        //Interés calculado a la tasa vigente (Negativo)
        String validarInteresCalculadoAlaTasaVigenteNegativoPaso2= loginPersonaIBK.driver.findElement(interesCalculadoAlaTasaVigenteNegativoPaso2).getText();
        interesNegativoObtenidoPaso2= validarInteresCalculadoAlaTasaVigenteNegativoPaso2;
        assertNotNull(interesNegativoObtenidoPaso2);
        System.out.println("Interés calculado a la tasa vigente (negativo) no es vacío en el paso 2");

        //Monto de cancelación
        String validarMontoCancelacionPaso2= loginPersonaIBK.driver.findElement(montoDeCancelacionPaso2).getText();

        if(validarMontoCancelacionPaso2.contains(monedaSoles)){
            montoDeCancelacionObtenidoPaso2=validarMontoCancelacionPaso2;
            System.out.println("Monto de cancelación obtenido en paso 2: "+montoDeCancelacionObtenidoPaso2);

        } else if (validarMontoCancelacionPaso2.contains(monedaDolares)){
            montoDeCancelacionObtenidoPaso2=validarMontoCancelacionPaso2;
            System.out.println("Monto de cancelación obtenido en paso 2: "+montoDeCancelacionObtenidoPaso2);

        }

        //ITF
        String validarItfPaso2= loginPersonaIBK.driver.findElement(ITFPaso2).getText();
        //itfobtenidoPaso2= validarItfPaso2;
        //String itfEsperadoPaso2= "S/ 0.00";
        //assertEquals(itfEsperadoPaso2, itfobtenidoPaso2);
        //System.out.println("ITF ok en paso 2");

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
        String validarCuentaDestinoPaso2= loginPersonaIBK.driver.findElement(cuentaDestinoPaso2).getText();
        cuentaDestinoObtenidoPaso2= validarCuentaDestinoPaso2;
        String parte1CuentaDestino= validarCuentaDestinoPaso2.substring(7,10);
        String parte2CuentaDestino = validarCuentaDestinoPaso2.substring(11,13);;
        String parte3CuentaDestino = validarCuentaDestinoPaso2.substring(14,21);;
        String cuentaDestinoEsperadaPaso2 = "Cuenta "+parte1CuentaDestino+"-"+parte2CuentaDestino+"-"+parte3CuentaDestino;
        assertEquals(cuentaDestinoEsperadaPaso2, cuentaDestinoObtenidoPaso2);
        System.out.println("Cuenta destino ok en paso 2");

        //Monto a transferir
        String validarMontoaTransferirPaso2= loginPersonaIBK.driver.findElement(montoAtransferirPaso2).getText();

        if(validarMontoaTransferirPaso2.contains(monedaSoles)){
            montoAtransferirObtenidoPaso2= validarMontoaTransferirPaso2;
            System.out.println("Monto a transferir obtenido en paso 2: "+montoAtransferirObtenidoPaso2);
            assertNotNull(itfobtenidoPaso2);

        } else if (validarMontoaTransferirPaso2.contains(monedaDolares)){
            montoAtransferirObtenidoPaso2= validarMontoaTransferirPaso2;
            System.out.println("Monto a transferir obtenido en paso 2: "+montoAtransferirObtenidoPaso2);
            assertNotNull(itfobtenidoPaso2);
        }
    }
    public void completarPaso2De3ConFondo() {

        Actions action = new Actions(loginPersonaIBK.driver);
        WebElement moverAbotonConfirmar = loginPersonaIBK.driver.findElement(By.xpath("//*[@id='generate-password-actual-autorizacion']"));
        action.moveToElement(moverAbotonConfirmar).build().perform();

        //ingresar clave de 6
        utilities.ingresarclavede6();
        //
        WebElement clicBotonConfirmarPaso2= loginPersonaIBK.driver.findElement(botonConfirmar);
        clicBotonConfirmarPaso2.click();

    }
    public void validarDatosDeCancelacionPaso3(){
        //Cuenta cancelada
        String cuentaCanceladaObtenidoPaso3= loginPersonaIBK.driver.findElement(cuentaCanceladaPaso3).getText();
        assertEquals(cuentaACancelarObtenidoPaso2, cuentaCanceladaObtenidoPaso3);
        System.out.println("Cuenta Cancelada en paso 3: " + cuentaCanceladaObtenidoPaso3);

        //Importe de documento
        String importeDeDocumentoObtenidoPaso3= loginPersonaIBK.driver.findElement(importedocumentoPaso3).getText();
        assertEquals(importeDeDocumentoObtenidoPaso2, importeDeDocumentoObtenidoPaso3);
        System.out.println("Importe de documento obtenido en paso 3: " + importeDeDocumentoObtenidoPaso3);

        //Interés calculado a la tasa vigente(positivo)
        String interesCalculadoAlaTasaVigentePositivoObtenidoPaso3= loginPersonaIBK.driver.findElement(interesCalculadoAlaTasaVigentePositivoPaso3).getText();
        assertEquals(interesPositivoObtenidoPaso2, interesCalculadoAlaTasaVigentePositivoObtenidoPaso3);
        System.out.println("Interés calculado a la tasa vigente(positivo) obtenido en paso 3: " + interesCalculadoAlaTasaVigentePositivoObtenidoPaso3);

        //Interés por cancelación antes de plazo
        String interesXcancelacionAntesDePlazoObtenidoPaso3= loginPersonaIBK.driver.findElement(interesXcancelacionAntesDePlazoPaso3).getText();
        assertEquals(interesXcancelacionAntesDePlazoObtenidoPaso2, interesXcancelacionAntesDePlazoObtenidoPaso3);
        System.out.println("Interés por cancelación antes de plazo obtenido en paso 3: " + interesXcancelacionAntesDePlazoObtenidoPaso3);

        //Interés calculado a la tasa vigente(negativo)
        String interesCalculadoAlaTasaVigenteNegativoObtenidoPaso3= loginPersonaIBK.driver.findElement(interesCalculadoAlaTasaVigenteNegativoPaso3).getText();
        assertEquals(interesNegativoObtenidoPaso2, interesCalculadoAlaTasaVigenteNegativoObtenidoPaso3);
        System.out.println("Interés calculado a la tasa vigente(Negativo) obtenido en paso 3: "+interesCalculadoAlaTasaVigenteNegativoObtenidoPaso3);

        //Monto de cancelación
        String montoCancelacionObtenidoPaso3= loginPersonaIBK.driver.findElement(montoCancelacionPaso3).getText();
        assertEquals(montoDeCancelacionObtenidoPaso2, montoCancelacionObtenidoPaso3);
        System.out.println("Monto de cancelación obtenida en paso 3: "+montoCancelacionObtenidoPaso3);

        //ITF
        String ITFobtenidoPaso3= loginPersonaIBK.driver.findElement(itfPaso3).getText();
        assertEquals(itfobtenidoPaso2, ITFobtenidoPaso3);
        System.out.println("ITF obtenida en paso 3: "+ITFobtenidoPaso3);
    }
    public void validarDatosDeDatosDelAbonoPaso3 (){
        //Cuenta destino
        String cuentaDestinoObtenidaPaso3= loginPersonaIBK.driver.findElement(cuentaDestinoPaso3).getText();
        assertEquals(cuentaDestinoObtenidoPaso2, cuentaDestinoObtenidaPaso3);
        System.out.println("Cuenta destino obtenido en paso 3: "+cuentaDestinoObtenidaPaso3);

        //Monto transferido
        String montoTransferidoObtenidaPaso3= loginPersonaIBK.driver.findElement(montotransferidoPaso3).getText();
        assertEquals(montoAtransferirObtenidoPaso2, montoTransferidoObtenidaPaso3);
        System.out.println("Monto transferido obtenido en paso 3: "+montoTransferidoObtenidaPaso3);
    }
    public void validarDatosAdicionalesPaso3De3() {
        //Mensaje exitoso
        String validarMensajeExitoso= loginPersonaIBK.driver.findElement(mensajeExitosoPaso3).getText();
        String mensajeExitosoEsperado="La transacción se ha realizado correctamente";
        assertEquals(mensajeExitosoEsperado, validarMensajeExitoso);
        System.out.println("Mensaje exitoso ok en paso 3");
        //Paso
        String validarPaso3= loginPersonaIBK.driver.findElement(paso3De3).getText();
        String paso3Esperado="(PASO 3 DE 3)";
        assertEquals(paso3Esperado, validarPaso3);
        System.out.println("Paso 3 ok");

        //Validacion de campos
        String validarNumeroReferenciaPaso3= loginPersonaIBK.driver.findElement(numeroReferenciaPaso3).getText();
        numeroReferenciaObtenidoPaso3= validarNumeroReferenciaPaso3;
        assertNotNull(validarNumeroReferenciaPaso3);
        System.out.println(validarNumeroReferenciaPaso3);
        System.out.println("Numero de referencia no es vacio en paso 3");

        //Número de operación
        String validarNumeroOperacionPaso3= loginPersonaIBK.driver.findElement(numeroOperacionPaso3).getText();
        numeroOperacionObtenidoPaso3= validarNumeroOperacionPaso3;
        assertNotNull(validarNumeroOperacionPaso3);
        System.out.println("Numero de operacion no es vacio en paso 3");
        System.out.println(validarNumeroOperacionPaso3);

        //Fecha de presentación
        String validarFechaPresentacionPaso3= loginPersonaIBK.driver.findElement(fechaPresentacionPaso3).getText();
        fechaDePresentacionObtenidoPaso3= validarFechaPresentacionPaso3;
        assertNotNull(validarFechaPresentacionPaso3);
        System.out.println("Fecha no es vacío en paso 3");
        System.out.println(validarFechaPresentacionPaso3);


    }
    public void funcionEnviarConstancia(String correo, String asunto){
        WebElement seleccionarEmailPara= loginPersonaIBK.driver.findElement(emailPara);
        seleccionarEmailPara.sendKeys(correo);

        WebElement seleccionarEmailAsunto= loginPersonaIBK.driver.findElement(emailasunto);
        seleccionarEmailAsunto.sendKeys(asunto);

        WebElement seleccionarBotonEnviar= loginPersonaIBK.driver.findElement(constanciaBotonEnviar);
        seleccionarBotonEnviar.click();
    }
    public void validarDatosDeModalConstancia(){

        WebElement EnviarConstancia = loginPersonaIBK.driver.findElement(seleccionarEnviarConstancia);
        EnviarConstancia.click();

        //Actions action = new Actions(loginPersonaIBK.driver);
        //WebElement moverAModal = loginPersonaIBK.driver.findElement(By.xpath("//form[@id='frmEnvio']//div[@id='enviarDEU01']//div[@class='modal-dialog']//div[@class='modal-content']"));
        //action.moveToElement(moverAModal).build().perform();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String numeroReferenciaConstancia= loginPersonaIBK.driver.findElement(constanciaNumeroDeReferencia).getText();
        String numeroReferenciaObtenidoConstancia= numeroReferenciaConstancia;
        assertEquals(numeroReferenciaObtenidoPaso3,numeroReferenciaObtenidoConstancia);

        String numeroOperacionObtenidoConstancia= loginPersonaIBK.driver.findElement(constanciaNumeroDeOperacion).getText();
        assertEquals(numeroOperacionObtenidoPaso3,numeroOperacionObtenidoConstancia);

        String fechaPresentacionObtenidoConstancia= loginPersonaIBK.driver.findElement(constanciaFechaDePresentacion).getText();
        assertEquals(fechaDePresentacionObtenidoPaso3,fechaPresentacionObtenidoConstancia);

        //Datos de Cancelación
        String cuentaCanceladaObtenidoConstancia= loginPersonaIBK.driver.findElement(constanciaCuentaCancelada).getText();
        assertEquals(cuentaACancelarObtenidoPaso2,cuentaCanceladaObtenidoConstancia);

        String importeDeDocumentoObtenidoConstancia= loginPersonaIBK.driver.findElement(constanciaImporteDeDocumento).getText();
        assertEquals(importeDeDocumentoObtenidoPaso2,importeDeDocumentoObtenidoConstancia);

        String interesPositivoObtenidoConstancia= loginPersonaIBK.driver.findElement(constanciaInteresCalculadoAlaTasaVigentePositivo).getText();
        assertEquals(interesPositivoObtenidoPaso2,interesPositivoObtenidoConstancia);

        String interesAntesDePlazoObtenidoConstancia= loginPersonaIBK.driver.findElement(constanciaInteresPorCancelacionAntesDePlazo).getText();
        assertEquals(interesXcancelacionAntesDePlazoObtenidoPaso2,interesAntesDePlazoObtenidoConstancia);

        String interesNegativoObtenidoConstancia= loginPersonaIBK.driver.findElement(constanciaInteresCalculadoAlaTasaVigenteNegativo).getText();
        assertEquals(interesNegativoObtenidoPaso2,interesNegativoObtenidoConstancia);

        String montoCancelacionObtenidoConstancia= loginPersonaIBK.driver.findElement(constanciaMontoDeCancelacion).getText();
        assertEquals(montoDeCancelacionObtenidoPaso2,montoCancelacionObtenidoConstancia);

        String itfObtenidoConstancia= loginPersonaIBK.driver.findElement(constanciaITF).getText();
        assertEquals(itfobtenidoPaso2,itfObtenidoConstancia);

        //Datos del Abono
        String cuentaDestinoObtenidoConstancia= loginPersonaIBK.driver.findElement(constanciaCuentaDestino).getText();
        assertEquals(cuentaDestinoObtenidoPaso2, cuentaDestinoObtenidoConstancia);

        String montoTransferidoObtenidoConstancia= loginPersonaIBK.driver.findElement(constanciaMontoTransferido).getText();
        assertEquals(montoAtransferirObtenidoPaso2,montoTransferidoObtenidoConstancia);
    }
    public void confirmacionDeEnvioDeConstancia(){


        String tituloConfirmacionObtenido = loginPersonaIBK.driver.findElement(By.xpath("//*[@id='dlgConfirmacion']/div[2]/h2")).getText();
        String tituloConfirmacionEsperado= "CONFIRMACIÓN";
        assertEquals(tituloConfirmacionEsperado,tituloConfirmacionObtenido);

        String mensajeConfirmacionObtenido = loginPersonaIBK.driver.findElement(By.xpath("//*[@id='j_idt128']")).getText();
        String mensajeConfirmacionEsperado= "La constancia fue enviada con éxito";
        assertEquals(mensajeConfirmacionEsperado,mensajeConfirmacionObtenido);

        String botonAceptarObtenido = loginPersonaIBK.driver.findElement(By.xpath("//*[@id='dlgConfirmacion']/div[2]/input")).getAttribute("value");
        String botonAceptarEsperado= "Aceptar";
        assertEquals(botonAceptarEsperado,botonAceptarObtenido);

        WebElement botonAceptar= loginPersonaIBK.driver.findElement(By.xpath("//*[@id='dlgConfirmacion']/div[2]/input"));
        botonAceptar.click();

    }



}

