package Automation;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class TestingAnnotationExample {
	ExtentReports obj;
	ExtentTest obj1;
	
	@BeforeTest
	public void setPath() {
		 obj= new ExtentReports("C:\\Users\\Nandhini.devi\\eclipse-workspace\\selenium-Training\\trainingpart01\\ExtentReportResults.html");
	}
	
	@BeforeMethod
	public void launchbrowser() {
		obj1=obj.startTest("launchbrowser");
		obj1.log(LogStatus.PASS, "open browser");
		obj.endTest(obj1);
	}
	
	@Test(groups = {"smoke","regression"})
	public void testcase1() {
		obj1=obj.startTest("testcase1");
		obj1.log(LogStatus.PASS, "Inside Testcase 1");
		obj.endTest(obj1);
	}
	@Test(groups="Regression")
	public void testcase2() {
		obj1=obj.startTest("testcase2");
		obj1.log(LogStatus.PASS, "Inside Testcase 2");
		obj.endTest(obj1);
	}
	@Test(groups="Regression")
	public void testcase3() {
		obj1=obj.startTest("testcase3");
		obj1.log(LogStatus.PASS, "Inside testcase3");
		obj.endTest(obj1);
	}
	@Test(groups="Regression")
	public void testcase4() {
		obj1=obj.startTest("testcase4");
		

		obj1.log(LogStatus.FAIL, "Inside testcase4");
		obj1.log(LogStatus.PASS, "Inside testcase4");
		obj.endTest(obj1);
	}
	@AfterMethod
	public void quitdriver() {
		obj1=obj.startTest("quitdriver");
		obj1.log(LogStatus.PASS, "Close the driver");
		obj.endTest(obj1);
		
	}
	
	@AfterTest
	public void savereport() {
		obj.flush();
	}
}
