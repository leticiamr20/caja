package testsIBK.Persona.CancelacionDePlazoFijoCon3Pasos;

import common.cancelacionDePlazoFijo;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class cancelacionDePlazoFijoCon3pasosAccesoDirecto {
    cancelacionDePlazoFijo cancelacionDePlazoFijo =  new cancelacionDePlazoFijo(driver);
    public static WebDriver driver;

    @Test
    public void cancelarCuentaDePlazoFijoSinFondoCon3pasos() {

        cancelacionDePlazoFijo.loginUsuarioCancelacion3pasos();
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeAccesoDirecto("310-01-9979302");
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        cancelacionDePlazoFijo.cancelarCuentaPlazoFijoconEnCero();
        cancelacionDePlazoFijo.validarDatosDeModalConstancia();
        cancelacionDePlazoFijo.funcionEnviarConstancia("leticia.moreno@avantica.com","cancelarCuentaDePlazoFijoSinFondoCon3pasos");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.confirmacionDeEnvioDeConstancia();


    }

    @Test
    public void cancelarCuentaPlazofijoDeSolesASolesCon3pasos(){
        cancelacionDePlazoFijo.loginUsuarioCancelacion3pasos();
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeAccesoDirecto("310-01-9982572");
        cancelacionDePlazoFijo.seleccionarTipoTransferenciaDesdeModal();

        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3desdeAccesoDirecto("210010021742");

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
        cancelacionDePlazoFijo.funcionEnviarConstancia("leticia.moreno@avantica.com","cancelarCuentaPlazofijoDeSolesASolesCon3pasos");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.confirmacionDeEnvioDeConstancia();
    }

    @Test
    public void cancelarCuentaPlazofijoDeDolaresADolaresCon3pasos(){
        cancelacionDePlazoFijo.loginUsuarioCancelacion3pasos();
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeAccesoDirecto("310-02-9979010");
        cancelacionDePlazoFijo.seleccionarTipoTransferenciaDesdeModal();

        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3desdeAccesoDirecto("210029556371");

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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.funcionEnviarConstancia("leticia.moreno@avantica.com","cancelarCuentaPlazofijoDeDolaresADolaresCon3pasos");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.confirmacionDeEnvioDeConstancia();

    }

    @Test
    public void cancelarCuentaPlazofijoDeDolaresASolesCon3pasos(){
        cancelacionDePlazoFijo.loginUsuarioCancelacion3pasos();
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeAccesoDirecto("310-02-9979025");
        cancelacionDePlazoFijo.seleccionarTipoTransferenciaDesdeModal();

        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3desdeAccesoDirecto("210010021742");

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
        cancelacionDePlazoFijo.funcionEnviarConstancia("leticia.moreno@avantica.com","cancelarCuentaPlazofijoDeDolaresASolesCon3pasos");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.confirmacionDeEnvioDeConstancia();

    }

    @Test
    public void cancelarCuentaPlazofijoDeSolesADolaresCon3pasos(){
        cancelacionDePlazoFijo.loginUsuarioCancelacion3pasos();
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeAccesoDirecto("310-01-9983094");
        cancelacionDePlazoFijo.seleccionarTipoTransferenciaDesdeModal();

        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3desdeAccesoDirecto("210029556371");

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
        cancelacionDePlazoFijo.funcionEnviarConstancia("leticia.moreno@avantica.com","cancelarCuentaPlazofijoDeSolesADolaresCon3pasos");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.confirmacionDeEnvioDeConstancia();

    }
}
