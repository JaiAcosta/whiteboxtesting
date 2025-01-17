package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	@Test
	/**
	 * a>b
	 * cos(a) < 0, cos(b) > 0
	 */
	public void test_agtb_tt() {
		Exercises ex= new Exercises();
		assertEquals((float) 2, ex.foo2(5,4),0);
		
	}
	
	@Test
	/**
	 * a>b
	 * cos(a) > 0, cos(b) > 0
	 */
	public void test_agtb_ft() {
		Exercises ex= new Exercises();
		assertEquals((float) 2, ex.foo2(7,5),0);
	}
	
	@Test
	/**
	 * a>b
	 * cos(a) > 0, cos(b) < 0
	 */
	public void test_agtb_ff() {
		Exercises ex= new Exercises();
		assertEquals((float) 7, ex.foo2(9,5),0);
	}
	
	
	@Test
	/**
	 * a<b
	 * cos(a) < 0, cos(b) > 0
	 */
	public void test_altb_tt() {
		Exercises ex= new Exercises();
		assertEquals((float) 2, ex.foo2(4,5),0);
		
	}
	
	@Test
	/**
	 * a<b
	 * cos(a) > 0, cos(b) > 0
	 */
	public void test_altb_ft() {
		Exercises ex= new Exercises();
		assertEquals((float) 2, ex.foo2(5,7),0);
	}
	
	@Test
	/**
	 * a<b
	 * cos(a) > 0, cos(b) < 0
	 */
	public void test_altb_ff() {
		Exercises ex= new Exercises();
		assertEquals((float) 7, ex.foo2(5,9),0);
	}
	

}
