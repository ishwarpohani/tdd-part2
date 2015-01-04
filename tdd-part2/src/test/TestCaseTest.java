package test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import framework.WasRun;


public class TestCaseTest {
	
	/**
	 * Chapter 18 : Chapter 18. First Steps to xUnit (Test Case)
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@org.junit.Test
	public void testRunning() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		WasRun test = new WasRun("testMethod");
		assertFalse(test.wasRun);
		test.run();
		assertTrue(test.wasRun);
	}

	
}

