package com.magnus.day4;

import java.io.File;
import java.io.IOException;
//import java.sql.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo {

		public void TakeScreenshot(WebDriver Dri) throws IOException {
			//DateFormat dateFormat = new DateFormat("yyyy/MM/dd HH:mm:ss");
			//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			 LocalDateTime now1 = LocalDateTime.now();
			 
	      //  Date date = new Date(System.currentTimeMillis();
	        TakesScreenshot tScr1 = ((TakesScreenshot) Dri);
			File Scr1 = tScr1.getScreenshotAs(OutputType.FILE);
			String fileName1 = ".//Resources//screenshot"+now1+ ".png";
			File Dcr1 = new File(fileName1);
			FileUtils.copyFile(Scr1, Dcr1);
			
		}
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	/*	
		TakesScreenshot tScr = ((TakesScreenshot) driver);
		File Scr = tScr.getScreenshotAs(OutputType.FILE);
		String fileName = ".//Resources//screenshot1.png";
		File Dcr = new File(fileName);
		FileUtils.copyFile(Scr, Dcr);
		*/
		ScreenshotDemo SS = new ScreenshotDemo();
		SS.TakeScreenshot(driver);
		driver.get("https://www.google.com");
		SS.TakeScreenshot(driver);
		driver.close();
		driver.quit();
		

	}

}
