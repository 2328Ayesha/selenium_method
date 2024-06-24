package selenium_methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CropScreenshot {
public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.xpath("//a[@id='gh-la']"));
	
	File src = ((TakesScreenshot)ele).getScreenshotAs(OutputType.FILE);
	File desti = new File("C:\\Users\\DTLP112\\eclipse-workspace\\projectS\\ss\\crop.png");
	FileUtils.copyFile(src, desti);
	driver.close();
	
}
}
