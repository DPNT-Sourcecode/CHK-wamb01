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
	
	assertEquals(280,checkoutSolution.checkout("ABCDEABCDE").intValue());
}
@Test
public void testBBBEE() {

	
	assertEquals(125,checkoutSolution.checkout("BBBEE").intValue());
}

@Test
public void testF() {

	
	assertEquals(10,checkoutSolution.checkout("F").intValue());
}

@Test
public void testFFF() {

	
	assertEquals(20,checkoutSolution.checkout("FFF").intValue());
}

@Test
public void testFFFFFF() {

	assertEquals(40,checkoutSolution.checkout("FFFFFF").intValue());
}

@Test
public void testFFFF() {

	assertEquals(30,checkoutSolution.checkout("FFFF").intValue());
}

@Test
public void testG() {

	assertEquals(20,checkoutSolution.checkout("G").intValue());
}
@Test
public void testGGG() {

	assertEquals(60,checkoutSolution.checkout("GGG").intValue());
}

@Test
public void testBBBEEG() {

	
	assertEquals(145,checkoutSolution.checkout("BBBEEG").intValue());
}

@Test
public void testH() {

	assertEquals(10,checkoutSolution.checkout("H").intValue());
}
@Test
public void testBBBEEGH() {

	
	assertEquals(155,checkoutSolution.checkout("BBBEEGH").intValue());
}

@Test

public void test5H() {
	
	assertEquals(45,checkoutSolution.checkout("HHHHH").intValue());

}

@Test

public void test10H() {
	
	assertEquals(80,checkoutSolution.checkout("HHHHHHHHHH").intValue());

}

@Test

public void test6H() {
	
	assertEquals(55,checkoutSolution.checkout("HHHHHH").intValue());

}

@Test

public void test11H() {
	
	assertEquals(90,checkoutSolution.checkout("HHHHHHHHHHH").intValue());

}
@Test

public void test15H() {
	
	assertEquals(125,checkoutSolution.checkout("HHHHHHHHHHHHHHH").intValue());

}

	
@Test

public void testI() {
	
	assertEquals(35,checkoutSolution.checkout("I").intValue());
}

@Test

public void test2I() {
	
	assertEquals(70,checkoutSolution.checkout("II").intValue());
}

@Test
public void testBBBEEGHI() {

	
	assertEquals(190,checkoutSolution.checkout("BBBEEGHI").intValue());
}	
@Test
public void testJ() {

	
	assertEquals(60,checkoutSolution.checkout("J").intValue());
}

@Test
public void testK() {

	
	assertEquals(70,checkoutSolution.checkout("K").intValue());
}
@Test
public void test2K() {

	
	assertEquals(120,checkoutSolution.checkout("KK").intValue());
}
@Test
public void test4K() {

	
	assertEquals(240,checkoutSolution.checkout("KKKK").intValue());
}
@Test
public void test5K() {

	
	assertEquals(310,checkoutSolution.checkout("KKKKK").intValue());
}
@Test
public void testL() {

	
	assertEquals(90,checkoutSolution.checkout("L").intValue());
}
@Test
public void testM() {

	
	assertEquals(15,checkoutSolution.checkout("M").intValue());
}
@Test
public void testML() {

	
	assertEquals(105,checkoutSolution.checkout("ML").intValue());
}
@Test
public void testN() {

	
	assertEquals(40,checkoutSolution.checkout("N").intValue());
}
@Test
public void test3NM() {

	
	assertEquals(120,checkoutSolution.checkout("NNNM").intValue());
}
@Test
public void test3N2M() {

	
	assertEquals(135,checkoutSolution.checkout("NNNMM").intValue());
}
@Test
public void testO() {

	
	assertEquals(10,checkoutSolution.checkout("O").intValue());
}
@Test
public void testP() {

	
	assertEquals(50,checkoutSolution.checkout("P").intValue());
}
@Test
public void test5P() {

	
	assertEquals(200,checkoutSolution.checkout("PPPPP").intValue());
}
@Test
public void test6P() {

	
	assertEquals(250,checkoutSolution.checkout("PPPPPP").intValue());
}
@Test
public void testQ() {

	
	assertEquals(30,checkoutSolution.checkout("Q").intValue());
}
@Test
public void test3Q() {

	
	assertEquals(80,checkoutSolution.checkout("QQQ").intValue());
}
@Test
public void test4Q() {

	
	assertEquals(110,checkoutSolution.checkout("QQQQ").intValue());
}
@Test
public void testR() {

	
	assertEquals(50,checkoutSolution.checkout("R").intValue());
}
@Test
public void test3RQ() {
	
	assertEquals(150,checkoutSolution.checkout("RRRQ").intValue());
}
@Test
public void test3RQQ() {
	
	assertEquals(180,checkoutSolution.checkout("RRRQQ").intValue());
}
@Test
public void testS() {
	
	assertEquals(20,checkoutSolution.checkout("S").intValue());
}
@Test
public void test3RQQS() {
	
	assertEquals(200,checkoutSolution.checkout("RRRQQS").intValue());
}
@Test
public void testT() {
	
	assertEquals(20,checkoutSolution.checkout("T").intValue());
}
@Test
public void testU() {
	
	assertEquals(40,checkoutSolution.checkout("U").intValue());
}
@Test
public void test3U() {
	
	assertEquals(120,checkoutSolution.checkout("UUU").intValue());
}
@Test
public void test4U() {
	
	assertEquals(120,checkoutSolution.checkout("UUUU").intValue());
}
@Test
public void testV() {
	
	assertEquals(50,checkoutSolution.checkout("V").intValue());
}
@Test
public void test2V() {
	
	assertEquals(90,checkoutSolution.checkout("VV").intValue());
}
@Test
public void test3V() {
	
	assertEquals(130,checkoutSolution.checkout("VVV").intValue());
}
@Test
public void testW() {
	
	assertEquals(20,checkoutSolution.checkout("W").intValue());
}
@Test
public void testX() {
	
	assertEquals(17,checkoutSolution.checkout("X").intValue());
}
@Test
public void testY() {
	
	assertEquals(20,checkoutSolution.checkout("Y").intValue());
}
@Test
public void testZ() {
	
	assertEquals(21,checkoutSolution.checkout("Z").intValue());
}
@Test
public void testPPPPPPPPPP() {
	
	assertEquals(400,checkoutSolution.checkout("PPPPPPPPPP").intValue());
}
@Test
public void testHHHHHHHHHHHHHHHHHHHH() {
	
	assertEquals(160,checkoutSolution.checkout("HHHHHHHHHHHHHHHHHHHH").intValue());
}
@Test
public void testVVVVVV() {
	
	assertEquals(260,checkoutSolution.checkout("VVVVVV").intValue());
}
@Test
public void testQQQQQQ() {
	
	assertEquals(160,checkoutSolution.checkout("QQQQQQ").intValue());
}
//S,T,X,Y,Z
@Test

public void testST() {
	
	assertEquals(40,checkoutSolution.checkout("ST").intValue());
}

@Test

public void testSTXX() {
	
	assertEquals(62,checkoutSolution.checkout("STXX").intValue());
}
@Test
public void testSSSZ() {
	
	assertEquals(65,checkoutSolution.checkout("SSSZ").intValue());
}

@Test
public void testCXYZYZC() {
	
	assertEquals(122,checkoutSolution.checkout("CXYZYZC").intValue());
}

@Test
public void testSTXS() {
	assertEquals(62,checkoutSolution.checkout("STXS").intValue());

}
@Test
public void testZZZS() {
	assertEquals(65,checkoutSolution.checkout("ZZZS").intValue());

}

}




