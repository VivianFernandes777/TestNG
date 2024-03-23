package test;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkiping5 {

	@Test(priority = 1, enabled = false)
	public void skiptest1() {
		System.out.println("testA");
	}

	@Test(priority = 2)
	public void skiptest2B() {
		System.out.println("testB");
		throw new SkipException(" skiping this test");
	}

	@Test(priority = 3)
	public void skiptest3C() {
		System.out.println("testC");
	}
}
