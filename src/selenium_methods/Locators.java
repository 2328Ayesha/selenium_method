package selenium_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	driver.findElement(By.tagName("button")).click();
	
	driver.findElement(By.className("button")).click();
	
	driver.findElement(By.id("name")).sendKeys("testing");
	
	driver.findElement(By.linkText("orange HRM")).click();
	
	driver.findElement(By.partialLinkText("ora")).click();
	
	driver.findElement(By.cssSelector("input#wednesday")).click();
		
}
}
