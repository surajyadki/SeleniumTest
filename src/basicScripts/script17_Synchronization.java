package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class script17_Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://demoapps.qspiders.com/ui/progress");
		driver.findElement(By.linkText("With Element")).click();
		
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Enter time in seconds']")).sendKeys("5");
		driver.findElement(By.xpath("//button[.='Start']")).click();
		WebElement drpdown = driver.findElement(By.xpath("(//select)[2]"));
		WebDriverWait ew=new WebDriverWait(driver, 5);
		ew.until(ExpectedConditions.visibilityOf(drpdown));
		Select s=new Select(drpdown);
		s.selectByIndex(1);
		
		
	}

}
