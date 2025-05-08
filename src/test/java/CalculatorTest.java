import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator c=new Calculator();
	
	@Test
	public void testadd() {
		
		assertEquals(7,c.perform(3, 4));
		
	}

}
