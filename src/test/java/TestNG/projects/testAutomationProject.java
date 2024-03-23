package TestNG.projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testAutomationProject {

    @Test
    public void testAutomationProjectorSignup() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Eren");
        if (name.isEnabled()) {
            System.out.println("Name PASSED!");
        } else {
            System.out.println("Name FAILED!!!");
        }
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("erencpt11@gmail.com");
        if (email.isEnabled()){
            System.out.println("Email PASSED!");
        }else {
            System.out.println("Email FAILED!!!");
        }
        Thread.sleep(1000);

        WebElement phone = driver.findElement(By.id("phone"));
        phone.sendKeys("0544584458");
        if (email.isEnabled()){
            System.out.println("Phone PASSED!");
        }else {
            System.out.println("Phone FAILED!!!");
        }
        Thread.sleep(1000);

        WebElement address = driver.findElement(By.id("textarea"));
        address.sendKeys("Malatya ");
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(1000);

        WebElement genderCheckInput = driver.findElement(By.id("male"));
        genderCheckInput.click();
        Thread.sleep(1000);

        driver.findElement(By.id("tuesday")).click();
        Thread.sleep(1000);

        WebElement countrySelection = driver.findElement(By.id("country"));
        Select select = new Select(countrySelection);
        select.selectByValue("germany");
        Thread.sleep(1000);

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(1000);

        WebElement blueOption = driver.findElement(By.xpath("//select[@id='colors']/option[@value='blue']"));
        blueOption.click();
        Thread.sleep(1000);

            driver.findElement(By.id("datepicker")).sendKeys("2024");
        Thread.sleep(1000);
        driver.quit();
        }
    }
