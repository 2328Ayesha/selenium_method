package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrame {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/frames");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(2000);
	
	Actions act=new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(2000);
	
	driver.switchTo().frame("frame1");
	String text = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
	System.out.println(text);
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame2']")));
	String textf = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
	System.out.println(textf);
	Thread.sleep(2000);
	driver.quit();
}
}
