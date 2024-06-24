package selenium_methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File desti = new File("C:\\Users\\DTLP112\\eclipse-workspace\\projectS\\ss\\ss1.png");
	
	FileHandler.copy(src, desti);
	
	driver.close();
	
}
}
