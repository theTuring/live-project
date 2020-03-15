package com.back_end.domain;

public class Record {
    private int id;
    private String name;//姓名
    private String tel;//手机号
    private String cardId;//身份证号
    private int count;//要求的口罩数量
    private int orderId;//发放口罩的活动编号
    private String selfOrderNumber;//预约编号
    private int status;//判断是否中签

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getCardId() {
        return cardId;
    }

    public int getCount() {
        return count;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getSelfOrderNumber() {
        return selfOrderNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setSelfOrderNumber(String selfOrderNumber) {
        this.selfOrderNumber = selfOrderNumber;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
