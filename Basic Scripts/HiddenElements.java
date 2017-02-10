package testCase1;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenElements {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		
		WebDriver dr = new FirefoxDriver();
		
		dr.get("http://seleniumpractise.blogspot.fi/2016/08/how-to-automate-radio-button-in.html");
		//List<WebElement> li = dr.findElements(By.xpath("//*[@id='male']"));
		int s = dr.findElements(By.xpath("//*[@id='male']")).size();
		dr.findElements(By.xpath("//*[@id='male']")).get(s-1).click();
		
		/*
		for (WebElement el:li){
			
			int x = el.getLocation().getX();
			if(x!=0){
				el.click();
				break;
			}
*/		}
		
	}

