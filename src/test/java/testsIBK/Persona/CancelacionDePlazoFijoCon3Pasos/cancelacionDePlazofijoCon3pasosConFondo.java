package testsIBK.Persona.CancelacionDePlazoFijoCon3Pasos;

import common.BaseDriver;
import common.cancelacionDePlazoFijo;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import util.Utilities;

import java.io.File;
import java.io.IOException;

public class cancelacionDePlazofijoCon3pasosConFondo extends BaseDriver {

    cancelacionDePlazoFijo cancelacionDePlazoFijo =  new cancelacionDePlazoFijo(driver);
    public static WebDriver driver;

    @Test
    public void cancelacionDePlazofijoDeSolesASolesCon3pasos(){
        //PASO 1
        cancelacionDePlazoFijo.loginUsuarioCancelacion3pasos();
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeMenu();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3ConFondo("310019982331","210010021742");
        //PASO 2
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso2();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso2();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.completarPaso2De3();
        //PASO 3
        cancelacionDePlazoFijo.validarDatosAdicionalesPaso3De3();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso3();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso3();
        cancelacionDePlazoFijo.validarDatosDeModalConstancia();
        cancelacionDePlazoFijo.funcionEnviarConstancia("leticia.moreno@avantica.com","transferenciasEntreCuentasPropias");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cancelacionDePlazoFijo.confirmacionDeEnvioDeConstancia();

    }

    @Test
    public void cancelacionDePlazofijoDeDolaresAdolaresCon3pasos(){
        //PASO 1
        cancelacionDePlazoFijo.loginUsuarioCancelacion3pasos();
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeMenu();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3ConFondo("310029979114","210029556371");
        //PASO 2
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso2();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso2();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cancelacionDePlazoFijo.completarPaso2De3();
        //PASO 3
        cancelacionDePlazoFijo.validarDatosAdicionalesPaso3De3();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso3();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso3();
        cancelacionDePlazoFijo.validarDatosDeModalConstancia();
        cancelacionDePlazoFijo.funcionEnviarConstancia("leticia.moreno@avantica.com","transferenciasEntreCuentasPropias");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.confirmacionDeEnvioDeConstancia();
      }

    @Test
    public void cancelacionDePlazoFijoDeDolaresAsolesCon3Pasos(){
        //PASO 1
        cancelacionDePlazoFijo.loginUsuarioCancelacion3pasos();
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeMenu();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3ConFondo("310029978990","210010021742"); //310019982059  310029978970 310029978943 310029978959 310029978964  310029978985
        //PASO 2
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso2();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso2();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       cancelacionDePlazoFijo.completarPaso2De3();
        //PASO 3
        cancelacionDePlazoFijo.validarDatosAdicionalesPaso3De3();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso3();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso3();
        cancelacionDePlazoFijo.validarDatosDeModalConstancia();
        cancelacionDePlazoFijo.funcionEnviarConstancia("leticia.moreno@avantica.com","transferenciasEntreCuentasPropias");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.confirmacionDeEnvioDeConstancia();
    }

    @Test
    public void cancelacionDePlazoFijoDeSolesADolaresCon3Pasos(){
        //PASO 1
        cancelacionDePlazoFijo.loginUsuarioCancelacion3pasos();
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeMenu();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3ConFondo("310019982085","210029556371");
        //PASO 2
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso2();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso2();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.completarPaso2De3();
        //PASO 3
        cancelacionDePlazoFijo.validarDatosAdicionalesPaso3De3();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso3();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso3();
        cancelacionDePlazoFijo.validarDatosDeModalConstancia();
        cancelacionDePlazoFijo.funcionEnviarConstancia("leticia.moreno@avantica.com","transferenciasEntreCuentasPropias cancelacionDePlazoFijoDeSolesADolaresCon3Pasos");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.confirmacionDeEnvioDeConstancia();
    }
}
