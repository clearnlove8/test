package com.ck.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class DBUtils {
    private static SqlSessionFactory sqlSessionFactory;
    //加载核心配置文件
    static{
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取数据库操作对象:SqlSession对象
    public static SqlSession openSession(boolean transaction){
        return sqlSessionFactory.openSession(transaction);
    }
}
