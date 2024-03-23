package TestNG;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class parameters {
    static WebDriver driver;

    @Test
    @Parameters({"firstname","lastname","email","telephone","password"})
    public void Test1(String firstname,String lastname,String email,String telephone,String password){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://tutorialsninja.com/demo/index.php?route=account%2Fregister");

        driver.findElement(By.cssSelector("#input-firstname")).sendKeys(firstname); //ömer

        driver.findElement(By.cssSelector("#input-lastname")).sendKeys(lastname);

        driver.findElement(By.cssSelector("#input-email")).sendKeys(email);

        driver.findElement(By.cssSelector("#input-telephone")).sendKeys(telephone);

        driver.findElement(By.cssSelector("#input-password")).sendKeys(password);

        driver.findElement(By.cssSelector("#input-confirm")).sendKeys(password);

    }

    @AfterClass
    public static void AfterClass() throws InterruptedException {

        Thread.sleep(1500);

        driver.quit();
    }
}