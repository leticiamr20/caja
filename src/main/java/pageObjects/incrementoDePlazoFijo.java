package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Utilities;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class incrementoDePlazoFijo {

    public WebDriver driver;

    public incrementoDePlazoFijo (WebDriver driver){
        this.driver= driver;
    }
    Utilities utilities = new Utilities();

    private By menuOperaciones = By.xpath("//form[@id='j_idt72']//div[@class='menu-groups']//a[contains(text(),'OPERACIONES')]");
    private By subMenuPlazoFijo = By.xpath("//form[@id='j_idt72']//div[@id='menuWebIbk']//a[contains(text(),'Plazo Fijo')]");
    private By incrementoDePlazoFijo = By.xpath("//form[@id='j_idt72']//div[@id='menuWebIbk']//a[contains(text(),'Plazo Fijo')]//following-sibling::ul//a[contains(text(),'Incremento de plazo fijo')]");
    private By tituloFormulario= By.xpath("//*[@id='operacion']/div[1]/div/h5");
    private By seccionOperaciones = By.xpath("//*[@id='operacion']/div[1]/div/ol/li[1]");
    private By seccionIncrementoDePlazoFijo = By.xpath("//*[@id='operacion']/div[1]/div/ol/li[2]");
    private By botonNext = By.xpath("//*[@id='botonNext']");
    private By pantallaSelección= By.xpath("//*[@id='ctn-creditos']/p");
    private By tituloPaso= By.xpath("//*[@id='subTitulo']");

    //Paso1
    private By cuentaDePlazoFijoPaso1= By.id("cuenta-plazo");
    private By cuentaDeAhorroOrigenPaso1= By.id("cuenta-origen");
    private By incrementoDeCapitalPaso1= By.id("monto");
    private By botonSiguientePaso1=By.xpath("//*[@id='operacion']/div/div[5]/input");
    private By cuentaDePlazoFijoSeleccionado= By.xpath("//*[@id='operacion']/div/div[3]/div[1]/div/button/span[1]");
    private By cuentaDeAhorroOrigenSeleccionado = By.xpath("//*[@id='operacion']/div/div[4]/div[1]/div/button/span[1]");
    //variables
    String saldoEnCuentaPlazoFijo;
    String cadenaTotal;
    //Parametros
    String cuentaPFparam;
    String ctaAhorroOrigenParam;
    String incrementoParam;



    //Paso 2
    private By cuentaDePlazoFijoPaso2 = By.xpath("//*[@id='ctn-creditos']/div[1]/p[2]");
    private By cuentaDeAhorroOrigenPaso2 = By.xpath("//*[@id='ctn-creditos']/div[3]/p[2]");
    private By incrementoDeCapitalPaso2 = By.xpath("//*[@id='ctn-creditos']/div[2]/p[2]");
    private By montoEquivalentePaso2 = By.xpath("//*[@id='ctn-creditos']/div[4]/p[2]");
    private By tipoDeCambioPaso2= By.xpath("//*[@id='ctn-creditos']/div/p[2]/span");
    private By botonConfirmar=  By.xpath("//*[@id='operacion']/div/div[5]/div[5]/a");

    //variables
    String cadenacuentaahorroorigen;
    String montoEquivalente;
    String tipoDeCambio;

    //Paso 3
    private By tipoPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[1]/p[2]");
    private By numeroReferenciaPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[2]/p[2]");
    private By numeroDeOperacionPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[3]/p[2]");
    private By fechaDePresentacionPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[4]/p[2]");
    private By nroDeCuentaPlazoFijoPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[5]/p[2]");
    private By fechaAperturaPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[6]/p[2]");
    private By fechaDeVencimientoPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[7]/p[2]");
    private By plazoPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[8]/p[2]");
    private By tasaDeInteresAnualPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[9]/p[2]");
    private By salMinDeEquilibrioPaso3= By.xpath("//*[@id='ctn-creditos']/div/div[10]/p[2]");

    private By capitalAnteriorPaso3= By.xpath("//*[@id='operacion']/div[5]/div[1]/p[2]");
    private By incrementoDeCapitalPaso3= By.xpath("//*[@id='operacion']/div[5]/div[2]/p[2]");
    private By capitalActualPaso3= By.xpath("//*[@id='operacion']/div[5]/div[3]/p[2]");
    private By interesDisponiblePaso3= By.xpath("//*[@id='operacion']/div[5]/div[4]/p[2]");
    private By interesPagadoPaso3= By.xpath("//*[@id='operacion']/div[6]/div/p[2]");

    private By interesAlVencimientoPaso3= By.xpath("//*[@id='operacion']/div[8]/div[1]/p[2]");
    private By interespordiasPaso3= By.xpath("//*[@id='operacion']/div[8]/div[2]/p[2]");

    private By cuentaDeAhorroOrigenPaso3= By.xpath("//*[@id='operacion']/div[10]/div[1]/p[2]");
    private By montoEquivalentePaso3= By.xpath("//*[@id='operacion']/div[10]/div[2]/p[2]");
    private By tipoDeCambioPaso3= By.xpath("//*[@id='operacion']/div[10]/div[3]/p[2]");

    //variables
    String tipo_paso3;
    String numeroReferencia_paso3;
    String numeroDeOperacion_paso3;
    String fechaDePresentacion_paso3;
    String fechaApertura_paso3;
    String fechaDeVencimiento_paso3;
    String plazo_paso3;
    String tasaDeInteresAnual_paso3;
    String salMinDeEquilibrio_paso3;

    String capitalAnterior_paso3;
    String capitalActual_paso3;
    String interesDisponible_paso3;
    String interesPagado_paso3;

    String interesAlVencimiento_paso3;
    String interespordias_paso3;

    String montoEquivalente_paso3;
    String tipoDeCambio_paso3;

    private By enviarConstancia = By.xpath("//*[@id='j_idt158']");


    private By tipoConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[1]/td[1]/span[2]");
    private By numeroReferenciaConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[1]/td[2]/span[2]");
    private By numeroDeOperacionConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[1]/td[3]/span[2]");
    private By fechaDePresentacionConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[2]/td[1]/span[2]");
    private By horaDePresentacionConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[2]/td[1]/span[3]");
    private By nroDeCuentaPlazoFijoConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[2]/td[2]/span[2]");
    private By fechaAperturaConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[2]/td[3]/span[2]");
    private By fechaDeVencimientoConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[3]/td[1]/span[2]");
    private By plazoConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[3]/td[2]/span[2]");
    private By tasaDeInteresAnualConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[3]/td[3]/span[2]");
    private By salMinDeEquilibrioConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[4]/td/span[2]");

    private By capitalAnteriorConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[1]/span[2]");
    private By incrementoDeCapitalConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[2]/span[2]");
    private By capitalActualConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[3]/span[2]");
    private By interesDisponibleConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td[1]/span[2]");
    private By interesPagadoConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td[2]/span[2]");

    private By interesAlVencimientoConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr/td[1]/span[2]");
    private By interespordiasConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr/td[2]/span[2]");

    private By cuentaDeAhorroOrigenConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[4]/tbody/tr/td[1]/span[2]");
    private By montoEquivalenteConstancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[4]/tbody/tr/td[2]/span[2]");
    private By tipoDeCambioConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[4]/tbody/tr/td[3]/span[2]");




    public void ingresarAincrementoDePlazoFijoDesdeMenu(){
        Actions Paso1 = new Actions(driver);
        WebElement seleccionarMenuOperaciones = driver.findElement(menuOperaciones);
        Paso1 .moveToElement(seleccionarMenuOperaciones).build().perform();

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(subMenuPlazoFijo));

        Actions Paso2 = new Actions(driver);
        WebElement seleccionarSubMenuPlazoFijo = driver.findElement(subMenuPlazoFijo);
        Paso2.moveToElement(seleccionarSubMenuPlazoFijo).perform();

        WebDriverWait wait1 = new WebDriverWait(driver,6000);
        wait1.until(ExpectedConditions.elementToBeClickable(incrementoDePlazoFijo));

        Actions Paso3 = new Actions(driver);
        WebElement seleccionarIncrementoDePlazoFijo = driver.findElement(incrementoDePlazoFijo);
        Paso3.moveToElement(seleccionarIncrementoDePlazoFijo).perform();
        seleccionarIncrementoDePlazoFijo.click();
    }
    public void validarFormularioDeSeleccionOperacion(){

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(tituloFormulario));

        String validartituloFormularioPaso1= driver.findElement(tituloFormulario).getText();
        String tituloFormularioEsperadoPaso1=("Incremento de plazo fijo con cargo en cuenta");
        assertEquals(tituloFormularioEsperadoPaso1, validartituloFormularioPaso1);
        System.out.println("Titulo Formulario ok");

        String validarSeccionOperaciones= driver.findElement(seccionOperaciones).getText();
        String seccionOperacionesEsperado=("OPERACIONES");
        assertEquals(seccionOperacionesEsperado, validarSeccionOperaciones);
        System.out.println("Sección operaciones ok");

        String validarSeccionTransferencias= driver.findElement(seccionIncrementoDePlazoFijo).getText();
        String seccionTransferenciasEsperado=("INCREMENTO DE PLAZO FIJO");
        assertEquals(seccionTransferenciasEsperado, validarSeccionTransferencias);
        System.out.println("Sección incremento ok");

        String validarTituloFormulario= driver.findElement(pantallaSelección).getText();
        String seccionTituloFormularioEsperado="SELECCIONE EL TIPO DE TRANSFERENCIA QUE DESEA REALIZAR";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Pantalla selección ok");

    }
    public void tipoDeOperación(){  //nueva  frecuente

        WebElement botonSiguientePaso1= driver.findElement(botonNext);
        botonSiguientePaso1.click();

    }
    public void paso1(String cuentaPF, String ctaAhorroOrigen, String incremento){

        cuentaPFparam= cuentaPF;
        ctaAhorroOrigenParam = ctaAhorroOrigen;
        incrementoParam = incremento;

        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="SELECCIÓN DE CUENTA ORIGEN Y DESTINO\n" +
                "(PASO 1 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 1 ok");

        //Nro de cuenta plazo fijo
        Select seleccionCtaPF = new Select(driver.findElement(cuentaDePlazoFijoPaso1));
        seleccionCtaPF.selectByValue(cuentaPF);

        //Cuenta de ahorro origen

        Select seleccionCtaAhorroOrigen = new Select(driver.findElement(cuentaDeAhorroOrigenPaso1));
        seleccionCtaAhorroOrigen.selectByValue(ctaAhorroOrigen);

        cadenacuentaahorroorigen= driver.findElement(cuentaDeAhorroOrigenSeleccionado).getText(); //obteniendo cadena de cta ahorro

        //conociendo saldo
        cadenaTotal = driver.findElement(cuentaDePlazoFijoSeleccionado).getText();
        String[] cadena= cadenaTotal.split(" ");
        String saldo = cadena[cadena.length - 1];
        String saldoFinal = saldo.substring(0, saldo.length()-1);
        saldoEnCuentaPlazoFijo= saldoFinal;



        //Incremento de capital
        WebElement incremento_capital= driver.findElement(incrementoDeCapitalPaso1);
        incremento_capital.sendKeys(incremento);

        WebElement botonSiguiente= driver.findElement(botonSiguientePaso1);
        botonSiguiente.click();

    }

    public void paso2(){
        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="CONFIRMAR INCREMENTO - CLAVE\n" +
                "(PASO 2 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 2 ok");

        double incrementoParamDouble= Double.parseDouble(incrementoParam);

        if (cadenaTotal.contains("S/") &&  cadenacuentaahorroorigen.contains("S/")){
            String cuentaDePlazoFijoObtenidoPaso2 = driver.findElement(cuentaDePlazoFijoPaso2).getText();
            assertEquals( cuentaPFparam,cuentaDePlazoFijoObtenidoPaso2);

            String incrementoObtenidoPaso2 = driver.findElement(incrementoDeCapitalPaso2).getText();

            assertNotNull(incrementoObtenidoPaso2.contains("S/ "+ incrementoParamDouble));

            String cuentaDeAhorroOrigenObtenidoPaso2 = driver.findElement(cuentaDeAhorroOrigenPaso2).getText();
            assertEquals(ctaAhorroOrigenParam,cuentaDeAhorroOrigenObtenidoPaso2);

            System.out.println("operacion unimoneda soles en cuenta de PF sin fondo");


        } else if(cadenaTotal.contains("US$") &&  cadenacuentaahorroorigen.contains("US$")){
            String cuentaDePlazoFijoObtenidoPaso2 = driver.findElement(cuentaDePlazoFijoPaso2).getText();
            assertEquals(cuentaPFparam,cuentaDePlazoFijoObtenidoPaso2);

            String incrementoObtenidoPaso2 = driver.findElement(incrementoDeCapitalPaso2).getText();
            assertNotNull(incrementoObtenidoPaso2.contains("S/ "+ incrementoParamDouble));

            String cuentaDeAhorroOrigenObtenidoPaso2 = driver.findElement(cuentaDeAhorroOrigenPaso2).getText();
            assertEquals(ctaAhorroOrigenParam,cuentaDeAhorroOrigenObtenidoPaso2);

            System.out.println("operacion unimoneda dolares en cuenta de PF sin fondo");

        } else if(cadenaTotal.contains("S/")  &&  cadenacuentaahorroorigen.contains("US$")){
            String cuentaDePlazoFijoObtenidoPaso2 = driver.findElement(cuentaDePlazoFijoPaso2).getText();
            assertEquals(cuentaPFparam,cuentaDePlazoFijoObtenidoPaso2);

            String incrementoObtenidoPaso2 = driver.findElement(incrementoDeCapitalPaso2).getText();
            assertNotNull(incrementoObtenidoPaso2.contains("S/ "+ incrementoParamDouble));

            String cuentaDeAhorroOrigenObtenidoPaso2 = driver.findElement(cuentaDeAhorroOrigenPaso2).getText();
            assertEquals(ctaAhorroOrigenParam,cuentaDeAhorroOrigenObtenidoPaso2);

            montoEquivalente= driver.findElement(montoEquivalentePaso2).getText();
            assertNotNull(montoEquivalente);

            tipoDeCambio= driver.findElement(tipoDeCambioPaso2).getText();
            assertNotNull(tipoDeCambio);

            System.out.println("operacion bimoneda dolares - soles en cuenta de PF sin fondo");

        } else if(cadenaTotal.contains("US$") &&  cadenacuentaahorroorigen.contains("S/")){
            String cuentaDePlazoFijoObtenidoPaso2 = driver.findElement(cuentaDePlazoFijoPaso2).getText();
            assertEquals(cuentaPFparam,cuentaDePlazoFijoObtenidoPaso2);

            String incrementoObtenidoPaso2 = driver.findElement(incrementoDeCapitalPaso2).getText();
            assertNotNull(incrementoObtenidoPaso2.contains("S/ "+ incrementoParamDouble));

            String cuentaDeAhorroOrigenObtenidoPaso2 = driver.findElement(cuentaDeAhorroOrigenPaso2).getText();
            assertEquals(ctaAhorroOrigenParam,cuentaDeAhorroOrigenObtenidoPaso2);

            montoEquivalente= driver.findElement(montoEquivalentePaso2).getText();
            assertNotNull(montoEquivalente);

            tipoDeCambio= driver.findElement(tipoDeCambioPaso2).getText();
            assertNotNull(tipoDeCambio);

            System.out.println("operacion bimoneda soles - dolares en cuenta de PF sin fondo");

        }
        Actions action = new Actions(driver);
        WebElement moverAbotonConfirmar = driver.findElement(By.xpath("//*[@id='operacion']/div/div[5]/div[5]/a"));
        action.moveToElement(moverAbotonConfirmar).build().perform();
        utilities.ingresarclavede6();

        WebElement botonconfirmar = driver.findElement(botonConfirmar);
        botonconfirmar.click();

    }
    public void paso3(){
        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="IMPRIMIR Y/O ENVIAR CONSTANCIA\n" +
                "(PASO 3 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 3 ok");

        DecimalFormat incremento = new DecimalFormat("0.00");
        String incrementoFormateado = incremento.format(Double.parseDouble(incrementoParam));

            //Primera seccion
            String tipoObtenidoPaso3 = driver.findElement(tipoPaso3).getText();
            tipo_paso3=tipoObtenidoPaso3;
            assertNotNull(tipoObtenidoPaso3);

            String numeroDeRefrenciaObtenidoPaso3 = driver.findElement(numeroReferenciaPaso3).getText();
            numeroReferencia_paso3 = numeroDeRefrenciaObtenidoPaso3;
            assertNotNull(numeroDeRefrenciaObtenidoPaso3);

            String numeroDeoperacionObtenidoPaso3 = driver.findElement(numeroDeOperacionPaso3).getText();
            numeroDeOperacion_paso3 = numeroDeoperacionObtenidoPaso3;
            assertNotNull(numeroDeoperacionObtenidoPaso3);

            String fechaDePresentacionObtenidoPaso3 = driver.findElement(fechaDePresentacionPaso3).getText();
            fechaDePresentacion_paso3 = fechaDePresentacionObtenidoPaso3.substring(0,10);
            assertNotNull(fechaDePresentacionObtenidoPaso3);

            String nroDeCuentaPlazoFijoObtenidoPaso3 = driver.findElement(nroDeCuentaPlazoFijoPaso3).getText();
            assertEquals(cuentaPFparam,nroDeCuentaPlazoFijoObtenidoPaso3);

            String fechaAperturaObtenidoPaso3 = driver.findElement(fechaAperturaPaso3).getText();
            fechaApertura_paso3 = fechaAperturaObtenidoPaso3;
            assertNotNull(fechaAperturaObtenidoPaso3);

            String fechaDeVencimientoObtenidoPaso3 = driver.findElement(fechaDeVencimientoPaso3).getText();
            fechaDeVencimiento_paso3 = fechaDeVencimientoObtenidoPaso3;
            assertNotNull(fechaDeVencimientoObtenidoPaso3);

            String plazoObtenidoPaso3 = driver.findElement(plazoPaso3).getText();
            plazo_paso3 = plazoObtenidoPaso3;
            assertNotNull(plazoObtenidoPaso3);

            String tasaDeInteresAnualObtenidoPaso3 = driver.findElement(tasaDeInteresAnualPaso3).getText();
            tasaDeInteresAnual_paso3 = tasaDeInteresAnualObtenidoPaso3;
            assertNotNull(tasaDeInteresAnualObtenidoPaso3);

            String salMinDeEquilibrioObtenidoPaso3 = driver.findElement(salMinDeEquilibrioPaso3).getText();
            salMinDeEquilibrio_paso3= salMinDeEquilibrioObtenidoPaso3;
            assertNotNull(salMinDeEquilibrioObtenidoPaso3);

            //Segunda seccion
            String capitalAnteriorObtenidoPaso3 = driver.findElement(capitalAnteriorPaso3).getText();
            String[] capital= capitalAnteriorObtenidoPaso3.split(" ");
            String capitalAnt= capital[capital.length - 1];
            assertEquals(saldoEnCuentaPlazoFijo,capitalAnt);

            String incrementoDeCapitalObtenidoPaso3 = driver.findElement(incrementoDeCapitalPaso3).getText();
            String[] incremento_cap= incrementoDeCapitalObtenidoPaso3.split(" ");
            String incrementoCapital= incremento_cap[incremento_cap.length - 1];
            assertEquals(incrementoFormateado,incrementoCapital);

            String capitalActualpaso3 = driver.findElement(capitalActualPaso3).getText();
            capitalActual_paso3=capitalActualpaso3;
            String[] capital_actual= capitalActualpaso3.split(" ");
            String extraerCapital= capital_actual[capital_actual.length - 1];
            Double capitalActualObtenido= Double.valueOf(extraerCapital);

            Double incrementoPaso1 = Double.valueOf(incrementoCapital);
            Double saldocuentaPF= Double.valueOf(saldoEnCuentaPlazoFijo);

            Double sumaCapital= incrementoPaso1+saldocuentaPF;
            BigDecimal capitalDecimalRedondeado = new BigDecimal(sumaCapital);
            capitalDecimalRedondeado = capitalDecimalRedondeado.setScale(2, RoundingMode.HALF_UP);
            Double capital_esperado= capitalDecimalRedondeado.doubleValue();
            assertEquals(capital_esperado,capitalActualObtenido);

            String interesDisponibleObtenidoPaso3 = driver.findElement(interesDisponiblePaso3).getText();
            interesDisponible_paso3 = interesDisponibleObtenidoPaso3;
            assertNotNull(interesDisponibleObtenidoPaso3);

            String interesPagadoObtenidoPaso3 = driver.findElement(interesPagadoPaso3).getText();
            interesPagado_paso3 = interesPagadoObtenidoPaso3;
            assertNotNull(interesPagadoObtenidoPaso3);

            //Tercera seccion
            String interesAlVencimientoObtenidoPaso3 = driver.findElement(interesAlVencimientoPaso3).getText();
            interesAlVencimiento_paso3 = interesAlVencimientoObtenidoPaso3;
            assertNotNull(interesAlVencimientoObtenidoPaso3);

            String interespordiasObtenidoPaso3 = driver.findElement(interespordiasPaso3).getText();
            interespordias_paso3 = interespordiasObtenidoPaso3;
            assertNotNull(interespordiasObtenidoPaso3);

            //Cuarta seccion
            String cuentaDeAhorroOrigenObtenidoPaso3 = driver.findElement(cuentaDeAhorroOrigenPaso3).getText();
            assertEquals(ctaAhorroOrigenParam,cuentaDeAhorroOrigenObtenidoPaso3);

            if(cadenacuentaahorroorigen.contains("US$") && cadenaTotal.contains("S/")){
                String montoEquivalenteObtenidoPaso3 = driver.findElement(montoEquivalentePaso3).getText();
                montoEquivalente_paso3 = montoEquivalenteObtenidoPaso3;
                assertNotNull(montoEquivalenteObtenidoPaso3);

                String tipoDeCambioObtenidoPaso3 = driver.findElement(tipoDeCambioPaso3).getText();
                tipoDeCambio_paso3 = tipoDeCambioObtenidoPaso3;
                assertNotNull(tipoDeCambioObtenidoPaso3);
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
        assertEquals("Constancia de Incremento de plazo fijo", SubtituloModalEnvioDeConstancia);

        DecimalFormat incremento = new DecimalFormat("0.00");
        String incrementoFormateado = incremento.format(Double.parseDouble(incrementoParam));

        //Primera seccion
        String tipoObtenido_constancia = driver.findElement(tipoConstancia).getText();
        assertEquals(tipo_paso3,tipoObtenido_constancia);

        String numeroDeRefrenciaObtenidotipoObtenido_constancia = driver.findElement(numeroReferenciaConstancia).getText();
        assertEquals(numeroReferencia_paso3,numeroDeRefrenciaObtenidotipoObtenido_constancia);

        String numeroDeoperacionObtenido_constancia = driver.findElement(numeroDeOperacionConstancia).getText();
        assertEquals(numeroDeOperacion_paso3,numeroDeoperacionObtenido_constancia);

        String fechaDePresentacionObtenido_constancia = driver.findElement(fechaDePresentacionConstancia).getText();
        String fechadepresentacion= fechaDePresentacionObtenido_constancia.substring(0,10);
        assertEquals(fechaDePresentacion_paso3,fechadepresentacion);

        String horaDePresentacionObtenido_constancia = driver.findElement(horaDePresentacionConstancia).getText();
        String[] hora= horaDePresentacionObtenido_constancia.split(" ");
        String horaDePresentacionEsperado= hora[hora.length - 1];
        assertEquals(horaDePresentacionEsperado,horaDePresentacionObtenido_constancia);


        String nroDeCuentaPlazoFijoObtenido_constancia = driver.findElement(nroDeCuentaPlazoFijoConstancia).getText();
        assertEquals(cuentaPFparam,nroDeCuentaPlazoFijoObtenido_constancia);

        String fechaAperturaObtenido_constancia = driver.findElement(fechaAperturaConstancia).getText();
        assertEquals(fechaApertura_paso3,fechaAperturaObtenido_constancia);

        String fechaDeVencimientoObtenido_constancia = driver.findElement(fechaDeVencimientoConstancia).getText();
        assertEquals(fechaDeVencimiento_paso3,fechaDeVencimientoObtenido_constancia);

        String plazoObtenidoObtenido_constancia = driver.findElement(plazoConstancia).getText();
        assertEquals(plazo_paso3,plazoObtenidoObtenido_constancia + " días");

        String tasaDeInteresAnualObtenido_constancia = driver.findElement(tasaDeInteresAnualConstancia).getText();
        assertEquals(tasaDeInteresAnual_paso3,tasaDeInteresAnualObtenido_constancia + " %");

        String salMinDeEquilibrioObtenido_constancia = driver.findElement(salMinDeEquilibrioConstancia).getText();
        assertEquals(salMinDeEquilibrio_paso3,salMinDeEquilibrioObtenido_constancia);

        //Segunda seccion
        String capitalAnteriorObtenido_constancia = driver.findElement(capitalAnteriorConstancia).getText();
        String[] capital_ant= capitalAnteriorObtenido_constancia.split(" ");
        String extraerCapitalAnterior= capital_ant[capital_ant.length - 1];
        assertEquals(saldoEnCuentaPlazoFijo,extraerCapitalAnterior);

        String incrementoDeCapitalObtenido_constancia = driver.findElement(incrementoDeCapitalConstancia).getText();
        String[] incrementode_cap= incrementoDeCapitalObtenido_constancia.split(" ");
        String extraerIncremento= incrementode_cap[incrementode_cap.length - 1];
        assertEquals(incrementoFormateado,extraerIncremento);

        String capitalActualObtenido_constancia = driver.findElement(capitalActualConstancia).getText();
        assertEquals(capitalActual_paso3,capitalActualObtenido_constancia);

        String interesDisponibleObtenido_constancia = driver.findElement(interesDisponibleConstancia).getText();
        assertEquals(interesDisponible_paso3,interesDisponibleObtenido_constancia);

        String interesPagadoObtenido_constancia = driver.findElement(interesPagadoConstancia).getText();
        assertEquals(interesPagado_paso3,interesPagadoObtenido_constancia);

        //Tercera seccion
        String interesAlVencimientoObtenido_constancia = driver.findElement(interesAlVencimientoConstancia).getText();
        assertEquals(interesAlVencimiento_paso3,interesAlVencimientoObtenido_constancia);

        String interespordiasObtenido_constancia = driver.findElement(interespordiasConstancia).getText();
        assertEquals(interespordias_paso3,interespordiasObtenido_constancia);

        //Cuarta seccion
        String cuentaDeAhorroOrigenObtenido_constancia = driver.findElement(cuentaDeAhorroOrigenConstancia).getText();
        assertEquals(ctaAhorroOrigenParam,cuentaDeAhorroOrigenObtenido_constancia);

        if(cadenacuentaahorroorigen.contains("US$") && cadenaTotal.contains("S/")){
            String montoEquivalenteObtenido_constancia = driver.findElement(montoEquivalenteConstancia).getText();
            assertEquals(montoEquivalente,montoEquivalenteObtenido_constancia);

            String tipoDeCambioObtenido_constancia = driver.findElement(tipoDeCambioConstancia).getText();
           assertEquals(tipoDeCambio,tipoDeCambioObtenido_constancia);

        }else if(cadenacuentaahorroorigen.contains("S/") && cadenaTotal.contains("US$")){
            String montoEquivalenteObtenido_constancia = driver.findElement(montoEquivalenteConstancia).getText();
            assertEquals(montoEquivalente,montoEquivalenteObtenido_constancia);

            String tipoDeCambioObtenido_constancia = driver.findElement(tipoDeCambioConstancia).getText();
            assertEquals(tipoDeCambio,tipoDeCambioObtenido_constancia);

        }

    }



}
