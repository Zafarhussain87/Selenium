package module2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckoDriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://jqueryui.com/resources/demos/droppable/default.html");
		Actions act = new Actions(dr);
		//WebElement el1 = dr.findElement(By.id("draggable"));
		WebElement el1 = dr.findElement(By.xpath("//*[@id='draggable']"));
		//WebElement el2 = dr.findElement(By.id("droppable"));
		WebElement el2 = dr.findElement(By.xpath("//*[@id='droppable']"));
		act.dragAndDrop(el1, el2).perform();		
	}
}
