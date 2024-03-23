package test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestRetry10 implements IRetryAnalyzer{

	
	private int retrycount = 0;
	public static final int maxRetryCount = 3 ;
	
	public boolean retry(ITestResult result) {
		if(retrycount< maxRetryCount) {
			retrycount++;
			return true;
		}
		else { 
			return false;
			
		}
	}
}
