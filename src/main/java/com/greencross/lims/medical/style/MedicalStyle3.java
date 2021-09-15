package com.greencross.lims.medical.style;

import com.greencross.lims.style.CustomExcelCellStyle;
import com.greencross.lims.style.align.DefaultExcelAlign;
import com.greencross.lims.style.border.DefaultExcelBorders;
import com.greencross.lims.style.border.ExcelBorderStyle;
import com.greencross.lims.style.configurer.ExcelCellStyleConfigurer;
import com.greencross.lims.style.font.DefaultFont;

public class MedicalStyle3 extends CustomExcelCellStyle {

    @Override
    public void configure(ExcelCellStyleConfigurer configurer) {
        configurer.foregroundColor(255, 255, 255)
                .excelBorders(DefaultExcelBorders.newInstance(ExcelBorderStyle.DASHED))
                .excelAlign(DefaultExcelAlign.CENTER_CENTER)
                .excelFont(DefaultFont.TEST_FONT3);
    }

}