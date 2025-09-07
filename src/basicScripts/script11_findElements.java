package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script11_findElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count=links.size();
		System.out.println("Number of Links :"+count);
		//for(int i=count-1;i>=0;i--)  //for reverse order
		//for(int i=0;i<count;i++) // for all links
		//for (int i=0;i<count;i=i+2) // for even records
	/*	for (int i=1;i<count;i=i+2) // for odd records
		{
			WebElement link = links.get(i);
			String url=link.getAttribute("href");
			String text=link.getText();
			System.out.println(i+" "+text+" "+url);
		} */
		
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			String text=link.getText();
			System.out.println(text+" "+url);
		}
		driver.quit();
	
	}

}
