package selenium_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggetion {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.uk/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(2000);
	
//search	 
	driver.findElement(By.id("APjFqb")).sendKeys("samsung");
	Thread.sleep(2000);
	
//print all opetion	
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));	
	System.out.println("size for suggetion=: "+list.size());	
	for(WebElement print:list) {
				System.out.println(print.getText());
			}
	
//click on opetion
	String exp="samsung s23";
	for(WebElement print:list) {
		Thread.sleep(2000);
		String act = print.getText();
		if(exp.equals(act)) {
			print.click();
			
		}
	}
	
	
}
}
