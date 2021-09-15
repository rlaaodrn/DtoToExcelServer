package com.greencross.lims.resource;

import com.greencross.lims.dto.ExcelDto;
import com.greencross.lims.excel.ExcelFile;
import com.greencross.lims.excel.onesheet.OneSheetExcelFile;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelRenderResourceFactoryTest {

    @Test
    public void excelRenderResourceCreationTest() throws IOException {

        ExcelDto a = new ExcelDto();
        a.setName("111");
        a.setAge(2222);
        a.setHideColumn("asgasdf");

        List<ExcelDto> aa = new ArrayList<>();

        aa.add(a);

        //List<ExcelDto> excelDtos = someService.getRenderedData(requestDto);

        ExcelFile excelFile = new OneSheetExcelFile<>(aa, ExcelDto.class);

        FileOutputStream os = new FileOutputStream("O:\\java32\\test.xlsx");
        excelFile.write(os);
    }
}
