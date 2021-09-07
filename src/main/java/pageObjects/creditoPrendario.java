package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Utilities;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class creditoPrendario {

    public WebDriver driver;
    Utilities utilities = new Utilities();

    public creditoPrendario(WebDriver driver){this.driver= driver; }


    private final By tituloFormulario= By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/h5");
    private final By seccionOperaciones = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[1]");
    private final By seccionCreditos = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[2]");
    private final By seccionCreditoPrendario = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[3]");
    private final By botonNext = By.xpath("//*[@id='botonNext']");
    private final By tituloPaso= By.xpath("//*[@id='subTitulo']");

    private final By certificadoDeTasacionPaso1= By.id("certificados-select");
    private final By fechaDeEmisionPaso1 = By.xpath("//*[@id='emissionDate']");
    private final By estadoPaso1 = By.xpath("//*[@id='estado']");
    private final By tasaEfectivaAnualPaso1 = By.xpath("//*[@id='tasaefectiva']");
    private final By tasaDeInteresCompensatorioPaso1 = By.xpath("//*[@id='tasainterescompensatorio']");
    private final By tasaDeInteresMoratorioPaso1 = By.xpath("//*[@id='tasainteresmoratorio']");
    private final By añoBasediasPaso1 = By.xpath("//*[@id='anobase']");
    private final By monedaPaso1 = By.xpath("//*[@id='moneda-select']");
    private final By montoDePrestamoPaso1 = By.xpath("//*[@id='montoprestamo']");
    private final By plazoPaso1 = By.id("plazo-select");
    private final By fechaDeVencimientoPaso1 = By.xpath("//*[@id='fechavencimiento']");
    private final By cuentaDeAbonoPaso1 = By.id("cuenta-abono-select");
    private final By emailPaso1 = By.xpath("//*[@id='email']");
    private final By checkMarcarTodosPaso1 = By.xpath("//*[@id='chkSeleccionLabel']");

    String certificadoDeTasacion_paso1;
    String montoDisponible_paso1;
    String fechaDeEmision_paso1;
    String estado_paso1;
    String tasaEfectivaAnual_paso1;
    String tasaDeInteresCompensatorio_paso1;
    String tasaDeInteresMoratorio_paso1;
    String añoBasedias_paso1;
    String moneda_paso1;
    String montoDePrestamo_paso1;
    String plazo_paso1;
    String fechaDeVencimiento_paso1;
    String cuentaDeAbono_paso1;
    String email_paso1;

    private final By certificadoDeTasacionPaso2= By.xpath("//*[@id='certificado']");
    private final By fechaDeEmisionPaso2 = By.xpath("//*[@id='fechaemision']");
    private final By estadoPaso2 = By.xpath("//*[@id='estado']");
    private final By montoDisponiblePaso2 = By.xpath("//*[@id='montodisponible']");
    private final By tasaEfectivaAnualPaso2 = By.xpath("//*[@id='tasaefectivaanual']");
    private final By tasaDeCostoEfectivoAnualPaso2 = By.xpath("//*[@id='tasacostoefectivoanual']");
    private final By tasaDeInteresCompensatorioPaso2 = By.xpath("//*[@id='tasainterescompensatorio']");
    private final By tasaDeInteresMoratorioPaso2 = By.xpath("//*[@id='tasainteresmoratorio']");
    private final By añoBasediasPaso2 = By.xpath("//*[@id='anobase']");
    private final By monedaPaso2 = By.xpath("//*[@id='moneda']");
    private final By montoDePrestamoPaso2 = By.xpath("//*[@id='montoprestamo']");
    private final By itfPaso2 = By.xpath("//*[@id='itf']");
    private final By plazoPaso2 = By.xpath("//*[@id='plazodias']");
    private final By fechaDeVencimientoPaso2 = By.xpath("//*[@id='fechavencimiento']");
    private final By fechaProxCancelacionPaso2 = By.xpath("//*[@id='fechaproxcancelacion']");
    private final By capitalPaso2 = By.xpath("//*[@id='capital']");
    private final By interesPaso2 = By.xpath("//*[@id='interes']");
    private final By totalCuotaPaso2 = By.xpath("//*[@id='totalcuota']");
    private final By emailPaso2 = By.xpath("//*[@id='email']");
    private final By montoAabonarPaso2 = By.xpath("//*[@id='montoabonar']");
    private final By itfAbonoPaso2 = By.xpath("//*[@id='itfabono']");
    private final By cuentaDeAbonoPaso2 = By.xpath("//*[@id='cuentaabono']");
    private final By botonConfirmarPaso2 = By.xpath("//*[@id='botonNextSinHoja']");


    //private final By

    String certificadoDeTasacion_paso2;
    String fechaDeEmision_paso2;
    String estado_paso2;
    String montoDisponible_paso2;
    String tasaEfectivaAnual_paso2;
    String tasaDeCostoEfectivoAnual_paso2;
    String tasaDeInteresCompensatorio_paso2;
    String tasaDeInteresMoratorio_paso2;
    String añoBasedias_paso2;
    String moneda_paso2;
    String montoDePrestamo_paso2;
    String itf_paso2;
    String plazo_paso2;
    String fechaDeVencimiento_paso2;
    String fechaProxCancelacion_paso2;
    String capital_paso2;
    String interes_paso2;
    String totalCuota_paso2;
    String email_paso2;
    String montoAabonar_paso2;
    String itfAbono_paso2;
    String cuentaDeAbono_paso2;

    private final By numeroReferenciaPaso3 = By.xpath("//*[@id='numreferencia']");
    private final By numeroOperacionPaso3 = By.xpath("//*[@id='numoperacion']");
    private final By fechaPresentacionPaso3 = By.xpath("//*[@id='fechapresentacion']");
    private final By nroDeContratoPaso3 = By.xpath("//*[@id='numcontrato']");
    private final By certificadoDeTasacionPaso3 = By.xpath("//*[@id='certificado']");
    private final By fechaDeEmisionPaso3 = By.xpath("//*[@id='fechaemision']");
    private final By estadoPaso3 = By.xpath("//*[@id='estado']");
    private final By montoDisponiblePaso3 = By.xpath("//*[@id='montodisponible']");
    private final By tasaEfectivaAnualPaso3 = By.xpath("//*[@id='tasaefectivaanual']");
    private final By tasaDeCostoEfectivoAnualPaso3 = By.xpath("//*[@id='tasacostoefectivoanual']");
    private final By tasaDeInteresCompensatorioPaso3 = By.xpath("//*[@id='tasainterescompensatorio']");
    private final By tasaDeInteresMoratorioPaso3 = By.xpath("//*[@id='tasainteresmoratorio']");
    private final By añoBasediasPaso3 = By.xpath("//*[@id='anobase']");
    private final By monedaPaso3 = By.xpath("//*[@id='moneda']");
    private final By montoDePrestamoPaso3 = By.xpath("//*[@id='montoprestamo']");
    private final By itfPaso3 = By.xpath("//*[@id='itf']");
    private final By plazoPaso3 = By.xpath("//*[@id='plazodias']");
    private final By fechaDeVencimientoPaso3 = By.xpath("//*[@id='fechavencimiento']");
    private final By fechaProxCancelacionPaso3 = By.xpath("//*[@id='fechaproxcancelacion']");
    private final By capitalPaso3 = By.xpath("//*[@id='capital']");
    private final By interesPaso3 = By.xpath("//*[@id='interes']");
    private final By totalCuotaPaso3 = By.xpath("//*[@id='totalcuota']");
    private final By emailPaso3 = By.xpath("//*[@id='email']");
    private final By montoAabonarPaso3 = By.xpath("//*[@id='montoabonar']");
    private final By itfAbonoPaso3 = By.xpath("//*[@id='itfabono']");
    private final By cuentaDeAbonoPaso3 = By.xpath("//*[@id='cuentaabono']");

    String numeroReferencia_paso3;
    String numeroOperacion_paso3;
    String fechaPresentacion_paso3;
    String nroDeContrato_paso3;
    String certificadoDeTasacion_paso3;
    String fechaDeEmision_paso3;
    String estado_paso3;
    String montoDisponible_paso3;
    String tasaEfectivaAnual_paso3;
    String tasaDeCostoEfectivoAnual_paso3;
    String tasaDeInteresCompensatorio_paso3;
    String tasaDeInteresMoratorio_paso3;
    String añoBasedias_paso3;
    String moneda_paso3;
    String montoDePrestamo_paso3;
    String itf_paso3;
    String plazo_paso3;
    String fechaDeVencimiento_paso3;
    String fechaProxCancelacion_paso3;
    String capital_paso3;
    String interes_paso3;
    String totalCuota_paso3;
    String email_paso3;
    String montoAabonar_paso3;
    String itfAbono_paso3;
    String cuentaDeAbono_paso3;

    private final By numeroReferenciaConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[1]/td[1]/span[2]");
    private final By numeroOperacionConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[1]/td[2]/span[2]");
    private final By fechaPresentacionConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[1]/td[3]/span[2]");
    private final By nroDeContratoConstacia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[1]/tbody/tr[2]/td/span[2]");
    private final By certificadoDeTasacionConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[1]/span[2]");
    private final By fechaDeEmisionConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[2]/span[2]");
    private final By estadoConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[1]/td[3]/span[2]");
    private final By montoDisponibleConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[2]/tbody/tr[2]/td/span[3]");
    private final By tasaEfectivaAnualConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[1]/td[1]/span[2]");
    private final By tasaDeCostoEfectivoAnualConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[1]/td[2]/span[2]");
    private final By tasaDeInteresCompensatorioConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[1]/td[3]/span[2]");
    private final By tasaDeInteresMoratorioConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[2]/td[1]/span[2]");
    private final By añoBasediasConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[2]/td[2]/span[2]");
    private final By monedaConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[2]/td[3]/span[2]");
    private final By montoDePrestamoConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[3]/td[1]/span[3]");
    private final By itfConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[3]/td[2]/span[3]");
    private final By plazoConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[3]/td[3]/span[2]");
    private final By fechaDeVencimientoConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[4]/td[1]/span[2]");
    private final By fechaProxCancelacionConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[4]/td[2]/span[2]");
    private final By capitalConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[4]/td[3]/span[3]");
    private final By interesConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[5]/td[1]/span[3]");
    private final By totalCuotaConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[5]/td[2]/span[3]");
    private final By emailConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[5]/td[3]/span[2]");
    private final By montoAabonarConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[4]/tbody/tr/td[1]/span[3]");
    private final By itfAbonoConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[3]/tbody/tr[3]/td[2]/span[3]");
    private final By cuentaDeAbonoConstancia = By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table[4]/tbody/tr/td[2]/span[2]");
    private final By enviarConstancia = By.xpath("//*[@id='j_idt159']");

    public void paso1(String certificadoDeTasacion, String montoDePrestamo, String plazo, String cuentaDeAbono, String email ){

        certificadoDeTasacion_paso1 = certificadoDeTasacion;
        montoDePrestamo_paso1 = montoDePrestamo;
        plazo_paso1 = plazo;
        cuentaDeAbono_paso1 = cuentaDeAbono;
        email_paso1 = email;

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(tituloFormulario));

        String validartituloFormularioPaso1= driver.findElement(tituloFormulario).getText();
        assertEquals("Crédito Prendario", validartituloFormularioPaso1);
        System.out.println("Titulo Formulario ok");

        String validarSeccionOperaciones= driver.findElement(seccionOperaciones).getText();
        assertEquals("OPERACIONES", validarSeccionOperaciones);
        System.out.println("Sección operaciones ok");

        String validarSeccionCreditos= driver.findElement(seccionCreditos).getText();
        assertEquals("CRÉDITOS", validarSeccionCreditos);
        System.out.println("Sección creditos ok");

        String validarSeccionCreditoprendario= driver.findElement(seccionCreditoPrendario).getText();
        assertEquals("CRÉDITO PRENDARIO - NUEVO CRÉDITO", validarSeccionCreditoprendario);
        System.out.println("Sección credito prendaio ok");

        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="DATOS DEL CRÉDITO\n" +
                "(PASO 1 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 1 ok");


        Select certificadoTasacion = new Select(driver.findElement(certificadoDeTasacionPaso1));
        certificadoTasacion.selectByValue(certificadoDeTasacion);

        String disponibleCertificadoTasacion = driver.findElement(By.xpath("//*[@id='operacion']/div/div[2]/div[1]/div[1]/button/span[1]")).getText();
        String[] disponible= disponibleCertificadoTasacion.split(" ");
        montoDisponible_paso1 = disponible[disponible.length - 1];

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        fechaDeEmision_paso1 = driver.findElement(fechaDeEmisionPaso1).getText();
        assertNotNull(fechaDeEmision_paso1);

        String estado = driver.findElement(estadoPaso1).getText();
        assertNotNull(estado);
        estado_paso1= estado;

        String tasaEfecAnual = driver.findElement(tasaEfectivaAnualPaso1).getText();
        assertNotNull(tasaEfecAnual);
        tasaEfectivaAnual_paso1 = tasaEfecAnual;

        String tasaInteresCompensatorio = driver.findElement(tasaDeInteresCompensatorioPaso1).getText();
        assertNotNull(tasaInteresCompensatorio);
        tasaDeInteresCompensatorio_paso1 = tasaInteresCompensatorio;

        String tasaInteresMoratorio = driver.findElement(tasaDeInteresMoratorioPaso1).getText();
        assertNotNull(tasaInteresMoratorio);
        tasaDeInteresMoratorio_paso1= tasaInteresMoratorio;

        String año = driver.findElement(añoBasediasPaso1).getText();
        assertNotNull(año);
        añoBasedias_paso1 = año;

        String moneda = driver.findElement(monedaPaso1).getText();
        assertEquals("SOLES", moneda);
        moneda_paso1 = moneda;

        WebElement monto = driver.findElement(montoDePrestamoPaso1);
        monto.sendKeys(montoDePrestamo);

        Select plazoDias = new Select(driver.findElement(plazoPaso1));
        plazoDias.selectByValue(plazo);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String fechaVencimiento = driver.findElement(fechaDeVencimientoPaso1).getText();
        assertNotNull(fechaVencimiento);
        fechaDeVencimiento_paso1 = fechaVencimiento;

        Select ctaAbono = new Select(driver.findElement(cuentaDeAbonoPaso1));
        ctaAbono.selectByValue(cuentaDeAbono);

        WebElement correo = driver.findElement(emailPaso1);
        correo.sendKeys(email);

        WebElement check = driver.findElement(checkMarcarTodosPaso1);
        check.click();

        WebElement botonSiguiente = driver.findElement(botonNext);
        botonSiguiente.click();

    }
    public void paso2(){
        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="CONFIRMAR CRÉDITO - CLAVE\n" +
                "(PASO 2 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 2 ok");

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(certificadoDeTasacionPaso2));

        DecimalFormat df = new DecimalFormat("0.00");

        certificadoDeTasacion_paso2 = driver.findElement(certificadoDeTasacionPaso2).getText();
        String parte1 = certificadoDeTasacion_paso2.substring(0,2);
        String parte2 = certificadoDeTasacion_paso2.substring(3,5);
        String parte3 = certificadoDeTasacion_paso2.substring(6,15);
        assertEquals(certificadoDeTasacion_paso1,"0"+parte1+parte2+parte3);

        fechaDeEmision_paso2 = driver.findElement(fechaDeEmisionPaso2).getText();
        assertEquals(fechaDeEmision_paso1,fechaDeEmision_paso2);

        estado_paso2= driver.findElement(estadoPaso2).getText();
        assertEquals(estado_paso1,estado_paso2);

        montoDisponible_paso2 = driver.findElement(montoDisponiblePaso2).getText();
        assertEquals(montoDisponible_paso1,montoDisponible_paso2);

        tasaEfectivaAnual_paso2 = driver.findElement(tasaEfectivaAnualPaso2).getText();
        assertNotNull(tasaEfectivaAnual_paso2);

        tasaDeCostoEfectivoAnual_paso2 = driver.findElement(tasaDeCostoEfectivoAnualPaso2).getText();
        assertNotNull(tasaDeCostoEfectivoAnual_paso2);

        tasaDeInteresCompensatorio_paso2 = driver.findElement(tasaDeInteresCompensatorioPaso2).getText();
        assertNotNull(tasaDeInteresCompensatorio_paso2);

        tasaDeInteresMoratorio_paso2 = driver.findElement(tasaDeInteresMoratorioPaso2).getText();
        assertNotNull(tasaDeInteresMoratorio_paso2);

        añoBasedias_paso2 = driver.findElement(añoBasediasPaso2).getText();
        assertEquals(añoBasedias_paso1,añoBasedias_paso2);

        moneda_paso2 = driver.findElement(monedaPaso2).getText();
        assertEquals(moneda_paso1,moneda_paso2);

        montoDePrestamo_paso2 = driver.findElement(montoDePrestamoPaso2).getText();
        String prestamo = df.format(Double.parseDouble(montoDePrestamo_paso1));
        assertEquals(prestamo,montoDePrestamo_paso2);

        itf_paso2 = driver.findElement(itfPaso2).getText();
        assertNotNull(itf_paso2);

        plazo_paso2 = driver.findElement(plazoPaso2).getText();
        assertEquals(plazo_paso1,plazo_paso2);

        fechaDeVencimiento_paso2 = driver.findElement(fechaDeVencimientoPaso2).getText();
        assertEquals(fechaDeVencimiento_paso1,fechaDeVencimiento_paso2);

        fechaProxCancelacion_paso2 = driver.findElement(fechaProxCancelacionPaso2).getText();
        assertNotNull(fechaProxCancelacion_paso2);

        capital_paso2 = driver.findElement(capitalPaso2).getText();
        String capital = df.format(Double.parseDouble(montoDePrestamo_paso1));
        assertEquals(capital,capital_paso2);

        interes_paso2 = driver.findElement(interesPaso2).getText();
        assertNotNull(interes_paso2);

        totalCuota_paso2 = driver.findElement(totalCuotaPaso2).getText();
        assertNotNull(totalCuota_paso2);

        email_paso2 = driver.findElement(emailPaso2).getText();
        assertEquals(email_paso1,email_paso2);

        montoAabonar_paso2 = driver.findElement(montoAabonarPaso2).getText();
        assertNotNull(montoAabonar_paso2);

        itfAbono_paso2 = driver.findElement(itfAbonoPaso2).getText();
        assertNotNull(itfAbono_paso2);

        cuentaDeAbono_paso2 = driver.findElement(cuentaDeAbonoPaso2).getText();
        String abonoParte1 = cuentaDeAbono_paso2.substring(0,3);
        String abonoParte2 = cuentaDeAbono_paso2.substring(4,6);
        String abonoParte3 = cuentaDeAbono_paso2.substring(7,14);
        assertEquals(cuentaDeAbono_paso1,abonoParte1+abonoParte2+abonoParte3);

        Actions moverAbotonConfirmar = new Actions(driver);
        WebElement botonConfirmar = driver.findElement(botonConfirmarPaso2);
        moverAbotonConfirmar.moveToElement(botonConfirmar).build().perform();

        utilities.ingresarclavede6();

        botonConfirmar.click();

    }
    public void paso3(){

        String validarTituloFormulario= driver.findElement(tituloPaso).getText();
        String seccionTituloFormularioEsperado="IMPRIMIR Y/O ENVIAR CONSTANCIA\n" +
                "(PASO 3 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 3 ok");

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(numeroReferenciaPaso3));

        numeroReferencia_paso3 = driver.findElement(numeroReferenciaPaso3).getText();
        assertNotNull(numeroReferencia_paso3);

        numeroOperacion_paso3 = driver.findElement(numeroOperacionPaso3).getText();
        assertNotNull(numeroOperacion_paso3);

        fechaPresentacion_paso3 = driver.findElement(fechaPresentacionPaso3).getText();
        assertNotNull(fechaPresentacion_paso3);

        nroDeContrato_paso3 = driver.findElement(nroDeContratoPaso3).getText();
        assertNotNull(nroDeContrato_paso3);

        certificadoDeTasacion_paso3 = driver.findElement(certificadoDeTasacionPaso3).getText();
        assertEquals(certificadoDeTasacion_paso2,certificadoDeTasacion_paso3);

        fechaDeEmision_paso3 = driver.findElement(fechaDeEmisionPaso3).getText();
        assertEquals(fechaDeEmision_paso1,fechaDeEmision_paso3);

        estado_paso3 = driver.findElement(estadoPaso3).getText();
        assertEquals(estado_paso1,estado_paso3);

        montoDisponible_paso3 = driver.findElement(montoDisponiblePaso3).getText();
        assertEquals(montoDisponible_paso1,montoDisponible_paso3);

        tasaEfectivaAnual_paso3 = driver.findElement(tasaEfectivaAnualPaso3).getText();
        assertNotNull(tasaEfectivaAnual_paso3);

        tasaDeCostoEfectivoAnual_paso3 = driver.findElement(tasaDeCostoEfectivoAnualPaso3).getText();
        assertNotNull(tasaDeCostoEfectivoAnual_paso3);

        tasaDeInteresCompensatorio_paso3 = driver.findElement(tasaDeInteresCompensatorioPaso3).getText();
        assertNotNull(tasaDeInteresCompensatorio_paso3);

        tasaDeInteresMoratorio_paso3 = driver.findElement(tasaDeInteresMoratorioPaso3).getText();
        assertNotNull(tasaDeInteresMoratorio_paso3);

        añoBasedias_paso3 = driver.findElement(añoBasediasPaso3).getText();
        assertEquals(añoBasedias_paso1,añoBasedias_paso3);

        moneda_paso3 = driver.findElement(monedaPaso3).getText();
        assertEquals(moneda_paso1,moneda_paso3);

        montoDePrestamo_paso3 = driver.findElement(montoDePrestamoPaso3).getText();
        assertEquals(montoDePrestamo_paso2,montoDePrestamo_paso3);

        itf_paso3 = driver.findElement(itfPaso3).getText();
        assertNotNull(itf_paso3);

        plazo_paso3 = driver.findElement(plazoPaso3).getText();
        assertEquals(plazo_paso1,plazo_paso3);

        fechaDeVencimiento_paso3 = driver.findElement(fechaDeVencimientoPaso3).getText();
        assertEquals(fechaDeVencimiento_paso2,fechaDeVencimiento_paso3);

        fechaProxCancelacion_paso3 = driver.findElement(fechaProxCancelacionPaso3).getText();
        assertEquals(fechaProxCancelacion_paso2,fechaProxCancelacion_paso3);

        capital_paso3 = driver.findElement(capitalPaso3).getText();
        assertEquals(capital_paso2,capital_paso3);

        interes_paso3 = driver.findElement(interesPaso3).getText();
        assertEquals(interes_paso2,interes_paso3);

        totalCuota_paso3 = driver.findElement(totalCuotaPaso3).getText();
        assertEquals(totalCuota_paso2,totalCuota_paso3);

        email_paso3 = driver.findElement(emailPaso3).getText();
        assertEquals(email_paso1,email_paso3);

        montoAabonar_paso3 = driver.findElement(montoAabonarPaso3).getText();
        assertEquals(montoAabonar_paso2,montoAabonar_paso3);

        itfAbono_paso3 = driver.findElement(itfAbonoPaso3).getText();
        assertEquals(itfAbono_paso2,itfAbono_paso3);

        cuentaDeAbono_paso3 = driver.findElement(cuentaDeAbonoPaso3).getText();
        assertEquals(cuentaDeAbono_paso2,cuentaDeAbono_paso3);

    }
    public void validarDatosDeEnvio(){
        WebElement EnviarConstancia = driver.findElement(enviarConstancia);
        EnviarConstancia.click();

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='enviarDEU01']/div/div/div[1]/h5")));

        String tituloModalEnvioDeConstancia= driver.findElement(By.xpath("//*[@id='enviarDEU01']/div/div/div[1]/h5")).getText();
        assertEquals("ENVÍO DE CONSTANCIA", tituloModalEnvioDeConstancia);

        String SubtituloModalEnvioDeConstancia= driver.findElement(By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[1]/span")).getText();
        assertEquals("Constancia de Desembolso de crédito prendario", SubtituloModalEnvioDeConstancia);

        String numeroReferencia_constancia= driver.findElement(numeroReferenciaConstancia).getText();
        assertEquals(numeroReferencia_paso3,numeroReferencia_constancia);

        String numeroOperacion_constancia = driver.findElement(numeroOperacionConstancia).getText();
        assertEquals(numeroOperacion_paso3,numeroOperacion_constancia);

        String fechaPresentacion_constancia = driver.findElement(fechaPresentacionConstancia).getText();
        assertEquals(fechaPresentacion_paso3,fechaPresentacion_constancia);

        String nroDeContrato_constacia = driver.findElement(nroDeContratoConstacia).getText();
        assertEquals(nroDeContrato_paso3,nroDeContrato_constacia);

        String certificadoDeTasacion_constancia = driver.findElement(certificadoDeTasacionConstancia).getText();
        assertEquals(certificadoDeTasacion_paso3,certificadoDeTasacion_constancia);

        String fechaDeEmision_constancia = driver.findElement(fechaDeEmisionConstancia).getText();
        assertEquals(fechaDeEmision_paso3,fechaDeEmision_constancia);

        String estado_constancia = driver.findElement(estadoConstancia).getText();
        assertEquals(estado_paso3,estado_constancia);

        String montoDisponible_constancia = driver.findElement(montoDisponibleConstancia).getText();
        assertEquals(montoDisponible_paso3,montoDisponible_constancia);

        String tasaEfectivaAnual_constancia = driver.findElement(tasaEfectivaAnualConstancia).getText();
        assertTrue(tasaEfectivaAnual_paso3.contains(tasaEfectivaAnual_constancia));

        String tasaDeCostoEfectivoAnual_constancia = driver.findElement(tasaDeCostoEfectivoAnualConstancia).getText();
        assertTrue(tasaDeCostoEfectivoAnual_paso3.contains(tasaDeCostoEfectivoAnual_constancia));

        String tasaDeInteresCompensatorio_constancia = driver.findElement(tasaDeInteresCompensatorioConstancia).getText();
        assertTrue(tasaDeInteresCompensatorio_paso3.contains(tasaDeInteresCompensatorio_constancia));

        String tasaDeInteresMoratorio_constancia = driver.findElement(tasaDeInteresMoratorioConstancia).getText();
        assertTrue(tasaDeInteresMoratorio_paso3.contains(tasaDeInteresMoratorio_constancia));

        String añoBasedias_constancia = driver.findElement(añoBasediasConstancia).getText();
        assertEquals(añoBasedias_paso3,añoBasedias_constancia);

        String moneda_constancia = driver.findElement(monedaConstancia).getText();
        assertEquals(moneda_paso3,moneda_constancia);

        String montoDePrestamo_constancia = driver.findElement(montoDePrestamoConstancia).getText();
        assertEquals(montoDePrestamo_paso3,montoDePrestamo_constancia);

        String itf_constancia = driver.findElement(itfConstancia).getText();
        assertEquals(itf_paso3,itf_constancia);

        String plazo_constancia = driver.findElement(plazoConstancia).getText();
        assertEquals(plazo_paso3,plazo_constancia);

        String fechaDeVencimiento_constancia = driver.findElement(fechaDeVencimientoConstancia).getText();
        assertEquals(fechaDeVencimiento_paso3,fechaDeVencimiento_constancia);

        String fechaProxCancelacion_constancia = driver.findElement(fechaProxCancelacionConstancia).getText();
        assertEquals(fechaProxCancelacion_paso3,fechaProxCancelacion_constancia);

        String capital_constancia = driver.findElement(capitalConstancia).getText();
        assertEquals(capital_paso3,capital_constancia);

        String interes_constancia = driver.findElement(interesConstancia).getText();
        assertEquals(interes_paso3,interes_constancia);

        String totalCuota_constancia = driver.findElement(totalCuotaConstancia).getText();
        assertEquals(totalCuota_paso3,totalCuota_constancia);

        String email_constancia = driver.findElement(emailConstancia).getText();
        assertEquals(email_paso3,email_constancia);

        String montoAabonar_constancia = driver.findElement(montoAabonarConstancia).getText();
        assertEquals(montoAabonar_paso3,montoAabonar_constancia);

        String itfAbono_constancia = driver.findElement(itfAbonoConstancia).getText();
        assertEquals(itfAbono_paso3,itfAbono_constancia);

        String cuentaDeAbono_constancia = driver.findElement(cuentaDeAbonoConstancia).getText();
        assertEquals(cuentaDeAbono_paso3,cuentaDeAbono_constancia);
    }


}
