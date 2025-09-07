package basicScripts;

import java.util.concurrent.TimeUnit;

import javax.management.Notification;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class script18_handlingPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Alert Popup
		driver.navigate().to("https://demoapps.qspiders.com/ui/alert/prompt?sublist=1");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.id("deleteButton")).click();
		Alert popup = driver.switchTo().alert();

		System.out.println(popup.getText());
		popup.sendKeys("Deleting the First Element");
		Thread.sleep(2000);
		popup.accept();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.id("deleteButton")).click();
		popup.dismiss();
		
		//Authentication Popup
		driver.navigate().to("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		Thread.sleep(2000);
		driver.navigate().to("https://admin:admin123@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		Thread.sleep(2000);
		//File upload Popup
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		WebElement upload = driver.findElement(By.id("resume"));
		upload.sendKeys("C:\\Users\\Suraj\\OneDrive\\Desktop\\Suraj YS Cover Letter.docx");
		
		
		ChromeOptions opts=new ChromeOptions();
		opts.addArguments("disable-notifications");
		driver=new ChromeDriver(opts);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://demoapps.qspiders.com/ui/browserNot?sublist=0");		
		WebElement notification = driver.findElement(By.id("browNotButton"));
		notification.click();
		
		
	
	
	}
	

}
