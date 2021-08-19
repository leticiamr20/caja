package testsIBK.Persona.TestPlazoFijo.CancelacionDePlazoFijoCon3Pasos;

import common.BaseDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import pageObjects.cancelacionDePlazoFijo;
import org.junit.Test;
import util.Utilities;

public class cancelacionDePlazofijoCon3pasosDesdeMenu extends BaseDriver{

    cancelacionDePlazoFijo cancelacionDePlazoFijo =  new cancelacionDePlazoFijo(driver);
    Utilities utilities = new Utilities();


    @BeforeClass
    public static void driverInstanceCreation() {
        initDriver();
    }

    @Before
    public void metodosBefore(){
        utilities.loginPersonaIBK_usuario1("4", "16466306");
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeMenu();
    }

    @Test
    public void cancelacionDePlazofijoDeSolesASolesCon3pasos(){
        //Paso 1
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3ConFondo("310019982373","210010021742");
        //PASO 2
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso2();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso2();
        //Paso 2
        cancelacionDePlazoFijo.completarPaso2De3();
        //PASO 3
        cancelacionDePlazoFijo.validarDatosAdicionalesPaso3De3();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso3();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso3();
        cancelacionDePlazoFijo.validarDatosDeModalConstancia();
        utilities.enviarConstancia("leticia.moreno@encora.com","cancelacionDePlazofijoDeSolesASolesCon3pasos");
        utilities.validarConformidadDeEnvio();

    }

    @Test
    public void cancelacionDePlazofijoDeDolaresAdolaresCon3pasos(){
        //PASO 1
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3ConFondo("310029979450","210029556371");
        //PASO 2
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso2();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso2();
        cancelacionDePlazoFijo.completarPaso2De3();
        //PASO 3
        cancelacionDePlazoFijo.validarDatosAdicionalesPaso3De3();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso3();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso3();
        cancelacionDePlazoFijo.validarDatosDeModalConstancia();
        utilities.enviarConstancia("leticia.moreno@encora.com","cancelacionDePlazofijoDeDolaresAdolaresCon3pasos");
        utilities.validarConformidadDeEnvio();
      }

    @Test
    public void cancelacionDePlazoFijoDeDolaresAsolesCon3Pasos(){
        //PASO 1
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3ConFondo("310029979465","210010021742");
        //PASO 2
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso2();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso2();
        cancelacionDePlazoFijo.completarPaso2De3();
        //PASO 3
        cancelacionDePlazoFijo.validarDatosAdicionalesPaso3De3();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso3();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso3();
        cancelacionDePlazoFijo.validarDatosDeModalConstancia();
        utilities.enviarConstancia("leticia.moreno@encora.com","cancelacionDePlazoFijoDeDolaresAsolesCon3Pasos");
        utilities.validarConformidadDeEnvio();
    }

    @Test
    public void cancelacionDePlazoFijoDeSolesADolaresCon3Pasos(){
        //PASO 1
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3ConFondo("310019982829","210029556371");
        //PASO 2
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso2();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso2();
        cancelacionDePlazoFijo.completarPaso2De3();
        //PASO 3
        cancelacionDePlazoFijo.validarDatosAdicionalesPaso3De3();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso3();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso3();
        cancelacionDePlazoFijo.validarDatosDeModalConstancia();
        utilities.enviarConstancia("leticia.moreno@encora.com","cancelacionDePlazoFijoDeSolesADolaresCon3Pasos");
        utilities.validarConformidadDeEnvio();
    }

    @After
    public void metodoAfter(){
        exitDriver();
    }
}
