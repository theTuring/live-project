package com.back_end.utils;

import java.util.UUID;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

public class SpecialData {
    public String getNumber(){
        UUID specialNumber = UUID.randomUUID();
        return specialNumber.toString();
    }
}
