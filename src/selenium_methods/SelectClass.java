package selenium_methods;
//ekda single select kelyvr deselect hot nahi.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//single select we cant use deselect opetion--UnsupportedOperationException
public class SelectClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
	 
		Select sc=new Select(country);
		sc.selectByIndex(1);
		Thread.sleep(2000);
		
		sc.selectByValue("germany");
		Thread.sleep(2000);
		
		sc.selectByVisibleText("India");
		Thread.sleep(2000);
		
	}
}
