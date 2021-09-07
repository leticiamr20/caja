package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Utilities;

import static org.junit.Assert.*;

public class creditoGrarantiaDePlazoFijo {

    public WebDriver driver;
    Utilities utilities = new Utilities();

    public creditoGrarantiaDePlazoFijo(WebDriver driver){this.driver= driver; }

    private final By tituloFormulario= By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/h5");
    private final By seccionOperaciones = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[1]");
    private final By seccionCreditos = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[2]");
    private final By seccionGarantiaPF = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[3]");
    private final By botonNext = By.xpath("//*[@id='botonNext']");
    private final By pantallaSelección= By.xpath("//*[@id='ctn-creditos']/p");
    private final By tituloPaso= By.xpath("//*[@id='subTitulo']");

    private final By plazoFijoMontoDisponiblePaso1 = By.id("plazo-fijo-select");
    private final By monedaPaso1 = By.id("moneda-select");
    private final By montoPrestamoPaso1 = By.xpath("//*[@id='monto-prestamo']");
    private final By tasaEfectivaAnualPaso1 = By.xpath("//*[@id='tasa-efectiva-anual']");
    private final By tasaInteresCompensatorioPaso1 = By.xpath("//*[@id='ctn-creditos3']/div[2]/span");
    private final By tasaInteresMoratorioPaso1 = By.xpath("//*[@id='ctn-creditos3']/div[3]/span");
    private final By planDePagosPaso1 = By.xpath("//*[@id='ctn-creditos3']/div[4]/span");
    private final By modalidadDePagoPaso1 = By.xpath("//*[@id='ctn-creditos4']/div[1]/span");
    private final By libreAmortizacionPaso1 = By.id("amortizacion-select");
    private final By cuotasPaso1 = By.xpath("//*[@id='selectedOp']/div/span");
    private final By periodoPaso1 = By.id("plazo-select");
    private final By nroCuotasPaso1 = By.xpath("//*[@id='plazoFijoNroCuotas']");
    private final By primerDíaDePagoPaso1 = By.xpath("//*[@id='datePlazoFijo']");
    private final By cuentaDeAbonoPaso1 = By.id("cuenta-abono-select");
    private final By emailPaso1 = By.xpath("//*[@id='email']");
    private final By checkBoxMarcarTodosPaso1 = By.xpath("//*[@id='chkSeleccionLabel']");
    private final By botonSiguientePaso1 = By.xpath("//*[@id='botonNext']");

    String requiere;

    //variables
    String plazoFijoMontoDisponible_paso1;
    String moneda_paso1;
    String montoPrestamo_paso1;
    String tasaEfectivaAnual_paso1;
    String tasaInteresCompensatorio_paso1;
    String tasaInteresMoratorio_paso1;
    String planDePagos_paso1;
    String modalidadDePago_paso1;
    String libreAmortizacion_paso1;
    String cuotas_paso1;
    String nroCuotas_paso1;
    String periodo_paso1;
    String primerPago_paso1;
    String cuentaDeAbono_paso1;
    String email_paso1;

    private final By plazoFijoMontoDisponiblePaso2 = By.xpath("//*[@id='ctn-creditos']/div[1]/p");
    private final By monedaPaso2 = By.xpath("//*[@id='ctn-creditos']/div[2]/p");
    private final By montoPrestamoPaso2 = By.xpath("//*[@id='ctn-creditos']/div[3]/span");
    private final By tasaEfectivaAnualPaso2 = By.xpath("//*[@id='ctn-creditos']/div[4]/p");
    private final By tasaDeCostoEfectivoAnualPaso2= By.xpath("//*[@id='ctn-creditos']/div[1]/p[2]");
    private final By tasaInteresCompensatorioPaso2 = By.xpath("//*[@id='ctn-creditos']/div[2]/p[2]");
    private final By tasaInteresMoratorioPaso2 = By.xpath("//*[@id='ctn-creditos']/div[3]/p[2]");
    private final By planDePagosPaso2 = By.xpath("//*[@id='ctn-creditos']/div[4]/p[2]");
    private final By modalidadDePagoPaso2 = By.xpath("//*[@id='ctn-creditos']/div[1]/p");
    private final By itfPaso2 = By.xpath("//*[@id='ctn-creditos']/div[2]/span");
    private final By libreAmortizacionPaso2 = By.xpath("//*[@id='ctn-creditos']/div[3]/p");
    private final By cuotasPaso2 = By.xpath("//*[@id='ctn-creditos']/span[1]/div/p");
    private final By nroCuotasPaso2 = By.xpath("//*[@id='ctn-creditos'][3]/span[2]/div/p");
    private final By primerDíaDePagoPaso2 = By.xpath("//*[@id='ctn-creditos'][4]/div/p");
    private final By periodoPaso2 = By.xpath("//*[@id='ctn-creditos'][4]/div[1]/p");
    private final By cuentaDeAbonoPaso2 = By.xpath("//*[@id='ctn-creditos']/div[2]/p");
    private final By desgravamenPaso2 = By.xpath("//*[@id='ctn-creditos']/div[3]/p");
    private final By emailPaso2 = By.xpath("//*[@id='ctn-creditos']/div[4]/span");

