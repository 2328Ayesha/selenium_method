package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
}
}
