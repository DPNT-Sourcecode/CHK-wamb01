package befaster.solutions.CHK;

import static org.junit.Assert.*;

import org.junit.Before;
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
	public void testC() {

		assertEquals(20,checkoutSolution.checkout("C").intValue());
	}
	
	@Test
	public void testD() {

		assertEquals(15,checkoutSolution.checkout("D").intValue());
	}
	
	@Test
	public void testP() {

		assertEquals(-1,checkoutSolution.checkout("P").intValue());
	}
	@Test
	public void testAB() {

		assertEquals(80,checkoutSolution.checkout("AB").intValue());
	}
	@Test
	public void testABCD() {

		assertEquals(115,checkoutSolution.checkout("ABCD").intValue());
	}
	
	@Test
	public void testAAA() {

		assertEquals(130,checkoutSolution.checkout("AAA").intValue());
	}

}
