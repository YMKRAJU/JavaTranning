package Selenium_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_POPUP_Handle {

	public static void main(String[] args) {
		String Path = "C://Selenium3//Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", Path);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.name("proceed")).click();
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text = alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Message is Correct");
		}
		else {
			System.out.println("Message is IN Correct");
		}
		alert.accept();
		
	}

}
