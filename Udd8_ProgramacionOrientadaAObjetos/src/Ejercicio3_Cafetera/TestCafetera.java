package Ejercicio3_Cafetera;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCafetera {

	@Test
	public void testAgregarCafe() {
		
		int cantidadActual = 10;
		Cafetera cafetera = new Cafetera(100,10);
		cantidadActual = cafetera.agregarCafe(50);
		assertEquals(60,cantidadActual);
		
	}

	@Test
	public void testVaciarCafetera() {
		
		int cantidadActual = 100;
		Cafetera cafetera = new Cafetera(100,cantidadActual);
		cantidadActual = cafetera.vaciarCafetera();
		assertEquals(0,cantidadActual);
		
	}
	
	@Test
	public void testServirTaza() {
		
		int cantidadActual = 50;
		Cafetera cafetera = new Cafetera (100,cantidadActual);
		cantidadActual = cafetera.servirTaza(15);
		assertEquals(35,cantidadActual);
	}
	
	@Test
	public void testLlenarCafetera() {
		
		Cafetera caf1 = new Cafetera();
		int cantidadActual = caf1.llenarCafetera();
		assertEquals(1000,cantidadActual);
		
		Cafetera caf2 = new Cafetera(500);
		int cantidadActual2= caf2.llenarCafetera();
		assertEquals(500,cantidadActual2);
		
		Cafetera caf3 = new Cafetera(2500,1000);
		int cantidadActual3 = caf3.llenarCafetera();
		assertEquals(2500,cantidadActual3);
	}
	
	
	
}
