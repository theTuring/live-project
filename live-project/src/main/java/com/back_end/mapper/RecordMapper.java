package com.back_end.mapper;

import com.back_end.domain.Record;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

public interface RecordMapper {
    public void insertRecord (Record record);

    public boolean checkThisTimeByTel(Record record);

    public boolean checkThisTimeByCardId(Record record);
}