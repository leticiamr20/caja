package testsIBK.Persona.Transferencias;

import common.BaseDriver;
import common.loginPersonaIBK;
import common.transferencias;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class transferenciasEntreCuentasPropias extends BaseDriver {

    transferencias transferencias =  new transferencias(driver);
    public static WebDriver driver;

    @Before
    public void init(){
        transferencias.loginUsuarioTransferencias();
        transferencias.ingresarAMenuTransferenciasEntreCuentasPropias();

    }

    @Test
    public void transferenciasEntreCuentasPropiasSolesASoles(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        transferencias.validarCaracterisicasDeFormularioCargadoPaso1();
        transferencias.Paso1("430-01-0436982","210-01-0021742","100","testSolesASoles");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        transferencias.validarCaracterisicasDeFormularioCargadoPaso2();
        transferencias.validarDataPaso2();
        transferencias.Paso2();
        transferencias.Paso3();
        transferencias.validarDatosConstancia();
        transferencias.enviarConstancia("leticia.moreno@avantica.com", "transferenciasEntreCuentasPropiasSolesASoles");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        transferencias.confirmacion();
    }

    @Test
    public void transferenciasEntreCuentasPropiasSolesAdolares(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        transferencias.validarCaracterisicasDeFormularioCargadoPaso1();
        transferencias.Paso1("210-01-0021742","210-02-9556371","100","testSolesAdolares");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        transferencias.validarCaracterisicasDeFormularioCargadoPaso2();
        transferencias.validarDataPaso2();
        transferencias.Paso2();
        transferencias.Paso3();
        transferencias.validarDatosConstancia();
        transferencias.enviarConstancia("leticia.moreno@avantica.com", "transferenciasEntreCuentasPropiasSolesAdolares");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        transferencias.confirmacion();

    }

    @Test
    public void transferenciasEntreCuentasPropiasDolaresAsoles(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        transferencias.validarCaracterisicasDeFormularioCargadoPaso1();
        transferencias.Paso1("210-02-9556371","210-01-0021742","100","TestDolaresAsoles");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        transferencias.validarCaracterisicasDeFormularioCargadoPaso2();
        transferencias.validarDataPaso2();
        transferencias.Paso2();
        transferencias.Paso3();
        transferencias.validarDatosConstancia();
        transferencias.enviarConstancia("leticia.moreno@avantica.com", "transferenciasEntreCuentasPropiasDolaresAsoles");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        transferencias.confirmacion();

    }

}
