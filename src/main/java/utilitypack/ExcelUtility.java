package utilitypack;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;



public class ExcelUtility {
	@Test
	public void readDataFromexcel() throws Throwable
	{

		FileInputStream fis=new FileInputStream("./Sdet_8PAssign.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		int lastcellvalue = s.getLastRowNum();

		for(int i=0;i<=lastcellvalue;i++)
		{
			String cellvalue = s.getRow(i).getCell(2).getStringCellValue();
			if(cellvalue.equals("IT"))
			{
				System.out.println(s.getRow(i).getCell(1).getStringCellValue());

			}

		}
		for(int i=0;i<=lastcellvalue;i++)
		{
			double sal = s.getRow(i).getCell(4).getNumericCellValue();
			if(sal==5000)
			{
				System.out.println(s.getRow(i).getCell(1).getStringCellValue());
			}

		}


	}
}
