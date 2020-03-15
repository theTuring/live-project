package com.back_end.service.impl;

import com.back_end.mapper.OrderMapper;
import com.back_end.service.RecordService;
import com.back_end.domain.Record;
import com.back_end.mapper.RecordMapper;
import com.back_end.utils.MybatisConfig;
import com.back_end.utils.Rex;
import com.back_end.utils.SpecialData;
import org.apache.ibatis.session.SqlSession;

import java.sql.ResultSet;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

public class RecordServiceImpl{

    public boolean check(String tel , String cardId){
        SqlSession sqlSession = new MybatisConfig().setIt();
        RecordMapper recordMapper = sqlSession.getMapper(RecordMapper.class);
        int orderId = new OrderServiceImpl().selectOrder(new OrderServiceImpl().specialTimeNumber);
        boolean checkTel = new Rex().checkTel(tel);
        boolean checkCardId = new Rex().checkCardId(cardId);
        if (!checkCardId)
            return false;
        if (!checkTel)
            return false;
        //查询本次
        Record record = new Record();
        record.setTel(tel);
        record.setOrderId(orderId);
        record.setCardId(cardId);

        //查询前三次
        for (int i = 0 ; i <= 3 ; i++){
            orderId-=i;
            record.setOrderId(orderId);
            if (recordMapper.checkThisTimeByTel(record))
                return false;
            if (recordMapper.checkThisTimeByCardId(record))
                return false;
        }

        return true;
    }

    public void insertRecord(String name , String tel , String cardId , int count){
        Record record = new Record();
        String sepcialNumber = new SpecialData().getNumber();
        int orderId = new OrderServiceImpl().selectOrder(new OrderServiceImpl().specialTimeNumber);

        record.setName(name);
        record.setTel(tel);
        record.setCardId(cardId);
        record.setCount(count);
        record.setOrderId(orderId);
        record.setSelfOrderNumber(sepcialNumber);

        SqlSession session = new MybatisConfig().setIt();
        RecordMapper recordMapper = session.getMapper(RecordMapper.class);
        recordMapper.insertRecord(record);
        session.commit();
        session.close();
    }
}