package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDataProviderDemo6 {
	@Test(dataProvider = "dataset")
	public void test(String user, String pass) {
		System.out.println(user + "=====" + pass);
	}

	@DataProvider
	public Object[][] dataset() {
		Object[][] dataset = new Object[4][2];

		// first row
		dataset[0][0] = "vvv";
		dataset[0][1] = "1111";

		// second row
		dataset[1][0] = "tttt";
		dataset[1][1] = "2222";

		// third row
		dataset[2][0] = "dddd";
		dataset[2][1] = "3333";

		// fourth row
		dataset[3][0] = "yyyy";
		dataset[3][1] = "44444";

		return dataset;
	}

	@Test(dataProvider = "vivian")
	public void test2(String name, String word) {
		System.out.println(name + "=====" + word);
	}

	@DataProvider(name =" vivian")
	public Object[][] dataset2() {
		return new Object[][] { { "MICHAEL", "FERNANDES" }, 
		                      	{ "VICTOR", "FERNANDES" },
			                    { "VIVIAN", "FERNANDES" },
				                { "MILAGRIN", "FERNANDES" } };
	}

	@Test(dataProvider = "create")
	public void test3(String username, String password) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.close();
	}

	@DataProvider(name = "create")
	public Object[][] dataset3() {
		return new Object[][] { { "standard_user", "secret_sauce1" },
			                    { "locked_out_user", "secret_sauce2" },
				                { "problem_user", "secret_sauce" }, 
				               { "performance_glitch_user", "secret_sauce" } };
	}
}
