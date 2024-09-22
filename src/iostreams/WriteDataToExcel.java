package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws Exception {
		String excelFilePath = System.getProperty("user.dir") + "\\Files\\Test.xlsx";

		File excelFile = new File(excelFilePath);
		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook excelWorkBook = new XSSFWorkbook(fis);
		XSSFSheet augustSheet = excelWorkBook.createSheet("August2024");
		Row row1 = augustSheet.createRow(0);
		Cell cell1 = row1.createCell(1);
		cell1.setCellValue("This Data from Code");

		FileOutputStream fos = new FileOutputStream(excelFile);
		excelWorkBook.write(fos);
		fos.close();

	}

}
