package com.front_end.swing.queryUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * description: ResultUI <br>
 * date: 2020/3/15 17:02 <br>
 * author: Z&C <br>
 * version: 1.0.0 <br>
 */
public class ResultUI extends JFrame {

    public ResultUI() {

        super("成功中签");

        //设置字体为宋体 加粗 大小为26
        Font title_font=new Font("宋体",Font.BOLD,26);

        //设置字体为宋体 加粗 大小为18
        Font font=new Font("宋体",Font.BOLD,18);

        label1 = new JLabel();
        label1.setText("成功中签");
        label1.setBounds(new Rectangle(340, 25, 200, 40));
        label1.setFont(title_font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label1);

        label2 = new JLabel();
        label2.setText("真实姓名：");
        label2.setBounds(new Rectangle(100, 105, 200, 40));
        label2.setFont(font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label2);

        label3 = new JLabel();
        label3.setText("身份证号：");
        label3.setBounds(new Rectangle(100, 185, 200, 40));
        label3.setFont(font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label3);

        label4 = new JLabel();
        label4.setText("手机号：");
        label4.setBounds(new Rectangle(100, 265, 200, 40));
        label4.setFont(font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label4);

        label5 = new JLabel();
        label5.setText("预约口罩数量：");
        label5.setBounds(new Rectangle(100, 345, 200, 40));
        label5.setFont(font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label5);

        label5 = new JLabel();
        label5.setText("编号：");
        label5.setBounds(new Rectangle(100, 425, 200, 40));
        label5.setFont(font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label5);

        textField1 = new JTextField(20);
        textField1.setBounds(new Rectangle(240, 110, 400, 30));
        textField1.setEditable(false);
        this.setLayout(null);//设置布局管理器为空
        this.add(textField1);

        textField2 = new JTextField(20);
        textField2.setBounds(new Rectangle(240, 190, 400, 30));
        textField2.setEditable(false);
        this.setLayout(null);//设置布局管理器为空
        this.add(textField2);

        textField3 = new JTextField(20);
        textField3.setBounds(new Rectangle(240, 270, 400, 30));
        textField3.setEditable(false);
        this.setLayout(null);//设置布局管理器为空
        this.add(textField3);

        textField4 = new JTextField(20);
        textField4.setBounds(new Rectangle(240, 350, 400, 30));
        textField4.setEditable(false);
        this.setLayout(null);//设置布局管理器为空
        this.add(textField4);

        textField5 = new JTextField(20);
        textField5.setBounds(new Rectangle(240, 430, 400, 30));
        textField5.setEditable(false);
        this.setLayout(null);//设置布局管理器为空
        this.add(textField5);

        super.setSize(760, 600);
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

    private JLabel label3;

    private JLabel label4;

    private JLabel label5;

    private JLabel label6;

    //文本框
    private JTextField textField1;

    private JTextField textField2;

    private JTextField textField3;

    private JTextField textField4;

    private JTextField textField5;


}
