package Selenium_Assignement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement_Assig {

	public static void main(String[] args) throws InterruptedException {
		String path = "C://Selenium3//Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		// To get Max Screen
		driver.manage().window().maximize();
		// To delete all the cookies
		driver.manage().deleteAllCookies();

		// Dynamic WAITS
		// To load Complete Page
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		// To Find the WebElement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2'][text()='Category']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='nav-text'][text()='Amazon Prime Video']"))).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='TV Shows']"))).click();

	}

}
