package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	WebDriver driver;

	@Test
	@Parameters({ "browser", "url", "ID" })
	public void YahooMailTest(String browser, String url, String ID) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://Selenium3//Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		else if (browser.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C://Selenium3//Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);			
		}
		driver.get(url);
		driver.findElement(By.id("login-username")).sendKeys(ID);
		driver.close();
	}

}
