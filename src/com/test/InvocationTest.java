package com.test;

import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationTest {
	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		String path = "C://Selenium3//Drivers\\\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	@Test(invocationCount = 4)
	public void TittleTest() {
		String Tittle = driver.getTitle();
		System.out.println(Tittle);
	}
	
	//Invocation Timeout is not enough to load This TextBox Method so it will give error
	@Test(invocationTimeOut = 100)
	public void TextBox() {
		driver.findElement(By.id("lst-ib")).sendKeys("Manikanta raju");
	}
	
	//Expected Exceptions are not good practice in selenium
	@Test(expectedExceptions = NumberFormatException.class)
	public void Test() {
		String x = "100X";
		Integer.parseInt(x);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
