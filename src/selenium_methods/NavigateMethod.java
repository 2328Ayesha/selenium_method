package selenium_methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.google.co.in/");
	
	driver.navigate().forward();
	
	driver.navigate().to("https://testautomationpractice.blogspot.com/");
	
	driver.navigate().back();
	
	driver.navigate().refresh();
	
	
}
}
