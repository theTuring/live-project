package com.back_end.mapper;

import com.back_end.domain.Record;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

public interface RecordMapper {
    public void insertRecord (Record record);

    public boolean checkThisTimeByTel(Record record);

    public boolean checkThisTimeByCardId(Record record);

    public LinkedList<String> getLinks(int orderId);

    public void setStatus(String selfOrderNumber);

    public int selectStatus(String selfOrderNumber);

    public boolean checkStatus(String selfOrderNumber);

    public List<Record> queryAll(int status);

    public Record selectWin(String selfOrderNumber);
}