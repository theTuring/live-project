package com.front_end.swing.resultUI;

import javax.swing.*;
import java.awt.*;

/**
 * description: SuccessUI <br>
 * date: 2020/3/15 22:32 <br>
 * author: Z&C <br>
 * version: 1.0.0 <br>
 */
public class SuccessUI extends JFrame {

    public SuccessUI() {

        super("操作成功");

        //设置字体为宋体 加粗 大小为26
        Font title_font=new Font("宋体",Font.BOLD,26);

        label1 = new JLabel();
        label1.setText("操作成功");
        label1.setBounds(new Rectangle(50, 50, 200, 40));
        label1.setFont(title_font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label1);

        super.setSize(200, 200);
        super.setVisible(true);
        super.setResizable(false);
        centered(this);
    }

    //布局居中方法
    public void centered(Container container) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Dimension screenSize = toolkit.getScreenSize();

        int w = container.getWidth();

        int h = container.getHeight();

        container.setBounds((screenSize.width - w) / 2, (screenSize.height - h) / 2, w, h);

    }

    //标签
    private JLabel label1;
}
    