package Selenium_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Launch {

	public static void main(String[] args) {
		
//		String ChromePath = "C://Selenium3//Drivers\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", ChromePath);
//		WebDriver driver = new ChromeDriver();
		
		String FirePath = "C://Selenium3//Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FirePath);
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
		String tittle = driver.getTitle();
		System.out.println(tittle);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		}

}
