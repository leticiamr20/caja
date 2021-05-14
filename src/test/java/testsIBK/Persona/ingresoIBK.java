package testsIBK.Persona;
import common.loginPersonaIBK;


import org.junit.*;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class ingresoIBK extends loginPersonaIBK{
    public static WebDriver driver;


    @Test
     public void ingresarMenuCancelacionPlazoFijo() throws Exception{

        WebElement postenter =  loginPersonaIBK.driver.findElement(By.id("j_idt74:1:j_idt76"));
        postenter.click();

    }

    }

/*
    public static WebDriver driver;

    @Before
    public void main(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\leticia.moreno\\Desktop\\Caja\\drivers\\chromedriver.exe");
        try {
            driver = new ChromeDriver();
            driver.get("http://10.0.202.9:8080/internetbanking/");

        } catch (WebDriverException wde) {
            System.out.println(wde.getMessage());
        }
    }

 */
/*
@Test
    public void ingresoIBKpersona() throws InterruptedException {

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
                Select tarjeta = new Select(driver.findElement(By.id("panel-steps:login-card-select")));
                tarjeta.selectByValue("4");

                //Llenando campo tarjeta
                WebElement numTarjetaCargada = driver.findElement(By.xpath("//*[@id=\'panel-steps:login-card-number\']"));
                //numTarjetaCargada.clear();
                Thread.sleep(5);
                numTarjetaCargada.sendKeys("16466306");
                Thread.sleep(5);

                //Paso 2
                driver.findElement(By.xpath("//*[@id=\'key-4\']")).click();
                driver.findElement(By.xpath("//*[@id=\'key-4\']")).click();
                driver.findElement(By.xpath("//*[@id=\'key-4\']")).click();
                driver.findElement(By.xpath("//*[@id=\'key-4\']")).click();
                driver.findElement(By.xpath("//*[@id=\'key-4\']")).click();
                driver.findElement(By.xpath("//*[@id=\'key-4\']")).click();

                //Paso 3
                //Captcha esta en true en ambiente de pruebas

                //ingreamos al app haciendo clic en el botón ingresar
                driver.findElement(By.name("panel-steps:j_idt88")).click();

                String nombreCliente = driver.findElement(By.xpath("//*[@id=\'j_idt11\']/div[2]/div[1]/div[2]/div/span[2]")).getText();
                String nombreClienteEsperado= "ANGEL ALEJO ALVITES";
                assertEquals(nombreCliente,nombreClienteEsperado);

            }
        }
    }
*/










