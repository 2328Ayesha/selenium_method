package selenium_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInterfaceMethod2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//isDisplayed	
	boolean logostats = driver.findElement(By.xpath("//a[@id='gh-la']")).isDisplayed();
	System.out.println("logo status ="+logostats);
//isEnabled	
	boolean buttn = driver.findElement(By.xpath("//input[@id='gh-btn']")).isEnabled();
	System.out.println("button status="+buttn);
//isSelected
	boolean select = driver.findElement(By.xpath("//div[@class='gh-menu']/a[@aria-label='Your shopping cart']")).isSelected();
	System.out.println("select status="+select);	

//submit ---->this will work only for button having as any attribute value.
	driver.findElement(By.xpath("//h3[text()='Luxury']")).submit();
}
}
