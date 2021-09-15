package com.greencross.lims.style;

import com.greencross.lims.style.align.DefaultExcelAlign;
import com.greencross.lims.style.border.DefaultExcelBorders;
import com.greencross.lims.style.border.ExcelBorderStyle;
import com.greencross.lims.style.configurer.ExcelCellStyleConfigurer;

public class BlackHeaderStyle extends CustomExcelCellStyle {

    @Override
    public void configure(ExcelCellStyleConfigurer configurer) {
        configurer.foregroundColor(0, 0, 0)
                .excelBorders(DefaultExcelBorders.newInstance(ExcelBorderStyle.THIN))
                .excelAlign(DefaultExcelAlign.CENTER_CENTER);
    }

}