package testCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class NotClickableElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://Selenium//softwares//chromedriver.exe");
		
		WebDriver dr  = new ChromeDriver();
		
		dr.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=us&.lang=en-US&.done=https%3A%2F%2Fwww.yahoo.com");
		Actions act = new Actions(dr);
		
		act.moveToElement(dr.findElement(By.id("persistent"))).click().build().perform();
		
		
		
	}

}
