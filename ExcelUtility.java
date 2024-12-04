package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String getStringdata(int a, int b,String path,String Sheetname) throws IOException  {
		
		f= new FileInputStream(System.getProperty("user.dir")+ path);
		w=new XSSFWorkbook(f); // handling Excel books
		sh= w.getSheet(Sheetname);//handling excel sheets
		XSSFRow R =sh.getRow(a);
		XSSFCell C = R.getCell(b);
		
		return C.getStringCellValue();
		}
	public static String getIntegerdata(int a, int b, String path, String Sheetname) throws IOException {
		
		f = new FileInputStream(System.getProperty("user.dir")+path);
		w=new XSSFWorkbook(f);
		sh= w.getSheet(Sheetname);
		XSSFRow R =sh.getRow(a);
		XSSFCell C = R.getCell(b);
		int x = (int) C.getNumericCellValue();
		return String.valueOf(x);
		
	}
	
}
