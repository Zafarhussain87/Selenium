package testCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.interactions.Actions;


public class ToolTip {

	public static void main(String[] args) throws InterruptedException {
		
		// Create proxy class object
		Proxy p = new Proxy();
		// Set HTTP Port to 7777
		p.setHttpProxy("localhost:7777");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		// Pass proxy object p
		cap.setCapability(CapabilityType.PROXY, p);		
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares/geckodriver.exe");
		WebDriver dr = new FirefoxDriver(cap);
		dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		dr.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en");
		dr.findElement(By.xpath(".//*[@id='GmailAddress']")).click();
		
		//Actions act = new Actions(dr);
		
		//WebElement el = dr.findElement(By.xpath("html/body/div[2]/div[1]"));
		//act.moveToElement(el).perform();
		
		//String st = el.getText();
		//System.out.println("Tooltip message is "+st);
		
		//String expected_msg = " You can use letters, number, and periods. ";
		
		//Assert.assertEquals(st, expected_msg);
	//	System.out.println("Message Verified");
	}

}
