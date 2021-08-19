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

public class transferencias{

    public WebDriver driver;

    public transferencias (WebDriver driver){
        this.driver= driver;
    }

    private By menuOperaciones = By.xpath("//form[@id='j_idt72']//div[@class='menu-groups']//a[contains(text(),'OPERACIONES')]");
    private By subMenuTransferencias = By.xpath("//form[@id='j_idt72']//div[@id='menuWebIbk']//a[contains(text(),'Transferencias')]");
    private By EntreCuentasPropias = By.xpath("//form[@id='j_idt72']//div[@id='menuWebIbk']//a[contains(text(),'Transferencias')]//following-sibling::ul//a[contains(text(),'Entre cuentas propias')]");
    private By tituloFormulario= By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/h5/div");
    private By seccionOperaciones = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[1]");
    private By seccionTransferencias = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[2]");
    private By seccionEntreCuentasPropias= By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[3]");
    private By tituloPaso1= By.xpath("//*[@id='operacion']/div/div[1]/div[2]");
    private By tituloPaso2= By.xpath("//*[@id='subTitulo']");
    private By tituloPaso3= By.xpath("");

    //locators Paso 1
    private By cuentaOrigenPaso1=By.xpath("//*[@id='cuenta-origen']");
    private By cuentaDestinoPaso1= By.xpath("//*[@id='cuenta-destino']");
    private By glosa = By.xpath("//*[@id='glosa']");
    private By montoTransferencia= By.xpath("//*[@id='monto']");
    private By siguientePaso1= By.xpath("//*[@id='operacion']/div/div[3]/div[3]/input");

    //Locators Paso 2
    private By cuentaOrigenPaso2 = By.xpath("//*[@id='ctn-creditos']/div[1]/p[2]");
    private By montoAtransferirPaso2 = By.xpath("//*[@id='ctn-creditos']/div[2]/span");
    private By cuentaDestinoPaso2 = By.xpath("//*[@id='ctn-creditos']/div[4]/p[2]");
    private By glosaPaso2 = By.xpath("//*[@id='glosa']");
    //multimoneda
    private By cuentaDestino_Paso2 = By.xpath("//*[@id='ctn-creditos']/div[4]/p[2]");
    private By glosa_Paso2 = By.xpath("//*[@id='glosa']");
    private By tipoDeCambio_Paso2 = By.xpath("//*[@id='ctn-creditos']/div[6]/span");
    private By montoEquivalente_Paso2 = By.xpath("//*[@id='ctn-creditos']/div[3]/span");

    private By etiquetatipoCambio= By.xpath("//*[@id='ctn-creditos']/div[3]/p");
    private By etiquetaTipoDeCambio= By.xpath("//*[@id='ctn-creditos']/div[6]/span");
    private By botonConfirmarPaso2 = By.xpath("//*[@id='operacion']/div/div[5]/div[5]/a");



    //Locatos Paso 3
    private By tipoOperacionPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[1]/p[2]");
    private By numeroDeReferenciaPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[2]/p[2]");
    private By numeroDeOperacionPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[3]/p[2]");
    private By fechaDePresentacionPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[4]/p[2]");


    private By cuentaOrigenPaso3 = By.xpath("//*[@id='ctn-creditos']/div/div[5]/p[2]");
    private By montoAtransferirPaso3 = By.xpath("//*[@id='ctn-creditos']/div/div[6]/p[2]");
    private By cuentaDestinoPaso3 = By.xpath("//*[@id='ctn-creditos']/div/div[7]/p[2]");
    private By glosaPaso3 = By.xpath("//*[@id='glosa']");
    //multimoneda
    private By montoEquivalentePaso3 = By.xpath("//*[@id='ctn-creditos']/div/div[8]/p[2]");
    private By glosa_Paso3 = By.xpath("//*[@id='glosa']");
    private By tipoDeCambio_Paso3 = By.xpath("//*[@id='ctn-creditos']/div/div[9]/p[2]");

