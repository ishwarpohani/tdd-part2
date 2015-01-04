package test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.Before;
import org.junit.Test;

import framework.WasRun;


public class TestCaseTest {
	
	WasRun test;
	
	/**
	 * Chapter 19. Set the Table
	 */
	@Before public void setUp(){
		this.test = new WasRun("testMethod");
	}
	
	/**
	 * Chapter 19. Set the Table (Test Case)
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	public void testRunning() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		assertFalse(test.wasRun);
		this.test.run();
		assertTrue(test.wasRun);
	}
	
	/**
	 * Chapter 19. Set the Table (Test Case)
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	public void testSetUp() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		this.test.run();
		assertTrue(test.wasRun);
	}
	
	
	
//	/**
//	 * Chapter 18 : Chapter 18. First Steps to xUnit (Test Case)
//	 * @throws NoSuchMethodException
//	 * @throws SecurityException
//	 * @throws IllegalAccessException
//	 * @throws IllegalArgumentException
//	 * @throws InvocationTargetException
//	 */
//	@Test
//	public void testRunningCH18() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		WasRun test = new WasRun("testMethod");
//		assertFalse(test.wasRun);
//		test.run();
//		assertTrue(test.wasRun);
//	}

	
}

