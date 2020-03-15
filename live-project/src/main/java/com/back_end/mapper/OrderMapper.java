package com.back_end.mapper;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

public interface OrderMapper {
//    插入judgeNumber
    void insertOrder(String order);

//    取得id
    int selectOrder(String judgeNumber);
}
