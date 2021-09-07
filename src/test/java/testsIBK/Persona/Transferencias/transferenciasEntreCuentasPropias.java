package testsIBK.Persona.Transferencias;

import common.BaseDriver;
import org.junit.After;
import org.junit.BeforeClass;
import pageObjects.transferencias;
import org.junit.Before;
import org.junit.Test;
import util.Utilities;

public class transferenciasEntreCuentasPropias extends BaseDriver{

    transferencias transferencias =  new transferencias(driver);
    Utilities utilities = new Utilities();

    @BeforeClass
    public static void driverInstanceCreation() {
        initDriver();
    }

    @Before
    public void metodosBefore() {
        utilities.loginPersonaIBK_usuario1("4", "16466306");
        utilities.ingresarAMenu("OPERACIONES","Transferencias","Entre cuentas propias");
    }

    @Test
    public void transferenciasEntreCuentasPropiasSolesASoles(){
        transferencias.validarCaracterisicasDeFormularioCargadoPaso1();
        transferencias.Paso1("430-01-0436982","210-01-0021742","100","testSolesASoles");
        transferencias.validarCaracterisicasDeFormularioCargadoPaso2();
        transferencias.validarDataPaso2();
        transferencias.Paso2();
        transferencias.Paso3();
        transferencias.validarDatosConstancia();
        utilities.enviarConstancia("leticia.moreno@encora.com","transferenciasEntreCuentasPropiasSolesASoles");
        utilities.validarConformidadDeEnvio();
    }

    @Test
    public void transferenciasEntreCuentasPropiasDolaresAdolares(){
        transferencias.validarCaracterisicasDeFormularioCargadoPaso1();
        transferencias.Paso1("210-02-9556371","110-02-1411910","100","TestDolaresADolares");
        transferencias.validarCaracterisicasDeFormularioCargadoPaso2();
        transferencias.validarDataPaso2();
        transferencias.Paso2();
        transferencias.Paso3();
        transferencias.validarDatosConstancia();
        utilities.enviarConstancia("leticia.moreno@encora.com", "transferenciasEntreCuentasPropiasDolaresADolares");
        utilities.validarConformidadDeEnvio();

    }

    @Test
    public void transferenciasEntreCuentasPropiasSolesAdolares(){
        transferencias.validarCaracterisicasDeFormularioCargadoPaso1();
        transferencias.Paso1("210-01-0021742","210-02-9556371","100","testSolesAdolares");
        transferencias.validarCaracterisicasDeFormularioCargadoPaso2();
        transferencias.validarDataPaso2();
        transferencias.Paso2();
        transferencias.Paso3();
        transferencias.validarDatosConstancia();
        utilities.enviarConstancia("leticia.moreno@encora.com", "transferenciasEntreCuentasPropiasSolesAdolares");
        utilities.validarConformidadDeEnvio();

    }

    @Test
    public void transferenciasEntreCuentasPropiasDolaresAsoles(){
        transferencias.validarCaracterisicasDeFormularioCargadoPaso1();
        transferencias.Paso1("210-02-9556371","210-01-0021742","100","TestDolaresAsoles");
        transferencias.validarCaracterisicasDeFormularioCargadoPaso2();
        transferencias.validarDataPaso2();
        transferencias.Paso2();
        transferencias.Paso3();
        transferencias.validarDatosConstancia();
        utilities.enviarConstancia("leticia.moreno@encora.com", "transferenciasEntreCuentasPropiasDolaresAsoles");
        utilities.validarConformidadDeEnvio();

    }

    @After
    public void metodoAfter(){
        exitDriver();
    }

}
