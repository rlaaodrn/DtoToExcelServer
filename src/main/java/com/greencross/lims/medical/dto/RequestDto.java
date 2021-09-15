package com.greencross.lims.medical.dto;

import com.greencross.lims.DefaultBodyStyle;
import com.greencross.lims.DefaultHeaderStyle;
import com.greencross.lims.ExcelColumn;
import com.greencross.lims.ExcelColumnStyle;
import com.greencross.lims.medical.style.*;
import com.greencross.lims.style.DefaultExcelCellStyle;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//@DefaultHeaderStyle(style = @ExcelColumnStyle(excelCellStyleClass = LightGrayHeader.class))
//@DefaultBodyStyle(style = @ExcelColumnStyle(excelCellStyleClass = NoExcelCellStyle.class))
@DefaultHeaderStyle(style = @ExcelColumnStyle(excelCellStyleClass = DefaultExcelCellStyle.class, enumName = "GREY_HEADER"))
@DefaultBodyStyle(style = @ExcelColumnStyle(excelCellStyleClass = DefaultExcelCellStyle.class, enumName = "BODY"))
public class RequestDto {
    @ExcelColumn(headerName = "의뢰일")
    private String prefix;
    @ExcelColumn(headerName = "수검자번호")
    private String patientNum;
    @ExcelColumn(headerName = "거래처코드")
    private String institution;
    @ExcelColumn(headerName = "출생년도")
    private String patientBirthYear;
    @ExcelColumn(headerName = "성별")
    private String patientSex;
    @ExcelColumn(headerName = "MRN")
    private String mrn;
    @ExcelColumn(headerName = "검사코드명")
    private String serviceName;
    @ExcelColumn(headerName = "검사코드")
    private String serviceCode;
    /*@ExcelColumn(headerName = "age",
            headerStyle = @ExcelColumnStyle(excelCellStyleClass = BlackHeaderStyle.class)
            ,bodyStyle = @ExcelColumnStyle(excelCellStyleClass = MedicalStyle6.class))
    private int age;*/

}
