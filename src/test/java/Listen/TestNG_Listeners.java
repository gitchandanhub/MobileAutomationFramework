package Listen;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public class TestNG_Listeners implements ITestListener
{
	public void onStart(ITestContext context) {
		System.out.println("Test have started successfull "   + context.getName());

		}
	public void onTestStart(ITestResult result)
	{
	   System.out.println("Started Test "   + result.getName());
	// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
	System.out.println("Test was successfull "   + result.getName());
	ExtentReportMethods.testpass(result.getMethod());

	}

	public void onTestFailure(ITestResult result) {
	System.out.println("Test was unsuccessfull because its failed "   + result.getName());
	ExtentReportMethods.testfail(result.getMethod());
	}

	public void onTestSkipped(ITestResult result) {
	System.out.println("Test was skipped "   + result.getTestName());

	ExtentReportMethods.testskip(result.getMethod());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub

	}

	

	public void onFinish(ITestContext context) {
	System.out.println("Test have been finished successfull "   + context.getName());

	}

	public Class<? extends ITestNGListener>[] getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setValue(Class<? extends ITestNGListener>[] value) {
		// TODO Auto-generated method stub
		
	}
	   
}
