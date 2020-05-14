package Automation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoookingModule {

		@BeforeMethod
		public void launchbrowser() {
			System.out.println("open browser");
		}
		
		@Test(groups="Regression",priority = 1)
		public void testcase1() {
			System.out.println("Inside Testcase 1");
		}
		@Test(groups="Regression",priority = 3)
		public void testcase2() {
			System.out.println("Inside Testcase 2");
		}
		@Test(groups= {"Regression","smoke"},priority = 2)
		public void testcase3() {
			System.out.println("Inside Testcase 3");
		}
		@Test(groups="Regression",priority = 1)
		public void testcase4() {
			System.out.println("Inside Testcase 4");
		}
		@AfterMethod
		public void quitdriver() {
			System.out.println("Close the driver");
		}
	

}
