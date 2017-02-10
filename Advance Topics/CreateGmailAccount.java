package advanceTopics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateGmailAccount {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		
		JavascriptExecutor je = (JavascriptExecutor)dr;
		
		dr.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en");
		
		dr.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("jackie");
		dr.findElement(By.name("LastName")).sendKeys("Daniel");
		dr.findElement(By.id("GmailAddress")).sendKeys("zhm2470");
		dr.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Demo@123");
		dr.findElement(By.xpath(".//*[@id='PasswdAgain']")).sendKeys("Demo@123");
		dr.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]")).click();
		dr.findElement(By.xpath(".//*[@id=':6']/div")).click();
		dr.findElement(By.name("BirthDay")).sendKeys("20");
		dr.findElement(By.id("BirthYear")).sendKeys("1988");
		dr.findElement(By.xpath(".//*[@id='Gender']/div[1]")).click();
		dr.findElement(By.xpath("//*[text()='Male']")).click();
		dr.findElement(By.xpath(".//*[@id='submitbutton']")).click();
		Thread.sleep(3000);
		//dr.findElement(By.xpath("tos-scroll-button")).click();

		int ok_size=dr.findElements(By.xpath(".//*[@id='iagreebutton']")).size();

		dr.findElements(By.xpath(".//*[@id='iagreebutton']")).get(ok_size-1).click();

		
		Thread.sleep(2000);
		//je.executeScript("scroll(0,900)");

		//dr.findElement(By.xpath(".//*[@id='iagreebutton']")).click();
		Thread.sleep(2000);
		
		/*String parent_window = dr.getWindowHandle();
		Set<String> s1 = dr.getWindowHandles();
		System.out.println(parent_window);
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String child_window = i1.next();
			System.out.println(child_window);
			if(!parent_window.equalsIgnoreCase(child_window)){
				dr.switchTo().window(child_window);
				je.executeScript("scroll(0,900)");
				Thread.sleep(3000);
				WebElement el = dr.findElement(By.xpath(".//*[@id='iagreebutton']"));
				System.out.println(el.getText());
				
				je.executeScript("arguments[0].scrollIntoView(true);", el);
				el.click();
				Thread.sleep(3000);
			}
			
		}
		dr.switchTo().window(parent_window);
	*/
	}

}
