package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
		MyInteger FirstNbr = new MyInteger(78);
		MyInteger SecondNbr = new MyInteger(27);
		MyInteger ThirdNbr = new MyInteger(11);
		MyInteger FourthNbr = new MyInteger(2);
		
		assertTrue(FirstNbr.isEven());
		assertFalse(FirstNbr.isOdd());
		assertTrue(SecondNbr.isOdd());
		assertFalse(SecondNbr.isPrime());
		assertTrue(ThirdNbr.isOdd());
		assertTrue(ThirdNbr.isPrime());
		assertTrue(FourthNbr.isPrime());
		
		int q = 5;
		int w = 7;
		int e = 10;
		int r = 2;
		int a = 78;
		
		MyInteger numberq = new MyInteger(q);
		MyInteger numberw = new MyInteger(w);
		MyInteger numbere = new MyInteger(e);
		MyInteger numberr = new MyInteger(r);
		
		assertTrue(numberq.isOdd());
		assertTrue(numberw.isPrime());
		assertFalse(numbere.isPrime());
		assertFalse(numberq.isEven());
		assertFalse(numberw.isEven());
		assertTrue(numberr.isPrime());
		assertFalse(numbere.isOdd());
		
		assertTrue(MyInteger.isOdd(q));
		assertTrue(MyInteger.isEven(e));
		assertFalse(MyInteger.isPrime(e));
		assertFalse(MyInteger.isEven(w));
		assertFalse(MyInteger.isOdd(e));
		assertTrue(MyInteger.isPrime(r));
		assertTrue(MyInteger.isPrime(w));
		
		assertTrue(MyInteger.isOdd(SecondNbr));
		assertTrue(MyInteger.isEven(FirstNbr));
		assertFalse(MyInteger.isEven(ThirdNbr));
		assertFalse(MyInteger.isOdd(FirstNbr));
		assertTrue(MyInteger.isPrime(FourthNbr));
		assertFalse(MyInteger.isPrime(FirstNbr));
		
		assertEquals(FirstNbr.getiValue(),78);
		
		assertTrue(FirstNbr.equals(FirstNbr));
		assertFalse(FirstNbr.equals(SecondNbr));
		
		assertEquals(FirstNbr.getiValue(),78);
	}

}
