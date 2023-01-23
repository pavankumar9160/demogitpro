package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dataprovider{
	@DataProvider(name="reg")
	public Object [][] registerdata() throws IOException {
	String path ="C:\\pavan\\Setup\\nopcommercedata\\nopcommerce_registerdata.xlsx";
	FileInputStream fs = new FileInputStream(path);
	XSSFWorkbook wb = new XSSFWorkbook(fs);
	XSSFSheet sheet = wb.getSheetAt(0);
	
	int rowcount = sheet.getPhysicalNumberOfRows();
	int colcount = sheet.getRow(0).getLastCellNum();
	Object data [][] = new Object[rowcount-1][colcount]; 
	for(int i=0;i<rowcount-1;i++) {
		sheet.getRow(i);
	for(int j=0;j<colcount;j++) {
		sheet.getRow(i).getCell(j);
		
		DataFormatter df = new DataFormatter();
	data [i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
		
	}	
		
	}
	wb.close();
	fs.close();
	
	return registerdata();
	
}

	

}