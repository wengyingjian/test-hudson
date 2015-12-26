/**
 * 
 */
package com.asd.hudson.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author <a href="mailto:wengyingjian@foxmail.com">翁英健</a>
 * @version 1.1 2015年12月25日
 * @since 1.1
 */
@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("hello")
    @ResponseBody
    public String hello(String name) {
        logger.info("request for /HelloController...");
        return "hello:" + name;
    }
}
