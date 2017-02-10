package testCase1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class HighlightFieldCode {
	
	@Test
	public void highlightElement(WebDriver dr, WebElement el){
		JavascriptExecutor js = (JavascriptExecutor)dr;
		js.executeScript("arguments[0].setAttribute('style','background: red; border: 2px solid yellow;');", el);
		try {
			Thread.sleep(3000);
		}
		catch (Exception e){
			System.out.println("Exception is "+e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border:2px solid white;');",el);
	}

}
