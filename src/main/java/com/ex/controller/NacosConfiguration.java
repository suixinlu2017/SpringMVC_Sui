package com.ex.controller;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.context.annotation.Configuration;

/**
 * @program: SpringMVC-Sui
 * @description:
 * @author: chenyulong
 * @create: 2020-08-28 16:09
 **/
@Configuration
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "localhost:8848"))
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class NacosConfiguration {
}
