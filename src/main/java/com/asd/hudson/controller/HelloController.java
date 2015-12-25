/**
 * 
 */
package com.asd.hudson.controller;

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

    @RequestMapping("hello")
    @ResponseBody
    public String hello(String name) {
        return "hello:" + name;
    }
}
