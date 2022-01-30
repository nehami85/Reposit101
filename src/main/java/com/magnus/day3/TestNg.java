package com.magnus.day3;

//import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg {
 WebDriver driver = null;
 @BeforeTest
 public void setup() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void GoogleSearch() {
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone 14" + Keys.ENTER);
		
		Reporter.log("Completed Google search for iphone 14");
		
	}
	@Test
	public void WikiSearch()  {
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Iphone 14" + Keys.ENTER);
		
		Reporter.log("Completed Wiki search for iphone 14");
	}
	
	@AfterTest
	public void dismiss() {
		driver.close();
		driver.quit();
	}
}