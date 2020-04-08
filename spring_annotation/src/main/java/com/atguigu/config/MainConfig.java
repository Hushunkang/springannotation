package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月08日 12时58分54秒
 */
@Configuration//告诉spring，这是一个配置类，就相当于一个spring的xml配置文件
//@ComponentScan//这个注解默认的包，扫描的是当前类所在包及其子包，即此处的@ComponentScan等价于@ComponentScan("com.atguigu.config")
//@ComponentScan这个注解的作用是将标识有@Component注解功能的注解（@Configuration、@Component、@Controller、@Service、@Repository）所标识的Bean注册到spring ioc容器里面
//@ComponentScan("com.atguigu")
@ComponentScan(value = "com.atguigu", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})})
public class MainConfig {

//    @Bean//向spring ioc容器里面注册Bean（注册组件）
    //Bean的类型为方法返回值类型，Bean的名称（Bean的id）为方法名
    @Bean("008")
    public Person person007(){
        return new Person("Lilei",16);
    }

}
