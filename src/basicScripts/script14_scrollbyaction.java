package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script14_scrollbyaction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//h3[contains(.,' Content Standards')]"));
		Thread.sleep(2000);
		int x=ele.getLocation().getX();
		int y=ele.getLocation().getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		
		js.executeScript("document.body.style.zoom='1000%'");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='1000%'");
		Thread.sleep(2000);
		
		
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/scroll/newTabHorizontal");
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(600,0)");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-300,0)");
		Thread.sleep(2000);
		
Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(-document.body.scrollWidth,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(document.body.scrollWidth,0)");
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
