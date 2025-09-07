package basicScripts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class script13_handlingDropdownExamples {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
		List<WebElement> options = s.getOptions();
		ArrayList<String> list=new ArrayList<String>();
		for(WebElement o:options) {
			list.add(o.getText());
			System.out.println(o.getText());
		}
		
		Collections.sort(list);
		System.out.println("Priting in reverse order");
		for(String l:list) {
			System.out.println(l);
		}
		s.selectByIndex(8);
		System.out.println("First Selected Record : "+s.getFirstSelectedOption().getText());
		List<WebElement> m = s.getAllSelectedOptions();
		System.out.println("All Selected Options :");
		for(WebElement n:m)
		{
				System.out.println(n.getText());
		}
	
		System.out.println("All Options :");
		List<WebElement> n = s.getAllSelectedOptions();
		for(WebElement o:n)
		{
				System.out.println(o.getText());
		}
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(4000);
		
		WebElement drpdwn = driver.findElement(By.id("select-multiple-native"));
		Select Sel=new Select(drpdwn);
		if(Sel.isMultiple())
		{
			System.out.println("It is Multi Select Dropdown");
			
			Sel.selectByIndex(1);
			Thread.sleep(2000);
			Sel.selectByValue("Mens Cotton Jacket");
			Thread.sleep(2000);
			Sel.selectByVisibleText("Fjallraven - Foldsac...");
			Thread.sleep(2000);
			System.out.println("First Selected Option :"+Sel.getFirstSelectedOption().getText());
			System.out.println("All Selected Option :");
			List<WebElement> AllSelOp = Sel.getAllSelectedOptions();
			for(WebElement a:AllSelOp) {
				System.out.println(a.getText());
			}
			System.out.println("All Options :");
			ArrayList<String> li=new ArrayList<String>();
			List<WebElement> AllOp = Sel.getOptions();
			for(WebElement a:AllOp) {
				li.add(a.getText());
				System.out.println(a.getText());
			}
			Collections.sort(li);
			System.out.println("Sorted Order");
			for(String l1:li) {
				System.out.println(l1);
			}
			Collections.sort(li.reversed());
			System.out.println("Reversed Order");
			for(String l1:li) {
				System.out.println(l1);
			}
			Sel.deselectByIndex(0);
			Sel.deselectByValue("Mens Casual Premium Slim Fit T-Shirts ");
			Sel.deselectByVisibleText("Mens Cotton Jacket...");
			
		}
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File Perm=new File("./screenshots/defect1.png");
		FileHandler.copy(temp, Perm);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
		File tmp=ele.getScreenshotAs(OutputType.FILE);
		File Prm=new File("./screenshots/element1.png");
		FileHandler.copy(tmp, Prm);
		Thread.sleep(2000);
		driver.navigate().to("https://www.fb.com");
		driver.findElement(By.id("email")).sendKeys("Admin");
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		email.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		email.sendKeys(Keys.CONTROL+"X");
		Thread.sleep(2000);
		pass.sendKeys(Keys.CONTROL+"V");
		Thread.sleep(2000);
		driver.quit();
		

	}

}
