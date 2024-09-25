package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {

		String excelFilePath = System.getProperty("user.dir") + "\\Files\\Test.xlsx";

		File excelFile = new File(excelFilePath);
		FileInputStream fis = new FileInputStream(excelFile);

//		XSSFWorkbook (.xlsx)
//		hSSFWorkbook (.xls)

		XSSFWorkbook excelWorkBook = new XSSFWorkbook(fis);
		XSSFSheet languagesSheet = excelWorkBook.getSheet("Languages");

		int numOfRows = languagesSheet.getLastRowNum();
		int noOfColumns = languagesSheet.getRow(1).getLastCellNum();

		Iterator<Row> allRows = languagesSheet.rowIterator();

		while (allRows.hasNext()) {
			Row eachRow = allRows.next();
			Iterator<Cell> allCell = eachRow.cellIterator();

			while (allCell.hasNext()) {
				Cell eachChell = allCell.next();
				String str = "";
				if (eachChell.getCellType() == Cell.CELL_TYPE_STRING) {
					str = eachChell.getStringCellValue();
					System.out.print(str + " -> ");
				} else if (eachChell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					double double1 = eachChell.getNumericCellValue();
					System.out.print(double1 + " -> ");
				} else if (eachChell.getCellType() == Cell.CELL_TYPE_BLANK) {
					str = "EMPTY_COLUMN";
					System.out.print(str + " -> ");
				}
			}
			System.out.println("");
			System.out.println("");
		}

	}

}
