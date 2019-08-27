package com.adidas.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdidasPage extends BasePage{
	
	public AdidasPage(WebDriver driver) {
		super(driver);
	}
	
	//*********Variables*********
    String baseURL = "https://www.adidas.co/";
    String campoBusqueda = "q";
    String busquedaLink = "//*[@class='suggestions___3uvil']/child::li[2]/a";
    String producto = "tenis";
 
    //*********Web Elements*********
    By busqueda = By.name(campoBusqueda);
    By linkBusqueda = By.xpath(busquedaLink);
    By lupa = By.className("search-icon___izpuX");
    
    //*********Metodos*********
    //Ir a la pagina
    public AdidasPage adidas (){
        driver.get(baseURL);
        return this;
    }

    //link del producto
    public void productoBusqueda() {
    	writeText(busqueda, producto);
    }
    
    //boton buscar en campo busqueda
    public void lupa() {
    	click(lupa);
    }
    
    //Seleccion de boton de la segunda opción
    public void linkProducto() {
		click(linkBusqueda);
    }
    
    
    

}