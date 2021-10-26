package Utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class excelUtils {
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public excelUtils(String excelPath, String sheetName){
        try {
            workbook = new XSSFWorkbook(excelPath);
            sheet = workbook.getSheet(sheetName);
        }
        catch (IOException excep) {
            System.out.println(excep.getMessage());
            System.out.println(excep.getCause());
            excep.printStackTrace();
        }

    }

    public static void getCellData(int rowNum, int rowCell){
            DataFormatter formatter = new DataFormatter();
            Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(rowCell));
            System.out.println(value);
        }

    public static void getRowCount(){

           int rowCount = sheet.getPhysicalNumberOfRows();
           System.out.println(rowCount);
            }

    }