    private final By datosDeTrabajo = By.xpath("//div[@id='ctn-creditos'][5]/div/p");
    private final By giroPaso2 = By.xpath("//*[@id='select2-activity-select-container']");
    private final By añoVigenciaPaso2 = By.xpath("//*[@id='ctn-creditos'][5]/div[2]/P");
    private final By antiguedadLaboralEnMesesPaso2 = By.xpath("//*[@id='antiguedad-laboral-meses']");
    private final By ingresosPaso2 = By.xpath("//*[@id='ingresos-garantia-plazo']");
    private final By gastosPaso2 = By.xpath("//*[@id='gastos-garantia-plazo']");
    private final By disponiblePaso2 = By.xpath("//*[@id='disponible-garantia']");
    private final By checkboxDeclaracionJuradaPaso2 = By.xpath("//*[@id='chkSeleccionLabel']");
    private final By botonConfirmarPaso2 = By.xpath("//*[@id='botonNext']");

    //Variables
    String tasaDeCostoEfectivoAnual_paso2;
    String itf_paso2;
    String desgravamen_paso2;
    String giro_paso2; //param
    String añoVigencia_paso2;
    String antiguedadLaboralEnMeses_paso2; //param
    String ingresos_paso2; //param
    String gastos_paso2; //param
    String disponible_Paso2; //param


    private final By numeroDeReferenciaPaso3 = By.xpath("//*[@id='operacion']/div[3]/div[1]/p[2]");
    private final By numeroDeOperacionPaso3 = By.xpath("//*[@id='operacion']/div[3]/div[2]/p[2]");
    private final By fechaDePresentacionPaso3 = By.xpath("//*[@id='operacion']/div[3]/div[3]/span[1]");
    private final By horaDePresentacionPaso3 = By.xpath("//*[@id='operacion']/div[3]/div[3]/span[3]");
    private final By numeroPagarePaso3 = By.xpath("//*[@id='operacion']/div[3]/div[4]/p[2]");
    private final By plazoFijoMontoDisponiblePaso3 = By.xpath("//*[@id='operacion']/div[7]/div[1]/p[2]");
    private final By monedaPaso3 = By.xpath("//*[@id='frmEnvio']/div/div[7]/div[2]/p[2]");
    private final By montoPrestamoPaso3 = By.xpath("//*[@id='operacion']/div[7]/div[3]/span");
    private final By tasaEfectivaAnualPaso3 = By.xpath("//*[@id='operacion']/div[7]/div[4]/p[2]");
    private final By tasaDeCostoEfectivoAnualPaso3= By.xpath("//*[@id='operacion']/div[8]/div[1]/p[2]");
    private final By tasaInteresCompensatorioPaso3 = By.xpath("//*[@id='operacion']/div[8]/div[2]/p[2]");
    private final By tasaInteresMoratorioPaso3 = By.xpath("//*[@id='operacion']/div[8]/div[3]/p[2]");
    private final By planDePagosPaso3 = By.xpath("//*[@id='operacion']/div[8]/div[4]/p[2]");
    private final By modalidadDePagoPaso3 = By.xpath("//*[@id='operacion']/div[9]/div[1]/p[2]");
    private final By itfPaso3 = By.xpath("//*[@id='operacion']/div[9]/div[2]/span");
    private final By libreAmortizacionPaso3 = By.xpath("//form[@id='frmEnvio']/div/div[9]/div[3]/p[2]"); //*[@id="operacion"]/div[9]/div[3]/p[2]
    private final By cuotasPaso3 = By.xpath("//*[@id='operacion']/div[9]/span[1]/div/p[2]");
    private final By periodoPaso3 = By.xpath("//*[@id='operacion']/div[10]/p");
    private final By montoTotalPaso3 = By.xpath("//*[@id='operacion']/div[11]/span");
    private final By vencimientoPaso3 = By.xpath("//*[@id='operacion']/div[12]/span");
    private final By cuentaDeAbonoPaso3 = By.xpath("//*[@id='operacion']/div[13]/p[2]");
    private final By desgravamenPaso3 = By.xpath("//*[@id='operacion']/div[14]/p[2]");
    private final By gastosPaso3 = By.xpath("//*[@id='operacion']/div[15]/span");
    private final By emailPaso3 = By.xpath("//*[@id='email']");
    private final By requiereDatosDeTrabajoPaso3 = By.xpath("//*[@id='operacion']/div[20]/p");

