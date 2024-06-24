package selenium_methods;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiYONO {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.onlinesbi.sbi/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
    List<WebElement> link = driver.findElements(By.xpath("//div[@id='usefullLinks']/div/div/ul/li/a"));
	
	System.out.println(driver.getTitle()); 
	
	for( WebElement click:link) {
		
		System.out.println(click.getText());
	}
	Set<String> newwin = driver.getWindowHandles();
	for(String focus:newwin) {
	driver.switchTo().window(focus);
	System.out.println(focus);
	}
	
	
	
}
}
