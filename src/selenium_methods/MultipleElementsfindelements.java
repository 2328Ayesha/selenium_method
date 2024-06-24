package selenium_methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleElementsfindelements {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	List<WebElement> list = driver.findElements(By.xpath("//nav[@class='desktop-navbar']/div/div/div/a"));
    for(WebElement all:list) {
    	System.out.println(all.getText());
    }


}
}
