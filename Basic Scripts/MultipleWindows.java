package testCase1;

import java.util.Iterator;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium//softwares//chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String parent_window = dr.getWindowHandle();
		
		System.out.println("Parent window is "+dr.getTitle());
		
		dr.findElement(By.xpath("//a[text()='Learn more']")).click();
		
		Set<String> s1 =dr.getWindowHandles();
        
		System.out.println("The set is "+s1);
        
        Iterator <String> I1 = s1.iterator();
        
        while(I1.hasNext()){
        	
        	String child_window = I1.next();
        	
        	if(!parent_window.equalsIgnoreCase(child_window)){
        		dr.switchTo().window(child_window);
        		System.out.println("Child window is "+dr.getTitle());
        		Thread.sleep(3000);
        	    dr.findElement(By.xpath("html/body/div[2]/div[2]/section/div/article/div/div[3]/div/div[3]/button[1]")).click();
        	    Thread.sleep(5000);
        	    
        		dr.close();
        	}
        }
        dr.switchTo().window(parent_window);
        dr.findElement(By.xpath("//a[text()='Privacy & Terms']")).click();

	}

}
