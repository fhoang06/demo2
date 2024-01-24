package com.example.demo.controller;

import com.example.demo.entity.ExcelData;
import com.example.demo.repository1.ExcelDataRepository;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileOutputStream;

@RestController
public class Controller {
    @Autowired
    private ExcelDataRepository excelDataRepository;

    @GetMapping(value = "hello")
    @ResponseBody
    public ResponseEntity<?> hello() throws Exception {
        return new ResponseEntity<>("toi ten la Duc Hoang", HttpStatus.OK);
    }

    @PostMapping("/add")
    @ResponseBody
    public ResponseEntity<?> add( ExcelData requestBody){
        try{
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Sheet1");
            Row row = sheet.createRow(0);

            Cell cell1 = row.createCell(0);
            cell1.setCellValue("ID");
            Cell cell2 = row.createCell(1);
            cell2.setCellValue("nhafcungcapdichvukyc");
            Cell cell3 = row.createCell(2);
            cell3.setCellValue("customerid");
            Cell cell4 = row.createCell(3);
            cell4.setCellValue("anhgiattomattruoc ");
            Cell cell5 = row.createCell(4);
            cell5.setCellValue("anhgiattomatsau ");
            Cell cell6 = row.createCell(5);
            cell6.setCellValue("anhchandung ");
            Cell cell7 = row.createCell(6);
            cell7.setCellValue("ketquaocrnattruoc ");
            Cell cell8 = row.createCell(7);
            cell8.setCellValue("thoigianxuly ");
            Cell cell9 = row.createCell(8);
            cell9.setCellValue("anhgiattomattruoc ");
            Cell cell10 = row.createCell(9);
            cell10.setCellValue("thoigianxuly1 ");
            Cell cell11 = row.createCell(10);
            cell11.setCellValue("ketquasosanhmat ");
            Cell cell12 = row.createCell(11);
            cell12.setCellValue("thoigianxuly2 ");
            Cell cell13 = row.createCell(12);
            cell13.setCellValue("dulieuocrmattruoc ");
            Cell cell14 = row.createCell(13);
            cell14.setCellValue("dulieuocrmatsau ");
            Cell cell15 = row.createCell(14);
            cell15.setCellValue("dulieusosanhkhuonmat ");
            Cell cell16 = row.createCell(15);
            cell16.setCellValue("data ");


            Row dataRow = sheet.createRow(1);

            Cell dataCell1 = dataRow.createCell(0);
            dataCell1.setCellValue(requestBody.getId());

            Cell dataCell2 = dataRow.createCell(1);
            dataCell2.setCellValue(requestBody.getNhafcungcapdichvukyc());

            Cell dataCell3 = dataRow.createCell(2);
            dataCell3.setCellValue(requestBody.getCustomerid());

            Cell dataCell4 = dataRow.createCell(3);
            dataCell4.setCellValue(requestBody.getAnhgiattomattruoc());

            Cell dataCell5 = dataRow.createCell(4);
            dataCell5.setCellValue(requestBody.getAnhgiattomatsau());

            Cell dataCell6 = dataRow.createCell(5);
            dataCell6.setCellValue(requestBody.getAnhchandung());

            Cell dataCell7 = dataRow.createCell(6);
            dataCell7.setCellValue(requestBody.getKetquaocrnattruoc());

            Cell dataCell8 = dataRow.createCell(7);
            dataCell8.setCellValue(requestBody.getThoigianxuly());

            Cell dataCell9 = dataRow.createCell(8);
            dataCell9.setCellValue(requestBody.getKetquaocrmatsau());

            Cell dataCell10 = dataRow.createCell(9);
            dataCell10.setCellValue(requestBody.getThoigianxuly1());

            Cell dataCell11 = dataRow.createCell(10);
            dataCell11.setCellValue(requestBody.getKetquasosanhmat());

            Cell dataCell12 = dataRow.createCell(11);
            dataCell12.setCellValue(requestBody.getThoigianxuly2());

            Cell dataCell13 = dataRow.createCell(12);
            dataCell13.setCellValue(requestBody.getDulieuocrmattruoc());

            Cell dataCell14 = dataRow.createCell(13);
            dataCell14.setCellValue(requestBody.getDulieuocrmatsau());

            Cell dataCell15 = dataRow.createCell(14);
            dataCell15.setCellValue(requestBody.getDulieusosanhkhuonmat());

            Cell dataCell16 = dataRow.createCell(15);
            dataCell16.setCellValue(requestBody.getData());

            ExcelData savedData  = excelDataRepository.save(requestBody);


            int lastRowNum = sheet.getLastRowNum();
            Row excelDataRow = sheet.createRow(lastRowNum + 1);

            excelDataRow.createCell(0).setCellValue(savedData.getId());
            excelDataRow.createCell(1).setCellValue(savedData.getNhafcungcapdichvukyc());
            excelDataRow.createCell(2).setCellValue(savedData.getCustomerid());
            excelDataRow.createCell(3).setCellValue(savedData.getAnhgiattomattruoc());
            excelDataRow.createCell(4).setCellValue(savedData.getAnhgiattomatsau());
            excelDataRow.createCell(5).setCellValue(savedData.getAnhchandung());
            excelDataRow.createCell(6).setCellValue(savedData.getKetquaocrnattruoc());
            excelDataRow.createCell(7).setCellValue(savedData.getThoigianxuly());
            excelDataRow.createCell(8).setCellValue(savedData.getKetquaocrmatsau());
            excelDataRow.createCell(9).setCellValue(savedData.getThoigianxuly1());
            excelDataRow.createCell(10).setCellValue(savedData.getKetquasosanhmat());
            excelDataRow.createCell(11).setCellValue(savedData.getThoigianxuly2());
            excelDataRow.createCell(12).setCellValue(savedData.getDulieuocrmattruoc());
            excelDataRow.createCell(13).setCellValue(savedData.getDulieuocrmatsau());
            excelDataRow.createCell(14).setCellValue(savedData.getDulieusosanhkhuonmat());
            excelDataRow.createCell(15).setCellValue(savedData.getData());


            String excelFilePath = "E:\\Project\\mypoi2.xlsx";
            try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
                workbook.write(outputStream);
            }

            workbook.close();

            return new ResponseEntity<>("thanh cong",HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>("erro",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
