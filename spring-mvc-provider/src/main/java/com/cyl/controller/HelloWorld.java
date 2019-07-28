package com.cyl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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




}
