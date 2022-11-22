package practiceForFetching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadingDatafromExcelTest {
	@Test
	public void readingprop() throws Throwable
	{
		FileInputStream fis=new FileInputStream("./MarkSheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		Row r = s.getRow(3);
		Cell c = r.getCell(0);
		String value = c.getStringCellValue();
		System.out.println(value);
		
		
	}

}
