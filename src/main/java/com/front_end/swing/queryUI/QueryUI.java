
package com.front_end.swing.queryUI;

import com.back_end.domain.Record;
import com.back_end.service.RecordService;
import com.back_end.service.impl.RecordServiceImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * description: QueryUI <br>
 * date: 2020/3/15 14:58 <br>
 * author: Z&C <br>
 * version: 1.0.0 <br>
 */
public class QueryUI extends JFrame{
    public static Record record = new Record();

    private void button1ActionPerformed(ActionEvent e) {
        RecordServiceImpl recordService = new RecordServiceImpl();
        if (recordService.checkStatus(textField1.getText())) {
            record = recordService.getRecordByNumber(textField1.getText());
            ResultUI reservationUI = new ResultUI();
        }


    }

    public QueryUI() {
        super("中签查询");

        //设置字体为宋体 加粗 大小为26
        Font title_font=new Font("宋体",Font.BOLD,26);

        //设置字体为宋体 加粗 大小为18
        Font font=new Font("宋体",Font.BOLD,18);

        label0 = new JLabel();
        label0.setText("中签查询");
        label0.setBounds(new Rectangle(340, 25, 200, 40));
        label0.setFont(title_font);
        this.setLayout(null);//设置布局管理器为空
        this.add(label0);

        textField1 = new JTextField(20);
        textField1.setBounds(new Rectangle(100, 110, 600, 40));
        this.setLayout(null);//设置布局管理器为空
        this.add(textField1);

        button1 = new JButton("->点击查询");
        button1.setBounds(new Rectangle(200, 200, 400, 40));//参数分别是坐标x，y，宽，高
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

        super.setSize(800, 400);
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

    //文本框
    private JTextField textField1;

    //按钮
    private JButton button1;
}