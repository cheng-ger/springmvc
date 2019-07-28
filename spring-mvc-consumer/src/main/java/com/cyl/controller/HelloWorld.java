package com.cyl.controller;


import com.cyl.api.TestDemoApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @author chengyuanliang
 * @desc
 * @since 2019-07-25
 */
@Controller
@RequestMapping("helloService")
public class HelloWorld {

    private  final  static  Logger log = LoggerFactory.getLogger(HelloWorld.class);

    @Autowired
    private TestDemoApi testDemoApi;



    @RequestMapping(value = "hello" , method = RequestMethod.GET)

    public   @ResponseBody String hello() {
        log.info("helloService:{}","hello");
        return "HELLO WORLD";
    }

    @RequestMapping(value = "hi")
    public   String hi() {
        log.info("helloService:{}","hi");
        return "hi";
    }

    @RequestMapping(value = "m1" , method = RequestMethod.GET)
    public   @ResponseBody String m1() {
        log.info("===========helloService:{}","m1");
        return testDemoApi.sayHello();
    }

   /* @RequestMapping(value = "m2" , method = RequestMethod.GET)
    public   @ResponseBody String m2() {
        log.info("helloService:{}","m2");
        return testDemoApi2.sayHello();
    }*/

    @RequestMapping(value = "m3" , method = RequestMethod.GET)
    public   @ResponseBody String m3() {
        log.info("=============helloService:{}","m3");
        return "HELLO WORLD";
    }
}
