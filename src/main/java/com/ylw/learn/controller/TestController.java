package com.ylw.learn.controller;


import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ylw.learn.config.TestConfig;
import com.ylw.learn.domain.entity.Test;
import com.ylw.learn.service.TestService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yangluwei
 * @since 2020-07-08
 */
@Controller
@Slf4j
@RequestMapping("/test")
public class TestController {

	@Autowired
    private TestConfig testConfig;
	
	@Autowired
	private TestService TestService;
	
    @RequestMapping("testStr")
    @ResponseBody
    public String testStr(HttpServletRequest request) {
    	Test test = TestService.getById(1);
    	log.info("------------:{}", test);
        return testConfig.getTest();
    }
	
}
