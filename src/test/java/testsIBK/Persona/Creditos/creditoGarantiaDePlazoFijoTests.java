package testsIBK.Persona.Creditos;

import common.BaseDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.creditoGrarantiaDePlazoFijo;
import util.Utilities;

public class creditoGarantiaDePlazoFijoTests extends BaseDriver {
    Utilities utilities = new Utilities();
    creditoGrarantiaDePlazoFijo creditoGrarantiaDePlazoFijo = new creditoGrarantiaDePlazoFijo(driver);

    @BeforeClass
    public static void driverInstanceCreation() {
        initDriver();
    }

    @Before
    public void metodosBefore(){
        utilities.loginPersonaIBK_usuario1("4", "17589668");
        utilities.ingresarAMenu("OPERACIONES","Créditos","Garantía de Plazo fijo");
    }

    @Test
    public void creditoGarantiaDPFDeSolesAsoles_conLibreAmortizacion(){
        creditoGrarantiaDePlazoFijo.paso1("310-01-9978089","604","500",
                "1","30","210-01-0025445","leticia.moreno@encora.com",
                "", "");
        creditoGrarantiaDePlazoFijo.paso2("CONSULTOR","12","1000","200");
        creditoGrarantiaDePlazoFijo.paso3();
        creditoGrarantiaDePlazoFijo.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com","creditoGarantiaDPFDeSolesAsoles_conLibreAmortizacion");
        utilities.validarConformidadDeEnvio();
    }
    @Test
    public void creditoGarantiaDPFDeDolaressADolares_sinLibreAmortizacion(){
        creditoGrarantiaDePlazoFijo.paso1("310-02-9977871","840","500",
                "0","30","210-02-9556779","leticia.moreno@encora.com",
                "60","10");
        creditoGrarantiaDePlazoFijo.paso2("CONSULTOR","12","1000","200");
        creditoGrarantiaDePlazoFijo.paso3();
        creditoGrarantiaDePlazoFijo.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com","creditoGarantiaDPFDeDolaressADolares_sinLibreAmortizacion");
        utilities.validarConformidadDeEnvio();
    }


    @After
    public void metodoAfter(){
       exitDriver();
    }

}
