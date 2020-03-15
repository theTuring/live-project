package com.back_end.utils;

import com.back_end.domain.Record;
import com.back_end.mapper.RecordMapper;
import com.back_end.service.impl.RecordServiceImpl;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */
public class ExportExcel {
    public static void main(String[] args) {
        try {
            WritableWorkbook wwb = null;
            // 创建可写入的Excel工作簿
            String fileName = "D://book.xls";
            File file=new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            //以fileName为文件名来创建一个Workbook
            wwb = Workbook.createWorkbook(file);
            // 创建工作表
            WritableSheet ws = wwb.createSheet("用户信息", 0);
            //查询数据库中所有的数据

            List<Record> lists=(ArrayList<Record>)new RecordServiceImpl().queryAll(1);

            //要插入到的Excel表格的行号，默认从0开始
            Label labelId= new Label(0, 0, "姓名");//表示第
            Label labelName= new Label(1, 0, "电话");
            Label labelSex= new Label(2, 0, "身份证号");
            Label labelNum= new Label(3, 0, "预约口罩数量");
            Label labelPassword= new Label(4, 0, "预约编号");
            ws.addCell(labelId);
            ws.addCell(labelName);
            ws.addCell(labelSex);
            ws.addCell(labelNum);
            ws.addCell(labelPassword);
            for (int i = 0; i < lists.size(); i++) {

                Record record=(Record) lists.get(i);


                Label labelId_i= new Label(0, i+1, record.getName());
                Label labelName_i= new Label(1, i+1, record.getTel());
                Label labelSex_i= new Label(2, i+1, record.getCardId());
                Label labelNum_i= new Label(3, i+1,record.getCount()+"");
                Label labelPassword_i= new Label(4, i+1, record.getSelfOrderNumber());
                ws.addCell(labelId_i);
                ws.addCell(labelName_i);
                ws.addCell(labelSex_i);
                ws.addCell(labelNum_i);
                ws.addCell(labelPassword_i);
            }
            //写进文档
            wwb.write();
            // 关闭Excel工作簿对象
            wwb.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

