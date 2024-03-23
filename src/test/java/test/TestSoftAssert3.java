package test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSoftAssert3 {
	
	@Test
	public void getTitle() {
		SoftAssert soft = new SoftAssert();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		// geturl
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String act = driver.getTitle();
		String exp = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		soft.assertEquals(act, exp, "verfiying title failed");
		System.out.println("verfiying title");
		String act1 = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		String exp1 = "Search" ;
		soft.assertEquals(act1, exp1, "text verfication failed");
		System.out.println("verfiying text");
		driver.close();
		soft.assertAll();
	}
}
