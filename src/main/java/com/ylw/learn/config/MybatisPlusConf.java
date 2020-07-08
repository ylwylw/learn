package com.ylw.learn.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.ylw.learn.mapper"})
public class MybatisPlusConf {
}