package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import util.Utilities;

import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class loginPersonaIBK {

    Screen screen = new Screen();
    Pattern pattern;

public static WebDriver driver;

public loginPersonaIBK (WebDriver driver){
    this.driver= driver;
}

private By tipotarjeta= By.id("panel-steps:login-card-select");
private By numerotarjeta = By.xpath("//*[@id='panel-steps:login-card-number']");

    Utilities utilities = new Utilities();

    public loginPersonaIBK() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://10.0.202.9:8080/internetbanking/");

    }

    public void  loginPersonaIBK_usuario1() {

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
                tarjeta.selectByValue("4");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //Llenando campo tarjeta
                WebElement numTarjetaCargada = driver.findElement(numerotarjeta);
                numTarjetaCargada.sendKeys("16466306");

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

                //validaciones
                String nombreCliente = driver.findElement(By.xpath("//*[@id='j_idt11']/div[2]/div[1]/div[2]/div/span[2]")).getText();
                String nombreClienteEsperado= "ANGEL ALEJO ALVITES";
                assertEquals(nombreCliente,nombreClienteEsperado);
                driver.navigate().to("http://10.0.202.9:8080/internetbanking/ibk/bienvenida#no-back-button");


            }

        }



    }

    public void ingresarclavelogin(){

        Screen screen = new Screen();
        Pattern pattern;
        pattern= new Pattern("C:\\Users\\leticia.moreno\\Desktop\\Caja\\src\\main\\resources\\imagenes\\tecla1.PNG");

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





    //@Before
     //public void loginPersonaIBK() { // throws InterruptedException
      //}
