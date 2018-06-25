package com.mistra.mistrastarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/25/025
 * Describe: 自动配置类
 * 根据条件判断是否要自动配置，创建Bean
 */
@Configuration
@EnableConfigurationProperties(MistraServiceProperties.class)
@ConditionalOnClass(MistraService.class)//判断MistraService这个类在类路径中是否存在
@ConditionalOnProperty(prefix = "mistra",value = "enabled",matchIfMissing = true)
public class MistraServiceAutoConfiguration {

    @Autowired
    private MistraServiceProperties mistraServiceProperties;

    @Bean
    @ConditionalOnMissingBean(MistraService.class)//当容器中没有这个Bean时(MistraService)就自动配置这个Bean，Bean的参数来自于MistraServiceProperties
    public MistraService mistraService(){
        MistraService mistraService = new MistraService();
        mistraService.setName(mistraServiceProperties.getName());
        return mistraService;
    }
}