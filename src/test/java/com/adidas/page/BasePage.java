package com.adidas.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
 
    //Constructor
    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,60);
    }
 
    //Metodo de espera del elemento visible
    public void waitVisibility(By elementBy) throws Exception{
    	try {
    		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    	} catch (Exception e){
    		System.out.println("WebDriver no encontro el "+elementBy+" elemento visible");
    	}
    }
 
    //Metodo de Click
    public void click (By elementBy) throws Exception {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
 
    //Metodo escritura
    public void writeText (By elementBy, String text)  throws Exception {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }
 
    //Meto de lectura
    public String readText (By elementBy)  throws Exception {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }
 
    //validar igualdad
    public void assertEquals (By elementBy, String expectedText)  throws Exception {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
 
    }
}