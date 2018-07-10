package Selenium_Classes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementS_concept {

	public static void main(String[] args) {
		String path = "C://Selenium3//Drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", path);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> listOfElements = driver.findElements(By.tagName("a"));
		
		System.out.println(listOfElements.size());
		
		for(int i=0;i<listOfElements.size();i++) {
			String LinkText = listOfElements.get(i).getText();
			System.out.println(LinkText);
		}
	}

}
