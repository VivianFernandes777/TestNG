package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	@Test
	public void testcase1() throws InterruptedException {
		SoftAssert softassert = new SoftAssert();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		System.out.println("Step 1--lunched  on the url");
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement simple = driver.findElement(By.xpath("//a[normalize-space()='Simple Form Demo']"));
		simple.click();
		System.out.println("Step 2--clciked on- Simple Form Demo”");
		Thread.sleep(3000);
		String exp = "simple-form-demo";
		String act = driver.getCurrentUrl();
		//softassert.assertEquals(act, exp);
		softassert.assertEquals(true, act.contains("simple-form-demo"));
		Thread.sleep(3000);
		System.out.println("Step 3--Validate  the URL contains");
		String var = "Welcome to LambdaTest";
		System.out.println("step 4 -- created a string variable");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys(var);
		System.out.println("step 5 --variable enterendd in chek box ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='showInput']")).click();
		System.out.println("Step 6 -- cliked on check value ");
		Thread.sleep(3000);
		String Actual1 = driver.findElement(By.xpath("//p[@id='message']")).getText();
		softassert.assertEquals(Actual1, var);
		System.out.println("Step 7 -- validate the message ");
		softassert.assertAll();
		driver.close();
	}

}
