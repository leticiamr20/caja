package testsIBK.Persona.TestPlazoFijo.incrementoDePlazoFijoTest;

import common.BaseDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.incrementoDePlazoFijo;
import util.Utilities;

public class incrementoDePlazoFijoTest extends BaseDriver {
    incrementoDePlazoFijo incrementoDePlazoFijo =  new incrementoDePlazoFijo(driver);
    Utilities utilities = new Utilities();

    @BeforeClass
    public static void driverInstanceCreation() {
        initDriver();
    }

    @Before
    public void metodosBefore(){
        utilities.loginPersonaIBK_usuario1("4", "16466306");
        incrementoDePlazoFijo.ingresarAincrementoDePlazoFijoDesdeMenu();
        incrementoDePlazoFijo.validarFormularioDeSeleccionOperacion();

    }

    @Test
    public void incrementoACuentaSinFondoCon3PasosSolesASoles(){
        incrementoDePlazoFijo.tipoDeOperación();
        incrementoDePlazoFijo.paso1("310-01-9982174","210-01-0021742","10.55");
        incrementoDePlazoFijo.paso2();
        incrementoDePlazoFijo.paso3();
        incrementoDePlazoFijo.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com", "test");
        utilities.validarConformidadDeEnvio();
    }

    @Test
    public void incrementoACuentaSinFondoCon3PasosDolaresAsoles(){
        incrementoDePlazoFijo.tipoDeOperación();
        incrementoDePlazoFijo.paso1("310-01-9982174","210-02-9556371","10.55");
        incrementoDePlazoFijo.paso2();
        incrementoDePlazoFijo.paso3();
        incrementoDePlazoFijo.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com", "test");
        utilities.validarConformidadDeEnvio();
    }

    @Test
    public void incrementoACuentaConFondoCon3PasosSolesAdolares(){
        incrementoDePlazoFijo.tipoDeOperación();
        incrementoDePlazoFijo.paso1("310-02-9979051","210-01-0021742","10");
        incrementoDePlazoFijo.paso2();
        incrementoDePlazoFijo.paso3();
        incrementoDePlazoFijo.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com", "test");
        utilities.validarConformidadDeEnvio();

    }

    @Test
    public void incrementoACuentaConFondoCon3PasosDolaresASoles(){
        incrementoDePlazoFijo.tipoDeOperación();
        incrementoDePlazoFijo.paso1("310-01-9982174","210-02-9556371","10.55");
        incrementoDePlazoFijo.paso2();
        incrementoDePlazoFijo.paso3();
        incrementoDePlazoFijo.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com", "test");
        utilities.validarConformidadDeEnvio();
    }

    @After
    public void metodoAfter(){
        exitDriver();
    }



}
