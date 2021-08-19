package util;

import common.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.*;

import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class Utilities extends BaseDriver {
    private By tipotarjeta= By.id("panel-steps:login-card-select");
    private By numerotarjeta = By.xpath("//*[@id='panel-steps:login-card-number']");
    private By emailPara =  By.xpath("//*[@id='txtEmailPara']");
    private By emailasunto =  By.xpath("//*[@id='txtEmailAsunto']");

    public void loginPersonaIBK_usuario1(String tarjetaSelect, String numeroTarjeta){

        driver.get("http://10.0.202.9:8080/internetbanking/");

        String originalWindows = driver.getWindowHandle();  //Almacena id de ventana original
        assert driver.getWindowHandles().size()==1; //comprueba que no existen otras ventanas desplegadas

        driver.findElement(By.id("j_idt4:j_idt6")).click(); //Lleva a la ventana hija

        WebDriverWait wait = new WebDriverWait(driver,600);
        wait.until(numberOfWindowsToBe(2));

        for (String windowHandle: driver.getWindowHandles()){

            if (!originalWindows.equals(windowHandle)){
                driver.switchTo().window(windowHandle);
                driver.findElement(By.className("iCheck-helper")).click(); //selecciona un checkbox
                driver.findElement(By.name("j_idt14:j_idt30")).click(); //lleva a otra url dentro de la ventana hija
                driver.navigate().to("http://10.0.202.9:8080/internetbanking/ibk/personas.do#no-back-button");

                //Paso 1
                //Seleccionando combo
                Select tarjeta = new Select(driver.findElement(tipotarjeta));
                tarjeta.selectByValue(tarjetaSelect); //4

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //Llenando campo tarjeta
                WebElement numTarjetaCargada = driver.findElement(numerotarjeta);
                numTarjetaCargada.sendKeys(numeroTarjeta); //16466306

                //Paso 2
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ingresarclavelogin();

                //Paso 3
                //Captcha esta en true en ambiente de pruebas

                //Ingreamos al app haciendo clic en el botón ingresar
                driver.findElement(By.name("panel-steps:j_idt88")).click();
                driver.navigate().to("http://10.0.202.9:8080/internetbanking/ibk/bienvenida#no-back-button");
            }
        }
    }

    public void ingresarclavelogin(){

        Screen screen = new Screen();
        Pattern pattern;
        pattern= new Pattern("C:\\Users\\leticia.moreno\\Desktop\\CAJA\\caja\\src\\main\\resources\\imagenes\\tecla1.PNG");

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

    public void enviarConstancia(String correo, String asunto){
        WebElement seleccionarEmailPara= driver.findElement(emailPara);
        seleccionarEmailPara.sendKeys(correo);

        WebElement seleccionarEmailAsunto= driver.findElement(emailasunto);
        seleccionarEmailAsunto.sendKeys(asunto);

        WebElement seleccionarBotonEnviar= driver.findElement(By.xpath("*//a[contains(text(),'ENVIAR')]"));
        seleccionarBotonEnviar.click();

    }

    public void validarConformidadDeEnvio(){

        WebDriverWait wait = new WebDriverWait(driver,6000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='j_idt72']//div[@id='dlgConfirmacion']/div[2]/h2")));

        String tituloConfirmacionObtenido = driver.findElement(By.xpath("//form[@id='j_idt72']//div[@id='dlgConfirmacion']/div[2]/h2")).getText();
        String tituloConfirmacionEsperado= "CONFIRMACIÓN";
        assertEquals(tituloConfirmacionEsperado,tituloConfirmacionObtenido);

        String mensajeConfirmacionObtenido = driver.findElement(By.xpath("//*[@id='j_idt128']")).getText();
        String mensajeConfirmacionEsperado= "La constancia fue enviada con éxito";
        assertEquals(mensajeConfirmacionEsperado,mensajeConfirmacionObtenido);

        String botonAceptarObtenido = driver.findElement(By.xpath("//*[@id='dlgConfirmacion']/div[2]/input")).getAttribute("value");
        String botonAceptarEsperado= "Aceptar";
        assertEquals(botonAceptarEsperado,botonAceptarObtenido);

        WebElement botonAceptar= driver.findElement(By.xpath("//*[@id='dlgConfirmacion']/div[2]/input"));
        botonAceptar.click();
    }





}





