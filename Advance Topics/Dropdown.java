package module2;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//import java.util.List;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("http://www.facebook.com");
		//selecting month from dropdown
		WebElement drop_down1 = dr.findElement(By.id("month"));
		Select month = new Select(drop_down1);
			month.selectByIndex(3);
		WebElement mon = month.getFirstSelectedOption();
			System.out.println("The values after selection is "+mon.getText());
		//selecting date from dropdown	
		WebElement drop_down2 = dr.findElement(By.id("day"));
		Select day = new Select(drop_down2);
			day.selectByValue("20");
		//selecting year from dropdown
		WebElement drop_down3 = dr.findElement(By.id("year"));
		Select year = new Select(drop_down3);	
		year.selectByVisibleText("2015");
		month.selectByIndex(0);
		WebElement nn = month.getFirstSelectedOption();
		System.out.println("The selected value is "+nn.getText());
		if (nn.getText().equalsIgnoreCase("Month")){
			System.out.println("Nothing is selected");
		}
			List<WebElement> m = month.getOptions();
			if (m.size()<13){
				System.out.println("Everything is ok");
			}
			for (WebElement ele:m){
				System.out.println("Month is "+ele.getText());
			}
		}

	}


