package com.back_end.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

/**
 * 使用方法：AdminMapper adminMapper = new MybatisConfig().setIt().getMapper(AdminMapper.class);
 */

public class MybatisConfig {
    public SqlSession setIt() {
        String resource = "SqlMapConfig.xml";

        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        return sqlSession;
    }
}
