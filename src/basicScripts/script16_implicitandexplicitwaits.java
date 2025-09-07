package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class script16_implicitandexplicitwaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Suraj");
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/progress");
		WebDriverWait ew=new WebDriverWait(driver,10);
		ew.until(ExpectedConditions.titleContains("Synchronization"));
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}

}
