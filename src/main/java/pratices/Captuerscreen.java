package pratices;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Captuerscreen extends Baseclass implements ITestListener  {
	public void onTestFailure(ITestResult result) {
	DateTimeFormatter dft =  DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
			LocalDateTime now  =  LocalDateTime.now();
			File secfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
	
		String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() +"/Target/TestNGReport";
		File destFile = new  File (reportDirectory + "/ failure_Screenshots/Screenshot_"+ dft.format(now) +".png");
		try {
			FileUtils.copyFile(secfile,destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("<a href='"+  destFile.getAbsolutePath() +"'> < img src='"+ destFile.getAbsolutePath()+"'height = '50' width = '50'/></a>");
		
	}
}
