package com.cyl.apiservice;

import com.cyl.api.TestDemoApi2;

/**
 * @author chengyuanliang
 * @desc
 * @since 2019-07-28
 */
public class TestDemoApi2Impl implements TestDemoApi2 {

    @Override
    public String sayHello() {
        return "TestDemoApi2<<==>>provider:hello";
    }
}
