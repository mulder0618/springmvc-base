package com.zhx.test.service;

import com.zhx.base.service.BaseService;
import com.zhx.test.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mulder on 15/6/16.
 */
@Service("testService")
public class TestService extends BaseService   {

    @Autowired
    TestMapper testMapper;





}
