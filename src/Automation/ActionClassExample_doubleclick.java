package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassExample_doubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);//Step 1
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tooltip-and-double-click/");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("doubleClickBtn")));// explicit wait
		WebElement doublick_btn = driver.findElement(By.id("doubleClickBtn"));
		Actions obj = new Actions(driver);
		obj.doubleClick(doublick_btn).build().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// implicit wait
		driver.switchTo().alert().accept();
		driver.close();
	}

}
