package util;

import common.BaseDriver;
import org.sikuli.script.*;

public class Utilities extends BaseDriver {


    public void ingresarclavede6(){
        Screen screen = new Screen();
        Pattern pattern;
        pattern= new Pattern("C:\\Users\\leticia.moreno\\Desktop\\CAJA\\caja\\src\\main\\resources\\imagenes\\tecla1Clave6.PNG");
        try {
            screen.click(pattern);
            screen.click(pattern);
            screen.click(pattern);
            screen.click(pattern);
            screen.click(pattern);
            screen.click(pattern);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

    }




}





