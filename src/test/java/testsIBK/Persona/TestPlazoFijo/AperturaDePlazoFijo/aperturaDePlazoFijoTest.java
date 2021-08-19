package testsIBK.Persona.TestPlazoFijo.AperturaDePlazoFijo;

import common.BaseDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.aperturaDePlazoFijo;
import util.Utilities;


public class aperturaDePlazoFijoTest extends BaseDriver {

    aperturaDePlazoFijo aperturaDePlazoFijo =  new aperturaDePlazoFijo(driver);
    Utilities utilities = new Utilities();

    @BeforeClass
    public static void driverInstanceCreation() {
        initDriver();
    }
    @Before
    public void metodosBefore(){
        utilities.loginPersonaIBK_usuario1("4", "16466306");
        aperturaDePlazoFijo.ingresarAaperturaDePlazoFijoDesdeMenu();
    }
    @Test
    public void aperturaDePlazoFijoConModalidadDisponibleEnCuenta (){
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        aperturaDePlazoFijo.paso1("210010021742","604","90","1","100",
            "","leticia.moreno@encora.com");
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        aperturaDePlazoFijo.paso2();
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso3();
        aperturaDePlazoFijo.paso3();
        aperturaDePlazoFijo.validarDatosConstancia();
        utilities.enviarConstancia("leticia.moreno@encora.com","aperturaDePlazoFijoConModalidadDisponibleEnCuenta");
        utilities.validarConformidadDeEnvio();
    }

    @Test
    public void aperturaDePlazoFijoConModalidadCapitalizableAlVencimiento(){
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        aperturaDePlazoFijo.paso1("210010021742","604","90","3","100",
                "","leticia.moreno@encora.com");
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        aperturaDePlazoFijo.paso2();
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso3();
        aperturaDePlazoFijo.paso3();
        aperturaDePlazoFijo.validarDatosConstancia();
        utilities.enviarConstancia("leticia.moreno@encora.com","aperturaDePlazoFijoConModalidadCapitalizableAlVencimiento");
        utilities.validarConformidadDeEnvio();

    }

    @Test
    public void aperturaDePlazoFijoConModalidadAbonoMensual_bimoneda(){
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        aperturaDePlazoFijo.paso1("210010021742","840","90","5","100",
                "210029556371","leticia.moreno@encora.com");
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        aperturaDePlazoFijo.paso2();
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso3();
        aperturaDePlazoFijo.paso3();
        aperturaDePlazoFijo.validarDatosConstancia();
        utilities.enviarConstancia("leticia.moreno@encora.com","aperturaDePlazoFijoConModalidadAbonoMensual_bimoneda");
        utilities.validarConformidadDeEnvio();
    }

    @Test
    public void aperturaDePlazoFijoConModalidadAbonoMensual_unimoneda(){
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        aperturaDePlazoFijo.paso1("210010021742","604","90","5","100",
                "210010021742","leticia.moreno@encora.com");
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        aperturaDePlazoFijo.paso2();
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso3();
        aperturaDePlazoFijo.paso3();
        aperturaDePlazoFijo.validarDatosConstancia();
        utilities.enviarConstancia("leticia.moreno@encora.com","aperturaDePlazoFijoConModalidadAbonoMensual_unimoneda");
        utilities.validarConformidadDeEnvio();
    }

    @Test
    public void aperturaDePlazoFijoConModalidadAbonoEnCuenta(){
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        aperturaDePlazoFijo.paso1("210010021742","840","90","2","100",
                "210029556371","leticia.moreno@encora.com");
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        aperturaDePlazoFijo.paso2();
        aperturaDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso3();
        aperturaDePlazoFijo.paso3();
        aperturaDePlazoFijo.validarDatosConstancia();
        utilities.enviarConstancia("leticia.moreno@encora.com","aperturaDePlazoFijoConModalidadAbonoEnCuenta");
        utilities.validarConformidadDeEnvio();
    }

    @After
    public void metodoAfter(){
        exitDriver();
    }


}
