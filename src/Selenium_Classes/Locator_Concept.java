package Selenium_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator_Concept {

	public static void main(String[] args) throws InterruptedException {
		//Launching Firefox Driver
		String Path = "C://Selenium3//Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", Path);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com/");
		//Locator ID
		driver.findElement(By.id("email")).sendKeys("MKR");
		driver.findElement(By.id("pass")).sendKeys("RanaRaghuRaju7");
		//driver.findElement(By.id("loginbutton")).click();
		System.out.println("All ID inputs are Entred");
		
		//Locator X-Path
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raju");
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("Yarragudi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("RRR");
		System.out.println("All X-Path inputs are Entred");
		
		//Locator NAME
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("VARA LAKSHMI");
		//driver.findElement(By.name("websubmit")).click();
		System.out.println("All NAME inputs are Entred");
		
		//Locator LINK TEXT		
		//driver.findElement(By.linkText("Create a Page")).click();
		
		//Locator Partial link Text
		// This not much useful
		
		//CSS Selector
		driver.findElement(By.cssSelector("#u_0_q")).sendKeys("Pass");
		
		

	}

}
