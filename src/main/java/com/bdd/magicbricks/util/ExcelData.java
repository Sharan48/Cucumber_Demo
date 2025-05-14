package com.bdd.magicbricks.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

    public static List<String[]> ExcelData(String filepath, String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(filepath);
        Workbook workBook = new XSSFWorkbook(file);
        Sheet sheets = workBook.getSheet(sheetName);

        int rowCount = sheets.getPhysicalNumberOfRows();
        List<String[]> credentials = new ArrayList();

        for (int i = 1; i < rowCount; i++) {
            Row rows = sheets.getRow(i);
            String username = rows.getCell(0).getStringCellValue();
            String password = rows.getCell(1).getStringCellValue();
            credentials.add(new String[] { username, password });
        }

        return credentials;
    }

}
