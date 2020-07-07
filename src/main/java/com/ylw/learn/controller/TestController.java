package com.ylw.learn.controller;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ylw.learn.config.TestConfig;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {
	
	private TestConfig testConfig;
	
	@Autowired
	public TestController(TestConfig testConfig) {
		this.testConfig = testConfig;
	}

	@RequestMapping("testStr")
	@ResponseBody
	public String testStr(HttpServletRequest request) {
		return testConfig.getTest();
	}
}
