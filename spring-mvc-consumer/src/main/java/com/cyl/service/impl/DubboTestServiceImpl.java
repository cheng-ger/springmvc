package com.cyl.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cyl.api.TestDemoApi;
import com.cyl.service.DubboTestService;
import org.springframework.stereotype.Service;

/**
 * @author chengyuanliang
 * @desc
 * @since 2019-07-28
 */
@Service
public class DubboTestServiceImpl implements DubboTestService {

    @Reference
    private TestDemoApi testDemoApi;
    @Override
    public String demoApi() {
        return testDemoApi.sayHello();
    }
}
