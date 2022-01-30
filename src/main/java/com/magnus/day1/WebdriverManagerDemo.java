package com.magnus.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManagerDemo {
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			Thread.sleep(2000);
			driver.close();
			driver.quit();
			//Added by pratik dubey@ 5:48 PM EST
			// Added by Neha @ 6PM EST
}
}


