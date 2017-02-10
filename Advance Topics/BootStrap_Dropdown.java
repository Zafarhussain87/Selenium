package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;



public class BootStrap_Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://seleniumpractise.blogspot.fi/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		WebElement ele = dr.findElement(By.id("menu1"));
		ele.click();
		List<WebElement> li = dr.findElements(By.xpath(".//ul[@class='dropdown-menu']//li//a"));
		
		for (WebElement el:li){
			String ss = el.getAttribute("innerHTML");
			System.out.println("The value is "+el.getText());
			if(ss.contains("JavaScript")){
				System.out.println("We got what we were looking for");
				el.click();
				break;
			}
		}
		

	}

}
