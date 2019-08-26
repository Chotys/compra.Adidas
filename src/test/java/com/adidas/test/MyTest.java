package com.adidas.test;

import org.junit.Test;
import com.adidas.page.AdidasPage;


public class MyTest extends BaseTest{
	
	@Test
	public void test01() {
		//*************PAGE INSTANTIATIONS*************
		AdidasPage adidas = new AdidasPage(driver);
		
		//*************PAGE METHODS********************
		
		adidas.adidas();
		adidas.lupa();
		adidas.productoBusqueda();
		adidas.linkProducto();
		//adidas.textFiltro();
		adidas.sexoFiltro();
		adidas.textFiltro();
		
		
	/*Base b = new Base();
		WebDriver driver = b.getDriver();
		Compra compra1 = PageFactory.initElements(driver, Compra.class);
		String url = "https://www.adidas.co/";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		compra1.Producto("tenis");
		
		
		driver.quit();*/
	}
}
