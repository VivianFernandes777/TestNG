package test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtils extends TestBase {
	public static WebDriver driver = null;

	public void getscreenshot() throws IOException {
		Date currentdate = new Date();
		String Screenshotfilename = currentdate.toString().replace("", "-").replace("", "-");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//Screenshot//" + Screenshotfilename + ".png"));
	}
}
