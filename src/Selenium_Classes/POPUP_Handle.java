package Selenium_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POPUP_Handle {

	public static void main(String[] args) {
		String Path = "C://Selenium3//Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", Path);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://html.com/input-type-file/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		Alert alert =driver.switchTo().alert();
		alert.dismiss();
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Downloads\\New Text Document.txt");
		System.out.println("File is Uploaded");
		

	}

}
