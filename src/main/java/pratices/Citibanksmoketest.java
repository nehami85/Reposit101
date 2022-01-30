package pratices;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Citibanksmoketest extends Baseclass {
@BeforeTest()
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	@Test()
		public void performGooglesearch() {
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[name='q']")).sendKeys("iphone 13"+ Keys.ENTER);
			Assert.assertTrue(driver.getTitle().contains("iphone 14 "));
			Reporter.log("google iphone 13 done successfully");
		}
	@Test()
	public void perforemwikisearch() {
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("apple iphone 13"+ Keys.ENTER);
		Reporter.log("wiki search for iphone 13 successfully ");
	}
		@AfterTest()
		public void dissmis() {
			driver.close();
			driver.quit();
		}
	}
		
		
	


