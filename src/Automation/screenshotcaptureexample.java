package Automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshotcaptureexample {

	public String capturescreenshot(String screenshotname,WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\Nandhini.devi\\Desktop\\screenshot\\"+screenshotname+".png";
		File destination=new File(path);
		FileUtils.copyFile(source, destination);
		return path;
	}
}
