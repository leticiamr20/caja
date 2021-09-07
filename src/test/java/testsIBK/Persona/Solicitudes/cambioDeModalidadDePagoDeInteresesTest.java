package testsIBK.Persona.Solicitudes;

import common.BaseDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.solicitudCambioModalidadDePagoDeIntereses;
import util.Utilities;

public class cambioDeModalidadDePagoDeInteresesTest extends BaseDriver {

    Utilities utilities = new Utilities();
    pageObjects.solicitudCambioModalidadDePagoDeIntereses solicitudCambioModalidadDePagoDeIntereses = new solicitudCambioModalidadDePagoDeIntereses(driver);

    @BeforeClass
    public static void driverInstanceCreation() {
        initDriver();
    }

    @Before
    public void metodosBefore(){
        utilities.loginPersonaIBK_usuario1("4", "17589668");
        utilities.ingresarAMenu("SOLICITUDES","Plazos fijos","Cambiar modalidad de pago de intereses");
    }

    @Test
    public void cambioDeModalidadDePagoDeIntereses_conAbonoEnCuenta_dolares(){
        solicitudCambioModalidadDePagoDeIntereses.paso1("310-02-9977871","2","210-02-9556779");
        solicitudCambioModalidadDePagoDeIntereses.paso2();
        solicitudCambioModalidadDePagoDeIntereses.paso3();
        solicitudCambioModalidadDePagoDeIntereses.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com","cambioDeModalidadDePagoDeIntereses_conAbonoEnCuenta_dolares");
        utilities.validarConformidadDeEnvio();

    }
    @Test
    public void cambioDeModalidadDePagoDeIntereses_disponibleEnCuenta_Soles(){
        solicitudCambioModalidadDePagoDeIntereses.paso1("310-01-9976406","1","");
        solicitudCambioModalidadDePagoDeIntereses.paso2();
        solicitudCambioModalidadDePagoDeIntereses.paso3();
        solicitudCambioModalidadDePagoDeIntereses.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com","cambioDeModalidadDePagoDeIntereses_disponibleEnCuenta_Soles");
        utilities.validarConformidadDeEnvio();
    }

    @Test
    public void cambioDeModalidadDePagoDeIntereses_AbonoMensual_Soles(){
        solicitudCambioModalidadDePagoDeIntereses.paso1("310-01-9976406","5","210-01-0025445");
        solicitudCambioModalidadDePagoDeIntereses.paso2();
        solicitudCambioModalidadDePagoDeIntereses.paso3();
        solicitudCambioModalidadDePagoDeIntereses.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com","cambioDeModalidadDePagoDeIntereses_AbonoMensual_Soles");
        utilities.validarConformidadDeEnvio();
    }

    @Test
    public void cambioDeModalidadDePagoDeIntereses_capitalizableAlVencimiento_Soles(){
        solicitudCambioModalidadDePagoDeIntereses.paso1("310-01-9976406","3","");
        solicitudCambioModalidadDePagoDeIntereses.paso2();
        solicitudCambioModalidadDePagoDeIntereses.paso3();
        solicitudCambioModalidadDePagoDeIntereses.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com","cambioDeModalidadDePagoDeIntereses_capitalizableAlVencimiento_Soles");
        utilities.validarConformidadDeEnvio();
    }

    @After
    public void metodoAfter(){
        exitDriver();
    }

}
