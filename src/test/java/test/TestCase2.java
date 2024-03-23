package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCase2 {
	
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
		driver.findElement(By.xpath("//a[normalize-space()='Input Form Submit']")).click();
		System.out.println("clicked on input form submit--- step 1 completed");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		System.out.println("clicked on submit button--step 2 completed");
		Thread.sleep(3000);
		String actual = driver.findElement(By.xpath("//input[@id='name']")).getAttribute("validationMessage");
		String expected = "Please fill out this field.";
		softassert.assertEquals(actual, expected);
		System.out.println("assert -step 3completed");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vivian");
		driver.findElement(By.xpath("//input[@id='inputEmail4']")).sendKeys("vivian.fernandes777@gmail.com");
		driver.findElement(By.xpath("//input[@id='inputPassword4']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='websitename']")).sendKeys("www.google.com");
		System.out.println("fill all the form --step 4 completed ");
		Thread.sleep(3000);
		Select Setect1 = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		Setect1.selectByVisibleText("United States");
		System.out.println("select--- step 5 compledted");
		driver.findElement(By.xpath("//input[@id='inputCity']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@id='inputAddress1']")).sendKeys("vaduwadi");
		driver.findElement(By.xpath("//input[@id='inputAddress2']")).sendKeys("hadapsar");
		driver.findElement(By.xpath("//input[@id='inputState']")).sendKeys("maharashtra");
		driver.findElement(By.xpath("//input[@id='inputZip']")).sendKeys("410013");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		String valid = "Thanks for contacting us, we will get back to you shortly.";
		String msg= driver.findElement(By.xpath("//p[@class='success-msg hidden']")).getText();
		softassert.assertEquals(msg, valid);
		Thread.sleep(3000);
		System.out.println("step 6 completd");
		softassert.assertAll();
}
}