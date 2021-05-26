package testsIBK.Persona.CancelacionDePlazoFijoCon3Pasos;

import common.BaseDriver;
import common.cancelacionDePlazoFijo;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class cancelacionDePlazofijoCon3pasosConFondo extends BaseDriver {

    cancelacionDePlazoFijo cancelacionDePlazoFijo =  new cancelacionDePlazoFijo(driver);
    public static WebDriver driver;

    @Test
    public void cancelacionDePlazofijoDeSolesASolesCon3pasos(){
        //PASO 1
        cancelacionDePlazoFijo.loginusuario1();
        cancelacionDePlazoFijo.ingresarACancelacionDePlazoFijoDesdeMenu();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso1();
        cancelacionDePlazoFijo.completarPaso1De3ConFondo("310019981317","210010021742");
        //PASO 2
        cancelacionDePlazoFijo.validarCaracterisicasDeFormularioCargadoPaso2();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso2();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso2();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cancelacionDePlazoFijo.completarPaso2De3ConFondo();
        //PASO 3
        cancelacionDePlazoFijo.validarDatosAdicionalesPaso3De3();
        cancelacionDePlazoFijo.validarDatosDeCancelacionPaso3();
        cancelacionDePlazoFijo.validarDatosDeDatosDelAbonoPaso3();
        //cancelacionDePlazoFijo.validarDatosDeModalConstancia();
    }
    /*
    @Test
    //Flujo desde menu: Cancelación de Plazo fijo con fondo en dolares con 3 pasos
    public void cancelacionDePlazofijoDeDolaresAdolaresCon3pasos(){
    }
    @Test
    //Flujo desde menu: Cancelación de Plazo fijo con fondo de soles a dolares con 3 pasos
    public void cancelacionDePlazofijoDeSolesAdolaresCon3pasos(){
    }
    @Test
    //Flujo desde menu: Cancelación de Plazo fijo con fondo de dolares a soles con 3 pasos
    public void cancelacionDePlazofijoDeDolaresAsolesCon3pasos(){
    }
    */


}