    //Locartors
    private By constancia_tipoOperacion = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[1]/td[1]/span[2]");
    private By constancia_numeroReferencia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[1]/td[2]/span[2]");
    private By constancia_numeroDeOperacion= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[1]/td[3]/span[2]");
    private By constancia_fechaDePresentacion= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[2]/td[1]/span[2]");
    private By Constacncia_horadePresentacion= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[2]/td[1]/span[3]");
    private By constancia_cuentaOrigen= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[2]/td[2]/span[2]");
    private By constancia_montoAtransferir = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[2]/td[3]/span[2]");
    private By constancia_cuentaDestino = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[3]/td[1]/span[2]");
    private By constancia_montoEquivalente= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[3]/td[2]/span[2]");
    private By constancia_tipoDeCambio= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[3]/td[3]/span[2]");
    private By constancia_glosa= By.xpath("//*[@id='glosaModal']");
    private By constancia_etiqueta=By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[3]/td[2]/span[1]");

    private By emailPara = By.xpath("//*[@id='txtEmailPara']");
    private By emailasunto = By.xpath("//*[@id='txtEmailAsunto']");

    private String cuentaOrigenSeleccionadaPaso1;
    private String cuentaDestinoSeleccionadaPaso1;
    private String montoATransferirPaso1;
    private String glosaIngresadaPaso1;

    private String cuentaOrigenObtenidoPaso2;
    private String montoAtransferirObtenidoPaso2;
    private String cuentaDestinoObtenidoPaso2;
    private String glosaObtenidaPaso2;
    private String montoEquivalenteObtenidoPaso2;
    private String tipoDeCambioObtenidoPaso2;

    private String tipoOperacionObtenidoPaso3;
    private String numeroDeReferenciaObtenidoPaso3;
    private String numeroDeOperacionObtenidoPaso3;
    private String fechaDePresentacionObtenidoPaso3;
    private String horaDePresentacionObtenidoPaso3;
    private String cuentaOrigenObtenidoPaso3;
    private String montoAtransferirObtenidoPaso3;
    private String cuentaDestinoObtenidoPaso3;
    private String glosaObtenidoPaso3;
    private String montoEquivalenteObtenidoPaso3;
    private String tipoDeCambioObtenidoPaso3;

    private String montoAtransferirObtenido_Paso2;

    String monedaSoles= "S/";
    String monedaDolares= "US$";

    Utilities utilities = new Utilities();

    public void ingresarAMenuTransferenciasEntreCuentasPropias(){
        Actions Paso1 = new Actions(driver);
        WebElement seleccionarMenuOperaciones = driver.findElement(menuOperaciones);
        Paso1 .moveToElement(seleccionarMenuOperaciones).build().perform();

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(subMenuTransferencias));

        Actions Paso2 = new Actions(driver);
        WebElement seleccionarSubMenuTransferencias = driver.findElement(subMenuTransferencias);
        Paso2.moveToElement(seleccionarSubMenuTransferencias).perform();

        WebDriverWait wait1 = new WebDriverWait(driver,6000);
        wait1.until(ExpectedConditions.elementToBeClickable(EntreCuentasPropias));

