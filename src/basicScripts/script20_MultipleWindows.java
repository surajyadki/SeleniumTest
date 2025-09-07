package basicScripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script20_MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		driver.findElement(By.xpath("//button[.='Shop Now']")).click();
		String parentTab = driver.getWindowHandle();
		Set<String> allTabs = driver.getWindowHandles();
		for(String tab:allTabs) {
			WebDriver itab = driver.switchTo().window(tab);
			System.out.println(itab.getTitle());
			System.out.println(tab);
			if(tab.equals(parentTab))
			{
				itab.close();
			}
		}
		
		
	}

}
