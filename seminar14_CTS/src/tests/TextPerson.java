package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.Person;

class TextPerson {

	private static final String Exception = null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testConformance() {
		Person pers= new Person();
		double[] cost= {
				70.00,
				90.00,
				95.00,
				100.00
		};
		pers.setCostReceipts(cost);
		double result=pers.getAvgCost();
		assertEquals(88.75, result,0.1);
	}
	
	@Test
	public void testOrdering() {
		Person pers= new Person();
		double[] cost= {
				95.00,
				70.00,
				90.00,
				100.00
		};
		pers.setCostReceipts(cost);
		double result=pers.getAvgCost();
		assertEquals(88.75, result,0.1);
	}
	@Test
	public void testExistance() {
		Person pers= new Person();
		double[] cost= {
				
		};
		pers.setCostReceipts(cost);
		double result=pers.getAvgCost();
	
	}
	@Test
	public void testCardinality1() throws Exception {
		Person pers= new Person();
		double[] cost= {
				70.00
		};
		pers.setCostReceipts(cost);
		double result=pers.getAvgCost();
	    assertEquals(1,pers.getCostReceipts().length);
	    
	}
}
