package com.front_end.domain;

/**
 * description: Config <br>
 * date: 2020/3/15 17:13 <br>
 * author: Z&C <br>
 * version: 1.0.0 <br>
 */
public class Config {

    String start_date;

    String end_date;

    int max_have;

    int max_mask;

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public int getMax_have() {
        return max_have;
    }

    public void setMax_have(int max_have) {
        this.max_have = max_have;
    }

    public int getMax_mask() {
        return max_mask;
    }

    public void setMax_mask(int max_mask) {
        this.max_mask = max_mask;
    }

    //覆写toString方法
    @Override
    public String toString() {
        return start_date + " " + end_date + " " + max_have + " " + max_mask;
    }
}
    