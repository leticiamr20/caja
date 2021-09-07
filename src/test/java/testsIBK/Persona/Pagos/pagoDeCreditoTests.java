package testsIBK.Persona.Pagos;

import common.BaseDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.pagoDeCredito;
import util.Utilities;

public class pagoDeCreditoTests extends BaseDriver {
    pagoDeCredito pagoDeCredito =  new pagoDeCredito(driver);
    Utilities utilities = new Utilities();

    @BeforeClass
    public static void driverInstanceCreation() {
        initDriver();
    }

    @Before
    public void metodosBefore() {
        utilities.loginPersonaIBK_usuario1("5", "00063118"); // 21162692 16611885
        utilities.ingresarAMenu("OPERACIONES","Pagos","Pago de créditos");
    }

    @Test
    public void amortizacionDePagoDeCredito (){
        pagoDeCredito.paso1("210-01-1018469","072-01-2242305");
        pagoDeCredito.paso2("OPE_AMOR","1");
        pagoDeCredito.paso3();
        pagoDeCredito.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com", "amortizacionDePagoDeCredito");
        utilities.validarConformidadDeEnvio();
    }

    @Test
    public void pagoDeCuotaDePagoDeCredito(){
        pagoDeCredito.paso1("210-01-1018469","072-01-2242305");
        pagoDeCredito.paso2("OPE_PCUO","");
        pagoDeCredito.paso3();
        pagoDeCredito.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com", "pagoDeCuotaDePagoDeCredito");
        utilities.validarConformidadDeEnvio();
    }

    @After
    public void metodoAfter(){
        exitDriver();
    }
}
