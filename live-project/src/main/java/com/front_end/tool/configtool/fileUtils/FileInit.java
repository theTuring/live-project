package com.front_end.tool.configtool.fileUtils;

import java.io.File;
import java.io.IOException;

//初始化创建Contacts.txt用于存放联系人信息
public class FileInit {

    public String init() {

        File file = new File(".//src/main/resources/config.properties");

        File fileParent = file.getParentFile();

        boolean exist = false;

        //判断文件是否存在，若不存在则创建
        if(!file.exists()) {

            try {
                //创建父目录
                exist = fileParent.mkdirs();

                //创建文件
                file.createNewFile();
            }catch (IOException e) {

                e.printStackTrace();

            }

            if(exist) {
                System.out.println("文件创建成功");
            }
        }

        //返回文件的绝对路径
        return file.getAbsolutePath();

    }

}
