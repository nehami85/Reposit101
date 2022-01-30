package com.magnus.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement userN = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userN.sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']"));
		userN.sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
		

	}

}
