package com.front_end.swing.adminUI;

import javax.swing.*;
import java.awt.*;

/**
 * description: LoginUI <br>
 * date: 2020/3/15 12:48 <br>
 * author: Z&C <br>
 * version: 1.0.0 <br>
 */
public class LoginUI extends JFrame {

    public LoginUI() {
        super("管理员登录");

        //设置字体为宋体 加粗 大小为18
        Font font=new Font("宋体",Font.BOLD,18);

        label1 = new JLabel();
        label1.setText("登录：");
        label1.setBounds(new Rectangle(50, 105, 200, 40));
        label1.setFont(font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label1);

        label2 = new JLabel();
        label2.setText("注册：");
        label2.setBounds(new Rectangle(50, 185, 200, 40));
        label2.setFont(font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label2);

        super.setSize(400, 400);
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

    private JLabel label2;

    //文本框
    private JTextField textField1;

    private JTextField textField2;
}
    