package testsIBK.Persona.Administracion;

import common.BaseDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.actualizacionDeDatos;
import util.Utilities;

public class actualizacionDeDatosTest  extends BaseDriver {
    Utilities utilities = new Utilities();
    actualizacionDeDatos actualizacionDeDatos = new actualizacionDeDatos(driver);

    @BeforeClass
    public static void driverInstanceCreation() {
        initDriver();
    }

    @Before
    public void metodosBefore(){
        utilities.loginPersonaIBK_usuario1("4", "17589668");
        utilities.ingresarAMenu("ADMINISTRACIÓN","Actualización de datos","");
    }

    @Test
    public void actualizarCorreo_Movil_NoRecibirOfertas(){
        actualizacionDeDatos.paso1("leticia.moreno@encora.com","Móvil","","","958856993","Claro","S");

    }

    @Test
    public void actualizarCorreo_Fijo_SiRecibirOfertas(){
        actualizacionDeDatos.paso1("leticia.moreno@encora.com","Fijo","043","321245","","01","N");

    }

}
