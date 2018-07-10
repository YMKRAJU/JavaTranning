 package Selenium_Classes;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_POPUP {

	public static void main(String[] args) throws InterruptedException {
		String path = "C://Selenium3//Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/");
		driver.findElement(By.xpath("//a[text()='Come & Go Test']")).click();
		
		Set <String> handler =driver.getWindowHandles();
		Iterator<String> it =handler.iterator();
		String ParentWindowID =it.next();
		System.out.println("Parent window id is :"+ ParentWindowID);
		
		String ChildWindowID =it.next();
		System.out.println("ChildWindow ID is :"+ ChildWindowID);
		
		driver.switchTo().window(ChildWindowID);
		System.out.println("Child window tittle is "+ driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(ParentWindowID);
		System.out.println("parent window Tittle is "+ driver.getTitle());
		driver.close();

	}

}
