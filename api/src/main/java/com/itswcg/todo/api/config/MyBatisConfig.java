package com.itswcg.todo.api.config;

import org.springframework.context.annotation.Configuration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.itswcg.todo.mbg.mapper"})
public class MyBatisConfig {
}
