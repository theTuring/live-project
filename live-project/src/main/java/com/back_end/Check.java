package com.back_end;

import com.back_end.service.AdminService;
import com.back_end.service.OrderService;
import com.back_end.service.impl.AdminServiceImpl;
import com.back_end.service.impl.OrderServiceImpl;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

public class Check {
    public static void main(String[] args){
        OrderService orderService = new OrderServiceImpl();
        orderService.insert();
        AdminService adminService = new AdminServiceImpl();
        System.out.println(adminService.login("hack" , "1234567"));
    }
}
