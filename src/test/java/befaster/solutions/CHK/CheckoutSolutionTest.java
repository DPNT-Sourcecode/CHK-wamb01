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

		assertEquals(1,checkoutSolution.checkout("A").intValue());
	}
	
	@Test
	public void test1() {

		assertEquals(-1,checkoutSolution.checkout("P").intValue());
	}
	@Test
	public void test2() {

		assertEquals(2,checkoutSolution.checkout("AB").intValue());
	}

}


