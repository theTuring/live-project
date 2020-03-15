package com.back_end.service.impl;

import com.back_end.domain.Record;
import com.back_end.service.TestService;
import com.back_end.mapper.RecordMapper;
import com.back_end.utils.MybatisConfig;

import java.sql.ResultSet;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

public class TestServiceImpl implements TestService {

    public String Register(String name, String tel, String cardId, int count, int ordId) throws Exception {

        RecordMapper recordMapper = new MybatisConfig().setIt().getMapper(RecordMapper.class);


        recordMapper.selectRecordByTel(tel);//查询手机号
        //recordMapper.insertRecord();

        return null;
    }
}
