package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script_jioApplication_locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jio.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Mobile")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("charge")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("submitNumber")).sendKeys("8217252534");
		driver.findElement(By.className("jds_btnCont__516j0")).click();
	}

}
