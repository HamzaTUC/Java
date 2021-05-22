package testUbung;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilityTest {
	
	@Test
	public void testNumberIsEvenWith5() {
		boolean actual = Utility.numberIsEven(5);
		
		assertFalse(actual);
	}
	
	@Test
	public void testNumberIsEvenWith7() {
		boolean actual = Utility.numberIsEven(7);
		
		assertFalse(actual);
	}
	
	@Test
	public void testNumberIsEvenWith2() {
		boolean actual = Utility.numberIsEven(2);
		
		assertTrue(actual);
	}

}
