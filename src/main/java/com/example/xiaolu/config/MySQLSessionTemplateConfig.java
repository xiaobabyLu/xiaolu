package com.example.xiaolu.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;

/**
 * @author Lu Yufeng
 * @date 2018/12/4 下午8:38
 */

@Configuration
public class MySQLSessionTemplateConfig {

    @Resource(name = "xiaoluSqlSessionFactory")
    private SqlSessionFactory mysqlSqlSessionFactory;

    @Primary
    @Bean(name = "mysqlSqlSessionTemplate")
    public SqlSessionTemplate mysqlSqlSessionTemplate(){
        return new SqlSessionTemplate(mysqlSqlSessionFactory);
    }
}
