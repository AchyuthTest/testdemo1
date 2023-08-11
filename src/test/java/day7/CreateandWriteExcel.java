package day7;

import java.io.File;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class CreateandWriteExcel {
	
	private static Logger log1 =Logger.getLogger(CreateandWriteExcel.class);
	public static void main(String[] args) throws Exception {
		
		File file1 = new File("E:\\Practice\\RestAssured\\src\\test\\java\\day7\\first.xls");
		HSSFWorkbook workbook1 = new HSSFWorkbook();
		
		HSSFSheet Sheet1 = workbook1.createSheet();
		Sheet1.createRow(0);
		Sheet1.getRow(0).createCell(0).setCellValue("hi");
		Sheet1.getRow(0).createCell(1).setCellValue("WORLD1");
		
		Sheet1.createRow(1);
		Sheet1.getRow(1).createCell(0).setCellValue("hEllo");
		Sheet1.getRow(1).createCell(1).setCellValue("WORLD");
		
		Sheet1.createRow(22);
		Sheet1.getRow(22).createCell(10).setCellValue("HEllO");
		Sheet1.getRow(22).createCell(11).setCellValue("SAI");
		workbook1.write(file1);
		workbook1.close();
		
		System.out.println("add values successfully");
		log1.info(Sheet1);
		log1.fatal (file1);
	}
}
