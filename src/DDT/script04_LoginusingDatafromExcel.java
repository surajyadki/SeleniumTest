package DDT;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script04_LoginusingDatafromExcel {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.fb.com");
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		FileInputStream fis=new FileInputStream("./testfiles/TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int lrn = sheet.getLastRowNum();
		System.out.println(lrn);
		
		for(int i=0;i<=lrn;i++) {
			
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell1=row.getCell(i);
			XSSFCell cell2=row.getCell(1);
			String usr = cell1.getStringCellValue();
			String pwd = cell2.getStringCellValue();
			System.out.println(usr+" "+pwd);
			email.sendKeys(usr);
			password.sendKeys(pwd);
			
			driver.findElement(By.xpath("//button[.='Log in']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			email.clear();
			driver.navigate().refresh();
		}
		
		
		Thread.sleep(2000);
		workbook.close();
		fis.close();
		Thread.sleep(2000);
		driver.quit();
		
//		for(int i=0;i<=lrn;i++) {
//			for(int j=0;j<=lrn;j++) {
//			XSSFRow row=sheet.getRow(i);
//			XSSFCell cell1=row.getCell(i);
//			XSSFCell cell2=row.getCell(j);
//			}
//			
//		}
		
		
		
		
		
		
		
		
	}

}
