package testCase1;

//import java.awt.AWTException;

//import java.awt.HeadlessException;
//import java.awt.Rectangle;
import java.awt.Robot;
//import java.awt.Toolkit;
import java.awt.event.KeyEvent;
//import java.awt.image.BufferedImage;
//import java.io.File;

//import javax.imageio.ImageIO;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotScreenShot {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		//Thread.sleep(3000);
		 WebDriver driver=new FirefoxDriver();
        
		  // Maximize the window
		  driver.manage().window().maximize();
		 
		  // Open facebook
		  driver.get("http://www.facebook.com");
		//BufferedImage im = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		
		
		//ImageIO.write(im, "png", new File("D://Selenium//sc1.png"));
		  // Enter Username
		  driver.findElement(By.id("email")).sendKeys("Selenium@gmail.com");
		 
		  // Enter password
		  driver.findElement(By.id("pass")).sendKeys("mukesh");
		 
		  // Create object of Robot class
		  Robot r=new Robot();
		 
		   // Press Enter
		   r.keyPress(KeyEvent.VK_ENTER);
		 
		   // Release Enter
		   r.keyRelease(KeyEvent.VK_ENTER);		 
		                  
		}
		 
		
	}
	
