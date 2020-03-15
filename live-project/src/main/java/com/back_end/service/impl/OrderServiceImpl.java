package com.back_end.service.impl;

import com.back_end.common.CommonDb;
import com.back_end.mapper.AdminMapper;
import com.back_end.mapper.OrderMapper;
import com.back_end.service.OrderService;
import com.back_end.utils.MybatisConfig;
import com.back_end.utils.SpecialData;
import org.apache.ibatis.session.SqlSession;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

public class OrderServiceImpl implements OrderService {
    public static CommonDb commonDb;
    public static String specialTimeNumber;

    public void start(int total , int userMax){
        commonDb.setTotal(total);
        commonDb.setUserMax(userMax);
    }

    public void start(){
        SqlSession session = new MybatisConfig().setIt();
        OrderMapper orderMapper = session.getMapper(OrderMapper.class);
        String specialNumber = new SpecialData().getNumber();
        specialTimeNumber = specialNumber;
        orderMapper.insertOrder(specialNumber);
        session.commit();
        session.close();
    }

    public int selectOrder(String judgeNumber){
        SqlSession session = new MybatisConfig().setIt();
        OrderMapper orderMapper = session.getMapper(OrderMapper.class);
        int a = orderMapper.selectOrder(judgeNumber);
        return a;
    }
}
