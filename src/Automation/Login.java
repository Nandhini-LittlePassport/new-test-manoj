package Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Login {
	static WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	@BeforeClass
	public void setreportpath() {
		report=new ExtentReports("C:\\Users\\Nandhini.devi\\Desktop\\screenshot\\report.html");
	}
	@BeforeTest
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		
	}

	@Test
	public void verifyLogin() throws IOException {
		screenshotcaptureexample obj=new screenshotcaptureexample();
		test=report.startTest("login");
		driver.findElement(By.id("email")).sendKeys("nan@gmail.com");
		test.log(LogStatus.PASS, "emial id entered "+test.addScreenCapture(obj.capturescreenshot("emailid", driver)));
		driver.findElement(By.id("passwd")).sendKeys("password01");
		driver.findElement(By.id("SubmitLogin")).click();
		if (driver.getCurrentUrl().equals("http://demo.guru99.com/test/success.html")) {
			String sspath=obj.capturescreenshot("login", driver);
			test.log(LogStatus.PASS, "Loged In successfully "+test.addScreenCapture(sspath));
			
		}
		
		report.endTest(test);
	}

	@AfterTest
	public void quitdriver() {
		driver.close();
	}
	@AfterClass
	public void savereport() {
		report.flush();
	}

}
