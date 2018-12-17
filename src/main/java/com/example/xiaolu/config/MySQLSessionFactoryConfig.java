package com.example.xiaolu.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author Lu Yufeng
 * @date 2018/12/4 下午8:30
 */

@Configuration
@MapperScan(basePackages = "com.example.xiaolu.mapper", sqlSessionFactoryRef = "xiaoluSqlSessionFactory")
@EnableTransactionManagement
public class MySQLSessionFactoryConfig {

    @Resource(name = "xiaoluDataSource")
    private DataSource xiaoluDataSource;

    @Bean(name = "xiaoluSqlSessionFactory")
    @Primary
    public SqlSessionFactory getMysqlSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(xiaoluDataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        bean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "mysqlTransactionManager")
    public PlatformTransactionManager buildManager(){
        return new DataSourceTransactionManager(xiaoluDataSource);
    }

}
