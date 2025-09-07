package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class script12_HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Suraj/OneDrive/Desktop/dropdown.html");
		
		WebElement dropdown = driver.findElement(By.id("skills"));
		Select s=new Select(dropdown);
		
		if(s.isMultiple())
		{
			System.out.println("Its Multi Select DropDown");
			
			s.selectByIndex(0);
			s.selectByValue("l");
			s.selectByVisibleText("JavaScript");
			Thread.sleep(2000);
			System.out.println("First Selected Option : "+s.getFirstSelectedOption());
			List<WebElement> options = s.getAllSelectedOptions();
			System.out.println("All Selected Option : ");
			for(WebElement o:options) {
				System.out.println(o.getText());
			}
			ArrayList<String> list=new ArrayList<String>();
			List<WebElement> alloptions = s.getOptions();
			System.out.println("All Options : ");
			for(WebElement o:alloptions) {
				list.add(o.getText());
				System.out.println(o.getText());
			}
			System.out.println("Printing in the sorted order");
			Collections.sort(list);
			for(String l:list) {
				System.out.println(l);
			}
			System.out.println("Printing in the Reverse order");
			Collections.sort(list.reversed());
			for(String l:list) {
				System.out.println(l);
			}
			
			Thread.sleep(2000);
			//s.deselectAll();
			s.deselectByIndex(2);
			s.deselectByValue("i");
			s.deselectByVisibleText("TESTNG");
		}
		else {
			System.out.println("It is Single Select DropDown");
		}
		driver.quit();
	}

}
