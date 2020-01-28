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

		checkoutSolution.checkout("A");
	}

}
