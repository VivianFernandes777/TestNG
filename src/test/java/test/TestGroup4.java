package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test(groups = "login application")
public class TestGroup4 {

	@BeforeSuite
	public void setup() {
		System.out.println("run this suite setup");

	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("run this before class");

	}

	@BeforeGroups(value = "Sanity")
	public void beforeGroup() {
		System.out.println("run this before group");

	}

	@Test(priority = 1, groups = "regression")
	public void testA() {
		System.out.println("testA");
	}

	@Test(priority = 2, groups = "regression")
	public void testB() {
		System.out.println("testB");
	}

	@Test(priority = 3, groups = { "Sanity", "bvt" })
	public void testC() {
		System.out.println("testC");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("run this after class");

	}

	@AfterGroups(value = "Sanity")
	public void afterGroup() {
		System.out.println("run this after group");

	}

	@AfterSuite
	public void teardown() {
		System.out.println("run this tear  setup");

	}
}
