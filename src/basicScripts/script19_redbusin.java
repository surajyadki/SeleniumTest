package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script19_redbusin {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[.='Date of Journey']")).click();
				driver.findElement(By.xpath("//i[@aria-label='Next month, August 2025']")).click();
		driver.findElement(By.xpath("//span[.='31']")).click();
		
		
	}
}
