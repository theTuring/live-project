package com.front_end.swing.succeedUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * description: 中签编号查询 <br>
 * date: 2020/3/15 12:48 <br>
 * author: Z&C <br>
 * version: 1.0.0 <br>
 */
public class SucceedUI extends JFrame {

    private void button1ActionPerformed(ActionEvent e) {

    }

    public SucceedUI() {
        super("中签编号查询");

        //设置字体为宋体 加粗 大小为18
        Font font=new Font("宋体",Font.BOLD,18);

        label1 = new JLabel();
        label1.setText("中签编号查询");
        label1.setBounds(new Rectangle(100, 50, 200, 40));
        label1.setFont(font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label1);

        label1 = new JLabel();
        label1.setText("编号：");
        label1.setBounds(new Rectangle(50, 105, 60, 40));
        label1.setFont(font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label1);

        textField1 = new JTextField(20);
        textField1.setBounds(new Rectangle(110, 105, 200, 40));
        this.setLayout(null);//设置布局管理器为空
        this.add(textField1);

        button1 = new JButton("->查询");
        button1.setBounds(new Rectangle(100, 185, 200, 40));//参数分别是坐标x，y，宽，高
        button1.setFont(font);//设置字体
        button1.setOpaque(false);//透明化
        //添加监听
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });
        this.setLayout(null);//设置布局管理器为空
        this.add(button1);

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

    //按钮
    private JButton button1;

}
