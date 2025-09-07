package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class script11_mouseactions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Mouse Hovering 
		driver.navigate().to("https://www.flipkart.com");
		WebElement HF = driver.findElement(By.xpath("//span[.='Home & Furniture']"));
		Actions act=new Actions(driver);
		act.moveToElement(HF).perform();
		Thread.sleep(2000);
		
		//double click
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement dc = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		act.doubleClick(dc).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		//click and hold and release
		driver.navigate().to("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		Thread.sleep(6000);
		WebElement c = driver.findElement(By.xpath("//div[@id='circle']"));
		act.clickAndHold(c).perform();
		Thread.sleep(2000);
		act.release(c).perform();
		Thread.sleep(2000);
		
		//drag and drop
		driver.navigate().to("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement d1 = driver.findElement(By.xpath("//div[.='Mobile Accessories']"));
		//WebElement d2 = driver.findElement(By.xpath("//div[.='Accessories']"));
		act.dragAndDrop(s, d1).perform();
		Thread.sleep(2000);
		//act.dragAndDrop(s, d2).perform();
		Thread.sleep(2000);
	
		//Right Click
		WebElement l = driver.findElement(By.linkText("Default"));
		act.contextClick(l).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	
		Thread.sleep(2000);
		driver.quit();
	}

}
