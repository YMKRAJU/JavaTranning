package Selenium_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handel_DROPDOWN {

	public static void main(String[] args) {
		// Launching Firefox Driver
		String Path = "C://Selenium3//Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", Path);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com/");
		
		// Handle Drop down Button
		// we have to create Object to the Dropdown Element with reference select
		
		//Drop down for DAY
		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("21");
		System.out.println("Day is selected");
		
		//Drop down for Month
		Select select_month = new Select(driver.findElement(By.id("month")));
		select_month.selectByVisibleText("Dec");
		System.out.println("Month is selected");
		
		//Drop down for Year
		Select Select_Year = new Select(driver.findElement(By.id("year")));
		Select_Year.selectByVisibleText("1991");
		System.out.println("Year is selected");
		driver.close();

	}

}
