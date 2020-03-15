package com.front_end.swing.adminUI;

import com.eltima.components.ui.DatePicker;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

import static com.front_end.tool.datetool.DateResult.getDatePicker;

/**
 * description: AdminUI <br>
 * date: 2020/3/15 15:33 <br>
 * author: Z&C <br>
 * version: 1.0.0 <br>
 */
public class AdminUI extends JFrame {

    public AdminUI() {
        super("管理员管理");

        //设置字体为宋体 加粗 大小为26
        Font title_font=new Font("宋体",Font.BOLD,26);

        //设置字体为宋体 加粗 大小为18
        Font font=new Font("宋体",Font.BOLD,18);

        label1 = new JLabel();
        label1.setText("后台管理");
        label1.setBounds(new Rectangle(330, 25, 200, 40));
        label1.setFont(title_font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label1);

        label2 = new JLabel();
        label2.setText("开始时间：");
        label2.setBounds(new Rectangle(100, 105, 200, 40));
        label2.setFont(font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label2);

        label3 = new JLabel();
        label3.setText("结束时间：");
        label3.setBounds(new Rectangle(100, 185, 200, 40));
        label3.setFont(font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label3);

        label4 = new JLabel();
        label4.setText("单个用户最高可预约数量：");
        label4.setBounds(new Rectangle(100, 265, 300, 40));
        label4.setFont(font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label4);

        label5 = new JLabel();
        label5.setText("口罩总数：");
        label5.setBounds(new Rectangle(100, 345, 200, 40));
        label5.setFont(font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label5);

//        textField1 = new JTextField(20);
//        textField1.setBounds(new Rectangle(240, 110, 400, 30));
//        this.setLayout(null);//设置布局管理器为空
//        this.add(textField1);

        final DatePicker datepick1;
        datepick1 = getDatePicker();
        datepick1.setBounds(new Rectangle(240, 110, 400, 30));
        this.setLayout(null);//设置布局管理器为空
        this.add(datepick1);

//        textField2 = new JTextField(20);
//        textField2.setBounds(new Rectangle(240, 190, 400, 30));
//        this.setLayout(null);//设置布局管理器为空
//        this.add(textField2);

        final DatePicker datepick2;
        datepick2 = getDatePicker();
        datepick2.setBounds(new Rectangle(240, 190, 400, 30));
        this.setLayout(null);//设置布局管理器为空
        this.add(datepick2);

//        textField3 = new JTextField(20);
//        textField3.setBounds(new Rectangle(330, 270, 310, 30));
//        this.setLayout(null);//设置布局管理器为空
//        this.add(textField3);

        final JSpinner numSpinner1 = new JSpinner();
        SpinnerModel numModel1 = new SpinnerNumberModel(3, 0, 999, 1);
        numSpinner1.setModel(numModel1);
        numSpinner1.setBounds(new Rectangle(330, 270, 310, 30));
        this.setLayout(null);//设置布局管理器为空
        this.add(numSpinner1);

        final JSpinner numSpinner2 = new JSpinner();
        SpinnerModel numModel2 = new SpinnerNumberModel(0, 0, 999, 1);
        numSpinner2.setModel(numModel2);
        numSpinner2.setBounds(new Rectangle(240, 350, 400, 30));
        this.setLayout(null);//设置布局管理器为空
        this.add(numSpinner2);

        numSpinner1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                System.out.println(numSpinner1.getValue());
            }
        });

        numSpinner2.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                System.out.println(numSpinner2.getValue());
            }
        });

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

    //文本框
    private JTextField textField1;

    private JTextField textField2;

    private JTextField textField3;
}
    