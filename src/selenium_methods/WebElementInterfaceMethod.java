package selenium_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebElementInterfaceMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//findelement
	WebElement css = driver.findElement(By.xpath("//h1"));	
//getcssValue
	System.out.println(css.getCssValue("color"));
//sendkeys
	WebElement firstname = driver.findElement(By.cssSelector("input#name"));
	firstname.sendKeys("testing");
//click
	driver.findElement(By.id("sunday")).click();
//clear
	firstname.clear();
//gettext
	WebElement text = driver.findElement(By.id("monday"));
    System.out.println(text.getText());
//getattribute
    String attribute = text.getAttribute("monday");
    System.out.println(attribute);
//gettagname
    String tag = firstname.getTagName();
    System.out.println(tag);
//getlocation
    Point location = driver.findElement(By.xpath("//input[@id='email']")).getLocation();
    System.out.println(location);
    int x=location.getX();
    System.out.println(x);
    int y=location.getY();
    System.out.println(y);
//getsize
   Dimension getsiz = firstname.getSize();                      //element hight and width
   System.out.println("dimaentions of firstname text box"+getsiz);
   System.out.println("firstname textbox hight"+getsiz.getHeight());
   System.out.println("firstname textbox width"+getsiz.getWidth());
   
   Actions act=new Actions(driver);
   act.sendKeys(Keys.PAGE_DOWN).perform();
 
	
}
}
