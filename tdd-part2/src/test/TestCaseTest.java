package test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.Before;
import org.junit.Test;

import framework.TestCase;
import framework.TestResult;
import framework.TestSuite;
import framework.WasRun;


@SuppressWarnings("unused")
public class TestCaseTest {
	
	TestResult result;
	
	@Before public void setUp(){
		result = new TestResult();
	}
	
	/** Chapter 23. How Suite It Is (Test Case)(Updated) */
	@Test
	public void testTemplateMethod() {
		WasRun test = new WasRun("testMethod");
		test.run(this.result);
		assertTrue("setUp testMethod tearDown ".equals(test.log));
	}
	
	/** Chapter 23. How Suite It Is (Test Case)(Updated) */
	@Test
	public void testResult(){
		WasRun test = new WasRun("testMethod");
		test.run(this.result);
		assertTrue("1 run, 0 failed".equals(this.result.summary()));
	}

	/** Chapter 23. How Suite It Is (Test Case)(Updated) */
	@Test
	public void testFailedResult(){
		WasRun test = new WasRun("testBrokenMethod");
		test.run(this.result);
		assertTrue("1 run, 1 failed".equals(this.result.summary()));
	}

	/** Chapter 22. Dealing with Failure (Test Case) */
	@Test 
	public void testFailedResultFormatting(){
		this.result.testStarted();
		this.result.testFailed();
		assertTrue("1 run, 1 failed".equals(result.summary()));
	}
	
	
	/** Chapter 23. How Suite It Is (Test Case) */
	@Test
	public void testSuite(){
		TestSuite suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod")); 
		suite.run(this.result);
		assertTrue("2 run, 1 failed".equals(this.result.summary()));
		
	}
	
	/** Test Case : After implementing "Test" interface on TestCase and TestSuite (Chapter 24. xUnit Retrospective) */
	@Test
	public void testCaseCount(){
		TestCase testCase = new WasRun("testMethod");
		assertEquals(1,testCase.countTestCases());
	}

	/** Test Case : After implementing "Test" interface on TestCase and TestSuite (Chapter 24. xUnit Retrospective) */
	@Test
	public void testEmtpyCasesCountFromSuite(){
		TestSuite suite = new TestSuite();
		assertEquals(0,suite.countTestCases());
	}

	/** Test Case : After implementing "Test" interface on TestCase and TestSuite (Chapter 24. xUnit Retrospective) */
	@Test
	public void testCasesCountFromSuite(){
		TestSuite suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod")); 
		assertEquals(2,suite.countTestCases());
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
	
//	/**
//	 * Chapter 19. Set the Table
//	 */
//	WasRun test;
//	@Before public void setUp(){
//		this.test = new WasRun("testMethod");
//	}

	
//	/**
//	 * Chapter 19. Set the Table (Test Case)
//	 * @throws NoSuchMethodException
//	 * @throws SecurityException
//	 * @throws IllegalAccessException
//	 * @throws IllegalArgumentException
//	 * @throws InvocationTargetException
//	 */
//	@Test
//	public void testRunning() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		assertFalse(test.wasRun);
//		this.test.run();
//		assertTrue(test.wasRun);
//	}

//	/**
//	 * Chapter 19. Set the Table (Test Case)
//	 * @throws NoSuchMethodException
//	 * @throws SecurityException
//	 * @throws IllegalAccessException
//	 * @throws IllegalArgumentException
//	 * @throws InvocationTargetException
//	 */
//	@Test
//	public void testSetUpCH19() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
//		this.test.run();
//		assertTrue(test.wasRun);
//	}
	
//	/**
//	 * Chapter 20. Cleaning Up After
//	 * @throws NoSuchMethodException
//	 * @throws SecurityException
//	 * @throws IllegalAccessException
//	 * @throws IllegalArgumentException
//	 * @throws InvocationTargetException
//	 */
//	@Test
//	public void testTemplateMethodCH20() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
//		WasRun test = new WasRun("testMethod");
//		test.run();
//		assertTrue("setUp testMethod tearDown ".equals(test.log));
//	}
//	
//	/** Chapter 20. Cleaning Up After */
//	@Test
//	public void testTemplateMethod() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
//		WasRun test = new WasRun("testMethod");
//		test.run();
//		assertTrue("setUp testMethod tearDown ".equals(test.log));
//	}
//	
//	/** Chapter 21. Counting (Test Case) */
//	@Test
//	public void testResult() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
//		WasRun test = new WasRun("testMethod");
//		TestResult result = test.run();
//		assertTrue("1 run, 0 failed".equals(result.summary()));
//	}
	
	
//	/** Chapter 21. Counting (Test Case) */
//	@Test
//	public void testFailedResult() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
//		WasRun test = new WasRun("testBrokenMethod");
//		TestResult result = test.run();
//		assertTrue("1 run, 1 failed".equals(result.summary()));
//	}
	
}

