package com.back_end.common;

import java.util.List;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

public class CommonDb {
    private int total = 1000;//口罩总数
    private int userMax = 3;//每日最多预约数（默认为3）

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getUserMax() {
        return userMax;
    }

    public void setUserMax(int userMax) {
        this.userMax = userMax;
    }
}
