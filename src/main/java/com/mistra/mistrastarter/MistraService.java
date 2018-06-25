package com.mistra.mistrastarter;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/25/025
 * Describe: 是否进行自动配置的判断依据类，根据此类是否存在来决定是否创建这个类的Bean
 */
public class MistraService {

    private String name;

    private String sayYourName(){
        return "I'm " + name + "! ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}