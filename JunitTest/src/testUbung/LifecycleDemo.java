package testUbung;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LifecycleDemo {
	
	@BeforeClass
	public static void init() {
		System.out.println("init");
	}

	@AfterClass
	public static void destruct() {
		System.out.println("destruct");
	}

	@Before
	public void setup() {
		System.out.println("setup");
	}

	@After
	public void teardown() {
		System.out.println("teardown");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
}
