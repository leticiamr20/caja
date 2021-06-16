package testsIBK.Persona.CancelacionDePlazoFijoCon3Pasos;

import common.cancelacionDePlazoFijo;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class cancelacionDePlazoFijoCon3pasosAccesoDirecto {
    cancelacionDePlazoFijo cancelacionDePlazoFijo =  new cancelacionDePlazoFijo(driver);
    public static WebDriver driver;

    @Test
    public void prueba() {
        cancelacionDePlazoFijo.loginUsuarioCancelacion3pasos();
        cancelacionDePlazoFijo.ingresarAconsultaDeCuenta();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }

}
