package com.mistra.mistrastarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/25/025
 * Describe: 自动配置的类型安全的注入参数类
 * 通过application.properties配置mistra.name的值来设置参数，若不设置，默认为"RoronoaZoro丶小王瑞"
 */
@ConfigurationProperties(prefix = "mistra")
public class MistraServiceProperties {

    private static final String NAME = "RoronoaZoro丶小王瑞";

    private String name = NAME;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}