    private final By giroPaso3 = By.id("//*[@id='operacion']/div[20]/div[1]/p[2]");
    private final By añoVigenciaPaso3 = By.xpath("//*[@id='operacion']/div[20]/div[2]/p[2]");
    private final By antiguedadLaboralEnMesesPaso3 = By.xpath("//*[@id='operacion']/div[21]/p[2]");
    private final By ingresosPaso3 = By.xpath("//*[@id='ingresoss']");
    private final By gastosDatosPaso3 = By.xpath("//*[@id='gastoss']");
    private final By disponiblePaso3 = By.xpath("//*[@id='disponiblee']");

    //variables
    String numeroDeReferencia_paso3;
    String numeroDeOperacion_paso3;
    String fechaDePresentacion_paso3;
    String horaDePresentacion_paso3;
    String numeroPagare_paso3;
    String plazoFijoMontoDisponible_paso3;
    String moneda_paso3;
    String montoPrestamo_paso3;
    String tasaEfectivaAnual_paso3;
    String tasaDeCostoEfectivoAnual_paso3;
    String tasaInteresCompensatorio_paso3;
    String tasaInteresMoratorio_paso3;
    String planDePagos_paso3;
    String modalidadDePago_paso3;
    String itf_paso3;
    String libreAmortizacion_paso3;
    String cuotas_paso3;
    String periodo_paso3;
    String montoTotal_paso3;
    String vencimiento_paso3;
    String cuentaDeAbono_paso3;
    String desgravamen_paso3;
    String gastos_paso3;
    String email_paso3;
    String requiereDatosDeTrabajo_paso3;

    String giro_paso3;
    String añoVigencia_paso3;
    String antiguedadLaboralEnMeses_paso3;
    String ingresos_paso3;
    String gastosDatos_paso3;
    String disponible_paso3;

    private final By numeroReferenciaConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[1]/td[1]/span[2]");
    private final By numeroOperacionConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[1]/td[2]/span[2]");
    private final By fechaDePresentacionConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[1]/td[3]/span[2]");
    private final By horaDePresentacionConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[1]/td[3]/span[4]");
    private final By nroDePagareConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[2]/td/span[2]");
    private final By garantiaDPFConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[1]/span[2]");
    private final By monedaConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[2]/span[2]");
    private final By montoPrestamoConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[3]/span[3]");
    private final By tasaEfectivaAnualConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td[1]/span[2]");
    private final By tasaDeCostoEfectivoAnualConstancia =  By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td[2]/span[2]");
    private final By tasaDeInteresCompensatorioConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td[3]/span[2]");
    private final By tasaDeInteresMoratorioConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[3]/td[1]/span[2]");
    private final By planDePagosConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[3]/td[2]/span[2]");
    private final By modalidadDePagoConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[3]/td[3]/span[2]");
    private final By itfConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[4]/td[1]/span[2]");
    private final By libreAmortizacionConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[4]/td[2]/span[2]");
    private final By nroCuotasConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[4]/td[3]/span[2]");
    private final By primerDiaDePagoConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[5]/td[1]/span[2]");
    private final By montoTotalConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[5]/td[2]/span[3]");
    private final By vencimientoConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[5]/td[3]/span[2]");
    private final By cuentaAbonoConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[6]/td[1]/span[2]");
    private final By seguroDesgravamenConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[6]/td[2]/span[2]");
    private final By gastosConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[6]/td[3]/span[2]");
    private final By emailConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[7]/td/span[2]");
    private final By requiereDatosDeTrabajoConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr/td/span[2]");
    private final By enviarConstancia = By.xpath("//*[@id='j_idt158']");


