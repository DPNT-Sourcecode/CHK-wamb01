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
	
	public void test2E2B() {

		assertEquals(125,checkoutSolution.checkout("EEBBB").intValue());
	}
@Test
	
	public void testEEEEBB() {

		assertEquals(160,checkoutSolution.checkout("EEEEBB").intValue());
	}
@Test

public void testBEBEEE() {

	assertEquals(160,checkoutSolution.checkout("BEBEEE").intValue());
}

@Test

public void testABCDEABCDE() {

	// 2A=100  
	//2B=45
	//C2=20*2=40
	//2D=15*2=30
	//2E=40*2=80
	
	assertEquals(280,checkoutSolution.checkout("ABCDEABCDE").intValue());
}
	
	

	

}
