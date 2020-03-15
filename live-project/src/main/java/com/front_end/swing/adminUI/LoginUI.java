package com.front_end.swing.adminUI;

import com.front_end.swing.reservationUI.ReservationUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * description: LoginUI <br>
 * date: 2020/3/15 12:48 <br>
 * author: Z&C <br>
 * version: 1.0.0 <br>
 */
public class LoginUI extends JFrame {

    private void button1ActionPerformed(ActionEvent e) throws IOException {

        AdminUI adminUI = new AdminUI();
    }

    public LoginUI() {
        super("管理员登录");

        //设置字体为宋体 加粗 大小为26
        Font title_font=new Font("宋体",Font.BOLD,26);

        //设置字体为宋体 加粗 大小为18
        Font font=new Font("宋体",Font.BOLD,18);

        label0 = new JLabel();
        label0.setText("管理员登录");
        label0.setBounds(new Rectangle(130, 25, 200, 40));
        label0.setFont(title_font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label0);

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

        textField1 = new JTextField(20);
        textField1.setBounds(new Rectangle(120, 110, 200, 40));
        this.setLayout(null);//设置布局管理器为空
        this.add(textField1);

        passwordField1 = new JPasswordField(20);
        passwordField1.setBounds(new Rectangle(120, 185, 200, 40));
        this.setLayout(null);//设置布局管理器为空
        this.add(passwordField1);

        button1 = new JButton("->点击登录");
        button1.setBounds(new Rectangle(110, 260, 200, 40));//参数分别是坐标x，y，宽，高
        button1.setFont(font);//设置字体
        button1.setOpaque(false);//透明化
        //添加监听
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    button1ActionPerformed(e);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
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
    private JLabel label0;

    private JLabel label1;

    private JLabel label2;

    //文本框
    private JTextField textField1;

    //密码框
    private JPasswordField passwordField1;

    //按钮
    private JButton button1;
}
    