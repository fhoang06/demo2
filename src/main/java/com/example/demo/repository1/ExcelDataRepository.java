package com.example.demo.repository1;

import com.example.demo.entity.ExcelData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExcelDataRepository extends JpaRepository<ExcelData, Integer> {
}
