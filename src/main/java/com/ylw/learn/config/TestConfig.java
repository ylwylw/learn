package com.ylw.learn.config;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "common.ylw")
@Data
public class TestConfig {
	private String test;
}
