package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestListner9 extends TestBase {
	public static WebDriver driver = null;

	@Test
	public void lunch() {

		driver.get("https://www.ebay.com/");

	}
}
