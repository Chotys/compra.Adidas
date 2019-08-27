package com.adidas.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductoPage extends BasePage{
	
	public ProductoPage(WebDriver driver) {
		super(driver);
	}
	
	//*********Variables*********
    String tenisProducto = "//img[@alt='Tenis Samba OG'][1]";
    String tallaBoton = "//button[@title='Elige tu talla']";
    String tallaTenis = "//button[@title='US 8.5']";
    String botonCarrito = "//button[@aria-label='Añadir al carrito']";
    String verCarrito = "//a[@data-auto-id='view-bag-desktop']";
 
    //*********Web Elements*********
    By productoTenis = By.xpath(tenisProducto);
    By botonTalla = By.xpath(tallaBoton);
    By botonTenis = By.xpath(tallaTenis);
    By carritoBoton = By.xpath(botonCarrito);
    By carritoVer = By.xpath(verCarrito);    
    
    //Seleccionar producto
    public void productoSeleccionado() {
    	click(productoTenis);
    }
    
    //seleccionamos la talla
    public void tallaTenis() {
    	click(botonTalla);
    	click(botonTenis);
    }
    
    //boton añadir al carrito
    public void anadirCarrito() {
    	click(carritoBoton);
    }
    
    //Ver carrito
    public void carrito() {
    	click(carritoVer);
    }

}
