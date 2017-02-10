package module2;

import org.openqa.selenium.firefox.*;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		
		WebDriver dr = new FirefoxDriver();
		
		//dr.get("http://seleniumpractise.blogspot.fi/2016/08/how-to-automate-radio-button-in.html");
		dr.get("http://www.facebook.com");
		List<WebElement> el1 = dr.findElements(By.cssSelector("input[name='sex'][type='radio']"));
		for (int i=0; i<el1.size();i++){
			WebElement ee= el1.get(i);
			String val = ee.getAttribute("Value");
			if (val.equalsIgnoreCase("2")){
				ee.click();
				}	
		}
		//WebElement el2 = dr.findElement(By.cssSelector("input[name*='la']#sing"));
		List <WebElement> el2 = dr.findElements(By.cssSelector("input[name*='la'][type='checkbox"));
		
		for (int j=0;j<el2.size();j++){
			WebElement e = el2.get(j);
			String e_value = e.getAttribute("Value");
			System.out.println("The value of this check box is "+e_value);
			
		}
		//el2.click();

	}

}
