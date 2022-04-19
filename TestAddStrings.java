package src;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test() {
		JUnitTesting JUnit = new JUnitTesting();
		String result = JUnit.AddString("Hello", "World");
		assertEquals("HelloWorld",result);
	}

}
