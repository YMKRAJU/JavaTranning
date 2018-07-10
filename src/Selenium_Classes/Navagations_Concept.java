package Selenium_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navagations_Concept {

	public static void main(String[] args) {
		String path = "C://Selenium3//Drivers\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", path);

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.amazon.in/");
		System.out.println("Amazon is opened");

		driver.navigate().to("http://www.rediff.com/");
		System.out.println("Rediff is opened");

		driver.navigate().back();

		driver.navigate().to("http://www.flipkart.com/");
		System.out.println("Flipkart is opened");

	}

}
