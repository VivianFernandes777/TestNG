package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation1 {

	@BeforeTest
	public void logintoApllication() {
		System.out.println("login to application ");
	}

	@AfterTest
	public void logouttoApllication() {
		System.out.println("logout to application ");
	}

	@BeforeMethod
	public void connecttodb() {
		System.out.println("connected to database");
	}

	@AfterMethod
	public void closetodb() {
		System.out.println("close to database");
	}

	@Test(priority = 1)
	public void login() {
		System.out.println("Test 1 ");
	}

	@Test(priority = 2)
	public void logout() {
		System.out.println("Test 2 ");
	}
}
