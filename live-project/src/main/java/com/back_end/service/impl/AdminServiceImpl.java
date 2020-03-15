package com.back_end.service.impl;

import com.back_end.mapper.AdminMapper;
import com.back_end.service.AdminService;
import com.back_end.utils.MybatisConfig;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

public class AdminServiceImpl implements AdminService {
    public boolean login(String name , String pw){
        AdminMapper adminMapper = new MybatisConfig().setIt().getMapper(AdminMapper.class);
        String passw = adminMapper.getPwByName(name);
        if (pw.equals(passw))
            return true;
        if (!pw.equals(passw))
            return false;
        return false;
    }
}
