package com.back_end.domain;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

public class Record {
    private String name;
    private String tel;
    private String cardId;
    private int count;
    private int orderId;
    private String selfOrderNumber;
    private int status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getSelfOrderNumber() {
        return selfOrderNumber;
    }

    public void setSelfOrderNumber(String selfOrderNumber) {
        this.selfOrderNumber = selfOrderNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
