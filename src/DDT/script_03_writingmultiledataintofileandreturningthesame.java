package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script_03_writingmultiledataintofileandreturningthesame {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count=links.size();
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("flipkartlinks");
		for(int i=0;i<count;i++)
		{
			WebElement link = links.get(i);
			String url = link.getAttribute("href");
			XSSFRow row=sheet.createRow(i);
			XSSFCell cell=row.createCell(0);
			cell.setCellValue(url);
			
		}
		FileOutputStream fos=new FileOutputStream("./testfiles/links.xlsx");
		book.write(fos);
		book.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream("./testfiles/links.xlsx");
		XSSFWorkbook book1=new XSSFWorkbook(fis);
		XSSFSheet sheet1 = book1.getSheet("flipkartlinks");
		int lastrownum=sheet1.getLastRowNum();
		for(int i=0;i<=lastrownum;i++) {
			XSSFRow row1=sheet1.getRow(i);
			XSSFCell cell1=row1.getCell(0);
			String url = cell1.getStringCellValue();
			System.out.println(i+" "+url);
		}
		book1.close();
		fis.close();
		
		driver.quit();

	}

}
