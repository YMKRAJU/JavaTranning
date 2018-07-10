package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBasics {
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		String path = "C://Selenium3//Drivers\\\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test
	public void TittleTest() {
		String Tittle = driver.getTitle();
		System.out.println(Tittle);
	}
	
	@Test
	public void EditText() {
		driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println("LOGO is Displayed");
	}
	@Test
	public void SearchTest() {
		driver.findElement(By.id("lst-ib")).sendKeys("Raju");
		System.out.println("Raju is Entred");
	}
	
	@Test
	public void SearchBox() {
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("MKR Yarragudi");
		System.out.println("MKR is Entred");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
