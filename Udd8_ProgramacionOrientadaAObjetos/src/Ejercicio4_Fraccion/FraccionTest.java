package Ejercicio4_Fraccion;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FraccionTest {

	@Test
	void testInvertir() {

		Fraccion Fraccion = new Fraccion(5,9);
		Fraccion FraccionInv = new Fraccion(9,5);
		Fraccion = Fraccion.invertir();
		assertEquals (Fraccion ,FraccionInv );

	}

	@Test
	void testSimplifica() {

		Fraccion Fraccion = new Fraccion (28,42);
		Fraccion FraccionSim = new Fraccion (2,3);
		Fraccion = Fraccion.simplifica();
		assertEquals (Fraccion ,FraccionSim );

	}

	@Test
	void testSuma() {

		Fraccion Fraccion = new Fraccion(5,9);
		Fraccion FraccionResultado = new Fraccion (68,9);
		Fraccion = Fraccion.suma(7);
		assertEquals (Fraccion ,FraccionResultado );

	}

	@Test
	void testSumaFrac() {

		Fraccion Fraccion = new Fraccion(3,9);
		Fraccion FraccionSum = new Fraccion (5,2);
		Fraccion FraccionResultado = new Fraccion(17,6);
		Fraccion = Fraccion.suma(FraccionSum);
		assertEquals (Fraccion ,FraccionResultado );

	}


	@Test
	void testResta() {

		Fraccion Fraccion = new Fraccion(7,3);
		Fraccion FraccionResultado = new Fraccion(-14,3);
		Fraccion = Fraccion.resta(7);
		assertEquals (Fraccion,FraccionResultado);

	}

	@Test
	void testRestaFrac() {

		Fraccion Fraccion = new Fraccion(3,5);
		Fraccion Fraccion2 = new Fraccion (2,4);
		Fraccion FraccionResultado = new Fraccion(1,10);
		Fraccion = Fraccion.resta(Fraccion2);
		assertEquals (Fraccion,FraccionResultado);

	}
	
	@Test
	void testDivide() {
		
		Fraccion Fraccion = new Fraccion(8,4);
		Fraccion FraccionResultado = new Fraccion (2,3);
		Fraccion = Fraccion.divide(3);
		assertEquals (Fraccion,FraccionResultado);
		
	}
	
	@Test
	void testDivideFrac() {
		
		Fraccion Fraccion = new Fraccion(9,4);
		Fraccion Fraccion2 = new Fraccion (4,2);
		Fraccion FraccionResultado = new Fraccion(9,8);
		Fraccion = Fraccion.divide(Fraccion2);
		assertEquals (Fraccion,FraccionResultado);
	}
	
	@Test
	void testMultiplica() {
		
		Fraccion Fraccion = new Fraccion(5,6);
		Fraccion FraccionResultado = new Fraccion (10,3);
		Fraccion = Fraccion.multiplica(4);
		assertEquals (Fraccion,FraccionResultado);
	}
	
	
	@Test
	void testMultiplicaFrac() {
		
		Fraccion Fraccion = new Fraccion (5,8);
		Fraccion Fraccion2 = new Fraccion (4,3);
		Fraccion FraccionResultado = new Fraccion (5,6);
		Fraccion = Fraccion.multiplica(Fraccion2);
		assertEquals (Fraccion,FraccionResultado);
	}
	
	
}