        Actions Paso3 = new Actions(driver);
        WebElement seleccionarEntreCuentasPropias = driver.findElement(EntreCuentasPropias);
        Paso3.moveToElement(seleccionarEntreCuentasPropias).perform();
        seleccionarEntreCuentasPropias.click();
    }
    public void validarCaracterisicasDeFormularioCargadoPaso1() {

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(tituloFormulario));

        String validartituloFormularioPaso1= driver.findElement(tituloFormulario).getText();
        String tituloFormularioEsperadoPaso1=("Transferencia entre cuentas propias");
        assertEquals(tituloFormularioEsperadoPaso1, validartituloFormularioPaso1);
        System.out.println("Titulo Formulario ok");

        String validarSeccionOperaciones= driver.findElement(seccionOperaciones).getText();
        String seccionOperacionesEsperado=("OPERACIONES");
        assertEquals(seccionOperacionesEsperado, validarSeccionOperaciones);
        System.out.println("Sección operaciones ok");

        String validarSeccionTransferencias= driver.findElement(seccionTransferencias).getText();
        String seccionTransferenciasEsperado=("TRANSFERENCIAS");
        assertEquals(seccionTransferenciasEsperado, validarSeccionTransferencias);
        System.out.println("Sección transferencias ok");

        String validarSeccionEntreCuentasPropias= driver.findElement(seccionEntreCuentasPropias).getText();
        String seccionEntreCuentasPropiasEsperado="ENTRE CUENTAS PROPIAS";
        assertEquals(seccionEntreCuentasPropiasEsperado, validarSeccionEntreCuentasPropias);
        System.out.println("Sección entre cuentas propias ok");

        String validarTituloFormulario= driver.findElement(tituloPaso1).getText();
        String seccionTituloFormularioEsperado="SELECCIÓN DE CUENTA ORIGEN Y DESTINO\n" +
                "(PASO 1 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 1 ok");

    }
    public void Paso1(String transferenciaCuentaOrigen, String cuenta_destino, String monto, String campoGlosa){

        cuentaOrigenSeleccionadaPaso1= transferenciaCuentaOrigen;
        cuentaDestinoSeleccionadaPaso1= cuenta_destino;
        montoATransferirPaso1 = monto;
        glosaIngresadaPaso1 = campoGlosa;

        //seleccionar cuenta origen
        Select seleccionarCuentaOrigen = new Select(driver.findElement(cuentaOrigenPaso1));
        seleccionarCuentaOrigen.selectByValue(transferenciaCuentaOrigen);

        //seleccionar cuenta destino
        Select seleccionarCuentaDestino = new Select(driver.findElement(cuentaDestinoPaso1));
        seleccionarCuentaDestino.selectByValue(cuenta_destino);

        //ingresar monto
        WebElement ingresarMontoAtransferir = driver.findElement(glosa);
        ingresarMontoAtransferir.sendKeys(campoGlosa);

        //ingresar glosa
        WebElement ingresarGlosa = driver.findElement(montoTransferencia);
        ingresarGlosa.sendKeys(monto);

        //clic botón siguiente
        WebElement clicBotonSiguientePaso1= driver.findElement(siguientePaso1);
        clicBotonSiguientePaso1.click();
    }
    public void validarCaracterisicasDeFormularioCargadoPaso2(){
        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(tituloPaso2));

        String validarTituloPaso2= driver.findElement(tituloPaso2).getText();
        String tituloPaso2Esperado="CONFIRMAR TRANSFERENCIA - CLAVE\n" +
                "(PASO 2 DE 3)";
        assertEquals(tituloPaso2Esperado, validarTituloPaso2);
        System.out.println("Titulo paso 2 ok");
    }
    public void validarDataPaso2(){
        String validarCuentaOrigenPaso2= driver.findElement(cuentaOrigenPaso2).getText();
        cuentaOrigenObtenidoPaso2= validarCuentaOrigenPaso2;
        String cuentaOrigenObtenido_Paso2= validarCuentaOrigenPaso2.substring(7,21);
        assertEquals(cuentaOrigenSeleccionadaPaso1, cuentaOrigenObtenido_Paso2);
        System.out.println("Cuenta a cancelar ok en paso 2");

        String etiquetatipocambioPaso2= driver.findElement(etiquetatipoCambio).getText();
        String tipoDeCambioPaso2= driver.findElement(tipoDeCambio_Paso2).getText();

        if(etiquetatipocambioPaso2.contains("Monto equivalente")){
            if(tipoDeCambioPaso2 !=null && tipoDeCambioPaso2 !="S/ 0.00"  && tipoDeCambioPaso2.contains(monedaSoles) ){
                montoAtransferirObtenidoPaso2= driver.findElement(montoAtransferirPaso2).getText();
                String[] montoAtransferirObtenido_Paso2= montoAtransferirObtenidoPaso2.split(" ");
                String moneda = montoAtransferirObtenido_Paso2[0];
                String monto= montoAtransferirObtenido_Paso2[1];

                if (montoAtransferirObtenidoPaso2.contains(monto)){
                    System.out.println("monto a transferir ok");
                }else {
                    System.out.println("monto a transferir nok - FAIL");
                }

                montoEquivalenteObtenidoPaso2= driver.findElement(montoEquivalente_Paso2).getText();

                cuentaDestinoObtenidoPaso2= driver.findElement(cuentaDestino_Paso2).getText();
                String cuentaDestinoObtenido_Paso2= cuentaDestinoObtenidoPaso2.substring(7,21);
                assertEquals(cuentaDestinoSeleccionadaPaso1,cuentaDestinoObtenido_Paso2);

                tipoDeCambioObtenidoPaso2= tipoDeCambioPaso2;

                glosaObtenidaPaso2= driver.findElement(glosa_Paso2).getText();
                assertEquals(glosaIngresadaPaso1,glosaObtenidaPaso2);

                System.out.println("Validación exitosa de operación multimoneda Paso 2");

            }

        }else {
            montoAtransferirObtenidoPaso2= driver.findElement(montoAtransferirPaso2).getText();
            if (montoAtransferirObtenidoPaso2.contains(montoATransferirPaso1) && montoAtransferirObtenidoPaso2.contains("US$")){
                montoAtransferirObtenido_Paso2= montoAtransferirObtenidoPaso2.substring(4);
            }else{
                montoAtransferirObtenido_Paso2= montoAtransferirObtenidoPaso2.substring(3);
            }
            cuentaDestinoObtenidoPaso2= driver.findElement(cuentaDestinoPaso2).getText();
            String cuentaDestinoObtenido_Paso2= cuentaDestinoObtenidoPaso2.substring(7,21);
            assertEquals(cuentaDestinoSeleccionadaPaso1,cuentaDestinoObtenido_Paso2);

            glosaObtenidaPaso2=driver.findElement(glosaPaso2).getText();
            assertEquals(glosaIngresadaPaso1,glosaObtenidaPaso2);

            System.out.println("Validación exitosa de operación Paso 2");
        }

    }
    public void Paso2(){
        //Completamos información

        Actions action = new Actions(driver);
        WebElement moverAbotonConfirmar = driver.findElement(By.xpath("//*[@id='operacion']/div/div[5]/div[5]/a"));
        action.moveToElement(moverAbotonConfirmar).build().perform();

        //ingresar clave de 6
        utilities.ingresarclavede6();

        WebElement clicBotonConfirmarPaso2= driver.findElement(botonConfirmarPaso2);
        clicBotonConfirmarPaso2.click();
    }
    public void Paso3(){
        String etiqueta= driver.findElement(By.xpath("//*[@id='ctn-creditos']/div/div[8]/p[1]")).getText();
        if(etiqueta.contains("Glosa")){
            tipoOperacionObtenidoPaso3= driver.findElement(tipoOperacionPaso3).getText();
            assertNotNull(tipoOperacionObtenidoPaso3);

            numeroDeReferenciaObtenidoPaso3= driver.findElement(numeroDeReferenciaPaso3).getText();
            assertNotNull(numeroDeReferenciaObtenidoPaso3);

            numeroDeOperacionObtenidoPaso3 = driver.findElement(numeroDeOperacionPaso3).getText();
            assertNotNull(numeroDeOperacionObtenidoPaso3);

            String fechaDePresentacion_obtenidoPaso3= driver.findElement(fechaDePresentacionPaso3).getText();
            String []fechaHora = fechaDePresentacion_obtenidoPaso3.split(" ");
            fechaDePresentacionObtenidoPaso3=fechaHora[0];
            horaDePresentacionObtenidoPaso3= fechaHora[1];
            System.out.println(fechaDePresentacionObtenidoPaso3);
            System.out.println(horaDePresentacionObtenidoPaso3);

            assertNotNull(fechaDePresentacion_obtenidoPaso3);

            cuentaOrigenObtenidoPaso3= driver.findElement(cuentaOrigenPaso3).getText();
            assertEquals(cuentaOrigenObtenidoPaso2,cuentaOrigenObtenidoPaso3);

            montoAtransferirObtenidoPaso3= driver.findElement(montoAtransferirPaso3).getText();
            assertEquals(montoAtransferirObtenidoPaso2,montoAtransferirObtenidoPaso3);

            cuentaDestinoObtenidoPaso3= driver.findElement(cuentaDestinoPaso3).getText();
            assertEquals(cuentaDestinoObtenidoPaso2,cuentaDestinoObtenidoPaso3);

            glosaObtenidoPaso3= driver.findElement(glosaPaso3).getText();
            assertEquals(glosaObtenidaPaso2,glosaObtenidoPaso3);

            System.out.println("Validaciçon exitosa de operación unimoneda Paso 3");


        }else {

            tipoOperacionObtenidoPaso3 = driver.findElement(tipoOperacionPaso3).getText();
            assertNotNull(tipoOperacionObtenidoPaso3);

            numeroDeReferenciaObtenidoPaso3 = driver.findElement(numeroDeReferenciaPaso3).getText();
            assertNotNull(numeroDeReferenciaObtenidoPaso3);

            numeroDeOperacionObtenidoPaso3= driver.findElement(numeroDeOperacionPaso3).getText();
            assertNotNull(numeroDeOperacionObtenidoPaso3);

            String fechaDePresentacion_obtenidoPaso3= driver.findElement(fechaDePresentacionPaso3).getText();
            String []fechaHora = fechaDePresentacion_obtenidoPaso3.split(" ");
            fechaDePresentacionObtenidoPaso3=fechaHora[0];
            horaDePresentacionObtenidoPaso3= fechaHora[1];

            assertNotNull(fechaDePresentacion_obtenidoPaso3);

            cuentaOrigenObtenidoPaso3= driver.findElement(cuentaOrigenPaso3).getText();
            assertEquals(cuentaOrigenObtenidoPaso2,cuentaOrigenObtenidoPaso3);

            montoAtransferirObtenidoPaso3= driver.findElement(montoAtransferirPaso3).getText();
            assertEquals(montoAtransferirObtenidoPaso2,montoAtransferirObtenidoPaso3);

            cuentaDestinoObtenidoPaso3= driver.findElement(cuentaDestinoPaso3).getText();
            assertEquals(cuentaDestinoObtenidoPaso2,cuentaDestinoObtenidoPaso3);

            glosaObtenidoPaso3= driver.findElement(glosa_Paso3).getText();
            assertEquals(glosaObtenidaPaso2,glosaObtenidoPaso3);

            montoEquivalenteObtenidoPaso3= driver.findElement(montoEquivalentePaso3).getText();
            assertEquals(montoEquivalenteObtenidoPaso2,montoEquivalenteObtenidoPaso3);

            tipoDeCambioObtenidoPaso3= driver.findElement(tipoDeCambio_Paso3).getText();
            assertEquals(tipoDeCambioObtenidoPaso2,tipoDeCambioObtenidoPaso3);
            System.out.println("Validaciçon exitosa de operación multimoneda Paso 3");

        }

    }
    public void validarDatosConstancia(){
        WebElement botonEnviarConstancia= driver.findElement(By.xpath("//*[@id='j_idt158']"));
        botonEnviarConstancia.click();

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(constancia_tipoOperacion));

        String  constancia_etiquetaTipoCambio= driver.findElement(constancia_etiqueta).getText();

        if (constancia_etiquetaTipoCambio.contains("Monto equivalente")){
            String constanciatipoOperacion= driver.findElement(constancia_tipoOperacion).getText();
            assertEquals(tipoOperacionObtenidoPaso3,constanciatipoOperacion);

            String constanciaNumeroReferencia= driver.findElement(constancia_numeroReferencia).getText();
            assertEquals(numeroDeReferenciaObtenidoPaso3,constanciaNumeroReferencia);

            String constanciaNumeroOperacion= driver.findElement(constancia_numeroDeOperacion).getText();
            assertEquals(numeroDeOperacionObtenidoPaso3,constanciaNumeroOperacion);

            String constanciaFechaDePresentacion= driver.findElement(constancia_fechaDePresentacion).getText();
            assertEquals(fechaDePresentacionObtenidoPaso3,constanciaFechaDePresentacion);

            String constanciaHoradePresentacion = driver.findElement(Constacncia_horadePresentacion).getText();
            assertEquals(horaDePresentacionObtenidoPaso3,constanciaHoradePresentacion);

            String constanciaCuentaOrigen = driver.findElement(constancia_cuentaOrigen).getText();
            assertEquals(cuentaOrigenObtenidoPaso2,constanciaCuentaOrigen);

            String constanciaMontoAtransferir = driver.findElement(constancia_montoAtransferir).getText();
            assertEquals(montoAtransferirObtenidoPaso2,constanciaMontoAtransferir);

            String constanciaCuentaDestino = driver.findElement(constancia_cuentaDestino).getText();
            assertEquals(cuentaDestinoObtenidoPaso2,constanciaCuentaDestino);

            String constanciaMontoEquivalente = driver.findElement(constancia_montoEquivalente).getText();
            assertEquals(montoEquivalenteObtenidoPaso2,constanciaMontoEquivalente);

            String constanciaTipoDeCambio = driver.findElement(constancia_tipoDeCambio).getText();
            assertEquals(tipoDeCambioObtenidoPaso2,constanciaTipoDeCambio);

            String constanciaGlosa = driver.findElement(constancia_glosa).getText();
            assertEquals(glosaObtenidaPaso2,constanciaGlosa);

        }else {

            String constanciatipo_Operacion= driver.findElement(constancia_tipoOperacion).getText();
            assertEquals(tipoOperacionObtenidoPaso3,constanciatipo_Operacion);

            String constanciaNumero_Referencia= driver.findElement(constancia_numeroReferencia).getText();
            assertEquals(numeroDeReferenciaObtenidoPaso3,constanciaNumero_Referencia);

            String constanciaNumero_Operacion= driver.findElement(constancia_numeroDeOperacion).getText();
            assertEquals(numeroDeOperacionObtenidoPaso3,constanciaNumero_Operacion);

            String constanciaFecha_Presentacion= driver.findElement(constancia_fechaDePresentacion).getText();
            assertEquals(fechaDePresentacionObtenidoPaso3,constanciaFecha_Presentacion);

            String constanciaHora_Presentacion = driver.findElement(Constacncia_horadePresentacion).getText();
            assertEquals(horaDePresentacionObtenidoPaso3,constanciaHora_Presentacion);

            String constanciaCuenta_Origen = driver.findElement(constancia_cuentaOrigen).getText();
            assertEquals(cuentaOrigenObtenidoPaso2,constanciaCuenta_Origen);

            String constanciaMonto_transferir = driver.findElement(constancia_montoAtransferir).getText();
            assertEquals(montoAtransferirObtenidoPaso3,constanciaMonto_transferir);

            String constanciaCuenta_Destino = driver.findElement(constancia_cuentaDestino).getText();
            assertEquals(cuentaDestinoObtenidoPaso3,constanciaCuenta_Destino);

            String constanciaGlosa_ = driver.findElement(constancia_glosa).getText();
            assertEquals(glosaObtenidoPaso3,constanciaGlosa_);

        }
    }
}
