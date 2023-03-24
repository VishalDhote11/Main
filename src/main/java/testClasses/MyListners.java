package testClasses;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements ITestListener
{
	 
	 public void onTestFailure(ITestResult result)
	 {
		 System.out.println("Test Case Failed and TestName is "+ result.getName());
	 }
	 
	 public void onTestPassed(ITestResult result)
	 {
		 System.out.println("Test Case Passed and TestName is "+ result.getName());
	 }
	 
	 public void onTestSkipped(ITestResult result)
	 {
		 System.out.println("Test Case Skipped and TestName is "+ result.getName());
	 }
	 
	 public void onTestSuccess(ITestResult result)
	 {
		 System.out.println("Test Case Success and TestName is "+ result.getName());
	 }
	 
	 public void onStart(ITestResult result)
	 {
		 System.out.println("Test Case Started and TestName is "+ result.getName());
	 }
	 
	 public void onFinish(ITestResult result)
	 {
		 System.out.println("Test Case Finish and TestName is "+ result.getName());
	 }
	 
}
