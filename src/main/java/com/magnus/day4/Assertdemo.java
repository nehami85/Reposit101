package com.magnus.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class Assertdemo {
	public void Assert1() throws InterruptedException {
		
	//public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.citi.com");
		driver.manage().window().maximize();
Thread.sleep(2000);
WebElement lnkinvesting = driver.findElement(By.xpath("//a[@id='investingmainAnchor3']"));
Actions act = new Actions(driver);
act.moveToElement(lnkinvesting).perform();
Thread.sleep(2000);
WebElement RoboAdviser = driver.findElement(By.xpath("//*[text()='Robo Advisor']"));
Assert.assertTrue(RoboAdviser.isDisplayed());
driver.close();
driver.quit();
	} 
}
