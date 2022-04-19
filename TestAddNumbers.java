package src;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	@Test
	public void test() {
		JUnitTesting JUnit = new JUnitTesting();
		int result = JUnit.AddNumbers(200, 200);
		assertEquals(400,result);
	}

}
