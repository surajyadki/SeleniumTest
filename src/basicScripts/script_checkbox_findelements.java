package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script_checkbox_findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Suraj/OneDrive/Desktop/Checkbox.html");
		List<WebElement> chkbox = driver.findElements(By.xpath("//input"));
		int count=chkbox.size();
		for(WebElement c:chkbox) {
			c.click();
		}
		for(int i=count-1;i>=0;i--) {
			WebElement c = chkbox.get(i);
			c.click();
		}
		
	}

}
