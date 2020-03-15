package com.back_end.service.impl;

<<<<<<< HEAD:live-project/src/main/java/com/back_end/service/impl/RecordServiceImpl.java
import com.back_end.service.RecordService;
=======
import com.back_end.domain.Record;
import com.back_end.service.TestService;
import com.back_end.mapper.RecordMapper;
import com.back_end.utils.MybatisConfig;

import java.sql.ResultSet;
>>>>>>> 688544e60993708c791190a0dfc3876c0aa529f2:live-project/src/main/java/com/back_end/service/impl/TestServiceImpl.java

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

<<<<<<< HEAD:live-project/src/main/java/com/back_end/service/impl/RecordServiceImpl.java
public class RecordServiceImpl implements RecordService {

=======
public class TestServiceImpl implements TestService {

    public String Register(String name, String tel, String cardId, int count, int ordId) throws Exception {

        RecordMapper recordMapper = new MybatisConfig().setIt().getMapper(RecordMapper.class);


        recordMapper.selectRecordByTel(tel);//查询手机号
        //recordMapper.insertRecord();

        return null;
    }
>>>>>>> 688544e60993708c791190a0dfc3876c0aa529f2:live-project/src/main/java/com/back_end/service/impl/TestServiceImpl.java
}
