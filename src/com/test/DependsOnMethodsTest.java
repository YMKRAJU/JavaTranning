package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {
	
WebDriver driver;
	
	@Test
	public void ChromeLunch() {
		String path = "C://Selenium3//Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
	}
	@Test(dependsOnMethods="ChromeLunch")
	public void TittleTest() {
		String Tittle = driver.getTitle();
		System.out.println("Tittle is :"+Tittle);
	}
	
	@Test(dependsOnMethods="TextBox")
	public void SearchButton() {
		driver.findElement(By.name("btnK")).click();		
	}
	
	@Test
	public void TextBox() {
		driver.findElement(By.id("lst-ib")).sendKeys("Manikanta raju");		
	}
	
	@Test(dependsOnMethods="SearchButton")
	public void teardown() {
		driver.close();
	}

}
