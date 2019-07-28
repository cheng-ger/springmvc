package com.cyl.apiservice;


import com.cyl.api.TestDemoApi;

/**
 * @author chengyuanliang
 * @desc 两种配置  1.注解 。2 xml配置为文件
 * @since 2019-07-28
 */
/*@Service(interfaceClass = TestDemoApi.class)*/
public class TestDemoApiImpl implements TestDemoApi {
    @Override
    public String sayHello() {
        return "TestDemoApi1<<==>>provider:hello";
    }
}
