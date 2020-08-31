package com.ex.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: SpringMVC-Sui
 * @description:
 * @author: chenyulong
 * @create: 2020-08-28 16:10
 **/
@Controller
@RequestMapping(value = "/suixinlu")
public class UserController {
    /** http://localhost:8080/suixinlu/getUser      代码没有错误，如果获取不到，要去查看服务器的配置是否齐全，特别注意集群配置，哪怕单机也需要配置，不可遗漏 **/
    @NacosValue(value = "${gushi:null}", autoRefreshed = true)
    private String gushi;

    @RequestMapping(value = "/getUser")
    @ResponseBody
    public String getUser() {
        System.out.println("gushi="+gushi);
        return "success";
    }
}
