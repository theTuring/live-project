package com.front_end.swing.reservationUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * description: ReservationUI <br>
 * date: 2020/3/15 10:47 <br>
 * author: Z&C <br>
 * version: 1.0.0 <br>
 */
public class ReservationUI extends JFrame {

    private void button1ActionPerformed(ActionEvent e) {

    }

    private void button2ActionPerformed(ActionEvent e) {

        dispose();

    }

    private void button3ActionPerformed(ActionEvent e) {

    }


    public ReservationUI() {

        super("口罩预约");

        //设置字体为宋体 加粗 大小为26
        Font title_font=new Font("宋体",Font.BOLD,26);

        //设置字体为宋体 加粗 大小为18
        Font font=new Font("宋体",Font.BOLD,18);

        label1 = new JLabel();
        label1.setText("口罩预约");
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

        textField1 = new JTextField(20);
        textField1.setBounds(new Rectangle(240, 110, 400, 30));
        this.setLayout(null);//设置布局管理器为空
        this.add(textField1);

        textField2 = new JTextField(20);
        textField2.setBounds(new Rectangle(240, 190, 400, 30));
        this.setLayout(null);//设置布局管理器为空
        this.add(textField2);

        textField3 = new JTextField(20);
        textField3.setBounds(new Rectangle(240, 270, 400, 30));
        this.setLayout(null);//设置布局管理器为空
        this.add(textField3);

//        textField4 = new JTextField(20);
//        textField4.setBounds(new Rectangle(240, 350, 400, 30));
//        this.setLayout(null);//设置布局管理器为空
//        this.add(textField4);

        final JSpinner numSpinner = new JSpinner();
        SpinnerModel numModel = new SpinnerNumberModel(0, 0, 3, 1);
        numSpinner.setModel(numModel);
        numSpinner.setBounds(new Rectangle(240, 350, 400, 30));
        this.setLayout(null);//设置布局管理器为空
        this.add(numSpinner);

        numSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                System.out.println(numSpinner.getValue());
            }
        });

        button1 = new JButton("->开始预约");
        button1.setBounds(new Rectangle(240, 430, 300, 40));//参数分别是坐标x，y，宽，高
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

        button2 = new JButton("->结束预约");
        button2.setBounds(new Rectangle(240, 510, 300, 40));//参数分别是坐标x，y，宽，高
        button2.setFont(font);//设置字体
        button2.setOpaque(false);//透明化
        //添加监听
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button2ActionPerformed(e);
            }
        });
        this.setLayout(null);//设置布局管理器为空
        this.add(button2);

        label6 = new JLabel();
        label6.setText("口罩总量设置");
        label6.setBounds(new Rectangle(50, 590, 200, 40));
        label6.setFont(title_font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label6);

        textField3 = new JTextField(20);
        textField3.setBounds(new Rectangle(250, 595, 200, 30));
        this.setLayout(null);//设置布局管理器为空
        this.add(textField3);

        button3 = new JButton("->设置（需管理员权限）");
        button3.setBounds(new Rectangle(460, 590, 260, 40));//参数分别是坐标x，y，宽，高
        button3.setFont(font);//设置字体
        button3.setOpaque(false);//透明化
        //添加监听
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button3ActionPerformed(e);
            }
        });
        this.setLayout(null);//设置布局管理器为空
        this.add(button3);

        super.setSize(760, 800);
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

    //按钮
    private JButton button1;

    private JButton button2;

    private JButton button3;

}
    