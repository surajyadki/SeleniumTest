package DDT;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class script_02_writingsinglevalueintofile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet();
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("TestUser1");
		
		FileOutputStream fos=new FileOutputStream("./testfiles/QSP.xlsx");
		book.write(fos);
		book.close();
		fos.close();
	}

}
