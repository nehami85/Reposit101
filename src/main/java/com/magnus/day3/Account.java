package com.magnus.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Account {
	@BeforeSuite()
	public void suit () {
		System.out.println("before test is suit");
		
		
	}
@BeforeTest()
	public void testing () {
		System.out.println("before test ");
	}
@BeforeMethod()
	public void display () {
		System.out.println("test display ");
	}
@Test()
public void test1 () throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.close();
	driver.quit();
}
@Test()
public void test2() throws InterruptedException {
	System.setProperty("webDriver.chrome.driver",".//recources//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.com");
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).click();
//driver.get("https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers");
Thread.sleep(3000);
driver.findElement(By.xpath("//span[@id='nav-global-location-data-modal-action']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[@class='zg-bdg-text']")).click();
driver.findElement(By.xpath("//a[@ href='https://affiliate-program.amazon.com/']")).click();
Thread.sleep(3000);
driver.close();
}
@AfterMethod()
public void test3() {
	System.out.println("after method");
}
@AfterTest()
public void test4(){
System.out.println("after test ");
}
@AfterSuite()
public void test5() {
	System.out.println("test suit ");
}
}