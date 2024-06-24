package selenium_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		Set<String> tab = driver.getWindowHandles();
		for(String focus:tab) {
		System.out.println(focus);	
		driver.switchTo().window(focus);
		}
		
		Thread.sleep(2000);
	    WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	    System.out.println(text.getText());
	    
	    driver.quit();
	    
}
}
