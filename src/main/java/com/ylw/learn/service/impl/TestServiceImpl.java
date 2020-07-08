package com.ylw.learn.service.impl;

import com.ylw.learn.domain.entity.Test;
import com.ylw.learn.mapper.TestMapper;
import com.ylw.learn.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yangluwei
 * @since 2020-07-08
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

}
