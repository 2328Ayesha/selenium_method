package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	
	driver.manage().deleteAllCookies();
	
	driver.manage().window().maximize();
	
	System.out.println(driver.getPageSource());
	
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
	
	System.out.println(driver.getWindowHandle());
	
	System.out.println(driver.getWindowHandles());
	
	driver.close();
	
	driver.quit();	
	
}
}
