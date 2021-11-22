package com.greencross.lims.dto;

import com.greencross.lims.DefaultHeaderStyle;
import com.greencross.lims.ExcelColumn;
import com.greencross.lims.ExcelColumnStyle;
import com.greencross.lims.medical.style.MedicalStyle1;
import com.greencross.lims.medical.style.MedicalStyle4;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@DefaultHeaderStyle(style = @ExcelColumnStyle(excelCellStyleClass = MedicalStyle4.class))
public class ExcelDto {

    @ExcelColumn(headerName = "name")
    private String name;

    private String hideColumn;

    @ExcelColumn(headerName = "age",
            headerStyle = @ExcelColumnStyle(excelCellStyleClass = MedicalStyle1.class))
    private Double age;

}