    public void paso1(String plazoFijo_montoDisponible,String moneda_Paso1, String monto_prestamo,String libre_amortizacion,
                      String periodo_dias,String cuenta_abono,String email_Paso1, String nroCuotas, String primerPago){
        primerPago_paso1 = primerPago;

        WebDriverWait wait = new WebDriverWait(driver,6);
        wait.until(ExpectedConditions.elementToBeClickable(tituloFormulario));

        String validartituloFormularioPaso1= driver.findElement(tituloFormulario).getText();
        String tituloFormularioEsperadoPaso1=("Crédito con Garantía de Plazo Fijo");
        assertEquals(tituloFormularioEsperadoPaso1, validartituloFormularioPaso1);
        System.out.println("Titulo Formulario ok");

        String validarSeccionOperaciones= driver.findElement(seccionOperaciones).getText();
        String seccionOperacionesEsperado=("OPERACIONES");
        assertEquals(seccionOperacionesEsperado, validarSeccionOperaciones);
        System.out.println("Sección operaciones ok");

        String validarCreditos= driver.findElement(seccionCreditos).getText();
        String seccionCreditos=("CRÉDITOS");
        assertEquals(seccionCreditos, validarCreditos);
        System.out.println("Sección crédito ok");

        String validarSeccionGarantiaDePF= driver.findElement(seccionGarantiaPF).getText();
        String seccionGarantiaDePFEsperado=("GARANTÍA DE PLAZO FIJO");
        assertEquals(seccionGarantiaDePFEsperado, validarSeccionGarantiaDePF);
        System.out.println("Sección garantía de plazo fijo ok");

        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="DATOS DEL CRÉDITO\n" +
                "(PASO 1 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 1 ok");

        Select plazoFijo = new Select(driver.findElement(plazoFijoMontoDisponiblePaso1));
        plazoFijo.selectByValue(plazoFijo_montoDisponible);
        plazoFijoMontoDisponible_paso1 = plazoFijo_montoDisponible;

        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Select moneda = new Select(driver.findElement(monedaPaso1));
        moneda.selectByValue(moneda_Paso1);
        moneda_paso1 = moneda_Paso1;

        WebElement monto =  driver.findElement(montoPrestamoPaso1);
        monto.sendKeys(monto_prestamo);
        montoPrestamo_paso1 = monto_prestamo;

        tasaEfectivaAnual_paso1 = driver.findElement(tasaEfectivaAnualPaso1).getText();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tasaInteresCompensatorio_paso1 = driver.findElement(tasaInteresCompensatorioPaso1).getText();
        tasaInteresMoratorio_paso1 = driver.findElement(tasaInteresMoratorioPaso1).getText();
        planDePagos_paso1 = driver.findElement(planDePagosPaso1).getText();
        modalidadDePago_paso1 = driver.findElement(modalidadDePagoPaso1).getText();

        Select libreamortizacion = new Select (driver.findElement(libreAmortizacionPaso1));
        libreamortizacion.selectByValue(libre_amortizacion);
        libreAmortizacion_paso1 = libre_amortizacion;

        if (libreAmortizacion_paso1.contains("1")){ //Si
            WebDriverWait waitCuota = new WebDriverWait(driver,5);
            waitCuota.until(ExpectedConditions.elementToBeClickable(cuotasPaso1));

            cuotas_paso1 = driver.findElement(cuotasPaso1).getText();

            Select periodo= new Select(driver.findElement(periodoPaso1));
            periodo.selectByValue(periodo_dias);
            periodo_paso1= periodo_dias;

        } else {//No
            int diaPago = Integer.parseInt(primerPago) ;
            WebDriverWait waitCuota = new WebDriverWait(driver,5);
            waitCuota.until(ExpectedConditions.elementToBeClickable(nroCuotasPaso1));

            WebElement nroCuotaspaso1= driver.findElement(nroCuotasPaso1);
            nroCuotaspaso1.sendKeys(nroCuotas);
            nroCuotas_paso1 = nroCuotas;

            WebElement primerpago = driver.findElement(primerDíaDePagoPaso1);
            primerpago.click();

            Actions moverACalendario = new Actions(driver);
            WebElement fecha_actual = driver.findElement(By.xpath("//html/body/div[5]/div[1]/table/tbody//tr[last()]")); ///html/body/div[5]/div[1]/table/tbody/tr//td[@class= 'day  active today']
            moverACalendario.moveToElement(fecha_actual).build().perform();

            String fechaActual = driver.findElement(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr//td[@class= 'day  active today']" +
                    "//following-sibling::td[1]")).getText();

