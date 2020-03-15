package com.front_end.icontool;

//创建图片标签类
import javax.swing.*;

public class CreatecdIcon {

    public static ImageIcon add(String ImageName){

    String imgURL="img\\"+new String(ImageName);
    ImageIcon imgic=new ImageIcon(imgURL);
    return imgic;

    }

}