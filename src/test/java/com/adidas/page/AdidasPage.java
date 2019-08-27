package com.adidas.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdidasPage extends BasePage{
	
	public AdidasPage(WebDriver driver) {
		super(driver);
	}
	
	//*********Variables*********
    String baseURL = "https://www.adidas.co/";
    String producto = "tenis";
    String genero = "Hombre";
    String sexo1 = "//div[@class='gl-checkbox multiselectFilter___37Nbo']//label//input[@name='Hombre'][@class='gl-checkbox__input']";
 
    //*********Web Elements*********
    By busqueda = By.name("q");
    By linkBusqueda = By.xpath("//*[@class='suggestions___3uvil']/child::li[2]/a");
    By lupa = By.className("search-icon___izpuX");
    By filtro = By.className("filter-name___1dqEa");
    By filtroSexo = By.xpath("//div[@data-auto-id=\'plp-collapsable-sidebar-item-container_Sexo\']");
    By sexo = By.xpath(sexo1);
    
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
    
    //Informacion que se presenta en el filtro 
    public void textFiltro() {
    	System.out.println(readText(filtro));
    }
    
    //Seleccion de filtro sexo
    public void sexoFiltro() {
    	click(filtroSexo);
    	click(sexo);
    }
    
    //Seleccionar producto
    public void productoSeleccionado() {
    	
    }
    

}