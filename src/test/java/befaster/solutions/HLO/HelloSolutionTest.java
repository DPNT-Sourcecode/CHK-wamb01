package befaster.solutions.HLO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class HelloSolutionTest {

	private HelloSolution helloSolution;
	@Before
	public void setup(){
		helloSolution=new HelloSolution();
	}
	@Test
	@Ignore
	public void test() {
		assertEquals("Not Matched", "Hello, World!", helloSolution.hello("Praveen"));
	}
	public void test2() {
		assertEquals("Not Matched", "Hello, Praveen!", helloSolution.hello("Praveen"));
	}

}


