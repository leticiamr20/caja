package testsIBK.Persona.PlazoFijo.incrementoDePlazoFijoTest;

import common.BaseDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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
        utilities.ingresarAMenu("OPERACIONES","Plazo Fijo","Incremento de plazo fijo");
        incrementoDePlazoFijo.validarFormularioDeSeleccionOperacion();

    }

    @Test
    public void incrementoACuentaSinFondoCon3PasosSolesASoles(){
        incrementoDePlazoFijo.tipoDeOperación();
        incrementoDePlazoFijo.paso1("310-01-9982174","210-01-0021742","10.55");
        incrementoDePlazoFijo.paso2();
        incrementoDePlazoFijo.paso3();
        incrementoDePlazoFijo.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com", "incrementoACuentaSinFondoCon3PasosSolesASoles");
        utilities.validarConformidadDeEnvio();
    }

    @Test
    public void incrementoACuentaSinFondoCon3PasosDolaresAsoles(){
        incrementoDePlazoFijo.tipoDeOperación();
        incrementoDePlazoFijo.paso1("310-01-9982174","210-02-9556371","10.55");
        incrementoDePlazoFijo.paso2();
        incrementoDePlazoFijo.paso3();
        incrementoDePlazoFijo.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com", "incrementoACuentaSinFondoCon3PasosDolaresAsoles");
        utilities.validarConformidadDeEnvio();
    }

    @Test
    public void incrementoACuentaConFondoCon3PasosSolesAdolares(){
        incrementoDePlazoFijo.tipoDeOperación();
        incrementoDePlazoFijo.paso1("310-02-9979051","210-01-0021742","10");
        incrementoDePlazoFijo.paso2();
        incrementoDePlazoFijo.paso3();
        incrementoDePlazoFijo.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com", "incrementoACuentaConFondoCon3PasosSolesAdolares");
        utilities.validarConformidadDeEnvio();

    }

    @Test
    public void incrementoACuentaConFondoCon3PasosDolaresASoles(){
        incrementoDePlazoFijo.tipoDeOperación();
        incrementoDePlazoFijo.paso1("310-01-9982174","210-02-9556371","10.55");
        incrementoDePlazoFijo.paso2();
        incrementoDePlazoFijo.paso3();
        incrementoDePlazoFijo.validarDatosDeEnvio();
        utilities.enviarConstancia("leticia.moreno@encora.com", "incrementoACuentaConFondoCon3PasosDolaresASoles");
        utilities.validarConformidadDeEnvio();
    }

    @After
    public void metodoAfter(){
        exitDriver();
    }



}
