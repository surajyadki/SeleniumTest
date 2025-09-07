package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script15_handlingdisabledElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.navigate().to("file://C:/Users/Suraj/OneDrive/Desktop/Basic%20Login%20Page.html");		
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('user').value=''");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('user').value='Suraj'");
		Thread.sleep(2000);
		
		WebElement p = driver.findElement(By.xpath("//input[@value='password']"));
		
		js.executeScript("arguments[0].value=''",p);
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='suraj12345'",p);
		Thread.sleep(2000);
		
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[.='Disabled']")).click();
		Thread.sleep(2000);
		js.executeScript("document.getElementById('name').value='TestUser'");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@type='email' and @name='email']"));
		
		js.executeScript("arguments[0].value='Test@test.com'",email);
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
		
	}

}
