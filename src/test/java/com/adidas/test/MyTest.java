package com.adidas.test;

import org.junit.Test;
import com.adidas.page.AdidasPage;
import com.adidas.page.ProductoPage;

public class MyTest extends BaseTest{
	
	@Test
	public void test01() throws Exception {
		//*************PAGE INSTANTIATIONS*************
		AdidasPage adidas = new AdidasPage(driver);
		ProductoPage producto = new ProductoPage(driver);
		//*************PAGE METHODS********************
		
		adidas.adidas();
		adidas.lupa();
		adidas.productoBusqueda();
		adidas.linkProducto();
		
		producto.productoSeleccionado();
		producto.tallaTenis();
		producto.anadirCarrito();
		
		producto.carrito();
		
	}
}
