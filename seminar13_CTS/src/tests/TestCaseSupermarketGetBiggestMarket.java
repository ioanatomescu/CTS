package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classes.EMarket;
import classes.ExceptionNullMarket;
import classes.Market;
import classes.Supermarket;

public class TestCaseSupermarketGetBiggestMarket {
           static Market m1;
           static Market m2;
           static Market m3;
           static  Market m4;
           static Market m5;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Setup before class");
		m1= new Market("Sephora",20,EMarket.BEAUTY);
		m2= new Market("Douglas",129,EMarket.BEAUTY);
		m3= new Market("H&M",40,EMarket.DRESS);
		m4= new Market("Mobexpert",100,EMarket.DECORATIONS);
		m5= new Market("Zara",20,EMarket.DRESS);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tear down after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Set up");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear dowb");
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	@Test
	public void testRight() {
		System.out.println("test right");
		ArrayList<Market> listMarket= new ArrayList<Market>();
		listMarket.add(m1);
		listMarket.add(m2);
		listMarket.add(m3);
		listMarket.add(m4);
		listMarket.add(m5);

		Supermarket sp=new Supermarket("Electroputere",listMarket);
		try {
			String result=sp.getBiggestMarketByArea(m2.getTypeMarket());
			/*if(result.equals("Douglas")) {
				assertTrue(true);
			}else {
				assertTrue(false);
			}*/
			assertEquals("Douglas",result);
		} catch (ExceptionNullMarket e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
    public void testBoundary() {
		System.out.println("Test Boundary");
		ArrayList<Market> listMarket= new ArrayList<Market>();
		listMarket.add(m1);
		Supermarket sp=new Supermarket("Electroputere",listMarket);
		try {
			String result=sp.getBiggestMarketByArea(EMarket.BEAUTY);
			assertEquals("Sephora",result);
		} catch (ExceptionNullMarket e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Sunt la limitele intervalului, nu trebuie exceptie");
		}
		
	}
	@Test(expected= ExceptionNullMarket.class)
	public void testException() throws ExceptionNullMarket {
		ArrayList<Market> listM= new ArrayList<Market>();
		Supermarket sp=new Supermarket("Electroputere",listM);
		String result=sp.getBiggestMarketByArea(EMarket.BEAUTY);
		
		
	}
	@Test
	public void testPerformance() throws ExceptionNullMarket {
		// NOT NOW Start time!!!
		ArrayList<Market> listMarket= new ArrayList<Market>();
		listMarket.add(m1);
		listMarket.add(m2);
		listMarket.add(m3);
		listMarket.add(m4);
		listMarket.add(m5);

		Supermarket sp=new Supermarket("Electroputere",listMarket);
		double startTime=System.currentTimeMillis();
		sp.getBiggestMarketByArea(EMarket.BEAUTY);
		double stopTime=System.currentTimeMillis();
		//assertEquals("Testul ruleaza in mai putin de 0.5 s",0.5, stopTime=startTime);
		assertTrue("Testul ruleaza sub < 10 ms",stopTime-startTime<=10);
		
	}
	public String getLargestMarket(EMarket type,ArrayList<Market> marketList) {
		marketList.sort(null);
	}
	@Test
	public void testCrossCheck() {
		
	}
	@Test
	public void testInverse() {
		
	}
}
