package selenium_methods;
//when use meultiple browser testing at one time 
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionSize {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	Dimension d=new Dimension(100, 200);
	
	System.out.println(driver.manage().window().getSize());
	
	driver.manage().window().setSize(d);
	
	
	
	
}
}
