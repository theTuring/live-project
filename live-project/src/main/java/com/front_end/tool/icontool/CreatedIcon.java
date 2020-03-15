
package com.front_end.tool.icontool;

//创建图片标签类
import javax.swing.*;

public class CreatedIcon {

    public static ImageIcon add(String ImageName){

    String imgURL="img\\"+new String(ImageName);
    ImageIcon imgic=new ImageIcon(imgURL);
    return imgic;

    }
}