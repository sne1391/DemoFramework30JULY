package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelDataProvider()
	{
		try {
			File f = new File("./ApplicationTestData/AppData.xlsx");
			FileInputStream fis = new FileInputStream(f);
			
			wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	public String getData(int sheetNo, int rowNum, int colNum)
	{
		sheet = wb.getSheetAt(sheetNo);
		String data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
		return data;
	}
	
	public String getData(String sheetName, int rowNum, int colNum)
	{
		sheet = wb.getSheet(sheetName);
		String data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
		return data;
	}
	
}
