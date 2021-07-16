package pageObjects;

import common.loginPersonaIBK;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class aperturaDePlazoFijo {
    public static WebDriver driver;

    loginPersonaIBK LoginPersonaIBK = new loginPersonaIBK();
    public aperturaDePlazoFijo (WebDriver driver){
        this.driver= driver;
    }
    Utilities utilities = new Utilities();
    //Ingreso a apertura de plazo fijo
    private By menuOperaciones = By.xpath("//form[@id='j_idt72']//div[@class='menu-groups']//a[contains(text(),'OPERACIONES')]");
    private By subMenuPlazoFijo= By.xpath("//*[@id='j_idt74:1:j_idt81:0:j_idt83']");
    private By aperturaDePlazoFijo= By.xpath("//*[@id='j_idt74:1:j_idt81:0:j_idt86:0:j_idt88']");

    //formulario paso 1
    private By tituloformulario= By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/h5");
    private By seccionOperaciones= By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[1]");
    private By seccionAperturaPlazoFijo= By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div/ol/li[2]");
    private By tituloPasoApaso= By.xpath("//*[@id='subTitulo']");


    //localizadores Paso 1
    private By cuentaOrigen_paso1= By.id("cuenta-select");
    private By moneda_paso1 = By.id("moneda-select");
    private By plazoEnDias_paso1= By.id("plazo-select");
    private By modaliadDePagoDeInteres_paso1= By.id("modalidad-pago-select");
    private By capital_paso1 = By.id("capital");
    private By cuentaDeAbonoDeIntereses_paso1 = By.id("cuenta-abono-select");
    private By email_paso1= By.id("email");
    private By chekboxTerminosYcondiciones_paso1=By.xpath("//*[@id='operacion']/div/div[5]/div[1]/div/div[1]/ins");
    private By chekboxTerminosYcondicionesDeLaCartilla_paso1=By.xpath("//*[@id='operacion']/div/div[5]/div[2]/div/div[1]/ins");
    private By botonSiguiente_paso1= By.id("botonNext");

    private String cuentaOrigenpaso1;
    private String monedapaso1;
    private String plazoEnDiaspaso1;
    private String modaliadDePagoDeInterespaso1;
    private String capitalpaso1;
    private String cuentaDeAbonoDeInteresespaso1;
    private String emailpaso1;

    private String tasa_interesAnualPaso2;
    private String tipo_cambioPaso2;
    private String monto_equivalentePaso2;

    private String numeroReferenciaPaso3;
    private String numeroOperacionPaso3;
    private String numeroContratoPaso3;
    private String fechaPresentacionPaso3;
    private String fechaDeVencimiemtoPaso3;
    private String horaPresentacionPaso3;
    private String numeroCuentaDPFPaso3;
    private String itfpaso3;


    //localizadores Fijos Paso 2
    private By cuentaOrigen_paso2= By.xpath("//*[@id='ctn-creditos']/div[1]/p[2]");
    private By capital_paso2 = By.xpath("//*[@id='ctn-creditos']/div[2]/p[2]");
    private By moneda_paso2 = By.xpath("//*[@id='ctn-creditos']/div[3]/p[2]");
    private By plazoEnDias_paso2= By.xpath("//*[@id='ctn-creditos']/div[4]/p[2]");
    private By modaliadDePagoDeInteres_paso2= By.xpath("//*[@id='operacion']/div/div[3]/div[1]/p[2]");

    //localizadores variables - Capitalizable al vencimiento, Disponible en cuenta-
    private By tasaDeInteresAnual_Paso2 = By.xpath("//*[@id='operacion']/div/div[3]/div[2]/p[2]");
    private By email_paso2= By.xpath("//*[@id='operacion']/div/div[3]/div[3]/p[2]");

    private By tipoDeCambio_paso2= By.xpath("//*[@id='operacion']/div/div[3]/div[4]/p[2]");
    private By montoEquivalente_paso2= By.xpath("//*[@id='operacion']/div/div[3]/div[4]/p[2]");

    //localizadores variables - Abono en cuenta, Abonno mensual-
    private By cuentaDeAbonoDeIntereses_paso2 = By.xpath("//*[@id='operacion']/div/div[3]/div[2]/p[2]");
    private By tasadeInteresAnual_Paso2= By.xpath("//*[@id='operacion']/div/div[3]/div[3]/p[2]");
    private By eMail_paso2= By.xpath("//*[@id='operacion']/div/div[3]/div[4]/p[2]");

    private By tipodeCambio_paso2 = By.xpath("//*[@id='operacion']/div/div[3]/div[5]/p[2]");
    private By montoequivalente_paso2= By.xpath("//*[@id='operacion']/div/div[3]/div[6]/p[2]");

    private By botonConfirmar_paso2= By.id("botonNext");


    //localizadores Fijos Paso 3
    private By mensajeExitoso_Paso3= By.xpath("//*[@id='mensajeTransaccion']/div/p[2]");
    private By formulario_paso3= By.xpath("//*[@id='subTitulo']");

    private By numeroDeReferencia_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[1]/p[2]");
    private By numeroDeOperacion_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[2]/p[2]");
    private By numeroDeContrato_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[3]/p[2]");
    private By fechaDePresentacion_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[4]/p[2]");
    private By horaDePresentacion_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[5]/p[2]");
    private By numeroDeCuentaPlazoFijo_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[6]/p[2]");
    private By capital_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[7]/p[2]");
    private By moneda_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[8]/p[2]");
    private By plazo_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[9]/p[2]");
    private By cuentaDeAhorroOrigen_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[10]/p[2]");
    private By modalidadDePagoDeInteres_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[11]/p[2]");

    //localizadores variables
    //localizadores variables - Capitalizable al vencimiento, Disponible en cuenta-
    private By tasadeIneteresAnual_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[13]/p[2]");
    private By eMail_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[13]/p[2]");
    private By fechadeApertura_paso3= By.xpath("//*[@id='j_idt175:fecApe']");
    private By fechadeVencimiemto_paso3= By.xpath("//*[@id='j_idt178:fecVto']");
    private By tasadeInteresAnual_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[12]/p[2]");
    private By itf_paso3 = By.xpath("//*[@id='ctn-creditos']/div/div[16]/p[2]");

    private By tipodeCambio_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[18]/p[2]");
    private By montodquivalente_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[19]/p[2]");

    //localizadores variables - Abono en cuenta, Abonno mensual-
    private By cuentaDeAbonoDeIntereses_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[12]/p[2]");
    private By tasaDeIneteresAnual_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[13]/p[2]");
    private By email_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[14]/p[2]");
    private By fechaDeApertura_paso3= By.xpath("//*[@id='j_idt175:fecApe']");
    private By fechaDeVencimiemto_paso3= By.xpath("//*[@id='j_idt178:fecVto']");
    private By ITF_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[17]/p[2]");

    private By tipoDeCambio_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[18]/p[2]");
    private By montoEquivalente_paso3= By.xpath("//*[@id='ctn-creditos']/div/div[19]/p[2]");

    //localizadores fijos constancia
    private By numeroDeReferencia_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[1]/span[2]");
    private By numeroDeOperacion_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[2]/span[2]");
    private By numeroDeContrato_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[3]/span[2]");
    private By fechaDePresentacion_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[2]/td[1]/span[2]");
    private By horaDePresentacion_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[2]/td[2]/span[2]");
    private By numeroDeCuentaPlazoFijo_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[2]/td[3]/span[2]");
    private By capital_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[3]/td[1]/span[2]");
    private By moneda_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[3]/td[2]/span[2]");
    private By plazo_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[3]/td[3]/span[2]");
    private By diasPlazo_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[3]/td[3]/span[3]");
    private By cuentaDeAhorroOrigen_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[4]/td[1]/span[2]");
    private By modalidadDePagoDeInteres_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[4]/td[2]/span[2]"); //CAPITAL.AL VMTO

    //localizadores variables - Capitalizable al vencimiento, Disponible en cuenta-
    private By tasadeInteresAnual_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[4]/td[3]/span[2]"); //falta$
    private By eMail_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[5]/td[1]/span[2]");
    private By fechadeApertura_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[5]/td[2]/span[2]");
    private By fechadeVencimiemto_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[5]/td[3]/span[2]");
    private By Itf_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[6]/td[1]/span[2]");

    private By tipodeCambio_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[6]/td[2]/span[2]");
    private By montodquivalente_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[6]/td[3]/span[2]");


    //localizadores variables - Abono en cuenta, Abonno mensual-
    private By cuentaDeAbonoDeIntereses_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[4]/td[3]/span[2]");
    private By tasadeinteresAnual_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[5]/td[1]/span[2]"); //falta %
    private By email_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[5]/td[2]/span[2]");
    private By fechaDeApertura_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[5]/td[3]/span[2]");
    private By fechaDeVencimiemto_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[6]/td[1]/span[2]");
    private By ITF_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[6]/td[2]/span[2]");

    private By tipoDeCambio_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[6]/td[3]/span[2]");
    private By montoEquivalente_constancia= By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[3]/div/table/tbody/tr[7]/td/span[2]");

    private By enviarConstancia = By.xpath("//*[@id='operacion']/div/div[1]/div[1]/div[2]/a[1]");
    private By emailPara =  By.xpath("//*[@id='txtEmailPara']");
    private By emailasunto =  By.xpath("//*[@id='txtEmailAsunto']");


    //Ingresar a Plazo fijo
    public void loginUsuarioAperturaPlazoFijo() {
        LoginPersonaIBK.loginPersonaIBK_usuario1("4", "16466306");
    }
    public void ingresarAaperturaDePlazoFijoDesdeMenu() {
        WebElement selecionarMenuOperaciones = loginPersonaIBK.driver.findElement(menuOperaciones);
        selecionarMenuOperaciones.click();

        Actions action = new Actions(loginPersonaIBK.driver);
        WebElement seleccionarSubMenuPlazofijo = loginPersonaIBK.driver.findElement(subMenuPlazoFijo);
        action.moveToElement(seleccionarSubMenuPlazofijo).build().perform();

        WebDriverWait wait = new WebDriverWait(loginPersonaIBK.driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(aperturaDePlazoFijo));

        Actions action2 = new Actions(loginPersonaIBK.driver);
        WebElement ingresarAaperturaDePlazoFijo = loginPersonaIBK.driver.findElement(aperturaDePlazoFijo);
        action2.moveToElement(ingresarAaperturaDePlazoFijo).perform();
        ingresarAaperturaDePlazoFijo.click();
    }
    public void validarCaracterisicasDeFormularioCargadoPaso1() {
        WebDriverWait wait = new WebDriverWait(loginPersonaIBK.driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(tituloformulario));

        String validartituloFormularioPaso1= loginPersonaIBK.driver.findElement(tituloformulario).getText();
        String tituloFormularioEsperadoPaso1=("Apertura de plazo fijo con cargo en cuenta");
        assertEquals(tituloFormularioEsperadoPaso1, validartituloFormularioPaso1);
        System.out.println("Titulo Formulario ok");

        String validarSeccionOperaciones= loginPersonaIBK.driver.findElement(seccionOperaciones).getText();
        String seccionOperacionesEsperado=("OPERACIONES");
        assertEquals(seccionOperacionesEsperado, validarSeccionOperaciones);
        System.out.println("Sección operaciones ok");

        String validarSeccionPlazoFijo= loginPersonaIBK.driver.findElement(seccionAperturaPlazoFijo).getText();
        String seccionPlazoFijoEsperado=("APERTURA DE PLAZO FIJO");
        assertEquals(seccionPlazoFijoEsperado, validarSeccionPlazoFijo);
        System.out.println("Sección Plazo Fijo ok");

        String validarTituloFormulario= loginPersonaIBK.driver.findElement(tituloPasoApaso).getText();
        String seccionTituloFormularioEsperado="DATOS DEL PLAZO FIJO\n" +
                "(PASO 1 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 1 ok");
    }
    public void paso1 (String cuentaOrigen, String moneda, String plazo, String modalidad, String capital,
                       String cuentaAbono, String email) {
        cuentaOrigenpaso1 = cuentaOrigen;
        monedapaso1 = moneda;
        plazoEnDiaspaso1 = plazo;
        modaliadDePagoDeInterespaso1 = modalidad;
        capitalpaso1 = capital;
        cuentaDeAbonoDeInteresespaso1 = cuentaAbono;
        emailpaso1 = email;

        if (cuentaAbono.equals("")){ //modalidad: Capitabizable al vencimiento o disponible en cuenta.
            //seleccionar cuenta origen
            Select seleccionarCuentaOrigen = new Select(loginPersonaIBK.driver.findElement(cuentaOrigen_paso1));
            seleccionarCuentaOrigen.selectByValue(cuentaOrigen);

            //seleccionar moneda
            Select seleccionarmoneda = new Select(loginPersonaIBK.driver.findElement(moneda_paso1));
            seleccionarmoneda.selectByValue(moneda);

            //seleccionar plazo
            Select seleccionarplazo = new Select(loginPersonaIBK.driver.findElement(plazoEnDias_paso1));
            seleccionarplazo.selectByValue(plazo);

            //seleccionar modalidad
            Select seleccionarmodalidad = new Select(loginPersonaIBK.driver.findElement(modaliadDePagoDeInteres_paso1));
            seleccionarmodalidad.selectByValue(modalidad);

            //Ingresar capital
            WebElement ingresarCapital= loginPersonaIBK.driver.findElement(capital_paso1);
            ingresarCapital.sendKeys(capital);

            //ingresar email
            WebElement ingresarEmail= loginPersonaIBK.driver.findElement(email_paso1);
            ingresarEmail.sendKeys(email);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement terminosYcondiciones= loginPersonaIBK.driver.findElement(chekboxTerminosYcondiciones_paso1);
            terminosYcondiciones.click();

            WebElement terminosYCondicionesCartilla= loginPersonaIBK.driver.findElement(chekboxTerminosYcondicionesDeLaCartilla_paso1);
            terminosYCondicionesCartilla.click();

            WebElement botonSiguiente = loginPersonaIBK.driver.findElement(botonSiguiente_paso1);
            botonSiguiente.click();

        }else { //modalidad: Abono en cuenta o Abono mensual

            //seleccionar cuenta origen
            Select seleccionarCuentaOrigen = new Select(loginPersonaIBK.driver.findElement(cuentaOrigen_paso1));
            seleccionarCuentaOrigen.selectByValue(cuentaOrigen);

            //seleccionar moneda
            Select seleccionarmoneda = new Select(loginPersonaIBK.driver.findElement(moneda_paso1));
            seleccionarmoneda.selectByValue(moneda);

            //seleccionar plazo
            Select seleccionarplazo = new Select(loginPersonaIBK.driver.findElement(plazoEnDias_paso1));
            seleccionarplazo.selectByValue(plazo);

            //seleccionar modalidad
            Select seleccionarmodalidad = new Select(loginPersonaIBK.driver.findElement(modaliadDePagoDeInteres_paso1));
            seleccionarmodalidad.selectByValue(modalidad);

            //Ingresar capital
            WebElement ingresarCapital= loginPersonaIBK.driver.findElement(capital_paso1);
            ingresarCapital.sendKeys(capital);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //seleccionar cuenta de abono
            Select seleccionarcuentaDeAbono = new Select(loginPersonaIBK.driver.findElement(cuentaDeAbonoDeIntereses_paso1));
            seleccionarcuentaDeAbono.selectByValue(cuentaAbono);

            //ingresar email
            WebElement ingresarEmail= loginPersonaIBK.driver.findElement(email_paso1);
            ingresarEmail.sendKeys(email);

            WebElement terminosYcondiciones= loginPersonaIBK.driver.findElement(chekboxTerminosYcondiciones_paso1);
            terminosYcondiciones.click();

            WebElement terminosYCondicionesCartilla= loginPersonaIBK.driver.findElement(chekboxTerminosYcondicionesDeLaCartilla_paso1);
            terminosYCondicionesCartilla.click();

            WebElement botonSiguiente = loginPersonaIBK.driver.findElement(botonSiguiente_paso1);
            botonSiguiente.click();

        }


    }
    public void validarCaracterisicasDeFormularioCargadoPaso2() {
        WebDriverWait wait = new WebDriverWait(loginPersonaIBK.driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(tituloPasoApaso));

        String validarTituloFormulario= loginPersonaIBK.driver.findElement(tituloPasoApaso).getText();
        String seccionTituloFormularioEsperado="CONFIRMAR APERTURA DE PLAZO FIJO - CLAVE\n" +
                "(PASO 2 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 2 ok");
    }
    public void paso2(){
        if (modaliadDePagoDeInterespaso1.contains("2" )|| modaliadDePagoDeInterespaso1.contains("5")){ //Abono en cuenta - Abono mensual
            //if (loginPersonaIBK.driver.findElement(tipodeCambio_paso2).isDisplayed()){

                String cuentaDeAhorroOrigenPaso2= loginPersonaIBK.driver.findElement(cuentaOrigen_paso2).getText();
                String cuentaParte1 = cuentaDeAhorroOrigenPaso2.substring(0,3);
                String cuentaParte2 = cuentaDeAhorroOrigenPaso2.substring(4,6);
                String cuentaParte3 = cuentaDeAhorroOrigenPaso2.substring(7,14);
                assertEquals(cuentaOrigenpaso1,cuentaParte1+cuentaParte2+cuentaParte3);


                String capitalpaso2= loginPersonaIBK.driver.findElement(capital_paso2).getText();
                if (capitalpaso2.contains(capitalpaso1)){
                assertNotNull(capitalpaso2);
                }

                String monedaPaso2= loginPersonaIBK.driver.findElement(moneda_paso2).getText();
                if(monedapaso1.contains("604")){
                    assertEquals("Soles",monedaPaso2);
                }else{
                    assertEquals("Dólares",monedaPaso2);
                }

                String plazoEnDiasPaso2= loginPersonaIBK.driver.findElement(plazoEnDias_paso2).getText();
                if(plazoEnDiasPaso2.contains(plazoEnDiaspaso1)){
                assertNotNull(plazoEnDiasPaso2);
                }

                String modaliadDePagoDeInteresPaso2= loginPersonaIBK.driver.findElement(modaliadDePagoDeInteres_paso2).getText();
                if (modaliadDePagoDeInterespaso1.contains("2")){
                    assertEquals("Abono en cuenta",modaliadDePagoDeInteresPaso2);
                } else {
                    assertEquals("Abono mensual", modaliadDePagoDeInteresPaso2);
                }

                String cuentaDeAbonoDeInteresesPaso2= loginPersonaIBK.driver.findElement(cuentaDeAbonoDeIntereses_paso2).getText();
                String cuenta_Parte1 = cuentaDeAbonoDeInteresesPaso2.substring(0,3);
                String cuenta_Parte2 = cuentaDeAbonoDeInteresesPaso2.substring(4,6);
                String cuenta_Parte3 = cuentaDeAbonoDeInteresesPaso2.substring(7,14);
                assertEquals(cuentaDeAbonoDeInteresespaso1,cuenta_Parte1+cuenta_Parte2+cuenta_Parte3);

                String tasadeInteresAnualPaso2= loginPersonaIBK.driver.findElement(tasadeInteresAnual_Paso2).getText();
                tasa_interesAnualPaso2= tasadeInteresAnualPaso2;
                assertNotNull("La tasa de interes anual en paso2 no es vacio",tasadeInteresAnualPaso2);

                String eMailPaso2= loginPersonaIBK.driver.findElement(eMail_paso2).getText();
                assertEquals(emailpaso1,eMailPaso2);

                if(capitalpaso2.contains("S/") && monedaPaso2.contains("Soles") || capitalpaso2.contains("US$") && monedaPaso2.contains("Dólares")) {
                    System.out.println("Validación ok en paso 2");
                }else{

                String tipodeCambioPaso2= loginPersonaIBK.driver.findElement(tipodeCambio_paso2).getText();
                tipo_cambioPaso2= tipodeCambioPaso2;
                assertNotNull("El tipo de cambio en paso 2 no es vacio",tipodeCambioPaso2);


                String montoequivalentePaso2= loginPersonaIBK.driver.findElement(montoequivalente_paso2).getText();
                monto_equivalentePaso2= montoequivalentePaso2;
                assertNotNull("El monto equivalente en paso 2 no es vacio",montoequivalentePaso2);

                System.out.println("Validación ok en paso 2");
                }

        }else if (modaliadDePagoDeInterespaso1.contains("3" )|| modaliadDePagoDeInterespaso1.contains("1")){ //Capitalizable al vencimiento - Disponible en cuenta
            String cuentaDeAhorroOrigenPaso2= loginPersonaIBK.driver.findElement(cuentaOrigen_paso2).getText();
            String cuentaParte1 = cuentaDeAhorroOrigenPaso2.substring(0,3);
            String cuentaParte2 = cuentaDeAhorroOrigenPaso2.substring(4,6);
            String cuentaParte3 = cuentaDeAhorroOrigenPaso2.substring(7,14);
            assertEquals(cuentaOrigenpaso1,cuentaParte1+cuentaParte2+cuentaParte3);

            String capitalpaso2= loginPersonaIBK.driver.findElement(capital_paso2).getText();
            if (capitalpaso2.contains(capitalpaso1)){
                assertNotNull(capitalpaso2);
            }

            String monedaPaso2= loginPersonaIBK.driver.findElement(moneda_paso2).getText();
            if(monedapaso1.contains("604")){
                assertEquals("Soles",monedaPaso2);
            }else{
                assertEquals("Dólares",monedaPaso2);
            }

            String plazoEnDiasPaso2= loginPersonaIBK.driver.findElement(plazoEnDias_paso2).getText();
            if(plazoEnDiasPaso2.contains(plazoEnDiaspaso1)){
                assertNotNull(plazoEnDiasPaso2);
            }

            String modaliadDePagoDeInteresPaso2= loginPersonaIBK.driver.findElement(modaliadDePagoDeInteres_paso2).getText();
            if (modaliadDePagoDeInterespaso1.contains("3")){
                assertEquals("Capitalizable al vencimiento",modaliadDePagoDeInteresPaso2);
            } else {
                assertEquals("Disponible en cuenta", modaliadDePagoDeInteresPaso2);
            }

            String tasadeInteresAnualPaso2= loginPersonaIBK.driver.findElement(tasaDeInteresAnual_Paso2).getText();
            tasa_interesAnualPaso2= tasadeInteresAnualPaso2;

            String eMailPaso2= loginPersonaIBK.driver.findElement(email_paso2).getText();
            assertEquals(emailpaso1,eMailPaso2);



            if(capitalpaso2.contains("S/") && monedaPaso2.contains("Soles") ||
                capitalpaso2.contains("US$") && monedaPaso2.contains("Dólares")) {

                System.out.println("Validación ok en paso 2");
            }else{

                String tipodeCambioPaso2= loginPersonaIBK.driver.findElement(tipoDeCambio_paso2).getText();
                tipo_cambioPaso2= tipodeCambioPaso2;
                assertNotNull("El tipo de cambio en paso 2 no es vacio",tipodeCambioPaso2);

                String montoequivalentePaso2= loginPersonaIBK.driver.findElement(montoEquivalente_paso2).getText();
                monto_equivalentePaso2= montoequivalentePaso2;
                assertNotNull("El monto equivalente en paso 2 no es vacio",montoequivalentePaso2);

                System.out.println("Validación ok en paso 2");

            }
        }

        Actions action = new Actions(loginPersonaIBK.driver);
        WebElement moverAbotonConfirmar = loginPersonaIBK.driver.findElement(By.xpath("//*[@id='generate-password-actual-autorizacion']"));
        action.moveToElement(moverAbotonConfirmar).build().perform();

        utilities.ingresarclavede6();

        WebElement botonConfirmar = loginPersonaIBK.driver.findElement(botonConfirmar_paso2);
        botonConfirmar.click();


    }
    public void validarCaracterisicasDeFormularioCargadoPaso3() {
        WebDriverWait wait = new WebDriverWait(loginPersonaIBK.driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(tituloPasoApaso));

        String validarTituloFormulario= loginPersonaIBK.driver.findElement(tituloPasoApaso).getText();
        String seccionTituloFormularioEsperado="IMPRIMIR Y/O ENVIAR CONSTANCIA\n" +
                "(PASO 3 DE 3)";
        assertEquals(seccionTituloFormularioEsperado, validarTituloFormulario);
        System.out.println("Titulo paso 3 ok");

        String mensajeExitoso = loginPersonaIBK.driver.findElement(mensajeExitoso_Paso3).getText();
        assertEquals("La transacción se ha realizado correctamente.",mensajeExitoso);
    }
    public void paso3(){

        String numeroReferencia = loginPersonaIBK.driver.findElement(numeroDeReferencia_paso3).getText();
        numeroReferenciaPaso3= numeroReferencia;
        assertNotNull(numeroReferencia);

        String numeroOperacion = loginPersonaIBK.driver.findElement(numeroDeOperacion_paso3).getText();
        numeroOperacionPaso3 = numeroOperacion;
        assertNotNull(numeroOperacion);

        String numeroContrato = loginPersonaIBK.driver.findElement(numeroDeContrato_paso3).getText();
        numeroContratoPaso3 = numeroContrato;
        assertNotNull(numeroContrato);

        String fechaPresentacion = loginPersonaIBK.driver.findElement(fechaDePresentacion_paso3).getText();
        fechaPresentacionPaso3 = fechaPresentacion;
        assertNotNull(fechaPresentacion);

        String horaPresentacion = loginPersonaIBK.driver.findElement(horaDePresentacion_paso3).getText();
        horaPresentacionPaso3 = horaPresentacion;
        assertNotNull(horaPresentacion);

        String numeroCuentaDPF = loginPersonaIBK.driver.findElement(numeroDeCuentaPlazoFijo_paso3).getText();
        numeroCuentaDPFPaso3 = numeroCuentaDPF;
        assertNotNull(numeroCuentaDPF);

        String capitalpaso3= loginPersonaIBK.driver.findElement(capital_paso3).getText();
        if (capitalpaso3.contains(capitalpaso1)){
            assertNotNull(capitalpaso3);
        }

        String monedaPaso3= loginPersonaIBK.driver.findElement(moneda_paso3).getText();
        if(monedapaso1.contains("604")){
            assertEquals("Soles",monedaPaso3);
        }else{
            assertEquals("Dólares",monedaPaso3);
        }

        String plazoEnDiasPaso3= loginPersonaIBK.driver.findElement(plazo_paso3).getText();
        if(plazoEnDiasPaso3.contains(plazoEnDiaspaso1)){
            assertNotNull(plazoEnDiasPaso3);
        }

        String cuentaDeAhorroOrigenPaso3= loginPersonaIBK.driver.findElement(cuentaDeAhorroOrigen_paso3).getText();
        String cuentaParte1 = cuentaDeAhorroOrigenPaso3.substring(0,3);
        String cuentaParte2 = cuentaDeAhorroOrigenPaso3.substring(4,6);
        String cuentaParte3 = cuentaDeAhorroOrigenPaso3.substring(7,14);
        assertEquals(cuentaOrigenpaso1,cuentaParte1+cuentaParte2+cuentaParte3);

        if (modaliadDePagoDeInterespaso1.contains("2" )|| modaliadDePagoDeInterespaso1.contains("5")){ //Abono en cuenta - Abono mensual

            String modaliadDePagoDeInteresPaso3= loginPersonaIBK.driver.findElement(modalidadDePagoDeInteres_paso3).getText();
            if (modaliadDePagoDeInterespaso1.contains("2")){
                assertEquals("ABONO EN CUENTA",modaliadDePagoDeInteresPaso3);
            } else {
                assertEquals("ABONO MENS.CTA", modaliadDePagoDeInteresPaso3);
            }

            String cuentaDeAbonoDeInteresesPaso3= loginPersonaIBK.driver.findElement(cuentaDeAbonoDeIntereses_paso3).getText();
            String cuenta_Parte1 = cuentaDeAbonoDeInteresesPaso3.substring(0,3);
            String cuenta_Parte2 = cuentaDeAbonoDeInteresesPaso3.substring(4,6);
            String cuenta_Parte3 = cuentaDeAbonoDeInteresesPaso3.substring(7,14);
            assertEquals(cuentaDeAbonoDeInteresespaso1,cuenta_Parte1+cuenta_Parte2+cuenta_Parte3);

            String tasadeInteresAnualPaso3= loginPersonaIBK.driver.findElement(tasaDeIneteresAnual_paso3).getText();
            assertEquals(tasa_interesAnualPaso2,tasadeInteresAnualPaso3);

            String eMailPaso3= loginPersonaIBK.driver.findElement(email_paso3).getText();
            assertEquals(emailpaso1,eMailPaso3);

            String itfPaso3 = loginPersonaIBK.driver.findElement(ITF_paso3).getText();
            itfpaso3 = itfPaso3;
            assertNotNull(itfPaso3);

            if(capitalpaso3.contains("S/") && monedaPaso3.contains("Soles") || capitalpaso3.contains("US$") && monedaPaso3.contains("Dólares")) {
                System.out.println("Validación ok en paso 3");
            }else{

                String tipodeCambioPaso3= loginPersonaIBK.driver.findElement(tipoDeCambio_paso3).getText();
                assertEquals(tipo_cambioPaso2,tipodeCambioPaso3);


                String montoequivalentePaso3= loginPersonaIBK.driver.findElement(montoEquivalente_paso3).getText();
                assertEquals(monto_equivalentePaso2,montoequivalentePaso3);

                System.out.println("Validación ok en paso 3");
            }

        }else if (modaliadDePagoDeInterespaso1.contains("3" )|| modaliadDePagoDeInterespaso1.contains("1")){ //Capitalizable al vencimiento - Disponible en cuenta

            String modaliadDePagoDeInteresPaso3= loginPersonaIBK.driver.findElement(modalidadDePagoDeInteres_paso3).getText();
            if (modaliadDePagoDeInterespaso1.contains("3")){
                assertEquals("CAPITAL.AL VMTO",modaliadDePagoDeInteresPaso3);
            } else {
                assertEquals("DISPONIBLE CTA.", modaliadDePagoDeInteresPaso3);
            }

            if(capitalpaso3.contains("S/") && monedaPaso3.contains("Soles") ||
                    capitalpaso3.contains("US$") && monedaPaso3.contains("Dólares")) {
                String tasadeInteresAnualPaso3= loginPersonaIBK.driver.findElement(tasadeInteresAnual_paso3).getText();
                assertEquals(tasa_interesAnualPaso2,tasadeInteresAnualPaso3);

                String eMailPaso3= loginPersonaIBK.driver.findElement(eMail_paso3).getText();
                assertEquals(emailpaso1,eMailPaso3);

                String fechaDeApertura_paso3 = loginPersonaIBK.driver.findElement(fechadeApertura_paso3).getText();
                fechaPresentacionPaso3 = fechaDeApertura_paso3;
                assertNotNull(fechaDeApertura_paso3);

                String fechaDeVencimiemto_paso3 = loginPersonaIBK.driver.findElement(fechadeVencimiemto_paso3).getText();
                fechaDeVencimiemtoPaso3 = fechaDeVencimiemto_paso3;
                assertNotNull(fechaDeVencimiemto_paso3);

                String itfPaso3 = loginPersonaIBK.driver.findElement(itf_paso3).getText();
                itfpaso3 = itfPaso3;
                assertNotNull(itfPaso3);

                System.out.println("Validación ok en paso 3");

            }else{

                String tipodeCambioPaso3= loginPersonaIBK.driver.findElement(tipodeCambio_paso3).getText();
                assertEquals(tipo_cambioPaso2,tipodeCambioPaso3);

                String montoequivalentePaso3= loginPersonaIBK.driver.findElement(montodquivalente_paso3).getText();
                assertEquals(monto_equivalentePaso2,montoequivalentePaso3);

                System.out.println("Validación ok en paso 3");

            }
        }
    }
    public void validarDatosConstancia(){
        WebElement EnviarConstancia = loginPersonaIBK.driver.findElement(enviarConstancia);
        EnviarConstancia.click();

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String tituloModalEnvioDeConstancia= loginPersonaIBK.driver.findElement(By.xpath("//*[@id='enviarDEU01']/div/div/div[1]/h5")).getText();
        assertEquals("ENVÍO DE CONSTANCIA", tituloModalEnvioDeConstancia);

        String SubtituloModalEnvioDeConstancia= loginPersonaIBK.driver.findElement(By.xpath("//*[@id='enviarDEU01']/div/div/div[2]/div[1]/span")).getText();
        assertEquals("Constancia de Apertura de plazo fijo con cargo en cuenta", SubtituloModalEnvioDeConstancia);

        String numeroReferencia = loginPersonaIBK.driver.findElement(numeroDeReferencia_constancia).getText();
        assertEquals(numeroReferenciaPaso3,numeroReferencia);

        String numeroOperacion = loginPersonaIBK.driver.findElement(numeroDeOperacion_constancia).getText();
        assertEquals(numeroOperacionPaso3,numeroOperacion);

        String numeroContrato = loginPersonaIBK.driver.findElement(numeroDeContrato_constancia).getText();

        assertEquals(numeroContratoPaso3,numeroContrato);

        String fechaPresentacion = loginPersonaIBK.driver.findElement(fechaDePresentacion_constancia).getText();
        assertEquals(fechaPresentacionPaso3,fechaPresentacion);

        String horaPresentacion = loginPersonaIBK.driver.findElement(horaDePresentacion_constancia).getText();
        assertEquals(horaPresentacionPaso3,horaPresentacion);

        String numeroCuentaDPF = loginPersonaIBK.driver.findElement(numeroDeCuentaPlazoFijo_constancia).getText();
        assertEquals(numeroCuentaDPFPaso3,numeroCuentaDPF);

        String capitalConstancia= loginPersonaIBK.driver.findElement(capital_constancia).getText();
        if (capitalConstancia.contains(capitalpaso1)){
            assertNotNull(capitalConstancia);
        }

        String monedaConstancia= loginPersonaIBK.driver.findElement(moneda_constancia).getText();
        if(monedapaso1.contains("604")){
            assertEquals("Soles",monedaConstancia);
        }else{
            assertEquals("Dólares",monedaConstancia);
        }


        String plazoEnDiasConstancia= loginPersonaIBK.driver.findElement(plazo_constancia).getText();
        if(plazoEnDiasConstancia.contains(plazoEnDiaspaso1)){
            String dias = loginPersonaIBK.driver.findElement(diasPlazo_constancia).getText();
            assertEquals("días",dias);
        }

        String cuentaDeAhorroOrigenConstancia= loginPersonaIBK.driver.findElement(cuentaDeAhorroOrigen_constancia).getText();
        String cuentaParte1 = cuentaDeAhorroOrigenConstancia.substring(0,3);
        String cuentaParte2 = cuentaDeAhorroOrigenConstancia.substring(4,6);
        String cuentaParte3 = cuentaDeAhorroOrigenConstancia.substring(7,14);
        assertEquals(cuentaOrigenpaso1,cuentaParte1+cuentaParte2+cuentaParte3);

        if (modaliadDePagoDeInterespaso1.contains("2" )|| modaliadDePagoDeInterespaso1.contains("5")){ //Abono en cuenta - Abono mensual

            String modaliadDePagoDeInteresConstancia= loginPersonaIBK.driver.findElement(modalidadDePagoDeInteres_constancia).getText();
            if (modaliadDePagoDeInterespaso1.contains("2")){
                assertEquals("ABONO EN CUENTA",modaliadDePagoDeInteresConstancia);
            } else {
                assertEquals("ABONO MENS.CTA", modaliadDePagoDeInteresConstancia);
            }

            String cuentaDeAbonoDeInteresesConstancia= loginPersonaIBK.driver.findElement(cuentaDeAbonoDeIntereses_constancia).getText();
            String cuenta_Parte1 = cuentaDeAbonoDeInteresesConstancia.substring(0,3);
            String cuenta_Parte2 = cuentaDeAbonoDeInteresesConstancia.substring(4,6);
            String cuenta_Parte3 = cuentaDeAbonoDeInteresesConstancia.substring(7,14);
            assertEquals(cuentaDeAbonoDeInteresespaso1,cuenta_Parte1+cuenta_Parte2+cuenta_Parte3);

            String tasadeInteresAnualConstancia= loginPersonaIBK.driver.findElement(tasadeinteresAnual_constancia).getText();
            assertEquals(tasa_interesAnualPaso2,tasadeInteresAnualConstancia+" "+"%");

            String eMailconstancia= loginPersonaIBK.driver.findElement(email_constancia).getText();
            assertEquals(emailpaso1,eMailconstancia);

            String itfconstancia= loginPersonaIBK.driver.findElement(ITF_constancia).getText();
            assertEquals(itfpaso3,itfconstancia);

            if(capitalConstancia.contains("S/") && monedaConstancia.contains("Soles") || capitalConstancia.contains("US$") && monedaConstancia.contains("Dólares")) {
                System.out.println("Validación ok en constancia");
            }else{

                String tipodeCambioConstancia= loginPersonaIBK.driver.findElement(tipoDeCambio_constancia).getText();
                assertEquals(tipo_cambioPaso2,tipodeCambioConstancia);


                String montoequivalenteConstancia= loginPersonaIBK.driver.findElement(montoEquivalente_constancia).getText();
                assertEquals(monto_equivalentePaso2,montoequivalenteConstancia);
                System.out.println("Validación ok en constancia");
            }

        }else if (modaliadDePagoDeInterespaso1.contains("3" )|| modaliadDePagoDeInterespaso1.contains("1")){ //Capitalizable al vencimiento - Disponible en cuenta

            String modaliadDePagoDeInteresConstancia= loginPersonaIBK.driver.findElement(modalidadDePagoDeInteres_paso3).getText();
            if (modaliadDePagoDeInterespaso1.contains("3")){
                assertEquals("CAPITAL.AL VMTO",modaliadDePagoDeInteresConstancia);
            } else {
                assertEquals("DISPONIBLE CTA.", modaliadDePagoDeInteresConstancia);
            }

            if(capitalConstancia.contains("S/") && monedaConstancia.contains("Soles") ||
                    capitalConstancia.contains("US$") && monedaConstancia.contains("Dólares")) {
                String tasadeInteresAnualConstancias= loginPersonaIBK.driver.findElement(tasadeInteresAnual_constancia).getText();
                assertEquals(tasa_interesAnualPaso2,tasadeInteresAnualConstancias+" "+"%");

                String eMailConstancia= loginPersonaIBK.driver.findElement(eMail_constancia).getText();
                assertEquals(emailpaso1,eMailConstancia);

                String fechaDeApertura_Constancia = loginPersonaIBK.driver.findElement(fechadeApertura_constancia).getText();
                assertEquals(fechaPresentacionPaso3,fechaDeApertura_Constancia);

                String fechaDeVencimiemto_Constancia = loginPersonaIBK.driver.findElement(fechadeVencimiemto_constancia).getText();
                assertEquals(fechaDeVencimiemtoPaso3,fechaDeVencimiemto_Constancia);


                String itfConstancia = loginPersonaIBK.driver.findElement(Itf_constancia).getText();
                assertEquals(itfpaso3,itfConstancia);

                System.out.println("Validación ok en constancia");

            }else{

                String tipodeCambioConstancia= loginPersonaIBK.driver.findElement(tipodeCambio_constancia).getText();
                assertEquals(tipo_cambioPaso2,tipodeCambioConstancia);

                String montoequivalenteConstancia= loginPersonaIBK.driver.findElement(montodquivalente_constancia).getText();
                assertEquals(monto_equivalentePaso2,montoequivalenteConstancia);
                System.out.println("Validación ok en constancia");
            }
        }
    }
    public void enviarConstancia(String correo, String asunto){
        WebElement seleccionarEmailPara= loginPersonaIBK.driver.findElement(emailPara);
        seleccionarEmailPara.sendKeys(correo);

        WebElement seleccionarEmailAsunto= loginPersonaIBK.driver.findElement(emailasunto);
        seleccionarEmailAsunto.sendKeys(asunto);

        WebElement seleccionarBotonEnviar= loginPersonaIBK.driver.findElement(By.xpath("*//a[contains(text(),'ENVIAR')]"));
        seleccionarBotonEnviar.click();

    }
    public void validarConformidadDeEnvio(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String tituloConfirmacionObtenido = loginPersonaIBK.driver.findElement(By.xpath("//form[@id='j_idt72']//div[@id='dlgConfirmacion']/div[2]/h2")).getText();
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
