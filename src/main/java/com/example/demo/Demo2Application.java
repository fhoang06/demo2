package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }
//    private static void writeExcel(String filePath, List<String[]> data) {
//        try (Workbook workbook = new XSSFWorkbook()) {
//            Sheet sheet = workbook.createSheet("Data");
//
//            int rowNum = 0;
//            for (String[] rowData : data) {
//                Row row = sheet.createRow(rowNum++);
//                int colNum = 0;
//                for (String field : rowData) {
//                    Cell cell = row.createCell(colNum++);
//                    cell.setCellValue(field);
//                }
//            }
//
//            try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
//                workbook.write(outputStream);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    private static void readExcel(String filePath) {
//        try (Workbook workbook = WorkbookFactory.create(Demo2Application.class.getResourceAsStream(filePath))) {
//            Sheet sheet = workbook.getSheetAt(0);
//
//            for (Row row : sheet) {
//                for (Cell cell : row) {
//                    System.out.print(cell.getStringCellValue() + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println("dữ liệu thêm vào thành công");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
