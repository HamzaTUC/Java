import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class UtiliteTest {

	@Test
	public void testNumberIsEvenWith5() {
		boolean actual = Utilitie.numberIsEven(5);
		
		assertFalse(actual);
	}
	@Test
	public void testNumberIsEvenWith7() {
		boolean actual = Utilitie.numberIsEven(7);
		
		assertFalse(actual);
	}
	
	@Test
	public void testNumberIsEvenWith2() {
		boolean actual = Utilitie.numberIsEven(2);
		
		assertTrue(actual);
	}


}






