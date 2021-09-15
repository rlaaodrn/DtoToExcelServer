package com.greencross.lims.style;

import com.greencross.lims.style.align.DefaultExcelAlign;
import com.greencross.lims.style.border.DefaultExcelBorders;
import com.greencross.lims.style.border.ExcelBorderStyle;
import com.greencross.lims.style.configurer.ExcelCellStyleConfigurer;

public class BlueHeaderStyle extends CustomExcelCellStyle {

    @Override
    public void configure(ExcelCellStyleConfigurer configurer) {
        configurer.foregroundColor(223, 235, 246)
                .excelBorders(DefaultExcelBorders.newInstance(ExcelBorderStyle.DASH_DOT))
                .excelAlign(DefaultExcelAlign.CENTER_CENTER);
    }

}