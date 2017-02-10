package testCase1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
//import org.openqa.selenium.support.ui.FluentWait;
public class FluentWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium//softwares//chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://seleniumpractise.blogspot.fi/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		dr.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		org.openqa.selenium.support.ui.FluentWait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(dr);
//		WebElement ele = dr.findElement(By.xpath("//p[text()='WebDriver']"));
		
		wait.withTimeout(15, TimeUnit.SECONDS);
		wait.pollingEvery(1, TimeUnit.SECONDS);
		
		
	}

}
