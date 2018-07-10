package Selenium_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Calander_Generic {

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
		driver.findElement(By.id("datepicker3")).click();

		String Date = "28-Feb-2019";
		String Array[] = Date.split("-");
		String Day = Array[0];
		String Month = Array[1];
		String Year = Array[2];
		Select select_Month = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		select_Month.selectByVisibleText(Month);
		Select select_year = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		select_year.selectByVisibleText(Year);

		String Before_XPath = "//div[@id='ui-datepicker-div']/table/tbody/tr[";
		String After_XPath = "]/td[";
		int Weekdays = 7;

		// div[@id='ui-datepicker-div']/table/tbody/tr[5]/td[3]
		// div[@id='ui-datepicker-div']/table/tbody/tr[5]/td[7]
		for (int rowNum = 1; rowNum <= 5; rowNum++) {
			for (int ColNum = 1; ColNum <= Weekdays; ColNum++) {
				String Date_Value = driver.findElement(By.xpath(Before_XPath + rowNum + After_XPath + ColNum + "]"))
						.getText();
				System.out.println(Date_Value);
				if (Date_Value.equals(Day)) {
					driver.findElement(By.xpath(Before_XPath + rowNum + After_XPath + ColNum + "]")).click();
					System.out.println(Date);
				}

			}
		}

	}

}
