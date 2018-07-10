package Selenium_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Highlight_WebElements {

	public static void main(String[] args) {
		String path = "C://Selenium3//Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement NextButton = driver.findElement(By.xpath("//button[text()='Sign Up' and @id='u_0_11']"));
		flash(driver, NextButton);
		driver.findElement(By.xpath("//button[text()='Sign Up' and @id='u_0_11']")).click();
		System.out.println("Element is highlited");
	}

	public static void flash(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundcolor");
		for (int i = 0; i < 200; i++) {
			ChangeColor("rgb(700,0,0", driver, element);
			ChangeColor(bgcolor, driver, element);
		}
	}

	public static void ChangeColor(String color, WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundcolor='"+color+"'", element);
		try {
			Thread.sleep(20);
		}catch (InterruptedException e) {
		}
	}

}
