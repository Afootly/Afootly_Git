package com.atguigu.springbootconfigautoconfig.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
配置mybatis
 */
@MapperScan(value = "com.atguigu.springbootconfigautoconfig.mapper") //批量扫描mapper,不用逐个添加@Mapper注解
@Configuration
public class MybatisConfig {
    @Bean
    //开启驼峰命名映射，（bean中体与数据库中不对应）
    public ConfigurationCustomizer configurationCustomizer() {
        return new ConfigurationCustomizer() {

            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);

            }


        }; //已使用配置文件方式
    }

}
