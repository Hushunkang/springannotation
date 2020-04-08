package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月08日 12时58分54秒
 */
@Configuration//告诉spring，这是一个配置类，就相当于一个spring的xml配置文件
public class MainConfig {

//    @Bean//向spring ioc容器里面注册Bean（注册组件）
    //Bean的类型为方法返回值类型，Bean的名称（Bean的id）为方法名
    @Bean("008")
    public Person person007(){
        return new Person("Lilei",16);
    }

}