            if(fechaActual.contains("1")){

                WebElement mesSiguiente = driver.findElement(By.xpath("/html/body/div[5]/div[@class='datepicker-days']/table/thead/tr[1]/th[3]"));
                mesSiguiente.click();

                WebElement dia = driver.findElement(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr/td[@class= 'day  '][contains(text(),'"+diaPago+"')]"));
                moverACalendario.moveToElement(dia).build().perform();
                dia.click();

            } else {
                WebElement dia = driver.findElement(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr/td[@class= 'day  '][contains(text(),'"+diaPago+"')]"));
                moverACalendario.moveToElement(dia).build().perform();
                dia.click();
            }
        }

        Select cuentaAbono = new Select(driver.findElement(cuentaDeAbonoPaso1));
        cuentaAbono.selectByValue(cuenta_abono);
        cuentaDeAbono_paso1 = cuenta_abono;

        WebElement email= driver.findElement(emailPaso1);
        email.sendKeys(email_Paso1);
        email_paso1 = email_Paso1;

        Actions moverAbotonSiguiente = new Actions(driver);
        WebElement botonSiguiente = driver.findElement(botonSiguientePaso1);
        moverAbotonSiguiente.moveToElement(botonSiguiente).build().perform();

        WebElement checkMarcarTodos = driver.findElement(checkBoxMarcarTodosPaso1);
        checkMarcarTodos.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        botonSiguiente.click();
    }

    public void paso2(String giro, String antiguedadLaboralMeses, String ingresos, String gastos){

        giro_paso2 = giro;
        antiguedadLaboralEnMeses_paso2 = antiguedadLaboralMeses;
        ingresos_paso2 = ingresos;
        gastos_paso2 = gastos;

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="CONFIRMAR CRÉDITO - CLAVE\n" +
                "(PASO 2 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 2 ok");

        String plazoFijoMontoDisponible_paso2 = driver.findElement(plazoFijoMontoDisponiblePaso2).getText();
        assertEquals(plazoFijoMontoDisponible_paso1,plazoFijoMontoDisponible_paso2);

        String moneda_paso2 = driver.findElement(monedaPaso2).getText();

        if (moneda_paso1.contains("604")){
            assertEquals( "SOLES",moneda_paso2);

            String montoPrestamo_paso2 = driver.findElement(montoPrestamoPaso2).getText();
            assertEquals("S/ " + montoPrestamo_paso1+".00",montoPrestamo_paso2);

        } else {
            assertEquals("DÓLARES",moneda_paso2);
            String montoPrestamo_paso2 = driver.findElement(montoPrestamoPaso2).getText();
            assertEquals("US$ " + montoPrestamo_paso1+".00",montoPrestamo_paso2);
        }

        String tasaEfectivaAnual_paso2 =  driver.findElement(tasaEfectivaAnualPaso2).getText();
        assertNotNull(tasaEfectivaAnual_paso2);

        tasaDeCostoEfectivoAnual_paso2 = driver.findElement(tasaDeCostoEfectivoAnualPaso2).getText();
        assertNotNull(tasaDeCostoEfectivoAnual_paso2);

        String tasaInteresCompensatorio_paso2 = driver.findElement(tasaInteresCompensatorioPaso2).getText();
        assertNotNull(tasaInteresCompensatorio_paso2);

        String tasaInteresMoratorio_paso2=  driver.findElement(tasaInteresMoratorioPaso2).getText();
        assertNotNull(tasaInteresMoratorio_paso2);

        String planDePagos_paso2 = driver.findElement(planDePagosPaso2).getText();
        assertNotNull(planDePagos_paso2);

        String modalidadDePago_paso2= driver.findElement(modalidadDePagoPaso2).getText();
        assertNotNull(modalidadDePago_paso2);

        itf_paso2= driver.findElement(itfPaso2).getText();
        assertNotNull(itf_paso2);

