package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTest {
	WebDriver driver;
	
	@BeforeMethod
	public void ChromeLunch() {
		String path = "C://Selenium3//Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
	}
	@Test(priority=2)
	public void TittleTest() {
		String Tittle = driver.getTitle();
		System.out.println(Tittle);
	}
	
	@Test(priority=4)
	public void EditText() {
		driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println("LOGO is Displayed");
	}
	@Test(priority=3)
	public void SearchTest() {
		driver.findElement(By.id("lst-ib")).sendKeys("Raju");
		System.out.println("Raju is Entred");
	}
	
	@Test(priority=1)
	public void SearchBox() {
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("MKR Yarragudi");
		System.out.println("MKR is Entred");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
