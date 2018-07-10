package Selenium_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement_Concept {

	public static void main(String[] args) throws InterruptedException {
		String Path = "C://Selenium3//Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", Path);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Add-Ons"))).build().perform();
		System.out.println("Mouse To the Element");
		Thread.sleep(5000);
		driver.findElement(By.linkText("SpiceCash Topup")).click();
		System.out.println("Actions Obj is Performed");

	}

}
