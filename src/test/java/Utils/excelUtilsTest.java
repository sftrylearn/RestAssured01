package Utils;

public class excelUtilsTest {

    public static void main(String[] args) {
        String excelPath = "./Testdata/Testdata1.xlsx";
        String sheetName = "sheet1";
        excelUtils excel = new excelUtils(excelPath,sheetName);
        excel.getRowCount();
        excel.getCellData(1,0);
        excel.getCellData(1,1);
        excel.getCellData(1,2);
        excel.getCellData(2,0);
        excel.getCellData(2,1);
        excel.getCellData(2,2);
    }
}
