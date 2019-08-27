package com.adidas.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class BaseTest {
    public WebDriver driver;
 
    @Before
    public void setup () {
        //Llamado de Chrome driver
    	System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
 
        //Ventana maximizada
        driver.manage().window().maximize();
    }
 
    @After
    public void teardown () {
    	//Cierre del navegador
        //driver.quit();
    }
}