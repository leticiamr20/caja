package testsIBK.Persona.AperturaDePlazoFijo;

import common.loginPersonaIBK;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.aperturaDePlazoFijo;
import pageObjects.transferencias;

import static org.junit.Assert.assertEquals;

public class aperturaDePlazoFijoTest {

    public static WebDriver driver;

    aperturaDePlazoFijo aperturaDePlazoFijo =  new aperturaDePlazoFijo(driver);
    @Before
    public void metodosBefore(){
        aperturaDePlazoFijo.loginUsuarioAperturaPlazoFijo();
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
        aperturaDePlazoFijo.enviarConstancia("leticia.moreno@encora.com","aperturaDePlazoFijoConModalidadDisponibleEnCuenta");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        aperturaDePlazoFijo.validarConformidadDeEnvio();

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
        aperturaDePlazoFijo.enviarConstancia("leticia.moreno@encora.com","aperturaDePlazoFijoConModalidadCapitalizableAlVencimiento");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        aperturaDePlazoFijo.validarConformidadDeEnvio();

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
        aperturaDePlazoFijo.enviarConstancia("leticia.moreno@encora.com","aperturaDePlazoFijoConModalidadAbonoMensual_bimoneda");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        aperturaDePlazoFijo.validarConformidadDeEnvio();

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
        aperturaDePlazoFijo.enviarConstancia("leticia.moreno@encora.com","aperturaDePlazoFijoConModalidadAbonoMensual_unimoneda");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        aperturaDePlazoFijo.validarConformidadDeEnvio();

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
        aperturaDePlazoFijo.enviarConstancia("leticia.moreno@encora.com","aperturaDePlazoFijoConModalidadAbonoEnCuenta");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        aperturaDePlazoFijo.validarConformidadDeEnvio();

    }


}
