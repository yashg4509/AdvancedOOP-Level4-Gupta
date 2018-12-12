package _03_01_GottaCatchThemAll;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ExceptionsTest {
	ExceptionMethods em = new ExceptionMethods();
	
	//1. This is an example of how one might test that an exception is thrown.
	//   It tests that an IndexOutOfBoundsException is thrown 
	@Test
	public void testIndexOOBException() {
		int[] vars = {0, 1, 2, 3};
			
		try {
			vars[0] = 4;
			assertArrayEquals(vars, new int[] {4, 1, 2, 3});
			vars[4] = 5;
			fail("IndexOutOfBoundsException not thrown");
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			assertArrayEquals(vars, new int[] {4, 1, 2, 3});
		}
	}
	
	//2. In the ExceptionMethods class, write a method called divide that takes
	//   two doubles as parameters and returns their quotient as a double. This method 
	//   should throw an IllegalArgumentException if the denominator is 0.0.
	
	//3. Complete the JUnit test method to test the divide method.
	@Test
	public void testDivideByZeroException() {
		double x = 1.0;
		double y = 0.0;
		double a = 1.0;
		double z = 2.0;
		try {
			z = em.divide(x, a);
			assertEquals(z,1.0);
			z = em.divide(x, y);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
			System.out.println("error, y = 0");
			assertEquals(z,1.0);
		}
	}
	
	//4. In the ExceptionMethods class, write a method called reverseString that takes a
	//   String and returns the reverse of that String. It should throw an IllegalStateException
	//   if the String passed in is empty
	
	//5. Complete the JUnit test method to test the reverseStringMethod.
	@Test
	public void testReverseString() {
		String x = "hello";
		String y = "";
		String z = "";
		try {
			z = em.reverse(x);
			assertEquals(z, "olleh");
			z= em.reverse(y);
		} catch(IllegalStateException e) {
			e.printStackTrace();
			assertEquals(z,"olleh");
		}
	}
	
	
	

}
