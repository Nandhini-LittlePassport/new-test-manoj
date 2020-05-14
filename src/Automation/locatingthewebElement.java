package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingthewebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/");
		WebElement title=driver.findElement(By.xpath("//*[@id=\"site-name\"]/a"));
		if(title.isDisplayed()) {
			System.out.println("Element id present");
		}
		else {
			System.out.println("Element is Not Present");
		}
		WebElement textbox=driver.findElement(By.name("emailid"));
		if(textbox.isDisplayed()) {
			textbox.sendKeys("nan@gmail.com");
			WebElement submit_btn=driver.findElement(By.name("btnLogin"));
			submit_btn.click();
		}

	}

}
