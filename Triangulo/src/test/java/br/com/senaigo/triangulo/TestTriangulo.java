package br.com.senaigo.triangulo;

import org.junit.Test;

import junit.framework.TestCase;

public class TestTriangulo extends TestCase{

	@Test
	public void testIsTriangulo(){
		
		Triangulo t = new Triangulo(5, 8, 5);
		assertTrue(t.isTriangulo());
	}
	
	@Test 
	public void testTipoDeTrianguloEscaleno(){
		Triangulo t = new Triangulo(5, 7, 3);
		assertEquals(t.tipoDeTriangulo(), "escaleno");
	}
	
	@Test 
	public void testTipoDeTrianguloEquilatero(){
		Triangulo t = new Triangulo(5, 5, 5);
		assertEquals(t.tipoDeTriangulo(), "equilatero");
	}
	
	
	@Test 
	public void testTipoDeTrianguloIsosceles(){
		Triangulo t = new Triangulo(4, 5, 5);
		assertEquals(t.tipoDeTriangulo(), "isosceles");
	}
	
	@Test 
	public void testTipoDeTrianguloIsosceles1(){
		Triangulo t = new Triangulo(5, 7, 5);
		assertEquals(t.tipoDeTriangulo(), "isosceles");
	}
	
	@Test 
	public void testTipoDeTrianguloIsosceles2(){
		Triangulo t = new Triangulo(3, 3, 4);
		assertEquals(t.tipoDeTriangulo(), "isosceles");
	}
	
	@Test 
	public void testTipoDeTrianguloIsosceles3(){
		Triangulo t = new Triangulo(3, 0, 4);
		assertFalse(t.tipoDeTriangulo() == "isosceles");
	}

	@Test 
	public void testTipoDeTrianguloIsosceles4(){
		Triangulo t = new Triangulo(3, -1, 6);
		assertFalse(t.tipoDeTriangulo() == "isosceles");
	}
	
	@Test 
	public void testTipoDeTrianguloIsosceles5(){
		Triangulo t = new Triangulo(3, 3, 6);
		assertFalse(t.tipoDeTriangulo() == "isosceles");
	}
	
	@Test 
	public void testTipoDeTrianguloIsosceles6(){
		Triangulo t = new Triangulo(2, 3, 6);
		assertFalse(t.tipoDeTriangulo() == "isosceles");
	}
	
	@Test 
	public void testTipoDeTrianguloIsosceles7(){
		Triangulo t = new Triangulo(0, 0, 0);
		assertFalse(t.tipoDeTriangulo() == "isosceles");
	}
	
}
