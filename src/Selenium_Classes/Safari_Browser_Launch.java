package Selenium_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari_Browser_Launch {

	public static void main(String[] args) {
		
		/*For Safari no need to Write SetProperty
		 * and No Need to Fetch Driver Path
		 * This Code will not work because Safari need New version (10+) to Run the code*/
		WebDriver driver = new SafariDriver();
		driver.get("http://google.com");
		

	}

}
