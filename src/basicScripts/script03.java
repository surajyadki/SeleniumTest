package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Suraj\\OneDrive\\Desktop\\Basic Login Page.html");
		//driver.findElement(By.id("li")).click();
		//driver.findElement(By.name("n1")).click();
		
		driver.findElement(By.className("c1")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
