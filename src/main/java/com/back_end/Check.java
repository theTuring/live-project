package com.back_end;

import com.back_end.service.AdminService;
import com.back_end.service.OrderService;
import com.back_end.service.impl.AdminServiceImpl;
import com.back_end.service.impl.OrderServiceImpl;
import com.back_end.service.impl.RecordServiceImpl;
import com.back_end.utils.Md5;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

public class Check {
    public static void main(String[] args){
//        OrderService orderService = new OrderServiceImpl();
//        orderService.start();
//        AdminService adminService = new AdminServiceImpl();
//        System.out.println(adminService.login("hack" , "1234567"));

//        new OrderServiceImpl().start();
//        new RecordServiceImpl().getWin();
//        try {
//            System.out.println(new Md5().md5Encode("123456"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(new RecordServiceImpl().checkStatus("c97a901f-2118-4378-8190-f2ec9fdd92"));
        new AdminServiceImpl().login("hack" , "123456");
//        new RecordServiceImpl().insertRecord("hack" , "13205039021" , "350583199712144336" , 5);
    }
}
