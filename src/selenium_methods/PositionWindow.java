package selenium_methods;
//when use meultiple browser testing at one time 
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionWindow {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	System.out.println(driver.manage().window().getPosition());
	
	Point p = new Point(100, 200);
	
	driver.manage().window().setPosition(p);
	
	
	
}
}
