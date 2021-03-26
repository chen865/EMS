package com.ems.dao;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * 该注解为 此类是配置类
 */
@Configuration
public class MyBatisConfig {
    /**
     * @Bean 应用方法上 该方法返回一个bean（对象） 自动执行
     * @ConditionalOnMissingBean   条件bean  当bean没有该bean是才执行下列方法 返回一个bean
     * @param dataSource
     * @return
     */
    @Bean
    @ConditionalOnMissingBean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        // 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        // 设置mybatis配置文件信息
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mapper-config.xml"));
        // 设置读取所有接口的映射文件
        // 创建读取对象
        PathMatchingResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
        // 声明数组读取存放的映射文件
        Resource[] mapperXml=null;

        // 读取
        try {
            mapperXml=resolver.getResources("classpath:mapper/*.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 把读取的映射文件赋值给sqlSession
        sqlSessionFactoryBean.setMapperLocations(mapperXml);
        // 设置别名
        sqlSessionFactoryBean.setTypeAliasesPackage("com.ems.pojo");

        return sqlSessionFactoryBean;
    }
    // 当执行mybatis的dao中的方法，要调用上面的sqlSession
    @Bean
    @ConditionalOnBean(SqlSessionFactoryBean.class) //条件bean 在这个bean存在的时候才执行
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc=new MapperScannerConfigurer();
        // 设置接口位置
        msc.setBasePackage("com.ems.dao");
        return msc;
    }



}
