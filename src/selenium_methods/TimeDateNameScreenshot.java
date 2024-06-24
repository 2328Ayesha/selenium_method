package selenium_methods;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TimeDateNameScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        
		Date d = new Date();
		String datetime = d.toString().replace(' ', '_').replace(':', '_');
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\DTLP112\\eclipse-workspace\\projectS\\ss\\"+datetime+".png");
		FileHandler.copy(src, desti);
		driver.close();
	}
}
