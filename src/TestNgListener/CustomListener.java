package TestNgListener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends BaseForScreenShot implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED Test");
		failed(result.getMethod().getMethodName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
		
}
