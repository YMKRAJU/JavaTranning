package Selenium_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calander_javaScript {		
		public static void main(String[] args) {
			String path = "C://Selenium3//Drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://demoqa.com/datepicker");
			driver.findElement(By.id("ui-id-3")).click();
			WebElement Date = driver.findElement(By.id("datepicker3"));
			String DateValue= "15-Feb-1991";
			selectDateBy_JS(driver, Date, DateValue);
		}
			
			public static void selectDateBy_JS(WebDriver driver,WebElement Date,String DateValue) {
				JavascriptExecutor js = ((JavascriptExecutor)driver);
				js.executeScript("arguments[0].setAttribute('value','"+DateValue+"');", Date);

	}

}
