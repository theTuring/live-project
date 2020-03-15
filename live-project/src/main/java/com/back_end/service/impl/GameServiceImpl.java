package com.back_end.service.impl;

import com.back_end.common.CommonDb;
import com.back_end.service.GameService;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

public class GameServiceImpl implements GameService {
    public static CommonDb commonDb;

    public void start(int total , int userMax){
        commonDb.setTotal(total);
        commonDb.setUserMax(userMax);
    }
}
