package testsIBK.Persona.CancelacionDePlazoFijoCon3Pasos;

import common.BaseDriver;
import pageObjects.cancelacionDePlazoFijo;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class cancelacionDePlazofijoCon3pasosConFondo{

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
        cancelacionDePlazoFijo.completarPaso1De3ConFondo("310019982347","210010021742");
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
        cancelacionDePlazoFijo.funcionEnviarConstancia("leticia.moreno@encora.com","transferenciasEntreCuentasPropias");
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
        cancelacionDePlazoFijo.completarPaso1De3ConFondo("310029979046","210029556371");
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
        cancelacionDePlazoFijo.funcionEnviarConstancia("leticia.moreno@encora.com","transferenciasEntreCuentasPropias");
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
        cancelacionDePlazoFijo.completarPaso1De3ConFondo("310029979051","210010021742");
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
        cancelacionDePlazoFijo.funcionEnviarConstancia("leticia.moreno@encora.com","transferenciasEntreCuentasPropias");
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
        cancelacionDePlazoFijo.completarPaso1De3ConFondo("310019982352","210029556371");
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
        cancelacionDePlazoFijo.funcionEnviarConstancia("leticia.moreno@encora.com","transferenciasEntreCuentasPropias cancelacionDePlazoFijoDeSolesADolaresCon3Pasos");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.confirmacionDeEnvioDeConstancia();
    }
}
