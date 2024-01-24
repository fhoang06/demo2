package com.example.demo.service;

import com.example.demo.entity.ExcelData;
import com.example.demo.repository1.ExcelDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcelService<dataArray> {
    @Autowired
    private final ExcelDataRepository repository;

    public ExcelService(ExcelDataRepository repository) {
        this.repository = repository;
    }

    public void addData(String[] dataArray) {
        for (String data : dataArray) {
            ExcelData excelData = new ExcelData();
            excelData.setData(data);
            repository.save(excelData);
        }
    }
}
