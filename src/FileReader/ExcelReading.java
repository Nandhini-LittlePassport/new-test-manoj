package FileReader;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\testData.xlsx");
		try {
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			String data=workbook.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
			String testdata=workbook.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
			System.out.println("Data : "+data);
			System.out.println("Data : "+testdata);
			System.out.println(workbook.getSheet("Login").getRow(0).getCell(1).getStringCellValue());
			System.out.println(workbook.getSheet("Login").getRow(1).getCell(1).getStringCellValue());
			int numberofrows=workbook.getSheet("Login").getLastRowNum();
			System.out.println("Number of rows : "+numberofrows);
			int numberofcolumns=workbook.getSheet("Login").getRow(0).getLastCellNum();
			System.out.println("Number of columns : "+numberofcolumns);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
