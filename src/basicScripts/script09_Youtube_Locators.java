package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script09_Youtube_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Kesariya Rangu");
		driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("yt-formatted-string[aria-label='BRAHMĀSTRA (Kannada) | Kesariya Rangu | Ranbir | Alia | Pritam | Sanjith Hegde, Sid Sriram 2 minutes, 47 seconds']")).click();
		//driver.findElement(By.linkText("BRAHMĀSTRA (Kannada) | Kesariya Rangu | Ranbir | Alia | Pritam | Sanjith Hegde, Sid Sriram")).click();
		//  driver.findElement(By.tagName("ytd-video-renderer")).click();
		
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
	}

}
