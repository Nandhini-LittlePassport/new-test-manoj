package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample_Rightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		WebElement rightclick_btn=driver.findElement(By.id("rightClickBtn"));
		Actions obj=new Actions(driver);
		obj.contextClick(rightclick_btn).build().perform();
		driver.findElement(By.xpath("//*[@id=\"rightclickItem\"]/div[2]")).click();
		driver.close();
		

	}

}
