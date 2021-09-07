package testsIBK.Persona.PlazoFijo.CancelacionDePlazoFijoCon3Pasos;

import common.BaseDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import pageObjects.cancelacionDePlazoFijo;
import org.junit.Test;
import util.Utilities;

public class cancelacionDePlazoFijoCon3pasosDesdeAccesoDirecto extends BaseDriver {

    cancelacionDePlazoFijo cancelacionDePlazoFijo =  new cancelacionDePlazoFijo(driver);
    Utilities utilities = new Utilities();


    @BeforeClass
    public static void driverInstanceCreation() {
        initDriver();
    }

    @Before
    public void metodosBefore(){
        utilities.loginPersonaIBK_usuario1("4", "16466306");
    }

    @Test
    public void cancelarCuentaDePlazoFijoSinFondoCon3pasos() {

        //utilities.loginPersonaIBK_usuario1("4", "16466306");
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeAccesoDirecto("310-01-9982284");
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        cancelacionDePlazoFijo.cancelarCuentaPlazoFijoconEnCero();
        cancelacionDePlazoFijo.validarDatosDeModalConstancia();
        utilities.enviarConstancia("leticia.moreno@avantica.com","cancelarCuentaDePlazoFijoSinFondoCon3pasos");
        utilities.validarConformidadDeEnvio();
    }

    @Test
    public void cancelarCuentaPlazofijoDeSolesASolesCon3pasos(){
        //utilities.loginPersonaIBK_usuario1("4", "16466306");
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeAccesoDirecto("310-01-9982860");
        cancelacionDePlazoFijo.seleccionarTipoTransferenciaDesdeModal();
        //Paso 1
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3desdeAccesoDirecto("210010000792");
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
        utilities.enviarConstancia("leticia.moreno@avantica.com","cancelarCuentaPlazofijoDeSolesASolesCon3pasos");
        utilities.validarConformidadDeEnvio();
    }

    @Test
    public void cancelarCuentaPlazofijoDeDolaresADolaresCon3pasos(){
        //utilities.loginPersonaIBK_usuario1("4", "16466306");
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeAccesoDirecto("310-02-9979560");
        cancelacionDePlazoFijo.seleccionarTipoTransferenciaDesdeModal();
        //Paso 1
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3desdeAccesoDirecto("210029556371");
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
        utilities.enviarConstancia("leticia.moreno@avantica.com","cancelarCuentaPlazofijoDeDolaresADolaresCon3pasos");
        utilities.validarConformidadDeEnvio();

    }

    @Test
    public void cancelarCuentaPlazofijoDeDolaresASolesCon3pasos(){
        //utilities.loginPersonaIBK_usuario1("4", "16466306");
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeAccesoDirecto("310-02-9979690");
        cancelacionDePlazoFijo.seleccionarTipoTransferenciaDesdeModal();
        //Paso 1
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3desdeAccesoDirecto("210010021742");
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
        utilities.enviarConstancia("leticia.moreno@avantica.com","cancelarCuentaPlazofijoDeDolaresASolesCon3pasos");
        utilities.validarConformidadDeEnvio();

    }

    @Test
    public void cancelarCuentaPlazofijoDeSolesADolaresCon3pasos(){
        //utilities.loginPersonaIBK_usuario1("4", "16466306");
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeAccesoDirecto("310-01-9983754");
        cancelacionDePlazoFijo.seleccionarTipoTransferenciaDesdeModal();
        //Paso 1
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3desdeAccesoDirecto("210029556371");
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
        utilities.enviarConstancia("leticia.moreno@avantica.com","cancelarCuentaPlazofijoDeSolesADolaresCon3pasos");
        utilities.validarConformidadDeEnvio();

    }

    @After
    public void metodoAfter(){
        exitDriver();
    }
}
