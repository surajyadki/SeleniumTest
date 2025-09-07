package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script06_DemoApps_IDandNameLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.id("name")).sendKeys("admin");
		driver.findElement(By.id("email")).sendKeys("admin@123.com");
		driver.findElement(By.name("password")).sendKeys("admin@12345");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login Now")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
