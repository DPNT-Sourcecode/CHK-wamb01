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
	@Test
	public void test2() {
		assertEquals("Not Matched", "Hello, Craftsman!", helloSolution.hello("Craftsman"));
	}
	@Test
	public void test3() {
		assertEquals("Not Matched", "Hello, Mr. X!", helloSolution.hello("Mr. X"));
	}

}
