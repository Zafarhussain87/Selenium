package testCase1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium//softwares//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("http://seleniumpractise.blogspot.fi/2016/08/how-to-use-explicit-wait-in-selenium.html");
		dr.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		WebDriverWait wt = new WebDriverWait(dr,10);
		WebElement element = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		boolean stat = element.isDisplayed();
		if(stat){
			System.out.println("Element located");
		}else{
				System.out.println("Can not find it");
		}
		
		dr.get("http://seleniumpractise.blogspot.fi/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele = dr.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		Actions act = new Actions(dr);
		//Mouse Hover function
		act.moveToElement(ele).perform();
		
        //Stores all the options available on Mouse Hovering
		List <WebElement> li = dr.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		System.out.println("The size is "+li.size());
		for (int i=0;i<li.size();i++){
			WebElement el = li.get(i);
		System.out.println("The options are "+el.getText());
		if(el.getText().equalsIgnoreCase("TestNG")){
			//el.click();
			break;
		}	
		}
		//Right Click on the Text link
//		act.contextClick(dr.findElement(By.xpath("//a[text()='Selenium Practise']"))).perform();
		act.contextClick(dr.findElement(By.xpath("//a[text()='Selenium Practise']"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();	
		//Keyboard events
	}
}
