package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestReportGenration11 {

	@Test
	public void test1() {
		System.out.println("this is test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("this is test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("this is test 3");
	}
	
	@Test
	public void test4() {
		Reporter.log("this is test 4");
		System.out.println("this is test 4");
	}
}
