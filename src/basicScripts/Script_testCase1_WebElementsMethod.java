package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_testCase1_WebElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Suraj");
		System.out.println(email.getText());
		Thread.sleep(2000);
		email.clear();
		email.click();
		System.out.println(email.getAttribute("placeholder"));
		System.out.println(email.getCssValue("font-family"));
		System.out.println(email.getLocation());
		System.out.println(email.getRect());
		System.out.println(email.getSize());
		System.out.println(email.getTagName());
		System.out.println(email.isDisplayed());
		System.out.println(email.isEnabled());
		System.out.println(email.isSelected());
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension d=new Dimension(100,200);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Point p =new Point(200,100);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
