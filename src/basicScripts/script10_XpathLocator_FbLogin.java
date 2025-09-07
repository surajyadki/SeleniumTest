package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script10_XpathLocator_FbLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Admin"); // By attribute
		driver.findElement(By.xpath("//input[@type='password' and @name='pass' ]")).sendKeys("Admin@1234"); // By multiple attributes
		driver.findElement(By.xpath("//button[.='Log in']")).click();// By Text Function
		Thread.sleep(6000);
	}

}
