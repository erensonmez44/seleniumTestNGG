package TestNG.projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class facebookProject {

    @Test
    public void newAccount() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");

        WebElement newAccount = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        newAccount.click();

        WebElement registername = driver.findElement(By.name("firstname"));
        registername.sendKeys("Eren");
        Thread.sleep(1000);
        WebElement registerlastname = driver.findElement(By.name("lastname"));
        registerlastname.sendKeys("Sönmez");
        Thread.sleep(1000);
        WebElement registerEmail = driver.findElement(By.name("reg_email__"));
        registerEmail.sendKeys("erencpt11@gmail.com");
        Thread.sleep(1000);
        WebElement registerEmailConfirmation = driver.findElement(By.name("reg_email_confirmation__"));
        registerEmailConfirmation.sendKeys("erensonmez4432599@gmail.com");
        Thread.sleep(1000);
        WebElement registerPassword = driver.findElement(By.name("reg_passwd__"));
        registerPassword.sendKeys("4458Erensonmez");
        Thread.sleep(1000);


        WebElement checkbox1 = driver.findElement(By.name("birthday_day"));
        Select select = new Select(checkbox1);
        select.selectByValue("4");
        Thread.sleep(1000);
        WebElement checkbox2 = driver.findElement(By.name("birthday_month"));
        Select select1 = new Select(checkbox2);
        select1.selectByValue("10");
        Thread.sleep(1000);
        WebElement checkbox3 = driver.findElement(By.name("birthday_year"));
        Select select2 = new Select(checkbox3);
        select2.selectByValue("2004");
        Thread.sleep(1000);

        WebElement genderBox = driver.findElement(By.xpath("//label[text()='Erkek']"));
        genderBox.click();

        Thread.sleep(1000);
        driver.quit();

    }
}
