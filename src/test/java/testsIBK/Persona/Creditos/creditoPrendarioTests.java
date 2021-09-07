package testsIBK.Persona.Creditos;

import common.BaseDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.creditoPrendario;
import util.Utilities;

public class creditoPrendarioTests extends BaseDriver {
    Utilities utilities = new Utilities();
    creditoPrendario creditoPrendario = new creditoPrendario(driver);


    @BeforeClass
    public static void driverInstanceCreation() {
        initDriver();
    }

    @Before
    public void metodosBefore(){
        utilities.loginPersonaIBK_usuario1("4", "17589668");
        utilities.ingresarAMenu("OPERACIONES","Créditos","Crédito prendario");
    }

    @Test
    public void creditoPrendarioSoles(){ //06501012161873  06501012177070
        creditoPrendario.paso1("06501012161873","350","30","210010025445","leticia.moreno@encora.com");
        creditoPrendario.paso2();
        creditoPrendario.paso3();
        creditoPrendario.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com","creditoPrendarioSoles");
        utilities.validarConformidadDeEnvio();
    }

    @After
    public void metodoAfter(){
        exitDriver();
    }

}