        if (libreAmortizacion_paso1.contains("1")){ //Si
            WebDriverWait waitCuota = new WebDriverWait(driver,5);
            waitCuota.until(ExpectedConditions.presenceOfElementLocated(cuotasPaso2));

            cuotas_paso1 = driver.findElement(cuotasPaso2).getText();

            String periodo_paso2 = driver.findElement(periodoPaso2).getText();
            assertEquals(periodo_paso1, periodo_paso2);

        }else {
            String libreAmortizacion_paso2 = driver.findElement(libreAmortizacionPaso2).getText();
            assertNotNull(libreAmortizacion_paso2);

            String cuotaspaso2 = driver.findElement(nroCuotasPaso2).getText();
            assertEquals(nroCuotas_paso1,cuotaspaso2);

            String primerpago = driver.findElement(primerDíaDePagoPaso2).getText();
            assertNotNull(primerpago.contains(primerPago_paso1));
        }

        String cuentaDeAbono_paso2 = driver.findElement(cuentaDeAbonoPaso2).getText();
        assertNotNull(cuentaDeAbono_paso2);

        desgravamen_paso2= driver.findElement(desgravamenPaso2).getText();

        String email_paso2= driver.findElement(emailPaso2).getText();
        assertNotNull(email_paso2);

        Actions moverAbotonConfirmar = new Actions(driver);
        WebElement boton_confirmar= driver.findElement(botonConfirmarPaso2);
        moverAbotonConfirmar.moveToElement(boton_confirmar).build().perform();

        WebDriverWait wait = new WebDriverWait(driver,6);
        wait.until(ExpectedConditions.visibilityOfElementLocated(datosDeTrabajo));

        String datos_trabajo = driver.findElement(datosDeTrabajo).getText();
        requiere = datos_trabajo;

