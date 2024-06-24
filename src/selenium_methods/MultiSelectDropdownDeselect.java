package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownDeselect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
//select class opetions	
		WebElement car = driver.findElement(By.id("cars"));
		Select sc=new Select(car);
		sc.selectByIndex(1);
		sc.selectByValue("volvo");
		sc.selectByVisibleText("Audi");
		Thread.sleep(2000);
		
//deselect opetions		
		sc.deselectByIndex(3);
		sc.deselectByValue("audi");
		sc.deselectByVisibleText("Saab");
		sc.deselectAll();
	}
}
