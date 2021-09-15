package com.greencross.lims.controller;

import com.greencross.lims.medical.dto.RequestDto;
import com.greencross.lims.excel.ExcelFile;
import com.greencross.lims.excel.onesheet.OneSheetExcelFile;
import com.greencross.lims.service.MedicalCheckupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class MedicalCheckupController {
    @Autowired
    private MedicalCheckupService medicalService;

    @GetMapping(value="/api/excel/institution/{institution}/request")
    public void getRequest(HttpServletResponse response, @PathVariable String institution) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", String.format("attachment;filename=%s.xlsx", "excelfile"));

        ExcelFile excelFile = new OneSheetExcelFile<>(medicalService.getRequestRenderedData(institution), RequestDto.class);
        excelFile.write(response.getOutputStream());
    }
}

