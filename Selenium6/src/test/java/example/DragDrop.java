package example;



import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DragDrop {

	@Test
	 public void f() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\aishwarya.sacharya\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver d1;
			d1=new ChromeDriver();

		d1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


		d1.get("http://the-internet.herokuapp.com/drag_and_drop"); 
		
	   WebElement drag1=d1.findElement(By.id("column-a"));
	   WebElement drop1=d1.findElement(By.id("column-b"));
	   
	   Actions act1=new Actions(d1);
	   
	  act1.dragAndDrop(drag1, drop1).build().perform();
		

	}
}
