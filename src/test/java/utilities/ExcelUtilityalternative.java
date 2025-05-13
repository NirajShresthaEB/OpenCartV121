//package utilities;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ExcelUtility {
//
//	private Workbook workbook;
//	private Sheet sheet;
//
//	// Constructor to load the Excel file and select the sheet
//	public ExcelUtility(String filePath, String sheetName) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream(filePath);
//        this.workbook = WorkbookFactory.create(fileInputStream);
//        this.sheet = workbook.getSheet(sheetName);
//        fileInputStream.close();
//    }
//
//	// Method to get the row count in the selected sheet
//	public int getRowCount() {
//		return sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
//	}
//
//	// Method to get the cell count in a given row
//	public int getCellCount(int rowNum) {
//		Row row = sheet.getRow(rowNum);
//		if (row != null) {
//			return row.getLastCellNum();
//		}
//		return 0;
//	}
//
//	// Close the workbook to release resources
//	public void close() throws IOException {
//		workbook.close();
//	}
//
//}
//
////private static Workbook workbook;
////@SuppressWarnings("unused")
////private static Sheet sheet;
////
////public static void LoadExcel(String filePath, String sheetName) throws IOException{
////	
////	FileInputStream file = new FileInputStream(filePath);
////	workbook = new XSSFWorkbook(file);
////	sheet = workbook.getSheet(sheetName);
////}
////
////public static String getCellData(int row, int col) {
////	Cell cell = sheet.getRow(row).getCell(col);
////	if (cell.getCellType() == CellType.STRING) {
////		return cell.getStringCellValue();
////	}
////	else if(cell.getCellType() == CellType.NUMERIC) {
////		return String.valueOf((int) cell.getNumericCellValue());
////	}
////	
////	return"";		
////	
////}
////
////public static int getRowCount() {
////	return sheet.getPhysicalNumberOfRows();
////}
////
////public static void closeExcel() throws IOException{
////	workbook.close();
////}
package utilities;


