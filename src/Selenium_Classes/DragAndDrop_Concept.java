package Selenium_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Concept {

	public static void main(String[] args) {
		String Path = "C://Selenium3//Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", Path);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		// Object Creation For Actions Class
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
				.moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();

	}

}
