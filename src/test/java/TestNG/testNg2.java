package TestNG;

import org.testng.annotations.*;

public class testNg2 {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method------ ------");
    }

    @Test
    public void test1(){
        System.out.println("Test--1");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Sistem açılıyor.........");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method-------");
    }
    @Test
    public void test2(){
        System.out.println("Test--2");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Sistem kapanıyor .......");
    }
    @Test
    public void test3(){
        System.out.println("Test--3");
    }


}
