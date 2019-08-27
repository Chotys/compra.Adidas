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
		adidas.sexoFiltro();
		adidas.textFiltro();
		
	}
}
