package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopUp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
//pagedown	
	Actions act=new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(2000);
	
//alertButton	
    driver.findElement(By.xpath("//button[@id='alertButton']")).click();
    String text = driver.switchTo().alert().getText();
	System.out.println(text);
    driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
//timerAlertButton
	driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	Thread.sleep(5000);
	String text1 = driver.switchTo().alert().getText();
	System.out.println(text1);
	Thread.sleep(5000);
	driver.switchTo().alert().accept();	
	Thread.sleep(2000);
	
//confirmButton
	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	String text2 = driver.switchTo().alert().getText();
	System.out.println(text2);
	driver.switchTo().alert().dismiss();
	Thread.sleep(2000);
	
//promtButton
	driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	driver.switchTo().alert().sendKeys("ayeshakhan");
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
}
}
