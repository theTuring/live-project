package com.front_end.swing.mainUI;

import com.front_end.icontool.CreatecdIcon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * description: MainUI <br>
 * date: 2020/3/15 10:05 <br>
 * author: Z&C <br>
 * version: 1.0.0 <br>
 */
public class MainUI extends JFrame {

    private void button1ActionPerformed(ActionEvent e) {

    }

    private void button2ActionPerformed(ActionEvent e) {

    }

    private void button3ActionPerformed(ActionEvent e) {

    }


    public MainUI() {

        super("口罩预约程序");

        //设置字体为宋体 加粗 大小为18
        Font font=new Font("宋体",Font.BOLD,18);

        label1 = new JLabel();
        label1.setIcon(CreatecdIcon.add("logo.png"));
        label1.setBounds(new Rectangle(0, 0, 800, 600));
        this.setLayout(null);//设置布局管理器为空
        this.add(label1);


        button1 = new JButton("->口罩预约");
        button1.setBounds(new Rectangle(250, 260, 300, 40));//参数分别是坐标x，y，宽，高
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

        button2 = new JButton("->中签查询");
        button2.setBounds(new Rectangle(250, 360, 300, 40));//参数分别是坐标x，y，宽，高
        button2.setFont(font);
        button2.setOpaque(false);
        //添加监听
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button2ActionPerformed(e);
            }
        });
        this.setLayout(null);//设置布局管理器为空
        this.add(button2);

        button3 = new JButton("->管理员登录");
        button3.setBounds(new Rectangle(520, 520, 200, 40));//参数分别是坐标x，y，宽，高
        button3.setFont(font);
        button3.setOpaque(false);
        //添加监听
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button3ActionPerformed(e);
            }
        });

        this.setLayout(null);//设置布局管理器为空
        this.add(button3);

        label2 = new JLabel();
        label2.setIcon(CreatecdIcon.add("background.png"));
        label2.setBounds(new Rectangle(0, 0, 800, 600));
        this.setLayout(null);//设置布局管理器为空
        this.add(label2);

        super.setSize(800, 600);
        super.setVisible(true);
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

    //标签用于显示logo
    private JLabel label1;

    //背景图片
    private JLabel label2;

    //按钮
    private JButton button1;

    private JButton button2;

    private JButton button3;

}
    