package testCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		
		dr.get("file:///C:/Users/Zafar%20Hussain/Desktop/frames.html");
		
		int total_frames = dr.findElements(By.tagName("iframe")).size();
		//dr.switchTo().frame("http://www.w3schools.com");
		dr.switchTo().frame("w3c");
	    //dr.switchTo().frame("W3Schools Online Web Tutorials");
	   dr.findElement(By.xpath("//a[@title='Search W3Schools']")).click();
	   Thread.sleep(2000);
	    //dr.findElement(By.xpath("//a[@title='Translate W3Schools']")).click();
	   dr.findElement(By.name("search")).click();
	   Thread.sleep(3000);
	   dr.findElement(By.name("search")).sendKeys("Css");
	   dr.findElement(By.xpath("//*[@title='search'][@type='image']")).click();
	   dr.switchTo().defaultContent();
	   //dr.findElement(By.xpath("//a")).click();
	   Thread.sleep(2000);
	   System.out.println("Total frames are "+total_frames);
	   //dr.switchTo().defaultContent();
	   //dr.navigate().back();
	   dr.switchTo().parentFrame();
	   WebElement el = dr.findElement(By.xpath("//iframe[@title='selenium_news']"));
	   dr.switchTo().frame(el);
	   dr.findElement(By.xpath("//a[@title='Selenium Projects']")).click();
	   
	   //dr.quit();
	}

}
