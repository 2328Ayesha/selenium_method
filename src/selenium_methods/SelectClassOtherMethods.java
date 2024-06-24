package selenium_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassOtherMethods{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
//selectclass		
		WebElement car = driver.findElement(By.xpath("//select[@id='cars']"));
		Select sc=new Select(car);
		sc.selectByIndex(1);
		sc.selectByValue("opel");
		sc.selectByVisibleText("Audi");
		
//isMultiple() ------check list status single or multiple		
		boolean listboxstatus = sc.isMultiple();
		System.out.println("list box is multi="+listboxstatus);

//getOptions() -----get all opetion from list
		List<WebElement> opetions = sc.getOptions();
	    for(WebElement get:opetions) {
		System.out.println("getOptins=: "+get.getText());	
	}

//getAllSelectedOptions() ----get all selected opetions	    
	   List<WebElement> allopetions = sc.getAllSelectedOptions();
	   for(WebElement all:allopetions) {
		   System.out.println("getAllSelectedOptions=: "+all.getText());
	   }
	   
//getFirstSelectedOption----get first selected opetion---in multiple get first select opetion   
	   WebElement fisrtselect = sc.getFirstSelectedOption();
	   System.out.println("getFirstSelectedOption=: "+fisrtselect.getText());
	
	}
}
