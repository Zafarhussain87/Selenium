package testCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HighlightField {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		WebDriver dr  = new FirefoxDriver();
		dr.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
		
		try{
		WebElement el = dr.findElement(By.xpath("//*[@id='Email']"));
		
		HighlightFieldCode hfc = new HighlightFieldCode();
		hfc.highlightElement(dr,el);
		}
		catch (NoSuchElementException e){
			 
				System.out.println(e.getMessage());
			 
		}
		
		

	}

}
