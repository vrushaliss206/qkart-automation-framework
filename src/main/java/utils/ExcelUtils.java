package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelUtils {

    public static int getRowCount(String filePath) throws Exception {

        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(fis);

        Sheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getPhysicalNumberOfRows();

        workbook.close();

        return rowCount;
    }

    public static int getColumnCount(String filePath) throws Exception {

        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(fis);

        Sheet sheet = workbook.getSheetAt(0);

        int columnCount =
                sheet.getRow(0).getPhysicalNumberOfCells();

        workbook.close();

        return columnCount;
    }

    public static String getCellData(
            String filePath,
            int row,
            int column) throws Exception {

        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(fis);

        Sheet sheet = workbook.getSheetAt(0);

        String value =
                sheet.getRow(row)
                     .getCell(column)
                     .toString();

        workbook.close();

        return value;
    }

    public static Object[][] getTestData(
            String filePath) throws Exception {

        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(fis);

        Sheet sheet = workbook.getSheetAt(0);

        int rows = sheet.getPhysicalNumberOfRows();

        int cols =
                sheet.getRow(0)
                     .getPhysicalNumberOfCells();

        Object[][] data =
                new Object[rows - 1][cols];

        for (int i = 1; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                data[i - 1][j] =
                        sheet.getRow(i)
                             .getCell(j)
                             .toString();
            }
        }

        workbook.close();

        return data;
    }
}