        utilities.ingresarclavede6();
        boton_confirmar.click();

    }
    public void paso3(){
        WebDriverWait wait = new WebDriverWait(driver,6);
        wait.until(ExpectedConditions.elementToBeClickable(tituloPaso));

        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="IMPRIMIR Y/O ENVIAR CONSTANCIA\n" +
                "(PASO 3 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 3 ok");

        numeroDeReferencia_paso3 = driver.findElement(numeroDeReferenciaPaso3).getText();
        assertNotNull(numeroDeReferencia_paso3);

        numeroDeOperacion_paso3 = driver.findElement(numeroDeOperacionPaso3).getText();
        assertNotNull(numeroDeOperacion_paso3);

        fechaDePresentacion_paso3 = driver.findElement(fechaDePresentacionPaso3).getText();
        assertNotNull(fechaDePresentacion_paso3);

        horaDePresentacion_paso3 = driver.findElement(horaDePresentacionPaso3).getText();
        assertNotNull(horaDePresentacion_paso3);

        numeroPagare_paso3 = driver.findElement(numeroPagarePaso3).getText();
        assertNotNull(numeroPagare_paso3);

        plazoFijoMontoDisponible_paso3 = driver.findElement(plazoFijoMontoDisponiblePaso3).getText();
        assertEquals(plazoFijoMontoDisponible_paso1,plazoFijoMontoDisponible_paso1);

        String monedapaso3= driver.findElement(monedaPaso3).getText();
        moneda_paso3 = monedapaso3;

        if (moneda_paso1.contains("604")){
            assertEquals( "SOLES",moneda_paso3);

            montoPrestamo_paso3 = driver.findElement(montoPrestamoPaso3).getText();
            assertEquals("S/ " +montoPrestamo_paso1+".00",montoPrestamo_paso3);

        } else {
            assertEquals("DÓLARES",moneda_paso3);

            montoPrestamo_paso3 = driver.findElement(montoPrestamoPaso3).getText();
            assertEquals("US$ " +montoPrestamo_paso1+".00",montoPrestamo_paso3);
        }

        tasaEfectivaAnual_paso3 = driver.findElement(tasaEfectivaAnualPaso3).getText();
        assertNotNull(tasaEfectivaAnual_paso3);

        tasaDeCostoEfectivoAnual_paso3 = driver.findElement(tasaDeCostoEfectivoAnualPaso3).getText();
        assertNotNull(tasaDeCostoEfectivoAnual_paso3);

        tasaInteresCompensatorio_paso3 = driver.findElement(tasaInteresCompensatorioPaso3).getText();
        assertNotNull(tasaInteresCompensatorio_paso3);

        tasaInteresMoratorio_paso3 = driver.findElement(tasaInteresMoratorioPaso3).getText();
        assertNotNull(tasaInteresMoratorio_paso3);

        planDePagos_paso3 = driver.findElement(planDePagosPaso3).getText();
        assertEquals(planDePagos_paso1,planDePagos_paso3);

        modalidadDePago_paso3 = driver.findElement(modalidadDePagoPaso3).getText();
        if (modalidadDePago_paso1.contains("DIA FIJO MENS") && libreAmortizacion_paso1.contains("0")){
            assertEquals("DIA FIJO MES",modalidadDePago_paso3);
        } else if (modalidadDePago_paso1.contains("DIA FIJO MENS") && libreAmortizacion_paso1.contains("1")){
            assertEquals("FRECUENCIA FIJA",modalidadDePago_paso3);
        }

        itf_paso3 = driver.findElement(itfPaso3).getText();
        assertEquals(itf_paso2,itf_paso3);

        if (libreAmortizacion_paso1.contains("1")){ //Si
            libreAmortizacion_paso3 = driver.findElement(libreAmortizacionPaso3).getText();
            assertEquals("SÍ",libreAmortizacion_paso3);

            cuotas_paso3 = driver.findElement(cuotasPaso3).getText();
            assertEquals(cuotas_paso1,cuotas_paso3);

            periodo_paso3 = driver.findElement(periodoPaso3).getText();
            assertEquals(periodo_paso1,periodo_paso3);

        } else if (libreAmortizacion_paso1.contains("0")){ //No
            libreAmortizacion_paso3 = driver.findElement(libreAmortizacionPaso3).getText();
            assertEquals("NO",libreAmortizacion_paso3);
        }

        montoTotal_paso3 = driver.findElement(montoTotalPaso3).getText();
        assertNotNull(montoTotal_paso3);

        vencimiento_paso3 = driver.findElement(vencimientoPaso3).getText();
        assertNotNull(vencimiento_paso3);

        cuentaDeAbono_paso3 = driver.findElement(cuentaDeAbonoPaso3).getText();
        assertEquals(cuentaDeAbono_paso1,cuentaDeAbono_paso3);

        desgravamen_paso3 = driver.findElement(desgravamenPaso3).getText();
        assertNotNull(desgravamen_paso3);

        gastos_paso3 = driver.findElement(gastosPaso3).getText();
        assertNotNull(gastos_paso3);

        email_paso3 = driver.findElement(emailPaso3).getText();
        assertEquals(email_paso1,email_paso3);

        String requiereDatosLaborales = driver.findElement(requiereDatosDeTrabajoPaso3).getText();
        requiereDatosDeTrabajo_paso3 = requiereDatosLaborales;
        assertEquals("NO",requiereDatosDeTrabajo_paso3);

    }
    public void validarDatosDeEnvio(){
        WebElement EnviarConstancia = driver.findElement(enviarConstancia);
        EnviarConstancia.click();

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='enviarDEU01']/div/div/div[1]/h5")));

        String tituloModalEnvioDeConstancia= driver.findElement(By.xpath("//*[@id='enviarDEU01']/div/div/div[1]/h5")).getText();
        assertEquals("ENVÍO DE CONSTANCIA", tituloModalEnvioDeConstancia);

        String SubtituloModalEnvioDeConstancia= driver.findElement(By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[1]/span")).getText();
        assertEquals("Constancia de Desembolso con Garantía de Plazo fijo", SubtituloModalEnvioDeConstancia);

        String numeroDeReferencia_constancia = driver.findElement(numeroReferenciaConstancia).getText();
        assertEquals(numeroDeReferencia_paso3,numeroDeReferencia_constancia);

        String numeroOperacion_constancia = driver.findElement(numeroOperacionConstancia).getText();
        assertEquals(numeroDeOperacion_paso3,numeroOperacion_constancia);

        String fechaDePresentacion_constancia = driver.findElement(fechaDePresentacionConstancia).getText();
        assertEquals(fechaDePresentacion_paso3,fechaDePresentacion_constancia);

        String horaDePresentacion_constancia = driver.findElement(horaDePresentacionConstancia).getText();
        assertEquals(horaDePresentacion_paso3,horaDePresentacion_constancia);

        String nroDePagare_constancia = driver.findElement(nroDePagareConstancia).getText();
        assertEquals(numeroPagare_paso3,nroDePagare_constancia);

        String garantiaDPF_constancia = driver.findElement(garantiaDPFConstancia).getText();
        assertEquals(plazoFijoMontoDisponible_paso1,garantiaDPF_constancia);

        String moneda_constancia= driver.findElement(monedaConstancia).getText();
        assertEquals(moneda_paso3,moneda_constancia);

        if (moneda_paso1.equals("604")){
            assertEquals( "SOLES",moneda_constancia);

            String montoPrestamo_Constancia = driver.findElement(montoPrestamoConstancia).getText();
            assertEquals("S/ " +montoPrestamo_paso1+".00","S/ " +montoPrestamo_Constancia);

            String itf_constancia = driver.findElement(itfConstancia).getText();
            assertEquals(itf_paso3,"S/ " +itf_constancia);

            String montoTotal_constancia = driver.findElement(montoTotalConstancia).getText();
            assertEquals(montoTotal_paso3,"S/ " +montoTotal_constancia);

        } else {
            assertEquals("DÓLARES",moneda_constancia);

            String montoPrestamo_Constancia = driver.findElement(montoPrestamoConstancia).getText();
            assertEquals("US$ " +montoPrestamo_paso1+".00","US$ " +montoPrestamo_Constancia);

            String itf_constancia = driver.findElement(itfConstancia).getText();
            assertEquals(itf_paso3,"US$ " +itf_constancia);

            String montoTotal_constancia = driver.findElement(montoTotalConstancia).getText();
            assertEquals(montoTotal_paso3,"US$ " +montoTotal_constancia);
        }

        String tasaEfectivaAnual_constancia = driver.findElement(tasaEfectivaAnualConstancia).getText();
        assertEquals(tasaEfectivaAnual_paso3,tasaEfectivaAnual_constancia);

        String tasaDeCostoEfectivoAnual_constancia = driver.findElement(tasaDeCostoEfectivoAnualConstancia).getText();
        assertEquals(tasaDeCostoEfectivoAnual_paso3,tasaDeCostoEfectivoAnual_constancia);

        String tasaDeInteresCompensatorio_constancia = driver.findElement(tasaDeInteresCompensatorioConstancia).getText();
        assertEquals(tasaInteresCompensatorio_paso3,tasaDeInteresCompensatorio_constancia);

        String tasaDeInteresMoratorio_constancia = driver.findElement(tasaDeInteresMoratorioConstancia).getText();
        assertEquals(tasaInteresMoratorio_paso3,tasaDeInteresMoratorio_constancia);

        String planDePagos_constancia = driver.findElement(planDePagosConstancia).getText();
        assertEquals(planDePagos_paso3,planDePagos_constancia);

        String modalidadDePago_constancia = driver.findElement(modalidadDePagoConstancia).getText();
        if (modalidadDePago_paso1.contains("DIA FIJO MENS") && libreAmortizacion_paso1.contains("0")){
            assertEquals("DIA FIJO MES",modalidadDePago_constancia);
        } else if (modalidadDePago_paso1.contains("DIA FIJO MENS") && libreAmortizacion_paso1.contains("1")){
            assertEquals("FRECUENCIA FIJA",modalidadDePago_constancia);
        }

        if (libreAmortizacion_paso1.contains("1")){ //Si
            String libreAmortizacion_constancia = driver.findElement(libreAmortizacionConstancia).getText();
            assertEquals("SÍ",libreAmortizacion_constancia);

            String nroCuotas_constancia = driver.findElement(nroCuotasConstancia).getText();
            assertEquals(cuotas_paso3,nroCuotas_constancia);

        } else if (libreAmortizacion_paso1.contains("0")){ //No
            String libreAmortizacion_constancia = driver.findElement(libreAmortizacionConstancia).getText();
            assertEquals("NO",libreAmortizacion_constancia);
        }

        String vencimiento_constancia = driver.findElement(vencimientoConstancia).getText();
        assertEquals(vencimiento_paso3,vencimiento_constancia);

        String cuentaAbono_constancia = driver.findElement(cuentaAbonoConstancia).getText();
        assertEquals(cuentaDeAbono_paso3,cuentaAbono_constancia);

        String seguroDesgravamen_constancia = driver.findElement(seguroDesgravamenConstancia).getText();
        assertEquals(desgravamen_paso3,seguroDesgravamen_constancia);

        String email_constancia = driver.findElement(emailConstancia).getText();
        assertEquals(email_paso3,email_constancia);

        String requiereDatosLaborales_constancia= driver.findElement(requiereDatosDeTrabajoConstancia).getText();
        assertEquals("No",requiereDatosLaborales_constancia);





    }


}
