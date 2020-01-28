package befaster.solutions.CHK;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CheckoutSolutionTest {

	private CheckoutSolution checkoutSolution;
	@Before
	public void setup() {
		checkoutSolution=new CheckoutSolution();
	}
	@Test
	public void test() {

		assertEquals(50,checkoutSolution.checkout("A").intValue());
	}
	@Test
	public void testAA() {

		assertEquals(100,checkoutSolution.checkout("AA").intValue());
	}
	@Test
	public void testAAA() {

		assertEquals(130,checkoutSolution.checkout("AAA").intValue());
	}
	@Test
	public void testAAAAA() {

		assertEquals(200,checkoutSolution.checkout("AAAAA").intValue());
	}
	
	@Test
	public void testAAAAAA() {

		assertEquals(250,checkoutSolution.checkout("AAAAAA").intValue());
	}
	@Test
	public void testB() {

		assertEquals(30,checkoutSolution.checkout("B").intValue());
	}
	@Test
	public void test2B() {

		assertEquals(45,checkoutSolution.checkout("BB").intValue());
	}
	
	@Test
	public void testC() {

		assertEquals(20,checkoutSolution.checkout("C").intValue());
	}
	@Test
	public void testD() {

		assertEquals(15,checkoutSolution.checkout("D").intValue());
	}
	
	@Test
	public void testE() {

		assertEquals(40,checkoutSolution.checkout("E").intValue());
	}
	
	@Test
	public void test2EB() {

		assertEquals(80,checkoutSolution.checkout("EEB").intValue());
	}
	@Test
	@Ignore
	public void test2E2B() {

		assertEquals(110,checkoutSolution.checkout("EEBB").intValue());
	}
	



	

}
